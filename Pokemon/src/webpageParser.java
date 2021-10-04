import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.internal.StringUtil;

import java.text.Normalizer;


public class webpageParser 
{
	public static void main(String[] args) throws IOException
	{
		//Takes data from serebii.net and bulbapedia for format all the data. This was used to scrape the data and then manually edited.
		/*
		webParse("https://www.serebii.net/swordshield/galarpokedex.shtml", "Pokedex Info.txt");
		separatePokemonData("Pokedex Info.txt", "Pokedex Data.txt");
		getRidOfFirstLastLine("Pokedex Data.txt", "Pokedex Data Format.txt");
		fixAbilitiesText("Pokedex Data Format.txt", "Pokedex Data Format with Abilities.txt");
		getTypeFromPokemon("Pokedex Data Format with Abilities.txt", "Pokedex Data Format with Abilities and Types.txt");
		File pkdxFile1 = new File("Pokedex Info.txt");
		pkdxFile1.delete();
		File pkdxFile2 = new File("Pokedex Data.txt");
		pkdxFile2.delete();
		File pkdxFile3 = new File("Pokedex Data Format.txt");
		pkdxFile3.delete();
		File pkdxFile4 = new File("Pokedex Data Format with Abilities.txt");
		pkdxFile4.delete();
		*/
		
		//Gets the Move data
		/*
		webParse("https://www.serebii.net/attackdex-swsh/fire.shtml", "Pokemon Move Parser.txt");
		getRidOfExtraTextAttacks("Pokemon Move Parse.txt", "No Extra text.txt");
		*/
		
		//formatAttacks(".txt");
		/*
		webParse("https://bulbapedia.bulbagarden.net/wiki/Ability", "Pokemon Ability List.txt");
		getPokemonAbilities("Pokemon Ability List.txt", "Only Pokemon Abilities.txt");
		separateEachAbility("Only Pokemon Abilities.txt", "Formatted Abilities.txt");
		changePokemonNoAccents("Formatted Abilities.txt", "Abilities Pokemon No Accent.txt");
		splitAbilityLines("Abilities Pokemon No Accent.txt", "Sort Abilities.txt");
		
		File file1 = new File("Pokemon Ability List.txt");
		file1.delete();
		File file2 = new File("Only Pokemon Abilities.txt");
		file2.delete();
		File file3 = new File("Formatted Abilities.txt");
		file3.delete();
		File file4 = new File("Abilities Pokemon No Accent.txt");
		file4.delete();
		*/
		
		webParse("https://replay.pokemonshowdown.com/gen8vgc2020-1044974365.log", "testReplay.txt");
	}
	
