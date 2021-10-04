import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class CreateAllPokemonDataFromScratch
{
	public static void main(String[] args) throws IOException
	{
		long startTime = System.nanoTime();
		ArrayList<Pokemon_Type_Constructor> types = createAllPokemonTypes();
		ArrayList<Pokemon_Ability_Constructor> abilities = createAllAbilities();
		ArrayList<Pokemon_Move_Constructor> moves = createAllMoves();
		ArrayList<Pokemon_Constructor> pokemon = createAllPokemon();
		long endTime = System.nanoTime();
		System.out.println("Time: " + (endTime - startTime) / 1000000 / 1000 + " seconds have passed");
	}
	
	public static ArrayList<Pokemon_Constructor> createAllPokemon() throws IOException
	{
		webpageParser.webParse("https://www.serebii.net/swordshield/galarpokedex.shtml", "Pokedex Info.txt");
		webpageParser.separatePokemonData("Pokedex Info.txt", "Pokedex Data.txt");
		File file1 = new File("Pokedex Info.txt");
		file1.delete();
		webpageParser.getRidOfFirstLastLine("Pokedex Data.txt", "Pokedex Data Format.txt");
		File file2 = new File("Pokedex Data.txt");
		file2.delete();
		webpageParser.fixAbilitiesText("Pokedex Data Format.txt", "Pokedex Data Format with Abilities.txt");
		File file3 = new File("Pokedex Data Format.txt");
		file3.delete();
		webpageParser.getTypeFromPokemon("Pokedex Data Format with Abilities.txt", "Pokedex Data Format with Abilities and Types.txt");
		File file4 = new File("Pokedex Data Format with Abilities.txt");
		file4.delete();
		
		ArrayList<Pokemon_Constructor> pokemon = Pokemon_Database.createAllPokemon();
		return pokemon;
	}
	
	public static ArrayList<Pokemon_Type_Constructor> createAllPokemonTypes()
	{
		ArrayList<Pokemon_Type_Constructor> allPokemonType = Pokemon_Type_Database.createAllTypes();
		return allPokemonType;
	}
	
	public static ArrayList<Pokemon_Move_Constructor> createAllMoves() throws IOException
	{
		webpageParser.formatAttacks(".txt");
		Pokemon_Move_Database.createAllAttacks();
		Pokemon_Move_Database.sortAllMoves();
		
		ArrayList<Pokemon_Type_Constructor> All_Types = Pokemon_Type_Database.createAllTypes();
		
		for(int i = 0; i <All_Types.size(); i++)
		{
			String type = All_Types.get(i).getName().toUpperCase().trim();
			Pokemon_Move_Database.movesOneFile("Pokemon Attack Type " + type + " FINAL.txt");
			File file = new File("Pokemon Attack Type " + type + " FINAL.txt");
			file.delete();
		}
		ArrayList<Pokemon_Move_Constructor> All_Move_Database = Pokemon_Move_Database.All_Pokemon_Move_Database();
		return All_Move_Database;
	}
	
	public static ArrayList<Pokemon_Ability_Constructor> createAllAbilities() throws IOException
	{
		webpageParser.webParse("https://bulbapedia.bulbagarden.net/wiki/Ability", "Pokemon Ability List.txt");
		webpageParser.getPokemonAbilities("Pokemon Ability List.txt", "Only Pokemon Abilities.txt");
		webpageParser.separateEachAbility("Only Pokemon Abilities.txt", "Formatted Abilities.txt");
		webpageParser.changePokemonNoAccents("Formatted Abilities.txt", "Abilities Pokemon No Accent.txt");
		webpageParser.splitAbilityLines("Abilities Pokemon No Accent.txt", "Sort Abilities.txt");

		File file1 = new File("Pokemon Ability List.txt");
		file1.delete();
		File file2 = new File("Only Pokemon Abilities.txt");
		file2.delete();
		File file3 = new File("Formatted Abilities.txt");
		file3.delete();
		File file4 = new File("Abilities Pokemon No Accent.txt");
		file4.delete();
		ArrayList<Pokemon_Ability_Constructor> All_Ability_Database = Pokemon_Ability_Database.createAllAbilities();
		return All_Ability_Database;
	}
}
