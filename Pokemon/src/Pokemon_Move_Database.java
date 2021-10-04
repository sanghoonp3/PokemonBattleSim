import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class Pokemon_Move_Database
{
	public static void main(String[] args) throws IOException
	{
		//createAllAttacks();
		//sortAllMoves();
		/*
		ArrayList<Pokemon_Type_Constructor> All_Types = Pokemon_Type_Database.createAllTypes();
		
		for(int i = 0; i <All_Types.size(); i++)
		{
			String type = All_Types.get(i).getName().toUpperCase().trim();
			movesOneFile("Pokemon Attack Type " + type + " FINAL.txt");
			File file = new File("Pokemon Attack Type " + type + " FINAL.txt");
			file.delete();
		}
		*/
		ArrayList<Pokemon_Move_Constructor> All_Move_Database = All_Pokemon_Move_Database();
	}
	
	public static void createAllAttacks() throws IOException
	{
		ArrayList<Pokemon_Type_Constructor> All_Types = Pokemon_Type_Database.createAllTypes();

		for(int i = 0; i < All_Types.size(); i++)
		{
			String[] fileNames = formatMoves("Pokemon Attack Type " + All_Types.get(i).getName().toUpperCase() + ".txt");
			File deleteFile = new File(fileNames[0]);
			deleteFile.delete();

			String fileOutput2 = finalFormatMoves(fileNames[1]);
			File deleteFile2 = new File(fileOutput2);
			deleteFile2.delete();
		}

		String[] physicalMovesOutput = formatMoves("Pokemon Attack Type Physical.txt");
		String physicalMovesOutput2 = finalFormatMoves(physicalMovesOutput[1]);
		File deletePhysicalFile = new File(physicalMovesOutput[0]);
		File deletePhysicalFile2 = new File(physicalMovesOutput2);
		deletePhysicalFile.delete();
		deletePhysicalFile2.delete();
		
		String[] specialMovesOutput = formatMoves("Pokemon Attack Type Special.txt");
		String specialMovesOutput2 = finalFormatMoves(specialMovesOutput[1]);
		File deleteSpecialFile = new File(specialMovesOutput[0]);
		File deleteSpecialFile2 = new File(specialMovesOutput2);
		deleteSpecialFile.delete();
		deleteSpecialFile2.delete();
		
		String[] otherMovesOutput = formatMoves("Pokemon Attack Type Other.txt");
		String otherMovesOutput2 = finalFormatMoves(otherMovesOutput[1]);
		File deleteOtherFile = new File(otherMovesOutput[0]);
		File deleteOtherFile2 = new File(otherMovesOutput2);
		deleteOtherFile.delete();
		deleteOtherFile2.delete();
	}
	
	public static String[] formatMoves(String file) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader(file));
		Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file.substring(0, file.length() - 4) + " Formatted.txt")));
		String[] fileNames = {file, file.substring(0, file.length() - 4) + " Formatted.txt"};
		
		ArrayList<String> formattedMoves = new ArrayList<String>();
		
		Scanner sc = new Scanner(file);
		String line = sc.nextLine();
		String formattedLine = "";
		
		while((line = br.readLine()) != null)
		{
			if(line.contains("."))
			{
				formattedLine = formattedLine + " " + line;
				formattedMoves.add(formattedLine);
				formattedLine = "";
			}
			else
			{
				formattedLine = (formattedLine + " " + line).replace("\\s", "").trim();
			}
		}
		
		for(int i = 0; i < formattedMoves.size(); i++)
		{
			writer.write(formattedMoves.get(i) + System.getProperty("line.separator"));
		}
		
		writer.close();
		br.close();
		sc.close();

		//readFile.delete();
		
		return fileNames;
	}
	
	public static String finalFormatMoves(String file) throws IOException, NullPointerException
	{
		BufferedReader br = new BufferedReader(new FileReader(file));
		Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file.substring(0, file.length() - 4) + " Final.txt")));
		String inputName = file;
		
		//ArrayList<String> formattedMoves = new ArrayList<String>();
		
		Scanner sc = new Scanner(file);
		String line = br.readLine();
		
		//System.out.println(line);
		
		while(line != null)
		{
			String checkLine = br.readLine();

			if(checkLine == null)
			{
				//formattedMoves.add(line);
				writer.write(line + System.getProperty("line.separator"));
				break;
			}
			else
			{
				String[] checkedLine = checkLine.split(" ");
				
				if(checkedLine.length > 2)
				{
					if(StringUtils.isNumeric(checkedLine[1]) == true || StringUtils.isNumeric(checkedLine[2]) == true)
					{
						//formattedMoves.add(line);
						writer.write(line + System.getProperty("line.separator"));
						line = checkLine;
					}
					else
					{
						line = line + " " + checkLine;
					}
				}
				else
				{
					line = line + " " + checkLine;
				}
			}
		}
		
		writer.close();
		br.close();
		sc.close();
		
		return inputName;
	}
	
	public static void deleteOldFiles() throws IOException
	{
		ArrayList<Pokemon_Type_Constructor> All_Types = Pokemon_Type_Database.createAllTypes();
	
		for(int i = 0; i < All_Types.size(); i++)
		{
			String[] fileNames = formatMoves("Pokemon Attack Type " + All_Types.get(i).getName().toUpperCase() + ".txt");
			File deleteFile = new File(fileNames[0]);
			deleteFile.delete();

			String fileOutput2 = finalFormatMoves(fileNames[1]);
			File deleteFile2 = new File(fileOutput2);
			deleteFile2.delete();
		}
		
		String[] physicalMovesOutput = formatMoves("Pokemon Attack Type Physical.txt");
		String physicalMovesOutput2 = finalFormatMoves(physicalMovesOutput[1]);
		File deletePhysicalFile = new File(physicalMovesOutput[0]);
		File deletePhysicalFile2 = new File(physicalMovesOutput2);
		deletePhysicalFile.delete();
		deletePhysicalFile2.delete();
		
		String[] specialMovesOutput = formatMoves("Pokemon Attack Type Special.txt");
		String specialMovesOutput2 = finalFormatMoves(specialMovesOutput[1]);
		File deleteSpecialFile = new File(specialMovesOutput[0]);
		File deleteSpecialFile2 = new File(specialMovesOutput2);
		deleteSpecialFile.delete();
		deleteSpecialFile2.delete();
		
		String[] otherMovesOutput = formatMoves("Pokemon Attack Type Other.txt");
		String otherMovesOutput2 = finalFormatMoves(otherMovesOutput[1]);
		File deleteOtherFile = new File(otherMovesOutput[0]);
		File deleteOtherFile2 = new File(otherMovesOutput2);
		deleteOtherFile.delete();
		deleteOtherFile2.delete();
	}
	
	public static void compareAttacksForCategory(String file1, String file2) throws IOException, NullPointerException
	{
		File readFile1 = new File(file1);
		File readFile2 = new File(file2);
		
		ArrayList<String> movesWithCategory = new ArrayList<String>();
		
		BufferedReader br1 = new BufferedReader(new FileReader(readFile1));
		FileWriter writer = new FileWriter(file1.substring(0, 20) + file1.substring(20, file1.length() - 19).toUpperCase() + "FINAL" + ".txt", true);

		String line1;
		
		while((line1 = br1.readLine()) != null)
		{
			BufferedReader br2 = new BufferedReader(new FileReader(readFile2));
			String line2 = br2.readLine();
			
			while((line2 = br2.readLine()) != null)
			{
				if(line1.equals(line2))
				{
					String category = file2.substring(20, file2.length() - 20);
					String[] lineSeparated = line1.split(" ");
					String[] categoryLine = new String[lineSeparated.length + 1];

					for(int i = 0; i < categoryLine.length; i++)
					{
						if(StringUtils.isNumeric(lineSeparated[1]))
						{
							if(i < 4)
							{
								categoryLine[i] = lineSeparated[i];
							}
							else if(i == 4)
							{
								categoryLine[i] = category;
							}
							else
							{
								categoryLine[i] = lineSeparated[i - 1];
							}
						}
						else if(StringUtils.isNumeric(lineSeparated[2]))
						{
							if(i < 5)
							{
								categoryLine[i] = lineSeparated[i];
							}
							else if(i == 5)
							{
								categoryLine[i] = category;
							}
							else
							{
								categoryLine[i] = lineSeparated[i - 1];
							}
						}
					}
					
					String line = "";					
					for(int i = 0; i < categoryLine.length; i++)
					{
						line = line + categoryLine[i] + " ";
					}
					movesWithCategory.add(line);
				}
			}			
			br2.close();
		}

		for(int i = 0; i < movesWithCategory.size(); i++)
		{
			writer.write(movesWithCategory.get(i) + System.getProperty("line.separator"));
		}

		br1.close();
		writer.close();
	}
	
	public static void sortAllMoves() throws NullPointerException, IOException
	{
		ArrayList<Pokemon_Type_Constructor> All_Types = Pokemon_Type_Database.createAllTypes();
		
		for(int i = 0; i < All_Types.size(); i++)
		{
			String fileName = "Pokemon Attack Type " + All_Types.get(i).getName().toUpperCase() + " Formatted Final.txt";
			
			compareAttacksForCategory(fileName, "Pokemon Attack Type Other Formatted Final.txt");

			compareAttacksForCategory(fileName, "Pokemon Attack Type Physical Formatted Final.txt");
			
			compareAttacksForCategory(fileName, "Pokemon Attack Type Special Formatted Final.txt");
			File deleteFile = new File(fileName);
			deleteFile.delete();
		}
	}
	
	public static void movesOneFile(String file) throws IOException
	{
		ArrayList<String> Pokemon_Move = new ArrayList<String>();
		ArrayList<Pokemon_Type_Constructor> All_Pokemon_Types = Pokemon_Type_Database.createAllTypes();
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		FileWriter fw = new FileWriter("All Pokemon Move List.txt", true);
		
		String type = file.substring(20, file.length() - 10).toLowerCase();
		String line;
		
		while((line = br.readLine()) != null)
		{
			String[] separatedString = line.split(" ");
			
			if(StringUtils.isNumeric(separatedString[1]))
			{
				for(int i = 0; i < 1; i++)
				{
					String name = "";
					String category = "";
					String pp = "";
					String base_power = "";
					String accuracy = "";
					String effect = "";
					
					while(StringUtils.isNumeric(separatedString[i]) == false && (StringUtils.isNumeric(separatedString[i + 2]) || separatedString[i + 2].equals("--")))
					{
						name = name + separatedString[i] + " ";
						i++;
					}
					
					if(StringUtils.isNumeric(separatedString[i]) && (StringUtils.isNumeric(separatedString[i + 1]) || separatedString[i + 1].equals("--")) && StringUtils.isNumeric(separatedString[i + 2]))
					{
						pp = separatedString[i];
						base_power = separatedString[i + 1];
						accuracy = separatedString[i + 2];
						category = separatedString[i + 3];
						
						for(int j = i + 4; j < separatedString.length; j++)
						{
							effect = effect + separatedString[j] + " ";
						}
					}
					String moveString = name + ", " + type + ", " + category + ", " + ", " + pp + ", " + base_power + ", " + accuracy + ", " + effect;
					Pokemon_Move.add(moveString);
				}
			}
			else
			{
				for(int i = 0; i < 2; i++)
				{
					String name = "";
					String category = "";
					String pp = "";
					String base_power = "";
					String accuracy = "";
					String effect = "";
					
					while(StringUtils.isNumeric(separatedString[i]) == false && (StringUtils.isNumeric(separatedString[i + 2]) || separatedString[i + 2].equals("--")))
					{
						name = name + separatedString[i] + " ";
						i++;
					}
					
					if(StringUtils.isNumeric(separatedString[i]) && (StringUtils.isNumeric(separatedString[i + 1]) || separatedString[i + 1].equals("--")) && StringUtils.isNumeric(separatedString[i + 2]))
					{
						pp = separatedString[i];
						base_power = separatedString[i + 1];
						accuracy = separatedString[i + 2];
						category = separatedString[i + 3];
						
						for(int j = i + 4; j < separatedString.length; j++)
						{
							effect = effect + separatedString[j] + " ";
						}
					}
					String moveString = name + ", " + type + ", " + category + ", " + pp + ", " + base_power + ", " + accuracy + ", " + effect;
					Pokemon_Move.add(moveString);
				}
			}
		}
		
		for(int i = 0; i < Pokemon_Move.size(); i++)
		{
			fw.write(Pokemon_Move.get(i) + System.getProperty("line.separator"));
		}
		
		fw.close();
		br.close();
	}
	
	public static ArrayList<Pokemon_Move_Constructor> All_Pokemon_Move_Database() throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("All Pokemon Move List.txt"));
		String line;
		
		ArrayList<Pokemon_Type_Constructor> All_Types = Pokemon_Type_Database.createAllTypes();
		ArrayList<Pokemon_Move_Constructor> All_Moves = new ArrayList<Pokemon_Move_Constructor>();
		
		while((line = br.readLine()) != null)
		{
			String[] moves = line.split(",");
			Pokemon_Type_Constructor type = null;
			
			for(int i = 0; i < moves.length; i++)
			{
				moves[i] = moves[i].trim();
			}
			
			for(int i = 0; i < All_Types.size(); i++)
			{
				if(All_Types.get(i).getName().equals(moves[1]))
				{
					type = All_Types.get(i);
				}
			}
			Pokemon_Move_Constructor move = new Pokemon_Move_Constructor(moves[0], type, moves[2], moves[3], moves[4], moves[5], moves[6]);
			All_Moves.add(move);
		}
		br.close();
		return All_Moves;
	}
}