	public static void webParse(String website, String filename) throws IOException
	{
		org.jsoup.nodes.Document doc = Jsoup.connect(website).get();
		
		String title = doc.body().text();
		//System.out.println(title);
		
		Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filename), "utf-8"));
		
		String[] text = new String[10000];
		
		for(int i = 0; i < title.length(); i++)
		{
			text = title.split(" ");
		}
		
		for(int i = 0; i < text.length; i++)
		{
			writer.write(text[i] + System.getProperty("line.separator"));
		}
		writer.close();
	}
	
	public static void separatePokemonData(String fileInput, String fileOutputName) throws IOException
	{
		File readFile = new File(fileInput);
		BufferedReader br = new BufferedReader(new FileReader(readFile));
		Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileOutputName)));
		String line;
		
		while((line = br.readLine()) != null)
		{
			if(line.contains("#"))
			{
				writer.write(System.getProperty("line.separator") + line + ", ");
			}
			else
			{
				writer.write(line + ", ");
			}
		}
		br.close();
		writer.close();
	}
	
	public static void getRidOfFirstLastLine(String fileInput, String fileOutputName) throws IOException
	{
		File readFile = new File(fileInput);
		BufferedReader br = new BufferedReader(new FileReader(readFile));
		Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileOutputName)));
		Scanner sc = new Scanner(fileInput);
		String line;
		int lineCount = 0;
		
		while((line = br.readLine()) != null)
		{
			if(line.contains("#"))
			{
				if(line.contains("Game"))
				{
					int index = line.indexOf("Game");
					line = line.substring(0, 74);
				}
				writer.write(line + System.getProperty("line.separator"));
			}
		}
		
		br.close();
		writer.close();
		sc.close();
	}

	public static void getRidOfExtraTextAttacks(String fileInput, String fileOutputName) throws IOException
	{
		File readFile = new File(fileInput);
		Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileOutputName)));
		Scanner sc = new Scanner(readFile);
		
		ArrayList<String> wantedText = new ArrayList<String>();
		ArrayList<String> noTopText = new ArrayList<String>();
		int lineCount = 0;
		
		for(int i = 0; i < 839; i++)
		{
			sc.nextLine();
		}
		
		while(sc.hasNextLine())
		{
			noTopText.add(sc.nextLine());
			lineCount++;
		}
		
		for(int i = 0; i < lineCount - 78; i++)
		{
			wantedText.add(noTopText.get(i));
		}


		for(int i = 0; i < wantedText.size(); i++)
		{
			writer.write(wantedText.get(i) + System.getProperty("line.separator"));
		}

		writer.close();
		sc.close();
	}
	
	//Fixes ability names in Pokedex Data Format txt file
	public static void fixAbilitiesText(String fileInput, String fileOutput) throws IOException
	{
		File file = new File(fileInput);
		BufferedReader br = new BufferedReader(new FileReader(file));
		Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileOutput)));
		String line;
		String newLine = "";
		ArrayList<Pokemon_Ability_Constructor> listOfAbilities = Pokemon_Ability_Database.createAllAbilities();
		
		while((line = br.readLine()) != null)
		{
			String[] splitLine = line.split(", ");
			String[] newArray = new String[10];
			String ability1 = "";
			String ability2 = "";
			String hidden_ability = "";
			
			for(int i = 0; i < splitLine.length; i++)
			{
				//This IF/ELSE is to format Mr. Mime's, Mr. Rime's, and Mime Jr.'s name and Type: Null's name
				if(i < splitLine.length - 2 && splitLine[i + 2].contains("."))
				{
					splitLine[i + 1] = splitLine[i + 1] + splitLine[i + 2].replace(".", "");
					
					for(int j = 2; j < splitLine.length - 1; j++)
					{
						splitLine[j] = splitLine[j + 1];
					}
				}
				else if(i < splitLine.length - 1 && splitLine[i + 1].contains("."))
				{
					splitLine[i + 1] = splitLine[i + 1].replace(".", "") + splitLine[i + 2]; 
					
					for(int j = 2; j < splitLine.length - 1; j++)
					{
						splitLine[j] = splitLine[j + 1];
					}
				}
				else if(splitLine[i].contains(":"))
				{
					splitLine[i] = splitLine[i].replace(":", "") + splitLine[i + 1];
					
					for(int j = 2; j < splitLine.length - 1; j++)
					{
						splitLine[j] = splitLine[j + 1];
					}
				}
				else if(splitLine[i].contains("-"))
				{
					splitLine[i] = splitLine[i].replace("-", "_");
				}
				
				for(int j = 0; j < listOfAbilities.size(); j++)
				{					
					if(i < splitLine.length - 1 && (splitLine[i] + " " + splitLine[i + 1]).equals(listOfAbilities.get(j).getName()))
					{
						splitLine[i] = listOfAbilities.get(j).getName();
						
						for(int k = i + 1; k < splitLine.length - 1; k++)
						{
							splitLine[k] = splitLine[k + 1];
						}
					}
				}
			}
			
			//All pokemon have at least 1 ability
			ability1 = splitLine[3];
			//This IF/ELSE is for each case of abilities existing
			if(StringUtils.isNumeric(splitLine[4]) == false && StringUtils.isNumeric(splitLine[5]) == false)
			{
				ability2 = splitLine[4];
				hidden_ability = splitLine[5];
			}
			else if(StringUtils.isNumeric(splitLine[4]) == false && StringUtils.isNumeric(splitLine[5]) == true)
			{
				ability2 = "null";
				hidden_ability = splitLine[4];
			}
			else
			{
				ability2 = "null";
				hidden_ability = "null";
			}

			newLine = splitLine[0] + ", " + splitLine[1] + ", " + ability1 + ", " + ability2 + ", " + hidden_ability + ", "; 
			//System.out.println(newLine);		
				
			for(int i = 0; i < splitLine.length; i++)
			{
				if(StringUtils.isNumeric(splitLine[i]) == false && StringUtils.isNumeric(splitLine[i + 1]) == true)
				{
					for(int j = i + 1; j < i + 7; j++)
					{
						newLine = newLine + splitLine[j] + ", ";
					}
				}
			}

			//System.out.println(newLine);
			writer.write(newLine + System.getProperty("line.separator"));
			newLine = "";
		}
		br.close();
		writer.close();
	}
	
	public static void getTypeFromPokemon(String fileInput, String fileOutput) throws IOException
	{
		File readFile = new File(fileInput);
		BufferedReader br = new BufferedReader(new FileReader(readFile));
		Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileOutput)));
		String line;
		
		while((line = br.readLine()) != null)
		{
			String[] splitLine = line.split(", ");
			String[] pokemonWithType = new String[splitLine.length + 2];
			String name = splitLine[1];
			String webName = name;
			
			//Fixes Mr. Mime's, Mr.Rime's and Mime Jr.'s name format for the url
			if(name.contains("Mr") || name.contains("Jr"))
			{
				int period = name.indexOf("r");
				webName = name.substring(0, period + 1) + "." + name.substring(period + 1, name.length());
			}
			//Fixes Type: Null's name format for the url
			if(name.contains("Type"))
			{
				int period = name.indexOf("e");
				webName = name.substring(0, period + 1) + ":" + name.substring(period + 1, name.length());
			}
			
			if(name.contains("_"))
			{
				webName = name.replace("_", "-");
			}
			
			for(int i = 0; i < webName.length(); i++)
			{
				if(i > 0 && Character.isUpperCase(name.charAt(i)))
				{
					if(webName.contains("MimeJr."))
					{
						webName = webName.substring(0, i) + "_" + webName.substring(i, name.length() + 1);
					}
					else
					{
						webName = webName.substring(0, i + 1) + "_" + webName.substring(i + 1, name.length() + 1);
					}
					i = webName.length();
				}
			}

			String newLine = "";
			String website = "https://bulbapedia.bulbagarden.net/wiki/" + webName + "_(Pok%C3%A9mon)";
			webParse(website, name + " Type.txt");
			File file = new File(name + " Type.txt");

			BufferedReader br2 = new BufferedReader(new FileReader(file));
			
			String line2;
			String type1 = "";
			String type2 = "";
			
			while((line2 = br2.readLine()) != null)
			{
				if(line2.contains("Type") && !line2.contains(":"))
				{
					String type1Normal = br2.readLine();
					String type2Normal = br2.readLine();
					br2.readLine();
					String type1Galarian = br2.readLine();
					String type2Galarian = br2.readLine();
					String isGalarian = br2.readLine();
					
					if(isGalarian.equals("Galarian"))
					{
						if(type2Galarian.equals("Unknown"))
						{
							type1 = type1Galarian;
							type2 = "null";
						}
						else
						{
							type1 = type1Galarian;
							type2 = type2Galarian;
						}
						break;
					}
					else
					{
						if(type2Normal.equals("Unknown"))
						{
							type1 = type1Normal;
							type2 = "null";
						}
						else
						{
							type1 = type1Normal;
							type2 = type2Normal;
						}
						break;
					}
				}
			}
			
			pokemonWithType[0] = splitLine[0];
			pokemonWithType[1] = splitLine[1];
			pokemonWithType[2] = type1;
			pokemonWithType[3] = type2;
			
			for(int i = 4; i < pokemonWithType.length; i++)
			{
				pokemonWithType[i] = splitLine[i - 2];
			}
			
			for(int i = 0; i < pokemonWithType.length; i++)
			{
				newLine = newLine + pokemonWithType[i] + ", ";
			}
			writer.write(newLine + System.getProperty("line.separator"));
			newLine = "";
			
			br2.close();
			file.delete();
		}
		
		br.close();
		writer.close();
	}

	public static void formatAttacks(String fileOutputName) throws IOException
	{
		ArrayList<Pokemon_Type_Constructor> All_Types = Pokemon_Type_Database.createAllTypes();
		
		for(int i = 0; i < All_Types.size(); i++)
		{
			webParse("https://www.serebii.net/attackdex-swsh/" + All_Types.get(i).getName() + ".shtml", "Pokemon Attack Type " + All_Types.get(i).getName().toUpperCase() + " Unsorted" + fileOutputName);
			getRidOfExtraTextAttacks("Pokemon Attack Type " + All_Types.get(i).getName().toUpperCase() + " Unsorted" + fileOutputName, "Pokemon Attack Type " + All_Types.get(i).getName().toUpperCase() + fileOutputName);
			File file = new File("Pokemon Attack Type " + All_Types.get(i).getName().toUpperCase() + " Unsorted" + fileOutputName);
			file.delete();
		}
		
		webParse("https://www.serebii.net/attackdex-swsh/physical.shtml", "Pokemon Attack Type Physical Unsorted" + fileOutputName);
		getRidOfExtraTextAttacks("Pokemon Attack Type Physical Unsorted" + fileOutputName, "Pokemon Attack Type Physical" + fileOutputName);
		File physical_file = new File("Pokemon Attack Type Physical Unsorted" + fileOutputName);
		physical_file.delete();
		
		webParse("https://www.serebii.net/attackdex-swsh/special.shtml", "Pokemon Attack Type Special Unsorted" + fileOutputName);
		getRidOfExtraTextAttacks("Pokemon Attack Type Special Unsorted" + fileOutputName, "Pokemon Attack Type Special" + fileOutputName);
		File special_file = new File("Pokemon Attack Type Special Unsorted" + fileOutputName);
		special_file.delete();
		
		webParse("https://www.serebii.net/attackdex-swsh/other.shtml", "Pokemon Attack Type Other Unsorted" + fileOutputName);
		getRidOfExtraTextAttacks("Pokemon Attack Type Other Unsorted" + fileOutputName, "Pokemon Attack Type Other" + fileOutputName);
		File other_file = new File("Pokemon Attack Type Other Unsorted" + fileOutputName);
		other_file.delete();
	}
	
	public static void getPokemonAbilities(String fileInput, String fileOutput) throws IOException
	{
		File readFile = new File(fileInput);
		BufferedReader br = new BufferedReader(new FileReader(readFile));
		Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileOutput)));

		for(int i = 0; i < 1417; i++)
		{
			br.readLine();
		}
		
		for(int i = 0; i < 3935; i++)
		{
			writer.write(br.readLine() + System.getProperty("line.separator"));
		}
		br.close();
		writer.close();
	}
	
	public static void separateEachAbility(String fileInput, String fileOutput) throws IOException
	{
		File readFile = new File(fileInput);
		BufferedReader br = new BufferedReader(new FileReader(readFile));
		Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileOutput)));
		String line = br.readLine();
		String printLine = "";

		ArrayList<String> sortedAbilities = new ArrayList<String>();
		
		while((line = br.readLine()) != null)
		{
			if(StringUtils.isNumeric(line) == true || line.equals("â€”"))
			{
				sortedAbilities.add(printLine.trim() + System.getProperty("line.separator"));
				printLine = "";
			}
			else
			{
				if(line.contains("â€”"))
				{
					line.replace("â€”", "-");
				}
				printLine = printLine + " " + line;
			}
		}
		sortedAbilities.add(printLine.trim());

		for(int i = 0; i < sortedAbilities.size(); i++)
		{
			//System.out.println(sortedAbilities.get(i));
			writer.write(sortedAbilities.get(i));
		}
		
		writer.close();
		br.close();
	}
	
	public static void changePokemonNoAccents(String fileInput, String fileOutput) throws IOException
	{
		File readFile = new File(fileInput);
		BufferedReader br = new BufferedReader(new FileReader(readFile));
		Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileOutput)));
		String line;
		
		while((line = br.readLine()) != null)
		{
			line = Normalizer.normalize(line, Normalizer.Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "/");
			String[] lineArray = line.split(" ");
			String newLine = "";
			
			//Converts Pokemon Unicode to String pokemon
			for(int i = 0; i < lineArray.length; i++)
			{
				if(lineArray[i].contains("A/©"))
				{
					lineArray[i] = lineArray[i].replace("A/©", "e").replace("P", "p");
				}
				if(lineArray[i].contains("Berries") || lineArray[i].contains("Berry") || lineArray[i].contains("HP") || lineArray[i].contains("-type") || lineArray[i].contains("Cells"))
				{
					lineArray[i] = lineArray[i].toLowerCase();
				}
				newLine = newLine + lineArray[i] + " ";
			}
			writer.write(newLine + System.getProperty("line.separator"));
		}
		
		br.close();
		writer.close();
	}
	
	public static void splitAbilityLines(String fileInput, String fileOutput) throws IOException
	{
		File readFile = new File(fileInput);
		BufferedReader br = new BufferedReader(new FileReader(readFile));
		Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileOutput)));
		String line;
		
		ArrayList<String> formattedLine = new ArrayList<String>();
		
		while((line = br.readLine()) != null)
		{
			String[] lineArray = line.split(" ");
			//String[] lineArray = "Power of Alchemy The Pokémon copies the Ability of a defeated ally. VII".split(" ");
			String newLine = "";
			
			for(int i = 0; i < 4; i++)
			{	
				String name1 = "";
				String effect1 = "";
				String generation1 = "";
				
				//This if block statement is used to only fix Rattled's formatting
				if(lineArray[i + 1].contains("-,"))
				{
					name1 = lineArray[i];
					
					for(int j = i + 1; j < lineArray.length - 1; j++)
					{
						effect1 = effect1 + lineArray[j] + " ";
					}
					
					generation1 = lineArray[lineArray.length - 1];
					
					newLine = name1.trim() + "/ " + effect1.trim() + "/ " + generation1.trim();
					formattedLine.add(newLine);
					
					break;
				}

				if(Character.isUpperCase(lineArray[i].charAt(0)) == true && Character.isUpperCase(lineArray[i + 1].charAt(0)) == false)
				{					
					//This checks if a "-type" move follows immediately after the name (single index)
					//If so then it automatically sets the name as index 0, the effect as index 1 to index size-1(exclusive)
					//and the generation to index size - 1
					if(i == 0)
					{
						//This if statement is only for Power of Alchemy since it's formattting is dumb as fuck
						//It follows too well but having a lowercase "of" doesn't format correctly with my algorithm
						if(lineArray[i].equals("Power") && lineArray[i + 1].equals("of"))
						{
							name1 = lineArray[0] + " " + lineArray[1] + " " + lineArray[2];
							
							for(int j = 3; j < lineArray.length - 1; j++)
							{
								effect1 = effect1 + lineArray[j] + " ";
							}
							
							generation1 = lineArray[lineArray.length - 1];
						}
						else
						{
							name1 = lineArray[0];
						
							for(int j = 1; j < lineArray.length - 1; j++)
							{
								effect1 = effect1 + lineArray[j] + " ";
							}
							
							generation1 = lineArray[lineArray.length - 1];
						}
						newLine = name1.trim() + "/ " + effect1.trim() + "/ " + generation1.trim();
						formattedLine.add(newLine);	
						break;
					}
					
					//Must be 4 to allow Full Metal Body to fit in the algorithm
					if(i < 4)
					{
						if(lineArray[i].equals("Speed"))
						{
							name1 = lineArray[0] + " " + lineArray[1];
							
							for(int j = 2; j < lineArray.length - 1; j++)
							{
								effect1 = effect1 + lineArray[j] + " ";
							}
							
							generation1 = lineArray[lineArray.length - 1];
						}
						else
						{
							for(int j = 0; j < i; j++)
							{
								name1 = name1 + lineArray[j] + " ";
							}
							for(int k = i + 1; k < lineArray.length; k++)
							{
								effect1 = effect1 + lineArray[k - 1] + " ";
								generation1 = lineArray[k];
							}
						}
					}		
					newLine = name1.trim() + "/ " + effect1.trim() + "/ " + generation1.trim();
					formattedLine.add(newLine);
					break;
				}
			}
		}

		for(int i = 0; i < formattedLine.size(); i++)
		{
			writer.write(formattedLine.get(i) + System.getProperty("line.separator"));
		}

		writer.close();
		br.close();
	}
}
