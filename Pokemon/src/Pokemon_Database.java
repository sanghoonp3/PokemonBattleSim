import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

public class Pokemon_Database 
{
	ArrayList<Pokemon_Constructor> Pokemon = new ArrayList<Pokemon_Constructor>();
	static ArrayList<String[]> PokemonList = new ArrayList<String[]>();
	
	public static void main(String[] args) throws IOException, NoSuchMethodException, SecurityException
	{
		//File file = new File("Pokedex Data Format with Abilities and Types.txt");
		//createAllPokemonConstructor(file);
		createAllPokemon();
	}
	
	public static void createAllPokemonConstructor(File file) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader(file));
		Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Pokemon Constructors.txt")));
		
		ArrayList<Pokemon_Ability_Constructor> abilityNames = Pokemon_Ability_Database.createAllAbilities();
		
		Scanner sc = new Scanner(file);
		String line = sc.nextLine();
		
		while((line = br.readLine()) != null)
		{
			String[] pokemon_info = line.split(", ");
			String name = pokemon_info[1].replace("'", "");
			String type1 = pokemon_info[2].toLowerCase();
			String type2 = pokemon_info[3].toLowerCase();
			if(!type2.equals("null"))
			{
				type2 = "Pokemon_Type_Database." + pokemon_info[3].toLowerCase() + "()";
			}
			
			String ability1 = pokemon_info[4].replace(" ", "");
			if(ability1.contains("Compoundeyes"))
			{
				ability1 = "CompoundEyes";
			}
			
			String ability2 = pokemon_info[5];
			if(!ability2.equals("null"))
			{
				ability2 = "Pokemon_Ability_Database." + pokemon_info[5].replace(" ", "") + "()";
			}
			if(ability2.contains("Compoundeyes"))
			{
				ability2 = "Pokemon_Ability_Database.CompoundEyes()";
			}
			
			String hidden_ability = pokemon_info[6];
			if(!hidden_ability.equals("null"))
			{
				hidden_ability = "Pokemon_Ability_Database." + pokemon_info[6].replace(" ", "") + "()";
			}
			
			String hp = pokemon_info[7];
			String attack = pokemon_info[8];
			String defense = pokemon_info[9];
			String special_attack = pokemon_info[10];
			String special_defense = pokemon_info[11];
			String speed = pokemon_info[12];
			
			//These print lines print out each line of the constructor for each pokemon
			/*
			System.out.println("public static Pokemon_Constructor " + name + "()");
			System.out.println("{");
			
			System.out.println("\t" + "int base_stat = {" + hp + ", " + attack + ", " + defense + ", " + special_attack + ", " + special_defense + ", " + speed + "};");
			
			System.out.println("\t" + "Pokemon_Constructor " + name + " = new Pokemon_Constructor(" + '"' + name + '"' + ", Pokemon_Type_Database." + type1 + "(), " + 
								type2 + ", Pokemon_Ability_Database." + ability1 + "(), " + ability2 + ", " + hidden_ability + ", base_stats);");
			
			System.out.println("\t" + "return " + name + ";");
			System.out.println("}");
			System.out.println();
			*/
			
			//These write the lines of the pokemon constructor to a txt file
			writer.write("public static Pokemon_Constructor " + name + "()" + System.getProperty("line.separator"));
			writer.write("{" + System.getProperty("line.separator"));
			
			writer.write("\t" + "int[] base_stats = {" + hp + ", " + attack + ", " + defense + ", " + special_attack + ", " + special_defense + ", " + speed + "};" + System.getProperty("line.separator"));
			
			writer.write("\t" + "Pokemon_Constructor " + name + " = new Pokemon_Constructor(" + '"' + name + '"' + ", Pokemon_Type_Database." + type1 + "(), " + 
								type2 + ", Pokemon_Ability_Database." + ability1 + "(), " + ability2 + ", " + hidden_ability + ", base_stats);" + System.getProperty("line.separator"));
			
			writer.write("\t" + "return " + name + ";" + System.getProperty("line.separator"));
			writer.write("}" + System.getProperty("line.separator"));
		}
		writer.close();
		sc.close();
		br.close();
	}

	/*
	public static Pokemon_Constructor Dragapult()
	{
		int[] Dragapult_Base_Stats = {88, 120, 75, 100, 75, 142};
		Pokemon_Constructor Dragapult = new Pokemon_Constructor("Dragapult", Pokemon_Type_Database.dragon(), Pokemon_Type_Database.ghost(), "Clear Body", "Infiltrator", "Cursed Body", Dragapult_Base_Stats);
		return Dragapult;
	}
	*/

	public static ArrayList<Pokemon_Constructor> createAllPokemon() throws IOException
	{
		ArrayList<Pokemon_Constructor> All_Pokemon = new ArrayList<Pokemon_Constructor>();
		All_Pokemon.add(Grookey());
		All_Pokemon.add(Thwackey());
		All_Pokemon.add(Rillaboom());
		All_Pokemon.add(Scorbunny());
		All_Pokemon.add(Raboot());
		All_Pokemon.add(Cinderace());
		All_Pokemon.add(Sobble());
		All_Pokemon.add(Drizzile());
		All_Pokemon.add(Inteleon());
		All_Pokemon.add(Blipbug());
		All_Pokemon.add(Dottler());
		All_Pokemon.add(Orbeetle());
		All_Pokemon.add(Caterpie());
		All_Pokemon.add(Metapod());
		All_Pokemon.add(Butterfree());
		All_Pokemon.add(Grubbin());
		All_Pokemon.add(Charjabug());
		All_Pokemon.add(Vikavolt());
		All_Pokemon.add(Hoothoot());
		All_Pokemon.add(Noctowl());
		All_Pokemon.add(Rookidee());
		All_Pokemon.add(Corvisquire());
		All_Pokemon.add(Corviknight());
		All_Pokemon.add(Skwovet());
		All_Pokemon.add(Greedent());
		All_Pokemon.add(Pidove());
		All_Pokemon.add(Tranquill());
		All_Pokemon.add(Unfezant());
		All_Pokemon.add(Nickit());
		All_Pokemon.add(Thievul());
		All_Pokemon.add(Zigzagoon());
		All_Pokemon.add(Linoone());
		All_Pokemon.add(Obstagoon());
		All_Pokemon.add(Wooloo());
		All_Pokemon.add(Dubwool());
		All_Pokemon.add(Lotad());
		All_Pokemon.add(Lombre());
		All_Pokemon.add(Ludicolo());
		All_Pokemon.add(Seedot());
		All_Pokemon.add(Nuzleaf());
		All_Pokemon.add(Shiftry());
		All_Pokemon.add(Chewtle());
		All_Pokemon.add(Drednaw());
		All_Pokemon.add(Purrloin());
		All_Pokemon.add(Liepard());
		All_Pokemon.add(Yamper());
		All_Pokemon.add(Boltund());
		All_Pokemon.add(Bunnelby());
		All_Pokemon.add(Diggersby());
		All_Pokemon.add(Minccino());
		All_Pokemon.add(Cinccino());
		All_Pokemon.add(Bounsweet());
		All_Pokemon.add(Steenee());
		All_Pokemon.add(Tsareena());
		All_Pokemon.add(Oddish());
		All_Pokemon.add(Gloom());
		All_Pokemon.add(Vileplume());
		All_Pokemon.add(Bellossom());
		All_Pokemon.add(Budew());
		All_Pokemon.add(Roselia());
		All_Pokemon.add(Roserade());
		All_Pokemon.add(Wingull());
		All_Pokemon.add(Pelipper());
		All_Pokemon.add(Joltik());
		All_Pokemon.add(Galvantula());
		All_Pokemon.add(Electrike());
		All_Pokemon.add(Manectric());
		All_Pokemon.add(Vulpix());
		All_Pokemon.add(Ninetales());
		All_Pokemon.add(Growlithe());
		All_Pokemon.add(Arcanine());
		All_Pokemon.add(Vanillite());
		All_Pokemon.add(Vanillish());
		All_Pokemon.add(Vanilluxe());
		All_Pokemon.add(Swinub());
		All_Pokemon.add(Piloswine());
		All_Pokemon.add(Mamoswine());
		All_Pokemon.add(Delibird());
		All_Pokemon.add(Snorunt());
		All_Pokemon.add(Glalie());
		All_Pokemon.add(Froslass());
		All_Pokemon.add(Baltoy());
		All_Pokemon.add(Claydol());
		All_Pokemon.add(Mudbray());
		All_Pokemon.add(Mudsdale());
		All_Pokemon.add(Dwebble());
		All_Pokemon.add(Crustle());
		All_Pokemon.add(Golett());
		All_Pokemon.add(Golurk());
		All_Pokemon.add(Munna());
		All_Pokemon.add(Musharna());
		All_Pokemon.add(Natu());
		All_Pokemon.add(Xatu());
		All_Pokemon.add(Stufful());
		All_Pokemon.add(Bewear());
		All_Pokemon.add(Snover());
		All_Pokemon.add(Abomasnow());
		All_Pokemon.add(Krabby());
		All_Pokemon.add(Kingler());
		All_Pokemon.add(Wooper());
		All_Pokemon.add(Quagsire());
		All_Pokemon.add(Corphish());
		All_Pokemon.add(Crawdaunt());
		All_Pokemon.add(Nincada());
		All_Pokemon.add(Ninjask());
		All_Pokemon.add(Shedinja());
		All_Pokemon.add(Tyrogue());
		All_Pokemon.add(Hitmonlee());
		All_Pokemon.add(Hitmonchan());
		All_Pokemon.add(Hitmontop());
		All_Pokemon.add(Pancham());
		All_Pokemon.add(Pangoro());
		All_Pokemon.add(Klink());
		All_Pokemon.add(Klang());
		All_Pokemon.add(Klinklang());
		All_Pokemon.add(Combee());
		All_Pokemon.add(Vespiquen());
		All_Pokemon.add(Bronzor());
		All_Pokemon.add(Bronzong());
		All_Pokemon.add(Ralts());
		All_Pokemon.add(Kirlia());
		All_Pokemon.add(Gardevoir());
		All_Pokemon.add(Gallade());
		All_Pokemon.add(Drifloon());
		All_Pokemon.add(Drifblim());
		All_Pokemon.add(Gossifleur());
		All_Pokemon.add(Eldegoss());
		All_Pokemon.add(Cherubi());
		All_Pokemon.add(Cherrim());
		All_Pokemon.add(Stunky());
		All_Pokemon.add(Skuntank());
		All_Pokemon.add(Tympole());
		All_Pokemon.add(Palpitoad());
		All_Pokemon.add(Seismitoad());
		All_Pokemon.add(Duskull());
		All_Pokemon.add(Dusclops());
		All_Pokemon.add(Dusknoir());
		All_Pokemon.add(Machop());
		All_Pokemon.add(Machoke());
		All_Pokemon.add(Machamp());
		All_Pokemon.add(Gastly());
		All_Pokemon.add(Haunter());
		All_Pokemon.add(Gengar());
		All_Pokemon.add(Magikarp());
		All_Pokemon.add(Gyarados());
		All_Pokemon.add(Goldeen());
		All_Pokemon.add(Seaking());
		All_Pokemon.add(Remoraid());
		All_Pokemon.add(Octillery());
		All_Pokemon.add(Shellder());
		All_Pokemon.add(Cloyster());
		All_Pokemon.add(Feebas());
		All_Pokemon.add(Milotic());
		All_Pokemon.add(Basculin());
		All_Pokemon.add(Wishiwashi());
		All_Pokemon.add(Pyukumuku());
		All_Pokemon.add(Trubbish());
		All_Pokemon.add(Garbodor());
		All_Pokemon.add(Sizzlipede());
		All_Pokemon.add(Centiskorch());
		All_Pokemon.add(Rolycoly());
		All_Pokemon.add(Carkol());
		All_Pokemon.add(Coalossal());
		All_Pokemon.add(Diglett());
		All_Pokemon.add(Dugtrio());
		All_Pokemon.add(Drilbur());
		All_Pokemon.add(Excadrill());
		All_Pokemon.add(Roggenrola());
		All_Pokemon.add(Boldore());
		All_Pokemon.add(Gigalith());
		All_Pokemon.add(Timburr());
		All_Pokemon.add(Gurdurr());
		All_Pokemon.add(Conkeldurr());
		All_Pokemon.add(Woobat());
		All_Pokemon.add(Swoobat());
		All_Pokemon.add(Noibat());
		All_Pokemon.add(Noivern());
		All_Pokemon.add(Onix());
		All_Pokemon.add(Steelix());
		All_Pokemon.add(Arrokuda());
		All_Pokemon.add(Barraskewda());
		All_Pokemon.add(Meowth());
		All_Pokemon.add(Perrserker());
		All_Pokemon.add(Persian());
		All_Pokemon.add(Milcery());
		All_Pokemon.add(Alcremie());
		All_Pokemon.add(Cutiefly());
		All_Pokemon.add(Ribombee());
		All_Pokemon.add(Ferroseed());
		All_Pokemon.add(Ferrothorn());
		All_Pokemon.add(Pumpkaboo());
		All_Pokemon.add(Gourgeist());
		All_Pokemon.add(Pichu());
		All_Pokemon.add(Pikachu());
		All_Pokemon.add(Raichu());
		All_Pokemon.add(Eevee());
		All_Pokemon.add(Vaporeon());
		All_Pokemon.add(Jolteon());
		All_Pokemon.add(Flareon());
		All_Pokemon.add(Espeon());
		All_Pokemon.add(Umbreon());
		All_Pokemon.add(Leafeon());
		All_Pokemon.add(Glaceon());
		All_Pokemon.add(Sylveon());
		All_Pokemon.add(Applin());
		All_Pokemon.add(Flapple());
		All_Pokemon.add(Appletun());
		All_Pokemon.add(Espurr());
		All_Pokemon.add(Meowstic());
		All_Pokemon.add(Swirlix());
		All_Pokemon.add(Slurpuff());
		All_Pokemon.add(Spritzee());
		All_Pokemon.add(Aromatisse());
		All_Pokemon.add(Dewpider());
		All_Pokemon.add(Araquanid());
		All_Pokemon.add(Wynaut());
		All_Pokemon.add(Wobbuffet());
		All_Pokemon.add(Farfetchd());
		All_Pokemon.add(Sirfetchd());
		All_Pokemon.add(Chinchou());
		All_Pokemon.add(Lanturn());
		All_Pokemon.add(Croagunk());
		All_Pokemon.add(Toxicroak());
		All_Pokemon.add(Scraggy());
		All_Pokemon.add(Scrafty());
		All_Pokemon.add(Stunfisk());
		All_Pokemon.add(Shuckle());
		All_Pokemon.add(Barboach());
		All_Pokemon.add(Whiscash());
		All_Pokemon.add(Shellos());
		All_Pokemon.add(Gastrodon());
		All_Pokemon.add(Wimpod());
		All_Pokemon.add(Golisopod());
		All_Pokemon.add(Binacle());
		All_Pokemon.add(Barbaracle());
		All_Pokemon.add(Corsola());
		All_Pokemon.add(Cursola());
		All_Pokemon.add(Impidimp());
		All_Pokemon.add(Morgrem());
		All_Pokemon.add(Grimmsnarl());
		All_Pokemon.add(Hatenna());
		All_Pokemon.add(Hattrem());
		All_Pokemon.add(Hatterene());
		All_Pokemon.add(Salandit());
		All_Pokemon.add(Salazzle());
		All_Pokemon.add(Pawniard());
		All_Pokemon.add(Bisharp());
		All_Pokemon.add(Throh());
		All_Pokemon.add(Sawk());
		All_Pokemon.add(Koffing());
		All_Pokemon.add(Weezing());
		All_Pokemon.add(Bonsly());
		All_Pokemon.add(Sudowoodo());
		All_Pokemon.add(Cleffa());
		All_Pokemon.add(Clefairy());
		All_Pokemon.add(Clefable());
		All_Pokemon.add(Togepi());
		All_Pokemon.add(Togetic());
		All_Pokemon.add(Togekiss());
		All_Pokemon.add(Munchlax());
		All_Pokemon.add(Snorlax());
		All_Pokemon.add(Cottonee());
		All_Pokemon.add(Whimsicott());
		All_Pokemon.add(Rhyhorn());
		All_Pokemon.add(Rhydon());
		All_Pokemon.add(Rhyperior());
		All_Pokemon.add(Gothita());
		All_Pokemon.add(Gothorita());
		All_Pokemon.add(Gothitelle());
		All_Pokemon.add(Solosis());
		All_Pokemon.add(Duosion());
		All_Pokemon.add(Reuniclus());
		All_Pokemon.add(Karrablast());
		All_Pokemon.add(Escavalier());
		All_Pokemon.add(Shelmet());
		All_Pokemon.add(Accelgor());
		All_Pokemon.add(Elgyem());
		All_Pokemon.add(Beheeyem());
		All_Pokemon.add(Cubchoo());
		All_Pokemon.add(Beartic());
		All_Pokemon.add(Rufflet());
		All_Pokemon.add(Braviary());
		All_Pokemon.add(Vullaby());
		All_Pokemon.add(Mandibuzz());
		All_Pokemon.add(Skorupi());
		All_Pokemon.add(Drapion());
		All_Pokemon.add(Litwick());
		All_Pokemon.add(Lampent());
		All_Pokemon.add(Chandelure());
		All_Pokemon.add(Inkay());
		All_Pokemon.add(Malamar());
		All_Pokemon.add(Sneasel());
		All_Pokemon.add(Weavile());
		All_Pokemon.add(Sableye());
		All_Pokemon.add(Mawile());
		All_Pokemon.add(Maractus());
		All_Pokemon.add(Sigilyph());
		All_Pokemon.add(Riolu());
		All_Pokemon.add(Lucario());
		All_Pokemon.add(Torkoal());
		All_Pokemon.add(Mimikyu());
		All_Pokemon.add(Cufant());
		All_Pokemon.add(Copperajah());
		All_Pokemon.add(Qwilfish());
		All_Pokemon.add(Frillish());
		All_Pokemon.add(Jellicent());
		All_Pokemon.add(Mareanie());
		All_Pokemon.add(Toxapex());
		All_Pokemon.add(Cramorant());
		All_Pokemon.add(Toxel());
		All_Pokemon.add(Toxtricity());
		All_Pokemon.add(Silicobra());
		All_Pokemon.add(Sandaconda());
		All_Pokemon.add(Hippopotas());
		All_Pokemon.add(Hippowdon());
		All_Pokemon.add(Durant());
		All_Pokemon.add(Heatmor());
		All_Pokemon.add(Helioptile());
		All_Pokemon.add(Heliolisk());
		All_Pokemon.add(Hawlucha());
		All_Pokemon.add(Trapinch());
		All_Pokemon.add(Vibrava());
		All_Pokemon.add(Flygon());
		All_Pokemon.add(Axew());
		All_Pokemon.add(Fraxure());
		All_Pokemon.add(Haxorus());
		All_Pokemon.add(Yamask());
		All_Pokemon.add(Runerigus());
		All_Pokemon.add(Cofagrigus());
		All_Pokemon.add(Honedge());
		All_Pokemon.add(Doublade());
		All_Pokemon.add(Aegislash());
		All_Pokemon.add(Ponyta());
		All_Pokemon.add(Rapidash());
		All_Pokemon.add(Sinistea());
		All_Pokemon.add(Polteageist());
		All_Pokemon.add(Indeedee());
		All_Pokemon.add(Phantump());
		All_Pokemon.add(Trevenant());
		All_Pokemon.add(Morelull());
		All_Pokemon.add(Shiinotic());
		All_Pokemon.add(Oranguru());
		All_Pokemon.add(Passimian());
		All_Pokemon.add(Morpeko());
		All_Pokemon.add(Falinks());
		All_Pokemon.add(Drampa());
		All_Pokemon.add(Turtonator());
		All_Pokemon.add(Togedemaru());
		All_Pokemon.add(Snom());
		All_Pokemon.add(Frosmoth());
		All_Pokemon.add(Clobbopus());
		All_Pokemon.add(Grapploct());
		All_Pokemon.add(Pincurchin());
		All_Pokemon.add(Mantyke());
		All_Pokemon.add(Mantine());
		All_Pokemon.add(Wailmer());
		All_Pokemon.add(Wailord());
		All_Pokemon.add(Bergmite());
		All_Pokemon.add(Avalugg());
		All_Pokemon.add(Dhelmise());
		All_Pokemon.add(Lapras());
		All_Pokemon.add(Lunatone());
		All_Pokemon.add(Solrock());
		All_Pokemon.add(MimeJr());
		All_Pokemon.add(MrMime());
		All_Pokemon.add(MrRime());
		All_Pokemon.add(Darumaka());
		All_Pokemon.add(Darmanitan());
		All_Pokemon.add(Stonjourner());
		All_Pokemon.add(Eiscue());
		All_Pokemon.add(Duraludon());
		All_Pokemon.add(Rotom());
		All_Pokemon.add(Ditto());
		All_Pokemon.add(Dracozolt());
		All_Pokemon.add(Arctozolt());
		All_Pokemon.add(Dracovish());
		All_Pokemon.add(Arctovish());
		All_Pokemon.add(Charmander());
		All_Pokemon.add(Charmeleon());
		All_Pokemon.add(Charizard());
		All_Pokemon.add(TypeNull());
		All_Pokemon.add(Silvally());
		All_Pokemon.add(Larvitar());
		All_Pokemon.add(Pupitar());
		All_Pokemon.add(Tyranitar());
		All_Pokemon.add(Deino());
		All_Pokemon.add(Zweilous());
		All_Pokemon.add(Hydreigon());
		All_Pokemon.add(Goomy());
		All_Pokemon.add(Sliggoo());
		All_Pokemon.add(Goodra());
		All_Pokemon.add(Jangmo_o());
		All_Pokemon.add(Hakamo_o());
		All_Pokemon.add(Kommo_o());
		All_Pokemon.add(Dreepy());
		All_Pokemon.add(Drakloak());
		All_Pokemon.add(Dragapult());
		All_Pokemon.add(Zacian());
		All_Pokemon.add(Zamazenta());
		All_Pokemon.add(Eternatus());
		
		/* This Prints out each method to add each pokemon object into the arraylist All_Pokemon
		BufferedReader br = new BufferedReader(new FileReader("Pokemon Data Corrected.txt"));
		String line;
		
		while((line = br.readLine()) != null)
		{
			String[] splitLine = line.split(",");
			String name = splitLine[1].trim();
			
			if(name.contains("-"))
			{
				name = name.replace("-", "_");
			}
			else if(name.contains(":"))
			{
				name = name.replace(":", "");
			}
			else if(name.contains("."))
			{
				name = name.replace(".", "");
			}
			name = name.replaceAll("\\s", "");
			
			System.out.println("All_Pokemon.add(" + name + "());");
		}
		*/
		return All_Pokemon;
	}
	
	public static Pokemon_Constructor Grookey()
	{
		int[] base_stats = {50, 65, 50, 40, 40, 65};
		Pokemon_Constructor Grookey = new Pokemon_Constructor("Grookey", Pokemon_Type_Database.grass(), null, Pokemon_Ability_Database.Overgrow(), null, Pokemon_Ability_Database.GrassySurge(), base_stats);
		return Grookey;
	}
	public static Pokemon_Constructor Thwackey()
	{
		int[] base_stats = {70, 85, 70, 55, 60, 80};
		Pokemon_Constructor Thwackey = new Pokemon_Constructor("Thwackey", Pokemon_Type_Database.grass(), null, Pokemon_Ability_Database.Overgrow(), null, Pokemon_Ability_Database.GrassySurge(), base_stats);
		return Thwackey;
	}
	public static Pokemon_Constructor Rillaboom()
	{
		int[] base_stats = {100, 125, 90, 60, 70, 85};
		Pokemon_Constructor Rillaboom = new Pokemon_Constructor("Rillaboom", Pokemon_Type_Database.grass(), null, Pokemon_Ability_Database.Overgrow(), null, Pokemon_Ability_Database.GrassySurge(), base_stats);
		return Rillaboom;
	}
	public static Pokemon_Constructor Scorbunny()
	{
		int[] base_stats = {50, 71, 40, 40, 40, 69};
		Pokemon_Constructor Scorbunny = new Pokemon_Constructor("Scorbunny", Pokemon_Type_Database.fire(), null, Pokemon_Ability_Database.Blaze(), null, Pokemon_Ability_Database.Libero(), base_stats);
		return Scorbunny;
	}
	public static Pokemon_Constructor Raboot()
	{
		int[] base_stats = {65, 86, 60, 55, 60, 94};
		Pokemon_Constructor Raboot = new Pokemon_Constructor("Raboot", Pokemon_Type_Database.fire(), null, Pokemon_Ability_Database.Blaze(), null, Pokemon_Ability_Database.Libero(), base_stats);
		return Raboot;
	}
	public static Pokemon_Constructor Cinderace()
	{
		int[] base_stats = {80, 116, 75, 65, 75, 119};
		Pokemon_Constructor Cinderace = new Pokemon_Constructor("Cinderace", Pokemon_Type_Database.fire(), null, Pokemon_Ability_Database.Blaze(), null, Pokemon_Ability_Database.Libero(), base_stats);
		return Cinderace;
	}
	public static Pokemon_Constructor Sobble()
	{
		int[] base_stats = {50, 40, 40, 70, 40, 70};
		Pokemon_Constructor Sobble = new Pokemon_Constructor("Sobble", Pokemon_Type_Database.water(), null, Pokemon_Ability_Database.Torrent(), null, Pokemon_Ability_Database.Sniper(), base_stats);
		return Sobble;
	}
	public static Pokemon_Constructor Drizzile()
	{
		int[] base_stats = {65, 60, 55, 95, 55, 90};
		Pokemon_Constructor Drizzile = new Pokemon_Constructor("Drizzile", Pokemon_Type_Database.water(), null, Pokemon_Ability_Database.Torrent(), null, Pokemon_Ability_Database.Sniper(), base_stats);
		return Drizzile;
	}
	public static Pokemon_Constructor Inteleon()
	{
		int[] base_stats = {70, 85, 65, 125, 65, 120};
		Pokemon_Constructor Inteleon = new Pokemon_Constructor("Inteleon", Pokemon_Type_Database.water(), null, Pokemon_Ability_Database.Torrent(), null, Pokemon_Ability_Database.Sniper(), base_stats);
		return Inteleon;
	}
	public static Pokemon_Constructor Blipbug()
	{
		int[] base_stats = {25, 20, 20, 25, 45, 45};
		Pokemon_Constructor Blipbug = new Pokemon_Constructor("Blipbug", Pokemon_Type_Database.bug(), null, Pokemon_Ability_Database.Swarm(), Pokemon_Ability_Database.CompoundEyes(), Pokemon_Ability_Database.Telepathy(), base_stats);
		return Blipbug;
	}
	public static Pokemon_Constructor Dottler()
	{
		int[] base_stats = {50, 35, 80, 50, 90, 30};
		Pokemon_Constructor Dottler = new Pokemon_Constructor("Dottler", Pokemon_Type_Database.bug(), Pokemon_Type_Database.psychic(), Pokemon_Ability_Database.Swarm(), Pokemon_Ability_Database.CompoundEyes(), Pokemon_Ability_Database.Telepathy(), base_stats);
		return Dottler;
	}
	public static Pokemon_Constructor Orbeetle()
	{
		int[] base_stats = {60, 45, 110, 80, 120, 90};
		Pokemon_Constructor Orbeetle = new Pokemon_Constructor("Orbeetle", Pokemon_Type_Database.bug(), Pokemon_Type_Database.psychic(), Pokemon_Ability_Database.Swarm(), Pokemon_Ability_Database.Frisk(), Pokemon_Ability_Database.Telepathy(), base_stats);
		return Orbeetle;
	}
	public static Pokemon_Constructor Caterpie()
	{
		int[] base_stats = {45, 30, 35, 20, 20, 45};
		Pokemon_Constructor Caterpie = new Pokemon_Constructor("Caterpie", Pokemon_Type_Database.bug(), null, Pokemon_Ability_Database.ShieldDust(), null, Pokemon_Ability_Database.RunAway(), base_stats);
		return Caterpie;
	}
	public static Pokemon_Constructor Metapod()
	{
		int[] base_stats = {50, 20, 55, 25, 25, 30};
		Pokemon_Constructor Metapod = new Pokemon_Constructor("Metapod", Pokemon_Type_Database.bug(), null, Pokemon_Ability_Database.ShedSkin(), null, null, base_stats);
		return Metapod;
	}
	public static Pokemon_Constructor Butterfree()
	{
		int[] base_stats = {60, 45, 50, 90, 80, 70};
		Pokemon_Constructor Butterfree = new Pokemon_Constructor("Butterfree", Pokemon_Type_Database.bug(), Pokemon_Type_Database.flying(), Pokemon_Ability_Database.CompoundEyes(), null, Pokemon_Ability_Database.TintedLens(), base_stats);
		return Butterfree;
	}
	public static Pokemon_Constructor Grubbin()
	{
		int[] base_stats = {47, 62, 45, 55, 45, 46};
		Pokemon_Constructor Grubbin = new Pokemon_Constructor("Grubbin", Pokemon_Type_Database.bug(), null, Pokemon_Ability_Database.Swarm(), null, null, base_stats);
		return Grubbin;
	}
	public static Pokemon_Constructor Charjabug()
	{
		int[] base_stats = {57, 82, 95, 55, 75, 36};
		Pokemon_Constructor Charjabug = new Pokemon_Constructor("Charjabug", Pokemon_Type_Database.bug(), Pokemon_Type_Database.electric(), Pokemon_Ability_Database.Battery(), null, null, base_stats);
		return Charjabug;
	}
	public static Pokemon_Constructor Vikavolt()
	{
		int[] base_stats = {77, 70, 90, 145, 75, 43};
		Pokemon_Constructor Vikavolt = new Pokemon_Constructor("Vikavolt", Pokemon_Type_Database.bug(), Pokemon_Type_Database.electric(), Pokemon_Ability_Database.Levitate(), null, null, base_stats);
		return Vikavolt;
	}
	public static Pokemon_Constructor Hoothoot()
	{
		int[] base_stats = {60, 30, 30, 36, 56, 50};
		Pokemon_Constructor Hoothoot = new Pokemon_Constructor("Hoothoot", Pokemon_Type_Database.normal(), Pokemon_Type_Database.flying(), Pokemon_Ability_Database.Insomnia(), Pokemon_Ability_Database.KeenEye(), Pokemon_Ability_Database.TintedLens(), base_stats);
		return Hoothoot;
	}
	public static Pokemon_Constructor Noctowl()
	{
		int[] base_stats = {100, 50, 50, 86, 96, 70};
		Pokemon_Constructor Noctowl = new Pokemon_Constructor("Noctowl", Pokemon_Type_Database.normal(), Pokemon_Type_Database.flying(), Pokemon_Ability_Database.Insomnia(), Pokemon_Ability_Database.KeenEye(), Pokemon_Ability_Database.TintedLens(), base_stats);
		return Noctowl;
	}
	public static Pokemon_Constructor Rookidee()
	{
		int[] base_stats = {38, 47, 35, 33, 35, 57};
		Pokemon_Constructor Rookidee = new Pokemon_Constructor("Rookidee", Pokemon_Type_Database.flying(), null, Pokemon_Ability_Database.KeenEye(), Pokemon_Ability_Database.Unnerve(), Pokemon_Ability_Database.BigPecks(), base_stats);
		return Rookidee;
	}
	public static Pokemon_Constructor Corvisquire()
	{
		int[] base_stats = {68, 67, 55, 43, 55, 77};
		Pokemon_Constructor Corvisquire = new Pokemon_Constructor("Corvisquire", Pokemon_Type_Database.flying(), null, Pokemon_Ability_Database.KeenEye(), Pokemon_Ability_Database.Unnerve(), Pokemon_Ability_Database.BigPecks(), base_stats);
		return Corvisquire;
	}
	public static Pokemon_Constructor Corviknight()
	{
		int[] base_stats = {98, 87, 105, 53, 85, 67};
		Pokemon_Constructor Corviknight = new Pokemon_Constructor("Corviknight", Pokemon_Type_Database.flying(), Pokemon_Type_Database.steel(), Pokemon_Ability_Database.Pressure(), Pokemon_Ability_Database.Unnerve(), Pokemon_Ability_Database.MirrorArmor(), base_stats);
		return Corviknight;
	}
	public static Pokemon_Constructor Skwovet()
	{
		int[] base_stats = {70, 55, 55, 35, 35, 25};
		Pokemon_Constructor Skwovet = new Pokemon_Constructor("Skwovet", Pokemon_Type_Database.normal(), null, Pokemon_Ability_Database.CheekPouch(), null, Pokemon_Ability_Database.Gluttony(), base_stats);
		return Skwovet;
	}
	public static Pokemon_Constructor Greedent()
	{
		int[] base_stats = {120, 95, 95, 55, 75, 20};
		Pokemon_Constructor Greedent = new Pokemon_Constructor("Greedent", Pokemon_Type_Database.normal(), null, Pokemon_Ability_Database.CheekPouch(), null, Pokemon_Ability_Database.Gluttony(), base_stats);
		return Greedent;
	}
	public static Pokemon_Constructor Pidove()
	{
		int[] base_stats = {50, 55, 50, 36, 30, 43};
		Pokemon_Constructor Pidove = new Pokemon_Constructor("Pidove", Pokemon_Type_Database.normal(), Pokemon_Type_Database.flying(), Pokemon_Ability_Database.BigPecks(), Pokemon_Ability_Database.SuperLuck(), Pokemon_Ability_Database.Rivalry(), base_stats);
		return Pidove;
	}
	public static Pokemon_Constructor Tranquill()
	{
		int[] base_stats = {62, 77, 62, 50, 42, 65};
		Pokemon_Constructor Tranquill = new Pokemon_Constructor("Tranquill", Pokemon_Type_Database.normal(), Pokemon_Type_Database.flying(), Pokemon_Ability_Database.BigPecks(), Pokemon_Ability_Database.SuperLuck(), Pokemon_Ability_Database.Rivalry(), base_stats);
		return Tranquill;
	}
	public static Pokemon_Constructor Unfezant()
	{
		int[] base_stats = {80, 115, 80, 65, 55, 93};
		Pokemon_Constructor Unfezant = new Pokemon_Constructor("Unfezant", Pokemon_Type_Database.normal(), Pokemon_Type_Database.flying(), Pokemon_Ability_Database.BigPecks(), Pokemon_Ability_Database.SuperLuck(), Pokemon_Ability_Database.Rivalry(), base_stats);
		return Unfezant;
	}
	public static Pokemon_Constructor Nickit()
	{
		int[] base_stats = {40, 28, 28, 47, 52, 50};
		Pokemon_Constructor Nickit = new Pokemon_Constructor("Nickit", Pokemon_Type_Database.dark(), null, Pokemon_Ability_Database.RunAway(), Pokemon_Ability_Database.Unburden(), Pokemon_Ability_Database.Stakeout(), base_stats);
		return Nickit;
	}
	public static Pokemon_Constructor Thievul()
	{
		int[] base_stats = {70, 58, 58, 87, 92, 90};
		Pokemon_Constructor Thievul = new Pokemon_Constructor("Thievul", Pokemon_Type_Database.dark(), null, Pokemon_Ability_Database.RunAway(), Pokemon_Ability_Database.Unburden(), Pokemon_Ability_Database.Stakeout(), base_stats);
		return Thievul;
	}
	public static Pokemon_Constructor Zigzagoon()
	{
		int[] base_stats = {38, 30, 41, 30, 41, 60};
		Pokemon_Constructor Zigzagoon = new Pokemon_Constructor("Zigzagoon", Pokemon_Type_Database.dark(), Pokemon_Type_Database.normal(), Pokemon_Ability_Database.Pickup(), Pokemon_Ability_Database.Gluttony(), Pokemon_Ability_Database.QuickFeet(), base_stats);
		return Zigzagoon;
	}
	public static Pokemon_Constructor Linoone()
	{
		int[] base_stats = {78, 70, 61, 50, 61, 100};
		Pokemon_Constructor Linoone = new Pokemon_Constructor("Linoone", Pokemon_Type_Database.dark(), Pokemon_Type_Database.normal(), Pokemon_Ability_Database.Pickup(), Pokemon_Ability_Database.Gluttony(), Pokemon_Ability_Database.QuickFeet(), base_stats);
		return Linoone;
	}
	public static Pokemon_Constructor Obstagoon()
	{
		int[] base_stats = {93, 90, 101, 60, 81, 95};
		Pokemon_Constructor Obstagoon = new Pokemon_Constructor("Obstagoon", Pokemon_Type_Database.dark(), Pokemon_Type_Database.normal(), Pokemon_Ability_Database.Reckless(), Pokemon_Ability_Database.Guts(), Pokemon_Ability_Database.Defiant(), base_stats);
		return Obstagoon;
	}
	public static Pokemon_Constructor Wooloo()
	{
		int[] base_stats = {42, 40, 55, 40, 45, 48};
		Pokemon_Constructor Wooloo = new Pokemon_Constructor("Wooloo", Pokemon_Type_Database.normal(), null, Pokemon_Ability_Database.Fluffy(), Pokemon_Ability_Database.RunAway(), Pokemon_Ability_Database.Bulletproof(), base_stats);
		return Wooloo;
	}
	public static Pokemon_Constructor Dubwool()
	{
		int[] base_stats = {72, 80, 100, 60, 90, 88};
		Pokemon_Constructor Dubwool = new Pokemon_Constructor("Dubwool", Pokemon_Type_Database.normal(), null, Pokemon_Ability_Database.Fluffy(), Pokemon_Ability_Database.Steadfast(), Pokemon_Ability_Database.Bulletproof(), base_stats);
		return Dubwool;
	}
	public static Pokemon_Constructor Lotad()
	{
		int[] base_stats = {40, 30, 30, 40, 50, 30};
		Pokemon_Constructor Lotad = new Pokemon_Constructor("Lotad", Pokemon_Type_Database.water(), Pokemon_Type_Database.grass(), Pokemon_Ability_Database.SwiftSwim(), Pokemon_Ability_Database.RainDish(), Pokemon_Ability_Database.OwnTempo(), base_stats);
		return Lotad;
	}
	public static Pokemon_Constructor Lombre()
	{
		int[] base_stats = {60, 50, 50, 60, 70, 50};
		Pokemon_Constructor Lombre = new Pokemon_Constructor("Lombre", Pokemon_Type_Database.water(), Pokemon_Type_Database.grass(), Pokemon_Ability_Database.SwiftSwim(), Pokemon_Ability_Database.RainDish(), Pokemon_Ability_Database.OwnTempo(), base_stats);
		return Lombre;
	}
	public static Pokemon_Constructor Ludicolo()
	{
		int[] base_stats = {80, 70, 70, 90, 100, 70};
		Pokemon_Constructor Ludicolo = new Pokemon_Constructor("Ludicolo", Pokemon_Type_Database.water(), Pokemon_Type_Database.grass(), Pokemon_Ability_Database.SwiftSwim(), Pokemon_Ability_Database.RainDish(), Pokemon_Ability_Database.OwnTempo(), base_stats);
		return Ludicolo;
	}
	public static Pokemon_Constructor Seedot()
	{
		int[] base_stats = {40, 40, 50, 30, 30, 30};
		Pokemon_Constructor Seedot = new Pokemon_Constructor("Seedot", Pokemon_Type_Database.grass(), null, Pokemon_Ability_Database.Chlorophyll(), Pokemon_Ability_Database.EarlyBird(), Pokemon_Ability_Database.Pickpocket(), base_stats);
		return Seedot;
	}
	public static Pokemon_Constructor Nuzleaf()
	{
		int[] base_stats = {70, 70, 40, 60, 40, 60};
		Pokemon_Constructor Nuzleaf = new Pokemon_Constructor("Nuzleaf", Pokemon_Type_Database.grass(), Pokemon_Type_Database.dark(), Pokemon_Ability_Database.Chlorophyll(), Pokemon_Ability_Database.EarlyBird(), Pokemon_Ability_Database.Pickpocket(), base_stats);
		return Nuzleaf;
	}
	public static Pokemon_Constructor Shiftry()
	{
		int[] base_stats = {90, 100, 60, 90, 60, 80};
		Pokemon_Constructor Shiftry = new Pokemon_Constructor("Shiftry", Pokemon_Type_Database.grass(), Pokemon_Type_Database.dark(), Pokemon_Ability_Database.Chlorophyll(), Pokemon_Ability_Database.EarlyBird(), Pokemon_Ability_Database.Pickpocket(), base_stats);
		return Shiftry;
	}
	public static Pokemon_Constructor Chewtle()
	{
		int[] base_stats = {50, 64, 50, 38, 38, 44};
		Pokemon_Constructor Chewtle = new Pokemon_Constructor("Chewtle", Pokemon_Type_Database.water(), null, Pokemon_Ability_Database.StrongJaw(), Pokemon_Ability_Database.ShellArmor(), Pokemon_Ability_Database.SwiftSwim(), base_stats);
		return Chewtle;
	}
	public static Pokemon_Constructor Drednaw()
	{
		int[] base_stats = {90, 115, 90, 48, 68, 74};
		Pokemon_Constructor Drednaw = new Pokemon_Constructor("Drednaw", Pokemon_Type_Database.water(), Pokemon_Type_Database.rock(), Pokemon_Ability_Database.StrongJaw(), Pokemon_Ability_Database.ShellArmor(), Pokemon_Ability_Database.SwiftSwim(), base_stats);
		return Drednaw;
	}
	public static Pokemon_Constructor Purrloin()
	{
		int[] base_stats = {41, 50, 37, 50, 37, 66};
		Pokemon_Constructor Purrloin = new Pokemon_Constructor("Purrloin", Pokemon_Type_Database.dark(), null, Pokemon_Ability_Database.Limber(), Pokemon_Ability_Database.Unburden(), Pokemon_Ability_Database.Prankster(), base_stats);
		return Purrloin;
	}
	public static Pokemon_Constructor Liepard()
	{
		int[] base_stats = {64, 88, 50, 88, 50, 106};
		Pokemon_Constructor Liepard = new Pokemon_Constructor("Liepard", Pokemon_Type_Database.dark(), null, Pokemon_Ability_Database.Limber(), Pokemon_Ability_Database.Unburden(), Pokemon_Ability_Database.Prankster(), base_stats);
		return Liepard;
	}
	public static Pokemon_Constructor Yamper()
	{
		int[] base_stats = {59, 45, 50, 40, 50, 26};
		Pokemon_Constructor Yamper = new Pokemon_Constructor("Yamper", Pokemon_Type_Database.electric(), null, Pokemon_Ability_Database.BallFetch(), null, Pokemon_Ability_Database.Rattled(), base_stats);
		return Yamper;
	}
	public static Pokemon_Constructor Boltund()
	{
		int[] base_stats = {69, 90, 60, 90, 60, 121};
		Pokemon_Constructor Boltund = new Pokemon_Constructor("Boltund", Pokemon_Type_Database.electric(), null, Pokemon_Ability_Database.StrongJaw(), null, Pokemon_Ability_Database.Competitive(), base_stats);
		return Boltund;
	}
	public static Pokemon_Constructor Bunnelby()
	{
		int[] base_stats = {38, 36, 38, 32, 36, 57};
		Pokemon_Constructor Bunnelby = new Pokemon_Constructor("Bunnelby", Pokemon_Type_Database.normal(), null, Pokemon_Ability_Database.Pickup(), Pokemon_Ability_Database.CheekPouch(), Pokemon_Ability_Database.HugePower(), base_stats);
		return Bunnelby;
	}
	public static Pokemon_Constructor Diggersby()
	{
		int[] base_stats = {85, 56, 77, 50, 77, 78};
		Pokemon_Constructor Diggersby = new Pokemon_Constructor("Diggersby", Pokemon_Type_Database.normal(), Pokemon_Type_Database.ground(), Pokemon_Ability_Database.Pickup(), Pokemon_Ability_Database.CheekPouch(), Pokemon_Ability_Database.HugePower(), base_stats);
		return Diggersby;
	}
	public static Pokemon_Constructor Minccino()
	{
		int[] base_stats = {55, 50, 40, 40, 40, 75};
		Pokemon_Constructor Minccino = new Pokemon_Constructor("Minccino", Pokemon_Type_Database.normal(), null, Pokemon_Ability_Database.CuteCharm(), Pokemon_Ability_Database.Technician(), Pokemon_Ability_Database.SkillLink(), base_stats);
		return Minccino;
	}
	public static Pokemon_Constructor Cinccino()
	{
		int[] base_stats = {75, 95, 60, 65, 60, 115};
		Pokemon_Constructor Cinccino = new Pokemon_Constructor("Cinccino", Pokemon_Type_Database.normal(), null, Pokemon_Ability_Database.CuteCharm(), Pokemon_Ability_Database.Technician(), Pokemon_Ability_Database.SkillLink(), base_stats);
		return Cinccino;
	}
	public static Pokemon_Constructor Bounsweet()
	{
		int[] base_stats = {42, 30, 38, 30, 38, 32};
		Pokemon_Constructor Bounsweet = new Pokemon_Constructor("Bounsweet", Pokemon_Type_Database.grass(), null, Pokemon_Ability_Database.LeafGuard(), Pokemon_Ability_Database.Oblivious(), Pokemon_Ability_Database.SweetVeil(), base_stats);
		return Bounsweet;
	}
	public static Pokemon_Constructor Steenee()
	{
		int[] base_stats = {52, 40, 48, 40, 48, 62};
		Pokemon_Constructor Steenee = new Pokemon_Constructor("Steenee", Pokemon_Type_Database.grass(), null, Pokemon_Ability_Database.LeafGuard(), Pokemon_Ability_Database.Oblivious(), Pokemon_Ability_Database.SweetVeil(), base_stats);
		return Steenee;
	}
	public static Pokemon_Constructor Tsareena()
	{
		int[] base_stats = {72, 120, 98, 50, 98, 72};
		Pokemon_Constructor Tsareena = new Pokemon_Constructor("Tsareena", Pokemon_Type_Database.grass(), null, Pokemon_Ability_Database.LeafGuard(), Pokemon_Ability_Database.QueenlyMajesty(), Pokemon_Ability_Database.SweetVeil(), base_stats);
		return Tsareena;
	}
	public static Pokemon_Constructor Oddish()
	{
		int[] base_stats = {45, 50, 55, 75, 65, 30};
		Pokemon_Constructor Oddish = new Pokemon_Constructor("Oddish", Pokemon_Type_Database.grass(), Pokemon_Type_Database.poison(), Pokemon_Ability_Database.Chlorophyll(), null, Pokemon_Ability_Database.RunAway(), base_stats);
		return Oddish;
	}
	public static Pokemon_Constructor Gloom()
	{
		int[] base_stats = {60, 65, 70, 85, 75, 40};
		Pokemon_Constructor Gloom = new Pokemon_Constructor("Gloom", Pokemon_Type_Database.grass(), Pokemon_Type_Database.poison(), Pokemon_Ability_Database.Chlorophyll(), null, Pokemon_Ability_Database.Stench(), base_stats);
		return Gloom;
	}
	public static Pokemon_Constructor Vileplume()
	{
		int[] base_stats = {75, 80, 85, 110, 90, 50};
		Pokemon_Constructor Vileplume = new Pokemon_Constructor("Vileplume", Pokemon_Type_Database.grass(), Pokemon_Type_Database.poison(), Pokemon_Ability_Database.Chlorophyll(), null, Pokemon_Ability_Database.EffectSpore(), base_stats);
		return Vileplume;
	}
	public static Pokemon_Constructor Bellossom()
	{
		int[] base_stats = {75, 80, 95, 90, 100, 50};
		Pokemon_Constructor Bellossom = new Pokemon_Constructor("Bellossom", Pokemon_Type_Database.grass(), null, Pokemon_Ability_Database.Chlorophyll(), null, Pokemon_Ability_Database.Healer(), base_stats);
		return Bellossom;
	}
	public static Pokemon_Constructor Budew()
	{
		int[] base_stats = {40, 30, 35, 50, 70, 55};
		Pokemon_Constructor Budew = new Pokemon_Constructor("Budew", Pokemon_Type_Database.grass(), Pokemon_Type_Database.poison(), Pokemon_Ability_Database.NaturalCure(), Pokemon_Ability_Database.PoisonPoint(), Pokemon_Ability_Database.LeafGuard(), base_stats);
		return Budew;
	}
	public static Pokemon_Constructor Roselia()
	{
		int[] base_stats = {50, 60, 45, 100, 80, 65};
		Pokemon_Constructor Roselia = new Pokemon_Constructor("Roselia", Pokemon_Type_Database.grass(), Pokemon_Type_Database.poison(), Pokemon_Ability_Database.NaturalCure(), Pokemon_Ability_Database.PoisonPoint(), Pokemon_Ability_Database.LeafGuard(), base_stats);
		return Roselia;
	}
	public static Pokemon_Constructor Roserade()
	{
		int[] base_stats = {60, 70, 65, 125, 105, 90};
		Pokemon_Constructor Roserade = new Pokemon_Constructor("Roserade", Pokemon_Type_Database.grass(), Pokemon_Type_Database.poison(), Pokemon_Ability_Database.NaturalCure(), Pokemon_Ability_Database.PoisonPoint(), Pokemon_Ability_Database.Technician(), base_stats);
		return Roserade;
	}
	public static Pokemon_Constructor Wingull()
	{
		int[] base_stats = {40, 30, 30, 55, 30, 85};
		Pokemon_Constructor Wingull = new Pokemon_Constructor("Wingull", Pokemon_Type_Database.water(), Pokemon_Type_Database.flying(), Pokemon_Ability_Database.KeenEye(), Pokemon_Ability_Database.Hydration(), Pokemon_Ability_Database.RainDish(), base_stats);
		return Wingull;
	}
	public static Pokemon_Constructor Pelipper()
	{
		int[] base_stats = {60, 50, 100, 95, 70, 65};
		Pokemon_Constructor Pelipper = new Pokemon_Constructor("Pelipper", Pokemon_Type_Database.water(), Pokemon_Type_Database.flying(), Pokemon_Ability_Database.KeenEye(), Pokemon_Ability_Database.Drizzle(), Pokemon_Ability_Database.RainDish(), base_stats);
		return Pelipper;
	}
	public static Pokemon_Constructor Joltik()
	{
		int[] base_stats = {50, 47, 50, 57, 50, 65};
		Pokemon_Constructor Joltik = new Pokemon_Constructor("Joltik", Pokemon_Type_Database.bug(), Pokemon_Type_Database.electric(), Pokemon_Ability_Database.CompoundEyes(), Pokemon_Ability_Database.Unnerve(), Pokemon_Ability_Database.Swarm(), base_stats);
		return Joltik;
	}
	public static Pokemon_Constructor Galvantula()
	{
		int[] base_stats = {70, 77, 60, 97, 60, 108};
		Pokemon_Constructor Galvantula = new Pokemon_Constructor("Galvantula", Pokemon_Type_Database.bug(), Pokemon_Type_Database.electric(), Pokemon_Ability_Database.CompoundEyes(), Pokemon_Ability_Database.Unnerve(), Pokemon_Ability_Database.Swarm(), base_stats);
		return Galvantula;
	}
	public static Pokemon_Constructor Electrike()
	{
		int[] base_stats = {40, 45, 40, 65, 40, 65};
		Pokemon_Constructor Electrike = new Pokemon_Constructor("Electrike", Pokemon_Type_Database.electric(), null, Pokemon_Ability_Database.Static(), Pokemon_Ability_Database.LightningRod(), Pokemon_Ability_Database.Minus(), base_stats);
		return Electrike;
	}
	public static Pokemon_Constructor Manectric()
	{
		int[] base_stats = {70, 75, 60, 105, 60, 105};
		Pokemon_Constructor Manectric = new Pokemon_Constructor("Manectric", Pokemon_Type_Database.electric(), null, Pokemon_Ability_Database.Static(), Pokemon_Ability_Database.LightningRod(), Pokemon_Ability_Database.Minus(), base_stats);
		return Manectric;
	}
	public static Pokemon_Constructor Vulpix()
	{
		int[] base_stats = {38, 41, 40, 50, 65, 65};
		Pokemon_Constructor Vulpix = new Pokemon_Constructor("Vulpix", Pokemon_Type_Database.fire(), null, Pokemon_Ability_Database.FlashFire(), null, Pokemon_Ability_Database.Drought(), base_stats);
		return Vulpix;
	}
	public static Pokemon_Constructor Ninetales()
	{
		int[] base_stats = {73, 76, 75, 81, 100, 100};
		Pokemon_Constructor Ninetales = new Pokemon_Constructor("Ninetales", Pokemon_Type_Database.fire(), null, Pokemon_Ability_Database.FlashFire(), null, Pokemon_Ability_Database.Drought(), base_stats);
		return Ninetales;
	}
	public static Pokemon_Constructor Growlithe()
	{
		int[] base_stats = {55, 70, 45, 70, 50, 60};
		Pokemon_Constructor Growlithe = new Pokemon_Constructor("Growlithe", Pokemon_Type_Database.fire(), null, Pokemon_Ability_Database.Intimidate(), Pokemon_Ability_Database.FlashFire(), Pokemon_Ability_Database.Justified(), base_stats);
		return Growlithe;
	}
	public static Pokemon_Constructor Arcanine()
	{
		int[] base_stats = {90, 110, 80, 100, 80, 95};
		Pokemon_Constructor Arcanine = new Pokemon_Constructor("Arcanine", Pokemon_Type_Database.fire(), null, Pokemon_Ability_Database.Intimidate(), Pokemon_Ability_Database.FlashFire(), Pokemon_Ability_Database.Justified(), base_stats);
		return Arcanine;
	}
	public static Pokemon_Constructor Vanillite()
	{
		int[] base_stats = {36, 50, 50, 65, 60, 44};
		Pokemon_Constructor Vanillite = new Pokemon_Constructor("Vanillite", Pokemon_Type_Database.ice(), null, Pokemon_Ability_Database.IceBody(), Pokemon_Ability_Database.SnowCloak(), Pokemon_Ability_Database.WeakArmor(), base_stats);
		return Vanillite;
	}
	public static Pokemon_Constructor Vanillish()
	{
		int[] base_stats = {51, 65, 65, 80, 75, 59};
		Pokemon_Constructor Vanillish = new Pokemon_Constructor("Vanillish", Pokemon_Type_Database.ice(), null, Pokemon_Ability_Database.IceBody(), Pokemon_Ability_Database.SnowCloak(), Pokemon_Ability_Database.WeakArmor(), base_stats);
		return Vanillish;
	}
	public static Pokemon_Constructor Vanilluxe()
	{
		int[] base_stats = {71, 95, 85, 110, 95, 79};
		Pokemon_Constructor Vanilluxe = new Pokemon_Constructor("Vanilluxe", Pokemon_Type_Database.ice(), null, Pokemon_Ability_Database.IceBody(), Pokemon_Ability_Database.SnowWarning(), Pokemon_Ability_Database.WeakArmor(), base_stats);
		return Vanilluxe;
	}
	public static Pokemon_Constructor Swinub()
	{
		int[] base_stats = {50, 50, 40, 30, 30, 50};
		Pokemon_Constructor Swinub = new Pokemon_Constructor("Swinub", Pokemon_Type_Database.ice(), Pokemon_Type_Database.ground(), Pokemon_Ability_Database.Oblivious(), Pokemon_Ability_Database.SnowCloak(), Pokemon_Ability_Database.ThickFat(), base_stats);
		return Swinub;
	}
	public static Pokemon_Constructor Piloswine()
	{
		int[] base_stats = {100, 100, 80, 60, 60, 50};
		Pokemon_Constructor Piloswine = new Pokemon_Constructor("Piloswine", Pokemon_Type_Database.ice(), Pokemon_Type_Database.ground(), Pokemon_Ability_Database.Oblivious(), Pokemon_Ability_Database.SnowCloak(), Pokemon_Ability_Database.ThickFat(), base_stats);
		return Piloswine;
	}
	public static Pokemon_Constructor Mamoswine()
	{
		int[] base_stats = {110, 130, 80, 70, 60, 80};
		Pokemon_Constructor Mamoswine = new Pokemon_Constructor("Mamoswine", Pokemon_Type_Database.ice(), Pokemon_Type_Database.ground(), Pokemon_Ability_Database.Oblivious(), Pokemon_Ability_Database.SnowCloak(), Pokemon_Ability_Database.ThickFat(), base_stats);
		return Mamoswine;
	}
	public static Pokemon_Constructor Delibird()
	{
		int[] base_stats = {45, 55, 45, 65, 45, 75};
		Pokemon_Constructor Delibird = new Pokemon_Constructor("Delibird", Pokemon_Type_Database.ice(), Pokemon_Type_Database.flying(), Pokemon_Ability_Database.VitalSpirit(), Pokemon_Ability_Database.Hustle(), Pokemon_Ability_Database.Insomnia(), base_stats);
		return Delibird;
	}
	public static Pokemon_Constructor Snorunt()
	{
		int[] base_stats = {50, 50, 50, 50, 50, 50};
		Pokemon_Constructor Snorunt = new Pokemon_Constructor("Snorunt", Pokemon_Type_Database.ice(), null, Pokemon_Ability_Database.InnerFocus(), Pokemon_Ability_Database.IceBody(), Pokemon_Ability_Database.Moody(), base_stats);
		return Snorunt;
	}
	public static Pokemon_Constructor Glalie()
	{
		int[] base_stats = {80, 80, 80, 80, 80, 80};
		Pokemon_Constructor Glalie = new Pokemon_Constructor("Glalie", Pokemon_Type_Database.ice(), null, Pokemon_Ability_Database.InnerFocus(), Pokemon_Ability_Database.IceBody(), Pokemon_Ability_Database.Moody(), base_stats);
		return Glalie;
	}
	public static Pokemon_Constructor Froslass()
	{
		int[] base_stats = {70, 80, 70, 80, 70, 110};
		Pokemon_Constructor Froslass = new Pokemon_Constructor("Froslass", Pokemon_Type_Database.ice(), Pokemon_Type_Database.ghost(), Pokemon_Ability_Database.SnowCloak(), null, Pokemon_Ability_Database.CursedBody(), base_stats);
		return Froslass;
	}
	public static Pokemon_Constructor Baltoy()
	{
		int[] base_stats = {40, 40, 55, 40, 70, 55};
		Pokemon_Constructor Baltoy = new Pokemon_Constructor("Baltoy", Pokemon_Type_Database.ground(), Pokemon_Type_Database.psychic(), Pokemon_Ability_Database.Levitate(), null, null, base_stats);
		return Baltoy;
	}
	public static Pokemon_Constructor Claydol()
	{
		int[] base_stats = {60, 70, 105, 70, 120, 75};
		Pokemon_Constructor Claydol = new Pokemon_Constructor("Claydol", Pokemon_Type_Database.ground(), Pokemon_Type_Database.psychic(), Pokemon_Ability_Database.Levitate(), null, null, base_stats);
		return Claydol;
	}
	public static Pokemon_Constructor Mudbray()
	{
		int[] base_stats = {70, 100, 70, 45, 55, 45};
		Pokemon_Constructor Mudbray = new Pokemon_Constructor("Mudbray", Pokemon_Type_Database.ground(), null, Pokemon_Ability_Database.OwnTempo(), Pokemon_Ability_Database.Stamina(), Pokemon_Ability_Database.InnerFocus(), base_stats);
		return Mudbray;
	}
	public static Pokemon_Constructor Mudsdale()
	{
		int[] base_stats = {100, 125, 100, 55, 85, 35};
		Pokemon_Constructor Mudsdale = new Pokemon_Constructor("Mudsdale", Pokemon_Type_Database.ground(), null, Pokemon_Ability_Database.OwnTempo(), Pokemon_Ability_Database.Stamina(), Pokemon_Ability_Database.InnerFocus(), base_stats);
		return Mudsdale;
	}
	public static Pokemon_Constructor Dwebble()
	{
		int[] base_stats = {50, 65, 85, 35, 35, 55};
		Pokemon_Constructor Dwebble = new Pokemon_Constructor("Dwebble", Pokemon_Type_Database.bug(), Pokemon_Type_Database.rock(), Pokemon_Ability_Database.Sturdy(), Pokemon_Ability_Database.ShellArmor(), Pokemon_Ability_Database.WeakArmor(), base_stats);
		return Dwebble;
	}
	public static Pokemon_Constructor Crustle()
	{
		int[] base_stats = {70, 105, 125, 65, 75, 45};
		Pokemon_Constructor Crustle = new Pokemon_Constructor("Crustle", Pokemon_Type_Database.bug(), Pokemon_Type_Database.rock(), Pokemon_Ability_Database.Sturdy(), Pokemon_Ability_Database.ShellArmor(), Pokemon_Ability_Database.WeakArmor(), base_stats);
		return Crustle;
	}
	public static Pokemon_Constructor Golett()
	{
		int[] base_stats = {59, 74, 50, 35, 50, 35};
		Pokemon_Constructor Golett = new Pokemon_Constructor("Golett", Pokemon_Type_Database.ground(), Pokemon_Type_Database.ghost(), Pokemon_Ability_Database.IronFist(), Pokemon_Ability_Database.Klutz(), Pokemon_Ability_Database.NoGuard(), base_stats);
		return Golett;
	}
	public static Pokemon_Constructor Golurk()
	{
		int[] base_stats = {89, 124, 80, 55, 80, 55};
		Pokemon_Constructor Golurk = new Pokemon_Constructor("Golurk", Pokemon_Type_Database.ground(), Pokemon_Type_Database.ghost(), Pokemon_Ability_Database.IronFist(), Pokemon_Ability_Database.Klutz(), Pokemon_Ability_Database.NoGuard(), base_stats);
		return Golurk;
	}
	public static Pokemon_Constructor Munna()
	{
		int[] base_stats = {76, 25, 45, 67, 55, 24};
		Pokemon_Constructor Munna = new Pokemon_Constructor("Munna", Pokemon_Type_Database.psychic(), null, Pokemon_Ability_Database.Forewarn(), Pokemon_Ability_Database.Synchronize(), Pokemon_Ability_Database.Telepathy(), base_stats);
		return Munna;
	}
	public static Pokemon_Constructor Musharna()
	{
		int[] base_stats = {116, 55, 85, 107, 95, 29};
		Pokemon_Constructor Musharna = new Pokemon_Constructor("Musharna", Pokemon_Type_Database.psychic(), null, Pokemon_Ability_Database.Forewarn(), Pokemon_Ability_Database.Synchronize(), Pokemon_Ability_Database.Telepathy(), base_stats);
		return Musharna;
	}
	public static Pokemon_Constructor Natu()
	{
		int[] base_stats = {40, 50, 45, 70, 45, 70};
		Pokemon_Constructor Natu = new Pokemon_Constructor("Natu", Pokemon_Type_Database.psychic(), Pokemon_Type_Database.flying(), Pokemon_Ability_Database.Synchronize(), Pokemon_Ability_Database.EarlyBird(), Pokemon_Ability_Database.MagicBounce(), base_stats);
		return Natu;
	}
	public static Pokemon_Constructor Xatu()
	{
		int[] base_stats = {65, 75, 70, 95, 70, 95};
		Pokemon_Constructor Xatu = new Pokemon_Constructor("Xatu", Pokemon_Type_Database.psychic(), Pokemon_Type_Database.flying(), Pokemon_Ability_Database.Synchronize(), Pokemon_Ability_Database.EarlyBird(), Pokemon_Ability_Database.MagicBounce(), base_stats);
		return Xatu;
	}
	public static Pokemon_Constructor Stufful()
	{
		int[] base_stats = {70, 75, 50, 45, 50, 50};
		Pokemon_Constructor Stufful = new Pokemon_Constructor("Stufful", Pokemon_Type_Database.normal(), Pokemon_Type_Database.fighting(), Pokemon_Ability_Database.Fluffy(), Pokemon_Ability_Database.Klutz(), Pokemon_Ability_Database.CuteCharm(), base_stats);
		return Stufful;
	}
	public static Pokemon_Constructor Bewear()
	{
		int[] base_stats = {120, 125, 80, 55, 60, 60};
		Pokemon_Constructor Bewear = new Pokemon_Constructor("Bewear", Pokemon_Type_Database.normal(), Pokemon_Type_Database.fighting(), Pokemon_Ability_Database.Fluffy(), Pokemon_Ability_Database.Klutz(), Pokemon_Ability_Database.Unnerve(), base_stats);
		return Bewear;
	}
	public static Pokemon_Constructor Snover()
	{
		int[] base_stats = {60, 62, 50, 62, 60, 40};
		Pokemon_Constructor Snover = new Pokemon_Constructor("Snover", Pokemon_Type_Database.grass(), Pokemon_Type_Database.ice(), Pokemon_Ability_Database.SnowWarning(), null, Pokemon_Ability_Database.Soundproof(), base_stats);
		return Snover;
	}
	public static Pokemon_Constructor Abomasnow()
	{
		int[] base_stats = {90, 92, 75, 92, 85, 60};
		Pokemon_Constructor Abomasnow = new Pokemon_Constructor("Abomasnow", Pokemon_Type_Database.grass(), Pokemon_Type_Database.ice(), Pokemon_Ability_Database.SnowWarning(), null, Pokemon_Ability_Database.Soundproof(), base_stats);
		return Abomasnow;
	}
	public static Pokemon_Constructor Krabby()
	{
		int[] base_stats = {30, 105, 90, 25, 25, 50};
		Pokemon_Constructor Krabby = new Pokemon_Constructor("Krabby", Pokemon_Type_Database.water(), null, Pokemon_Ability_Database.HyperCutter(), Pokemon_Ability_Database.ShellArmor(), Pokemon_Ability_Database.SheerForce(), base_stats);
		return Krabby;
	}
	public static Pokemon_Constructor Kingler()
	{
		int[] base_stats = {55, 130, 115, 50, 50, 75};
		Pokemon_Constructor Kingler = new Pokemon_Constructor("Kingler", Pokemon_Type_Database.water(), null, Pokemon_Ability_Database.HyperCutter(), Pokemon_Ability_Database.ShellArmor(), Pokemon_Ability_Database.SheerForce(), base_stats);
		return Kingler;
	}
	public static Pokemon_Constructor Wooper()
	{
		int[] base_stats = {55, 45, 45, 25, 25, 15};
		Pokemon_Constructor Wooper = new Pokemon_Constructor("Wooper", Pokemon_Type_Database.water(), Pokemon_Type_Database.ground(), Pokemon_Ability_Database.Damp(), Pokemon_Ability_Database.WaterAbsorb(), Pokemon_Ability_Database.Unaware(), base_stats);
		return Wooper;
	}
	public static Pokemon_Constructor Quagsire()
	{
		int[] base_stats = {95, 85, 85, 65, 65, 35};
		Pokemon_Constructor Quagsire = new Pokemon_Constructor("Quagsire", Pokemon_Type_Database.water(), Pokemon_Type_Database.ground(), Pokemon_Ability_Database.Damp(), Pokemon_Ability_Database.WaterAbsorb(), Pokemon_Ability_Database.Unaware(), base_stats);
		return Quagsire;
	}
	public static Pokemon_Constructor Corphish()
	{
		int[] base_stats = {43, 80, 65, 50, 35, 35};
		Pokemon_Constructor Corphish = new Pokemon_Constructor("Corphish", Pokemon_Type_Database.water(), null, Pokemon_Ability_Database.HyperCutter(), Pokemon_Ability_Database.ShellArmor(), Pokemon_Ability_Database.Adaptability(), base_stats);
		return Corphish;
	}
	public static Pokemon_Constructor Crawdaunt()
	{
		int[] base_stats = {63, 120, 85, 90, 55, 55};
		Pokemon_Constructor Crawdaunt = new Pokemon_Constructor("Crawdaunt", Pokemon_Type_Database.water(), Pokemon_Type_Database.dark(), Pokemon_Ability_Database.HyperCutter(), Pokemon_Ability_Database.ShellArmor(), Pokemon_Ability_Database.Adaptability(), base_stats);
		return Crawdaunt;
	}
	public static Pokemon_Constructor Nincada()
	{
		int[] base_stats = {31, 45, 90, 30, 30, 40};
		Pokemon_Constructor Nincada = new Pokemon_Constructor("Nincada", Pokemon_Type_Database.bug(), Pokemon_Type_Database.ground(), Pokemon_Ability_Database.CompoundEyes(), null, Pokemon_Ability_Database.RunAway(), base_stats);
		return Nincada;
	}
	public static Pokemon_Constructor Ninjask()
	{
		int[] base_stats = {61, 90, 45, 50, 50, 160};
		Pokemon_Constructor Ninjask = new Pokemon_Constructor("Ninjask", Pokemon_Type_Database.bug(), Pokemon_Type_Database.flying(), Pokemon_Ability_Database.SpeedBoost(), null, Pokemon_Ability_Database.Infiltrator(), base_stats);
		return Ninjask;
	}
	public static Pokemon_Constructor Shedinja()
	{
		int[] base_stats = {1, 90, 45, 30, 30, 40};
		Pokemon_Constructor Shedinja = new Pokemon_Constructor("Shedinja", Pokemon_Type_Database.bug(), Pokemon_Type_Database.ghost(), Pokemon_Ability_Database.WonderGuard(), null, null, base_stats);
		return Shedinja;
	}
	public static Pokemon_Constructor Tyrogue()
	{
		int[] base_stats = {35, 35, 35, 35, 35, 35};
		Pokemon_Constructor Tyrogue = new Pokemon_Constructor("Tyrogue", Pokemon_Type_Database.fighting(), null, Pokemon_Ability_Database.Guts(), Pokemon_Ability_Database.Steadfast(), Pokemon_Ability_Database.VitalSpirit(), base_stats);
		return Tyrogue;
	}
	public static Pokemon_Constructor Hitmonlee()
	{
		int[] base_stats = {50, 120, 53, 35, 110, 87};
		Pokemon_Constructor Hitmonlee = new Pokemon_Constructor("Hitmonlee", Pokemon_Type_Database.fighting(), null, Pokemon_Ability_Database.Limber(), Pokemon_Ability_Database.Reckless(), Pokemon_Ability_Database.Unburden(), base_stats);
		return Hitmonlee;
	}
	public static Pokemon_Constructor Hitmonchan()
	{
		int[] base_stats = {50, 105, 79, 35, 110, 76};
		Pokemon_Constructor Hitmonchan = new Pokemon_Constructor("Hitmonchan", Pokemon_Type_Database.fighting(), null, Pokemon_Ability_Database.KeenEye(), Pokemon_Ability_Database.IronFist(), Pokemon_Ability_Database.InnerFocus(), base_stats);
		return Hitmonchan;
	}
	public static Pokemon_Constructor Hitmontop()
	{
		int[] base_stats = {50, 95, 95, 35, 110, 70};
		Pokemon_Constructor Hitmontop = new Pokemon_Constructor("Hitmontop", Pokemon_Type_Database.fighting(), null, Pokemon_Ability_Database.Intimidate(), Pokemon_Ability_Database.Technician(), Pokemon_Ability_Database.Steadfast(), base_stats);
		return Hitmontop;
	}
	public static Pokemon_Constructor Pancham()
	{
		int[] base_stats = {67, 82, 62, 46, 48, 43};
		Pokemon_Constructor Pancham = new Pokemon_Constructor("Pancham", Pokemon_Type_Database.fighting(), null, Pokemon_Ability_Database.IronFist(), Pokemon_Ability_Database.MoldBreaker(), Pokemon_Ability_Database.Scrappy(), base_stats);
		return Pancham;
	}
	public static Pokemon_Constructor Pangoro()
	{
		int[] base_stats = {95, 124, 78, 69, 71, 58};
		Pokemon_Constructor Pangoro = new Pokemon_Constructor("Pangoro", Pokemon_Type_Database.fighting(), Pokemon_Type_Database.dark(), Pokemon_Ability_Database.IronFist(), Pokemon_Ability_Database.MoldBreaker(), Pokemon_Ability_Database.Scrappy(), base_stats);
		return Pangoro;
	}
	public static Pokemon_Constructor Klink()
	{
		int[] base_stats = {40, 55, 70, 45, 60, 30};
		Pokemon_Constructor Klink = new Pokemon_Constructor("Klink", Pokemon_Type_Database.steel(), null, Pokemon_Ability_Database.Plus(), Pokemon_Ability_Database.Minus(), Pokemon_Ability_Database.ClearBody(), base_stats);
		return Klink;
	}
	public static Pokemon_Constructor Klang()
	{
		int[] base_stats = {60, 80, 95, 70, 85, 50};
		Pokemon_Constructor Klang = new Pokemon_Constructor("Klang", Pokemon_Type_Database.steel(), null, Pokemon_Ability_Database.Plus(), Pokemon_Ability_Database.Minus(), Pokemon_Ability_Database.ClearBody(), base_stats);
		return Klang;
	}
	public static Pokemon_Constructor Klinklang()
	{
		int[] base_stats = {60, 100, 115, 70, 85, 90};
		Pokemon_Constructor Klinklang = new Pokemon_Constructor("Klinklang", Pokemon_Type_Database.steel(), null, Pokemon_Ability_Database.Plus(), Pokemon_Ability_Database.Minus(), Pokemon_Ability_Database.ClearBody(), base_stats);
		return Klinklang;
	}
	public static Pokemon_Constructor Combee()
	{
		int[] base_stats = {30, 30, 42, 30, 42, 70};
		Pokemon_Constructor Combee = new Pokemon_Constructor("Combee", Pokemon_Type_Database.bug(), Pokemon_Type_Database.flying(), Pokemon_Ability_Database.HoneyGather(), null, Pokemon_Ability_Database.Hustle(), base_stats);
		return Combee;
	}
	public static Pokemon_Constructor Vespiquen()
	{
		int[] base_stats = {70, 80, 102, 80, 102, 40};
		Pokemon_Constructor Vespiquen = new Pokemon_Constructor("Vespiquen", Pokemon_Type_Database.bug(), Pokemon_Type_Database.flying(), Pokemon_Ability_Database.Pressure(), null, Pokemon_Ability_Database.Unnerve(), base_stats);
		return Vespiquen;
	}
	public static Pokemon_Constructor Bronzor()
	{
		int[] base_stats = {57, 24, 86, 24, 86, 23};
		Pokemon_Constructor Bronzor = new Pokemon_Constructor("Bronzor", Pokemon_Type_Database.steel(), Pokemon_Type_Database.psychic(), Pokemon_Ability_Database.Levitate(), Pokemon_Ability_Database.Heatproof(), Pokemon_Ability_Database.HeavyMetal(), base_stats);
		return Bronzor;
	}
	public static Pokemon_Constructor Bronzong()
	{
		int[] base_stats = {67, 89, 116, 79, 116, 33};
		Pokemon_Constructor Bronzong = new Pokemon_Constructor("Bronzong", Pokemon_Type_Database.steel(), Pokemon_Type_Database.psychic(), Pokemon_Ability_Database.Levitate(), Pokemon_Ability_Database.Heatproof(), Pokemon_Ability_Database.HeavyMetal(), base_stats);
		return Bronzong;
	}
	public static Pokemon_Constructor Ralts()
	{
		int[] base_stats = {28, 25, 25, 45, 35, 40};
		Pokemon_Constructor Ralts = new Pokemon_Constructor("Ralts", Pokemon_Type_Database.psychic(), Pokemon_Type_Database.fairy(), Pokemon_Ability_Database.Synchronize(), Pokemon_Ability_Database.Trace(), Pokemon_Ability_Database.Telepathy(), base_stats);
		return Ralts;
	}
	public static Pokemon_Constructor Kirlia()
	{
		int[] base_stats = {38, 35, 35, 65, 55, 50};
		Pokemon_Constructor Kirlia = new Pokemon_Constructor("Kirlia", Pokemon_Type_Database.psychic(), Pokemon_Type_Database.fairy(), Pokemon_Ability_Database.Synchronize(), Pokemon_Ability_Database.Trace(), Pokemon_Ability_Database.Telepathy(), base_stats);
		return Kirlia;
	}
	public static Pokemon_Constructor Gardevoir()
	{
		int[] base_stats = {68, 65, 65, 125, 115, 80};
		Pokemon_Constructor Gardevoir = new Pokemon_Constructor("Gardevoir", Pokemon_Type_Database.psychic(), Pokemon_Type_Database.fairy(), Pokemon_Ability_Database.Synchronize(), Pokemon_Ability_Database.Trace(), Pokemon_Ability_Database.Telepathy(), base_stats);
		return Gardevoir;
	}
	public static Pokemon_Constructor Gallade()
	{
		int[] base_stats = {68, 125, 65, 65, 115, 80};
		Pokemon_Constructor Gallade = new Pokemon_Constructor("Gallade", Pokemon_Type_Database.psychic(), Pokemon_Type_Database.fighting(), Pokemon_Ability_Database.Steadfast(), null, Pokemon_Ability_Database.Justified(), base_stats);
		return Gallade;
	}
	public static Pokemon_Constructor Drifloon()
	{
		int[] base_stats = {90, 50, 34, 60, 44, 70};
		Pokemon_Constructor Drifloon = new Pokemon_Constructor("Drifloon", Pokemon_Type_Database.ghost(), Pokemon_Type_Database.flying(), Pokemon_Ability_Database.Aftermath(), Pokemon_Ability_Database.Unburden(), Pokemon_Ability_Database.FlareBoost(), base_stats);
		return Drifloon;
	}
	public static Pokemon_Constructor Drifblim()
	{
		int[] base_stats = {150, 80, 44, 90, 54, 80};
		Pokemon_Constructor Drifblim = new Pokemon_Constructor("Drifblim", Pokemon_Type_Database.ghost(), Pokemon_Type_Database.flying(), Pokemon_Ability_Database.Aftermath(), Pokemon_Ability_Database.Unburden(), Pokemon_Ability_Database.FlareBoost(), base_stats);
		return Drifblim;
	}
	public static Pokemon_Constructor Gossifleur()
	{
		int[] base_stats = {40, 40, 60, 40, 60, 10};
		Pokemon_Constructor Gossifleur = new Pokemon_Constructor("Gossifleur", Pokemon_Type_Database.grass(), null, Pokemon_Ability_Database.CottonDown(), Pokemon_Ability_Database.Regenerator(), Pokemon_Ability_Database.EffectSpore(), base_stats);
		return Gossifleur;
	}
	public static Pokemon_Constructor Eldegoss()
	{
		int[] base_stats = {60, 50, 90, 80, 120, 60};
		Pokemon_Constructor Eldegoss = new Pokemon_Constructor("Eldegoss", Pokemon_Type_Database.grass(), null, Pokemon_Ability_Database.CottonDown(), Pokemon_Ability_Database.Regenerator(), Pokemon_Ability_Database.EffectSpore(), base_stats);
		return Eldegoss;
	}
	public static Pokemon_Constructor Cherubi()
	{
		int[] base_stats = {45, 35, 45, 62, 53, 35};
		Pokemon_Constructor Cherubi = new Pokemon_Constructor("Cherubi", Pokemon_Type_Database.grass(), null, Pokemon_Ability_Database.Chlorophyll(), null, null, base_stats);
		return Cherubi;
	}
	public static Pokemon_Constructor Cherrim()
	{
		int[] base_stats = {70, 60, 70, 87, 78, 85};
		Pokemon_Constructor Cherrim = new Pokemon_Constructor("Cherrim", Pokemon_Type_Database.grass(), null, Pokemon_Ability_Database.FlowerGift(), null, null, base_stats);
		return Cherrim;
	}
	public static Pokemon_Constructor Stunky()
	{
		int[] base_stats = {63, 63, 47, 41, 41, 74};
		Pokemon_Constructor Stunky = new Pokemon_Constructor("Stunky", Pokemon_Type_Database.poison(), Pokemon_Type_Database.dark(), Pokemon_Ability_Database.Stench(), Pokemon_Ability_Database.Aftermath(), Pokemon_Ability_Database.KeenEye(), base_stats);
		return Stunky;
	}
	public static Pokemon_Constructor Skuntank()
	{
		int[] base_stats = {103, 93, 67, 71, 61, 84};
		Pokemon_Constructor Skuntank = new Pokemon_Constructor("Skuntank", Pokemon_Type_Database.poison(), Pokemon_Type_Database.dark(), Pokemon_Ability_Database.Stench(), Pokemon_Ability_Database.Aftermath(), Pokemon_Ability_Database.KeenEye(), base_stats);
		return Skuntank;
	}
	public static Pokemon_Constructor Tympole()
	{
		int[] base_stats = {50, 50, 40, 50, 40, 64};
		Pokemon_Constructor Tympole = new Pokemon_Constructor("Tympole", Pokemon_Type_Database.water(), null, Pokemon_Ability_Database.SwiftSwim(), Pokemon_Ability_Database.Hydration(), Pokemon_Ability_Database.WaterAbsorb(), base_stats);
		return Tympole;
	}
	public static Pokemon_Constructor Palpitoad()
	{
		int[] base_stats = {75, 65, 55, 65, 55, 69};
		Pokemon_Constructor Palpitoad = new Pokemon_Constructor("Palpitoad", Pokemon_Type_Database.water(), Pokemon_Type_Database.ground(), Pokemon_Ability_Database.SwiftSwim(), Pokemon_Ability_Database.Hydration(), Pokemon_Ability_Database.WaterAbsorb(), base_stats);
		return Palpitoad;
	}
	public static Pokemon_Constructor Seismitoad()
	{
		int[] base_stats = {105, 95, 75, 85, 75, 74};
		Pokemon_Constructor Seismitoad = new Pokemon_Constructor("Seismitoad", Pokemon_Type_Database.water(), Pokemon_Type_Database.ground(), Pokemon_Ability_Database.SwiftSwim(), Pokemon_Ability_Database.PoisonTouch(), Pokemon_Ability_Database.WaterAbsorb(), base_stats);
		return Seismitoad;
	}
	public static Pokemon_Constructor Duskull()
	{
		int[] base_stats = {20, 40, 90, 30, 90, 25};
		Pokemon_Constructor Duskull = new Pokemon_Constructor("Duskull", Pokemon_Type_Database.ghost(), null, Pokemon_Ability_Database.Levitate(), null, Pokemon_Ability_Database.Frisk(), base_stats);
		return Duskull;
	}
	public static Pokemon_Constructor Dusclops()
	{
		int[] base_stats = {40, 70, 130, 60, 130, 25};
		Pokemon_Constructor Dusclops = new Pokemon_Constructor("Dusclops", Pokemon_Type_Database.ghost(), null, Pokemon_Ability_Database.Pressure(), null, Pokemon_Ability_Database.Frisk(), base_stats);
		return Dusclops;
	}
	public static Pokemon_Constructor Dusknoir()
	{
		int[] base_stats = {45, 100, 135, 65, 135, 45};
		Pokemon_Constructor Dusknoir = new Pokemon_Constructor("Dusknoir", Pokemon_Type_Database.ghost(), null, Pokemon_Ability_Database.Pressure(), null, Pokemon_Ability_Database.Frisk(), base_stats);
		return Dusknoir;
	}
	public static Pokemon_Constructor Machop()
	{
		int[] base_stats = {70, 80, 50, 35, 35, 35};
		Pokemon_Constructor Machop = new Pokemon_Constructor("Machop", Pokemon_Type_Database.fighting(), null, Pokemon_Ability_Database.Guts(), Pokemon_Ability_Database.NoGuard(), Pokemon_Ability_Database.Steadfast(), base_stats);
		return Machop;
	}
	public static Pokemon_Constructor Machoke()
	{
		int[] base_stats = {80, 100, 70, 50, 60, 45};
		Pokemon_Constructor Machoke = new Pokemon_Constructor("Machoke", Pokemon_Type_Database.fighting(), null, Pokemon_Ability_Database.Guts(), Pokemon_Ability_Database.NoGuard(), Pokemon_Ability_Database.Steadfast(), base_stats);
		return Machoke;
	}
	public static Pokemon_Constructor Machamp()
	{
		int[] base_stats = {90, 130, 80, 65, 85, 55};
		Pokemon_Constructor Machamp = new Pokemon_Constructor("Machamp", Pokemon_Type_Database.fighting(), null, Pokemon_Ability_Database.Guts(), Pokemon_Ability_Database.NoGuard(), Pokemon_Ability_Database.Steadfast(), base_stats);
		return Machamp;
	}
	public static Pokemon_Constructor Gastly()
	{
		int[] base_stats = {30, 35, 30, 100, 35, 80};
		Pokemon_Constructor Gastly = new Pokemon_Constructor("Gastly", Pokemon_Type_Database.ghost(), Pokemon_Type_Database.poison(), Pokemon_Ability_Database.Levitate(), null, null, base_stats);
		return Gastly;
	}
	public static Pokemon_Constructor Haunter()
	{
		int[] base_stats = {45, 50, 45, 115, 55, 95};
		Pokemon_Constructor Haunter = new Pokemon_Constructor("Haunter", Pokemon_Type_Database.ghost(), Pokemon_Type_Database.poison(), Pokemon_Ability_Database.Levitate(), null, null, base_stats);
		return Haunter;
	}
	public static Pokemon_Constructor Gengar()
	{
		int[] base_stats = {60, 65, 60, 130, 75, 110};
		Pokemon_Constructor Gengar = new Pokemon_Constructor("Gengar", Pokemon_Type_Database.ghost(), Pokemon_Type_Database.poison(), Pokemon_Ability_Database.CursedBody(), null, null, base_stats);
		return Gengar;
	}
	public static Pokemon_Constructor Magikarp()
	{
		int[] base_stats = {20, 10, 55, 15, 20, 80};
		Pokemon_Constructor Magikarp = new Pokemon_Constructor("Magikarp", Pokemon_Type_Database.water(), null, Pokemon_Ability_Database.SwiftSwim(), null, Pokemon_Ability_Database.Rattled(), base_stats);
		return Magikarp;
	}
	public static Pokemon_Constructor Gyarados()
	{
		int[] base_stats = {95, 125, 79, 60, 100, 81};
		Pokemon_Constructor Gyarados = new Pokemon_Constructor("Gyarados", Pokemon_Type_Database.water(), Pokemon_Type_Database.flying(), Pokemon_Ability_Database.Intimidate(), null, Pokemon_Ability_Database.Moxie(), base_stats);
		return Gyarados;
	}
	public static Pokemon_Constructor Goldeen()
	{
		int[] base_stats = {45, 67, 60, 35, 50, 63};
		Pokemon_Constructor Goldeen = new Pokemon_Constructor("Goldeen", Pokemon_Type_Database.water(), null, Pokemon_Ability_Database.SwiftSwim(), Pokemon_Ability_Database.WaterVeil(), Pokemon_Ability_Database.LightningRod(), base_stats);
		return Goldeen;
	}
	public static Pokemon_Constructor Seaking()
	{
		int[] base_stats = {80, 92, 65, 65, 80, 68};
		Pokemon_Constructor Seaking = new Pokemon_Constructor("Seaking", Pokemon_Type_Database.water(), null, Pokemon_Ability_Database.SwiftSwim(), Pokemon_Ability_Database.WaterVeil(), Pokemon_Ability_Database.LightningRod(), base_stats);
		return Seaking;
	}
	public static Pokemon_Constructor Remoraid()
	{
		int[] base_stats = {35, 65, 35, 65, 35, 65};
		Pokemon_Constructor Remoraid = new Pokemon_Constructor("Remoraid", Pokemon_Type_Database.water(), null, Pokemon_Ability_Database.Hustle(), Pokemon_Ability_Database.Sniper(), Pokemon_Ability_Database.Moody(), base_stats);
		return Remoraid;
	}
	public static Pokemon_Constructor Octillery()
	{
		int[] base_stats = {75, 105, 75, 105, 75, 45};
		Pokemon_Constructor Octillery = new Pokemon_Constructor("Octillery", Pokemon_Type_Database.water(), null, Pokemon_Ability_Database.SuctionCups(), Pokemon_Ability_Database.Sniper(), Pokemon_Ability_Database.Moody(), base_stats);
		return Octillery;
	}
	public static Pokemon_Constructor Shellder()
	{
		int[] base_stats = {30, 65, 100, 45, 25, 40};
		Pokemon_Constructor Shellder = new Pokemon_Constructor("Shellder", Pokemon_Type_Database.water(), null, Pokemon_Ability_Database.ShellArmor(), Pokemon_Ability_Database.SkillLink(), Pokemon_Ability_Database.Overcoat(), base_stats);
		return Shellder;
	}
	public static Pokemon_Constructor Cloyster()
	{
		int[] base_stats = {50, 95, 180, 85, 45, 70};
		Pokemon_Constructor Cloyster = new Pokemon_Constructor("Cloyster", Pokemon_Type_Database.water(), Pokemon_Type_Database.ice(), Pokemon_Ability_Database.ShellArmor(), Pokemon_Ability_Database.SkillLink(), Pokemon_Ability_Database.Overcoat(), base_stats);
		return Cloyster;
	}
	public static Pokemon_Constructor Feebas()
	{
		int[] base_stats = {20, 15, 20, 10, 55, 80};
		Pokemon_Constructor Feebas = new Pokemon_Constructor("Feebas", Pokemon_Type_Database.water(), null, Pokemon_Ability_Database.SwiftSwim(), Pokemon_Ability_Database.Oblivious(), Pokemon_Ability_Database.Adaptability(), base_stats);
		return Feebas;
	}
	public static Pokemon_Constructor Milotic()
	{
		int[] base_stats = {95, 60, 79, 100, 125, 81};
		Pokemon_Constructor Milotic = new Pokemon_Constructor("Milotic", Pokemon_Type_Database.water(), null, Pokemon_Ability_Database.MarvelScale(), Pokemon_Ability_Database.Competitive(), Pokemon_Ability_Database.CuteCharm(), base_stats);
		return Milotic;
	}
	public static Pokemon_Constructor Basculin()
	{
		int[] base_stats = {70, 92, 65, 80, 55, 98};
		Pokemon_Constructor Basculin = new Pokemon_Constructor("Basculin", Pokemon_Type_Database.water(), null, Pokemon_Ability_Database.Reckless(), Pokemon_Ability_Database.Adaptability(), Pokemon_Ability_Database.MoldBreaker(), base_stats);
		return Basculin;
	}
	public static Pokemon_Constructor Wishiwashi()
	{
		int[] base_stats = {45, 20, 20, 25, 25, 40};
		Pokemon_Constructor Wishiwashi = new Pokemon_Constructor("Wishiwashi", Pokemon_Type_Database.water(), null, Pokemon_Ability_Database.Schooling(), null, null, base_stats);
		return Wishiwashi;
	}
	public static Pokemon_Constructor Pyukumuku()
	{
		int[] base_stats = {55, 60, 130, 30, 130, 5};
		Pokemon_Constructor Pyukumuku = new Pokemon_Constructor("Pyukumuku", Pokemon_Type_Database.water(), null, Pokemon_Ability_Database.InnardsOut(), null, Pokemon_Ability_Database.Unaware(), base_stats);
		return Pyukumuku;
	}
	public static Pokemon_Constructor Trubbish()
	{
		int[] base_stats = {50, 50, 62, 40, 62, 65};
		Pokemon_Constructor Trubbish = new Pokemon_Constructor("Trubbish", Pokemon_Type_Database.poison(), null, Pokemon_Ability_Database.Stench(), Pokemon_Ability_Database.StickyHold(), Pokemon_Ability_Database.Aftermath(), base_stats);
		return Trubbish;
	}
	public static Pokemon_Constructor Garbodor()
	{
		int[] base_stats = {80, 95, 82, 60, 82, 75};
		Pokemon_Constructor Garbodor = new Pokemon_Constructor("Garbodor", Pokemon_Type_Database.poison(), null, Pokemon_Ability_Database.Stench(), Pokemon_Ability_Database.WeakArmor(), Pokemon_Ability_Database.Aftermath(), base_stats);
		return Garbodor;
	}
	public static Pokemon_Constructor Sizzlipede()
	{
		int[] base_stats = {50, 65, 45, 50, 50, 45};
		Pokemon_Constructor Sizzlipede = new Pokemon_Constructor("Sizzlipede", Pokemon_Type_Database.fire(), Pokemon_Type_Database.bug(), Pokemon_Ability_Database.FlashFire(), Pokemon_Ability_Database.WhiteSmoke(), Pokemon_Ability_Database.FlameBody(), base_stats);
		return Sizzlipede;
	}
	public static Pokemon_Constructor Centiskorch()
	{
		int[] base_stats = {100, 115, 65, 90, 90, 65};
		Pokemon_Constructor Centiskorch = new Pokemon_Constructor("Centiskorch", Pokemon_Type_Database.fire(), Pokemon_Type_Database.bug(), Pokemon_Ability_Database.FlashFire(), Pokemon_Ability_Database.WhiteSmoke(), Pokemon_Ability_Database.FlameBody(), base_stats);
		return Centiskorch;
	}
	public static Pokemon_Constructor Rolycoly()
	{
		int[] base_stats = {30, 40, 50, 40, 50, 30};
		Pokemon_Constructor Rolycoly = new Pokemon_Constructor("Rolycoly", Pokemon_Type_Database.rock(), null, Pokemon_Ability_Database.SteamEngine(), Pokemon_Ability_Database.Heatproof(), Pokemon_Ability_Database.FlashFire(), base_stats);
		return Rolycoly;
	}
	public static Pokemon_Constructor Carkol()
	{
		int[] base_stats = {80, 60, 90, 60, 70, 50};
		Pokemon_Constructor Carkol = new Pokemon_Constructor("Carkol", Pokemon_Type_Database.rock(), Pokemon_Type_Database.fire(), Pokemon_Ability_Database.SteamEngine(), Pokemon_Ability_Database.FlameBody(), Pokemon_Ability_Database.FlashFire(), base_stats);
		return Carkol;
	}
	public static Pokemon_Constructor Coalossal()
	{
		int[] base_stats = {110, 80, 120, 80, 90, 30};
		Pokemon_Constructor Coalossal = new Pokemon_Constructor("Coalossal", Pokemon_Type_Database.rock(), Pokemon_Type_Database.fire(), Pokemon_Ability_Database.SteamEngine(), Pokemon_Ability_Database.FlameBody(), Pokemon_Ability_Database.FlashFire(), base_stats);
		return Coalossal;
	}
	public static Pokemon_Constructor Diglett()
	{
		int[] base_stats = {10, 55, 25, 35, 45, 95};
		Pokemon_Constructor Diglett = new Pokemon_Constructor("Diglett", Pokemon_Type_Database.ground(), null, Pokemon_Ability_Database.SandVeil(), Pokemon_Ability_Database.ArenaTrap(), Pokemon_Ability_Database.SandForce(), base_stats);
		return Diglett;
	}
	public static Pokemon_Constructor Dugtrio()
	{
		int[] base_stats = {35, 100, 50, 50, 70, 120};
		Pokemon_Constructor Dugtrio = new Pokemon_Constructor("Dugtrio", Pokemon_Type_Database.ground(), null, Pokemon_Ability_Database.SandVeil(), Pokemon_Ability_Database.ArenaTrap(), Pokemon_Ability_Database.SandForce(), base_stats);
		return Dugtrio;
	}
	public static Pokemon_Constructor Drilbur()
	{
		int[] base_stats = {60, 85, 40, 30, 45, 68};
		Pokemon_Constructor Drilbur = new Pokemon_Constructor("Drilbur", Pokemon_Type_Database.ground(), null, Pokemon_Ability_Database.SandRush(), Pokemon_Ability_Database.SandForce(), Pokemon_Ability_Database.MoldBreaker(), base_stats);
		return Drilbur;
	}
	public static Pokemon_Constructor Excadrill()
	{
		int[] base_stats = {110, 135, 60, 50, 65, 88};
		Pokemon_Constructor Excadrill = new Pokemon_Constructor("Excadrill", Pokemon_Type_Database.ground(), Pokemon_Type_Database.steel(), Pokemon_Ability_Database.SandRush(), Pokemon_Ability_Database.SandForce(), Pokemon_Ability_Database.MoldBreaker(), base_stats);
		return Excadrill;
	}
	public static Pokemon_Constructor Roggenrola()
	{
		int[] base_stats = {55, 75, 85, 25, 25, 15};
		Pokemon_Constructor Roggenrola = new Pokemon_Constructor("Roggenrola", Pokemon_Type_Database.rock(), null, Pokemon_Ability_Database.Sturdy(), Pokemon_Ability_Database.WeakArmor(), Pokemon_Ability_Database.SandForce(), base_stats);
		return Roggenrola;
	}
	public static Pokemon_Constructor Boldore()
	{
		int[] base_stats = {70, 105, 105, 50, 40, 20};
		Pokemon_Constructor Boldore = new Pokemon_Constructor("Boldore", Pokemon_Type_Database.rock(), null, Pokemon_Ability_Database.Sturdy(), Pokemon_Ability_Database.WeakArmor(), Pokemon_Ability_Database.SandForce(), base_stats);
		return Boldore;
	}
	public static Pokemon_Constructor Gigalith()
	{
		int[] base_stats = {85, 135, 130, 60, 80, 25};
		Pokemon_Constructor Gigalith = new Pokemon_Constructor("Gigalith", Pokemon_Type_Database.rock(), null, Pokemon_Ability_Database.Sturdy(), Pokemon_Ability_Database.SandStream(), Pokemon_Ability_Database.SandForce(), base_stats);
		return Gigalith;
	}
	public static Pokemon_Constructor Timburr()
	{
		int[] base_stats = {75, 80, 55, 25, 35, 35};
		Pokemon_Constructor Timburr = new Pokemon_Constructor("Timburr", Pokemon_Type_Database.fighting(), null, Pokemon_Ability_Database.Guts(), Pokemon_Ability_Database.SheerForce(), Pokemon_Ability_Database.IronFist(), base_stats);
		return Timburr;
	}
	public static Pokemon_Constructor Gurdurr()
	{
		int[] base_stats = {85, 105, 85, 40, 50, 40};
		Pokemon_Constructor Gurdurr = new Pokemon_Constructor("Gurdurr", Pokemon_Type_Database.fighting(), null, Pokemon_Ability_Database.Guts(), Pokemon_Ability_Database.SheerForce(), Pokemon_Ability_Database.IronFist(), base_stats);
		return Gurdurr;
	}
	public static Pokemon_Constructor Conkeldurr()
	{
		int[] base_stats = {105, 140, 95, 55, 65, 45};
		Pokemon_Constructor Conkeldurr = new Pokemon_Constructor("Conkeldurr", Pokemon_Type_Database.fighting(), null, Pokemon_Ability_Database.Guts(), Pokemon_Ability_Database.SheerForce(), Pokemon_Ability_Database.IronFist(), base_stats);
		return Conkeldurr;
	}
	public static Pokemon_Constructor Woobat()
	{
		int[] base_stats = {65, 45, 43, 55, 43, 72};
		Pokemon_Constructor Woobat = new Pokemon_Constructor("Woobat", Pokemon_Type_Database.psychic(), Pokemon_Type_Database.flying(), Pokemon_Ability_Database.Unaware(), Pokemon_Ability_Database.Klutz(), Pokemon_Ability_Database.Simple(), base_stats);
		return Woobat;
	}
	public static Pokemon_Constructor Swoobat()
	{
		int[] base_stats = {67, 57, 55, 77, 55, 114};
		Pokemon_Constructor Swoobat = new Pokemon_Constructor("Swoobat", Pokemon_Type_Database.psychic(), Pokemon_Type_Database.flying(), Pokemon_Ability_Database.Unaware(), Pokemon_Ability_Database.Klutz(), Pokemon_Ability_Database.Simple(), base_stats);
		return Swoobat;
	}
	public static Pokemon_Constructor Noibat()
	{
		int[] base_stats = {40, 30, 35, 45, 40, 55};
		Pokemon_Constructor Noibat = new Pokemon_Constructor("Noibat", Pokemon_Type_Database.flying(), Pokemon_Type_Database.dragon(), Pokemon_Ability_Database.Frisk(), Pokemon_Ability_Database.Infiltrator(), Pokemon_Ability_Database.Telepathy(), base_stats);
		return Noibat;
	}
	public static Pokemon_Constructor Noivern()
	{
		int[] base_stats = {85, 70, 80, 97, 80, 123};
		Pokemon_Constructor Noivern = new Pokemon_Constructor("Noivern", Pokemon_Type_Database.flying(), Pokemon_Type_Database.dragon(), Pokemon_Ability_Database.Frisk(), Pokemon_Ability_Database.Infiltrator(), Pokemon_Ability_Database.Telepathy(), base_stats);
		return Noivern;
	}
	public static Pokemon_Constructor Onix()
	{
		int[] base_stats = {35, 45, 160, 30, 45, 70};
		Pokemon_Constructor Onix = new Pokemon_Constructor("Onix", Pokemon_Type_Database.rock(), Pokemon_Type_Database.ground(), Pokemon_Ability_Database.RockHead(), Pokemon_Ability_Database.Sturdy(), Pokemon_Ability_Database.WeakArmor(), base_stats);
		return Onix;
	}
	public static Pokemon_Constructor Steelix()
	{
		int[] base_stats = {75, 85, 200, 55, 65, 30};
		Pokemon_Constructor Steelix = new Pokemon_Constructor("Steelix", Pokemon_Type_Database.steel(), Pokemon_Type_Database.ground(), Pokemon_Ability_Database.RockHead(), Pokemon_Ability_Database.Sturdy(), Pokemon_Ability_Database.SheerForce(), base_stats);
		return Steelix;
	}
	public static Pokemon_Constructor Arrokuda()
	{
		int[] base_stats = {41, 63, 40, 40, 30, 66};
		Pokemon_Constructor Arrokuda = new Pokemon_Constructor("Arrokuda", Pokemon_Type_Database.water(), null, Pokemon_Ability_Database.SwiftSwim(), null, Pokemon_Ability_Database.PropellerTail(), base_stats);
		return Arrokuda;
	}
	public static Pokemon_Constructor Barraskewda()
	{
		int[] base_stats = {61, 123, 60, 60, 50, 136};
		Pokemon_Constructor Barraskewda = new Pokemon_Constructor("Barraskewda", Pokemon_Type_Database.water(), null, Pokemon_Ability_Database.SwiftSwim(), null, Pokemon_Ability_Database.PropellerTail(), base_stats);
		return Barraskewda;
	}
	public static Pokemon_Constructor Meowth()
	{
		int[] base_stats = {50, 65, 55, 40, 40, 40};
		Pokemon_Constructor Meowth = new Pokemon_Constructor("Meowth", Pokemon_Type_Database.steel(), null, Pokemon_Ability_Database.Pickup(), Pokemon_Ability_Database.ToughClaws(), Pokemon_Ability_Database.Unnerve(), base_stats);
		return Meowth;
	}
	public static Pokemon_Constructor Perrserker()
	{
		int[] base_stats = {70, 110, 100, 50, 60, 50};
		Pokemon_Constructor Perrserker = new Pokemon_Constructor("Perrserker", Pokemon_Type_Database.steel(), null, Pokemon_Ability_Database.BattleArmor(), Pokemon_Ability_Database.ToughClaws(), Pokemon_Ability_Database.SteelySpirit(), base_stats);
		return Perrserker;
	}
	public static Pokemon_Constructor Persian()
	{
		int[] base_stats = {65, 70, 60, 65, 65, 115};
		Pokemon_Constructor Persian = new Pokemon_Constructor("Persian", Pokemon_Type_Database.normal(), null, Pokemon_Ability_Database.Limber(), Pokemon_Ability_Database.Technician(), Pokemon_Ability_Database.Unnerve(), base_stats);
		return Persian;
	}
	public static Pokemon_Constructor Milcery()
	{
		int[] base_stats = {45, 40, 40, 50, 61, 34};
		Pokemon_Constructor Milcery = new Pokemon_Constructor("Milcery", Pokemon_Type_Database.fairy(), null, Pokemon_Ability_Database.SweetVeil(), null, Pokemon_Ability_Database.AromaVeil(), base_stats);
		return Milcery;
	}
	public static Pokemon_Constructor Alcremie()
	{
		int[] base_stats = {65, 60, 75, 110, 121, 64};
		Pokemon_Constructor Alcremie = new Pokemon_Constructor("Alcremie", Pokemon_Type_Database.fairy(), null, Pokemon_Ability_Database.SweetVeil(), null, Pokemon_Ability_Database.AromaVeil(), base_stats);
		return Alcremie;
	}
	public static Pokemon_Constructor Cutiefly()
	{
		int[] base_stats = {40, 45, 40, 55, 40, 84};
		Pokemon_Constructor Cutiefly = new Pokemon_Constructor("Cutiefly", Pokemon_Type_Database.bug(), Pokemon_Type_Database.fairy(), Pokemon_Ability_Database.HoneyGather(), Pokemon_Ability_Database.ShieldDust(), Pokemon_Ability_Database.SweetVeil(), base_stats);
		return Cutiefly;
	}
	public static Pokemon_Constructor Ribombee()
	{
		int[] base_stats = {60, 55, 60, 95, 70, 124};
		Pokemon_Constructor Ribombee = new Pokemon_Constructor("Ribombee", Pokemon_Type_Database.bug(), Pokemon_Type_Database.fairy(), Pokemon_Ability_Database.HoneyGather(), Pokemon_Ability_Database.ShieldDust(), Pokemon_Ability_Database.SweetVeil(), base_stats);
		return Ribombee;
	}
	public static Pokemon_Constructor Ferroseed()
	{
		int[] base_stats = {44, 50, 91, 24, 86, 10};
		Pokemon_Constructor Ferroseed = new Pokemon_Constructor("Ferroseed", Pokemon_Type_Database.grass(), Pokemon_Type_Database.steel(), Pokemon_Ability_Database.IronBarbs(), null, null, base_stats);
		return Ferroseed;
	}
	public static Pokemon_Constructor Ferrothorn()
	{
		int[] base_stats = {74, 94, 131, 54, 116, 20};
		Pokemon_Constructor Ferrothorn = new Pokemon_Constructor("Ferrothorn", Pokemon_Type_Database.grass(), Pokemon_Type_Database.steel(), Pokemon_Ability_Database.IronBarbs(), null, Pokemon_Ability_Database.Anticipation(), base_stats);
		return Ferrothorn;
	}
	public static Pokemon_Constructor Pumpkaboo()
	{
		int[] base_stats = {49, 66, 70, 44, 55, 51};
		Pokemon_Constructor Pumpkaboo = new Pokemon_Constructor("Pumpkaboo", Pokemon_Type_Database.ghost(), Pokemon_Type_Database.grass(), Pokemon_Ability_Database.Pickup(), Pokemon_Ability_Database.Frisk(), Pokemon_Ability_Database.Insomnia(), base_stats);
		return Pumpkaboo;
	}
	public static Pokemon_Constructor Gourgeist()
	{
		int[] base_stats = {65, 90, 122, 58, 75, 84};
		Pokemon_Constructor Gourgeist = new Pokemon_Constructor("Gourgeist", Pokemon_Type_Database.ghost(), Pokemon_Type_Database.grass(), Pokemon_Ability_Database.Pickup(), Pokemon_Ability_Database.Frisk(), Pokemon_Ability_Database.Insomnia(), base_stats);
		return Gourgeist;
	}
	public static Pokemon_Constructor Pichu()
	{
		int[] base_stats = {20, 40, 15, 35, 35, 60};
		Pokemon_Constructor Pichu = new Pokemon_Constructor("Pichu", Pokemon_Type_Database.electric(), null, Pokemon_Ability_Database.Static(), null, Pokemon_Ability_Database.LightningRod(), base_stats);
		return Pichu;
	}
	public static Pokemon_Constructor Pikachu()
	{
		int[] base_stats = {35, 55, 40, 50, 50, 90};
		Pokemon_Constructor Pikachu = new Pokemon_Constructor("Pikachu", Pokemon_Type_Database.electric(), null, Pokemon_Ability_Database.Static(), null, Pokemon_Ability_Database.LightningRod(), base_stats);
		return Pikachu;
	}
	public static Pokemon_Constructor Raichu()
	{
		int[] base_stats = {60, 90, 55, 90, 80, 110};
		Pokemon_Constructor Raichu = new Pokemon_Constructor("Raichu", Pokemon_Type_Database.electric(), null, Pokemon_Ability_Database.Static(), null, Pokemon_Ability_Database.LightningRod(), base_stats);
		return Raichu;
	}
	public static Pokemon_Constructor Eevee()
	{
		int[] base_stats = {55, 55, 50, 45, 65, 55};
		Pokemon_Constructor Eevee = new Pokemon_Constructor("Eevee", Pokemon_Type_Database.normal(), null, Pokemon_Ability_Database.RunAway(), Pokemon_Ability_Database.Adaptability(), Pokemon_Ability_Database.Anticipation(), base_stats);
		return Eevee;
	}
	public static Pokemon_Constructor Vaporeon()
	{
		int[] base_stats = {130, 65, 60, 110, 95, 65};
		Pokemon_Constructor Vaporeon = new Pokemon_Constructor("Vaporeon", Pokemon_Type_Database.water(), null, Pokemon_Ability_Database.WaterAbsorb(), null, Pokemon_Ability_Database.Hydration(), base_stats);
		return Vaporeon;
	}
	public static Pokemon_Constructor Jolteon()
	{
		int[] base_stats = {65, 65, 60, 110, 95, 130};
		Pokemon_Constructor Jolteon = new Pokemon_Constructor("Jolteon", Pokemon_Type_Database.electric(), null, Pokemon_Ability_Database.VoltAbsorb(), null, Pokemon_Ability_Database.QuickFeet(), base_stats);
		return Jolteon;
	}
	public static Pokemon_Constructor Flareon()
	{
		int[] base_stats = {65, 130, 60, 95, 110, 65};
		Pokemon_Constructor Flareon = new Pokemon_Constructor("Flareon", Pokemon_Type_Database.fire(), null, Pokemon_Ability_Database.FlashFire(), null, Pokemon_Ability_Database.Guts(), base_stats);
		return Flareon;
	}
	public static Pokemon_Constructor Espeon()
	{
		int[] base_stats = {65, 65, 60, 130, 95, 110};
		Pokemon_Constructor Espeon = new Pokemon_Constructor("Espeon", Pokemon_Type_Database.psychic(), null, Pokemon_Ability_Database.Synchronize(), null, Pokemon_Ability_Database.MagicBounce(), base_stats);
		return Espeon;
	}
	public static Pokemon_Constructor Umbreon()
	{
		int[] base_stats = {95, 65, 110, 60, 130, 65};
		Pokemon_Constructor Umbreon = new Pokemon_Constructor("Umbreon", Pokemon_Type_Database.dark(), null, Pokemon_Ability_Database.Synchronize(), null, Pokemon_Ability_Database.InnerFocus(), base_stats);
		return Umbreon;
	}
	public static Pokemon_Constructor Leafeon()
	{
		int[] base_stats = {65, 110, 130, 60, 65, 95};
		Pokemon_Constructor Leafeon = new Pokemon_Constructor("Leafeon", Pokemon_Type_Database.grass(), null, Pokemon_Ability_Database.LeafGuard(), null, Pokemon_Ability_Database.Chlorophyll(), base_stats);
		return Leafeon;
	}
	public static Pokemon_Constructor Glaceon()
	{
		int[] base_stats = {65, 60, 110, 130, 95, 65};
		Pokemon_Constructor Glaceon = new Pokemon_Constructor("Glaceon", Pokemon_Type_Database.ice(), null, Pokemon_Ability_Database.SnowCloak(), null, Pokemon_Ability_Database.IceBody(), base_stats);
		return Glaceon;
	}
	public static Pokemon_Constructor Sylveon()
	{
		int[] base_stats = {95, 65, 65, 110, 130, 60};
		Pokemon_Constructor Sylveon = new Pokemon_Constructor("Sylveon", Pokemon_Type_Database.fairy(), null, Pokemon_Ability_Database.CuteCharm(), null, Pokemon_Ability_Database.Pixilate(), base_stats);
		return Sylveon;
	}
	public static Pokemon_Constructor Applin()
	{
		int[] base_stats = {40, 40, 80, 40, 40, 20};
		Pokemon_Constructor Applin = new Pokemon_Constructor("Applin", Pokemon_Type_Database.grass(), Pokemon_Type_Database.dragon(), Pokemon_Ability_Database.Ripen(), Pokemon_Ability_Database.Gluttony(), Pokemon_Ability_Database.Bulletproof(), base_stats);
		return Applin;
	}
	public static Pokemon_Constructor Flapple()
	{
		int[] base_stats = {70, 110, 80, 95, 60, 70};
		Pokemon_Constructor Flapple = new Pokemon_Constructor("Flapple", Pokemon_Type_Database.grass(), Pokemon_Type_Database.dragon(), Pokemon_Ability_Database.Ripen(), Pokemon_Ability_Database.Gluttony(), Pokemon_Ability_Database.Hustle(), base_stats);
		return Flapple;
	}
	public static Pokemon_Constructor Appletun()
	{
		int[] base_stats = {110, 85, 80, 100, 80, 30};
		Pokemon_Constructor Appletun = new Pokemon_Constructor("Appletun", Pokemon_Type_Database.grass(), Pokemon_Type_Database.dragon(), Pokemon_Ability_Database.Ripen(), Pokemon_Ability_Database.Gluttony(), Pokemon_Ability_Database.ThickFat(), base_stats);
		return Appletun;
	}
	public static Pokemon_Constructor Espurr()
	{
		int[] base_stats = {62, 48, 54, 63, 60, 68};
		Pokemon_Constructor Espurr = new Pokemon_Constructor("Espurr", Pokemon_Type_Database.psychic(), null, Pokemon_Ability_Database.KeenEye(), Pokemon_Ability_Database.Infiltrator(), Pokemon_Ability_Database.OwnTempo(), base_stats);
		return Espurr;
	}
	public static Pokemon_Constructor Meowstic()
	{
		int[] base_stats = {74, 48, 76, 83, 81, 104};
		Pokemon_Constructor Meowstic = new Pokemon_Constructor("Meowstic", Pokemon_Type_Database.psychic(), null, Pokemon_Ability_Database.KeenEye(), Pokemon_Ability_Database.Infiltrator(), Pokemon_Ability_Database.Prankster(), base_stats);
		return Meowstic;
	}
	public static Pokemon_Constructor Swirlix()
	{
		int[] base_stats = {62, 48, 66, 59, 57, 49};
		Pokemon_Constructor Swirlix = new Pokemon_Constructor("Swirlix", Pokemon_Type_Database.fairy(), null, Pokemon_Ability_Database.SweetVeil(), null, Pokemon_Ability_Database.Unburden(), base_stats);
		return Swirlix;
	}
	public static Pokemon_Constructor Slurpuff()
	{
		int[] base_stats = {82, 80, 86, 85, 75, 72};
		Pokemon_Constructor Slurpuff = new Pokemon_Constructor("Slurpuff", Pokemon_Type_Database.fairy(), null, Pokemon_Ability_Database.SweetVeil(), null, Pokemon_Ability_Database.Unburden(), base_stats);
		return Slurpuff;
	}
	public static Pokemon_Constructor Spritzee()
	{
		int[] base_stats = {78, 52, 60, 63, 65, 23};
		Pokemon_Constructor Spritzee = new Pokemon_Constructor("Spritzee", Pokemon_Type_Database.fairy(), null, Pokemon_Ability_Database.Healer(), null, Pokemon_Ability_Database.AromaVeil(), base_stats);
		return Spritzee;
	}
	public static Pokemon_Constructor Aromatisse()
	{
		int[] base_stats = {101, 72, 72, 99, 89, 29};
		Pokemon_Constructor Aromatisse = new Pokemon_Constructor("Aromatisse", Pokemon_Type_Database.fairy(), null, Pokemon_Ability_Database.Healer(), null, Pokemon_Ability_Database.AromaVeil(), base_stats);
		return Aromatisse;
	}
	public static Pokemon_Constructor Dewpider()
	{
		int[] base_stats = {38, 40, 52, 40, 72, 27};
		Pokemon_Constructor Dewpider = new Pokemon_Constructor("Dewpider", Pokemon_Type_Database.water(), Pokemon_Type_Database.bug(), Pokemon_Ability_Database.WaterBubble(), null, Pokemon_Ability_Database.WaterAbsorb(), base_stats);
		return Dewpider;
	}
	public static Pokemon_Constructor Araquanid()
	{
		int[] base_stats = {68, 70, 92, 50, 132, 42};
		Pokemon_Constructor Araquanid = new Pokemon_Constructor("Araquanid", Pokemon_Type_Database.water(), Pokemon_Type_Database.bug(), Pokemon_Ability_Database.WaterBubble(), null, Pokemon_Ability_Database.WaterAbsorb(), base_stats);
		return Araquanid;
	}
	public static Pokemon_Constructor Wynaut()
	{
		int[] base_stats = {95, 23, 48, 23, 48, 23};
		Pokemon_Constructor Wynaut = new Pokemon_Constructor("Wynaut", Pokemon_Type_Database.psychic(), null, Pokemon_Ability_Database.ShadowTag(), null, Pokemon_Ability_Database.Telepathy(), base_stats);
		return Wynaut;
	}
	public static Pokemon_Constructor Wobbuffet()
	{
		int[] base_stats = {190, 33, 58, 33, 58, 33};
		Pokemon_Constructor Wobbuffet = new Pokemon_Constructor("Wobbuffet", Pokemon_Type_Database.psychic(), null, Pokemon_Ability_Database.ShadowTag(), null, Pokemon_Ability_Database.Telepathy(), base_stats);
		return Wobbuffet;
	}
	public static Pokemon_Constructor Farfetchd()
	{
		int[] base_stats = {52, 95, 55, 58, 62, 55};
		Pokemon_Constructor Farfetchd = new Pokemon_Constructor("Farfetchd", Pokemon_Type_Database.fighting(), null, Pokemon_Ability_Database.Steadfast(), null, Pokemon_Ability_Database.Scrappy(), base_stats);
		return Farfetchd;
	}
	public static Pokemon_Constructor Sirfetchd()
	{
		int[] base_stats = {62, 135, 95, 68, 82, 65};
		Pokemon_Constructor Sirfetchd = new Pokemon_Constructor("Sirfetchd", Pokemon_Type_Database.fighting(), null, Pokemon_Ability_Database.Steadfast(), null, Pokemon_Ability_Database.Scrappy(), base_stats);
		return Sirfetchd;
	}
	public static Pokemon_Constructor Chinchou()
	{
		int[] base_stats = {75, 38, 38, 56, 56, 67};
		Pokemon_Constructor Chinchou = new Pokemon_Constructor("Chinchou", Pokemon_Type_Database.water(), Pokemon_Type_Database.electric(), Pokemon_Ability_Database.VoltAbsorb(), Pokemon_Ability_Database.Illuminate(), Pokemon_Ability_Database.WaterAbsorb(), base_stats);
		return Chinchou;
	}
	public static Pokemon_Constructor Lanturn()
	{
		int[] base_stats = {125, 58, 58, 76, 76, 67};
		Pokemon_Constructor Lanturn = new Pokemon_Constructor("Lanturn", Pokemon_Type_Database.water(), Pokemon_Type_Database.electric(), Pokemon_Ability_Database.VoltAbsorb(), Pokemon_Ability_Database.Illuminate(), Pokemon_Ability_Database.WaterAbsorb(), base_stats);
		return Lanturn;
	}
	public static Pokemon_Constructor Croagunk()
	{
		int[] base_stats = {48, 61, 40, 61, 40, 50};
		Pokemon_Constructor Croagunk = new Pokemon_Constructor("Croagunk", Pokemon_Type_Database.poison(), Pokemon_Type_Database.fighting(), Pokemon_Ability_Database.Anticipation(), Pokemon_Ability_Database.DrySkin(), Pokemon_Ability_Database.PoisonTouch(), base_stats);
		return Croagunk;
	}
	public static Pokemon_Constructor Toxicroak()
	{
		int[] base_stats = {83, 106, 65, 86, 65, 85};
		Pokemon_Constructor Toxicroak = new Pokemon_Constructor("Toxicroak", Pokemon_Type_Database.poison(), Pokemon_Type_Database.fighting(), Pokemon_Ability_Database.Anticipation(), Pokemon_Ability_Database.DrySkin(), Pokemon_Ability_Database.PoisonTouch(), base_stats);
		return Toxicroak;
	}
	public static Pokemon_Constructor Scraggy()
	{
		int[] base_stats = {50, 75, 70, 35, 70, 48};
		Pokemon_Constructor Scraggy = new Pokemon_Constructor("Scraggy", Pokemon_Type_Database.dark(), Pokemon_Type_Database.fighting(), Pokemon_Ability_Database.ShedSkin(), Pokemon_Ability_Database.Moxie(), Pokemon_Ability_Database.Intimidate(), base_stats);
		return Scraggy;
	}
	public static Pokemon_Constructor Scrafty()
	{
		int[] base_stats = {65, 90, 115, 45, 115, 58};
		Pokemon_Constructor Scrafty = new Pokemon_Constructor("Scrafty", Pokemon_Type_Database.dark(), Pokemon_Type_Database.fighting(), Pokemon_Ability_Database.ShedSkin(), Pokemon_Ability_Database.Moxie(), Pokemon_Ability_Database.Intimidate(), base_stats);
		return Scrafty;
	}
	public static Pokemon_Constructor Stunfisk()
	{
		int[] base_stats = {109, 81, 99, 66, 84, 32};
		Pokemon_Constructor Stunfisk = new Pokemon_Constructor("Stunfisk", Pokemon_Type_Database.ground(), Pokemon_Type_Database.steel(), Pokemon_Ability_Database.Mimicry(), null, null, base_stats);
		return Stunfisk;
	}
	public static Pokemon_Constructor Shuckle()
	{
		int[] base_stats = {20, 10, 230, 10, 230, 5};
		Pokemon_Constructor Shuckle = new Pokemon_Constructor("Shuckle", Pokemon_Type_Database.bug(), Pokemon_Type_Database.rock(), Pokemon_Ability_Database.Sturdy(), Pokemon_Ability_Database.Gluttony(), Pokemon_Ability_Database.Contrary(), base_stats);
		return Shuckle;
	}
	public static Pokemon_Constructor Barboach()
	{
		int[] base_stats = {50, 48, 43, 46, 41, 60};
		Pokemon_Constructor Barboach = new Pokemon_Constructor("Barboach", Pokemon_Type_Database.water(), Pokemon_Type_Database.ground(), Pokemon_Ability_Database.Oblivious(), Pokemon_Ability_Database.Anticipation(), Pokemon_Ability_Database.Hydration(), base_stats);
		return Barboach;
	}
	public static Pokemon_Constructor Whiscash()
	{
		int[] base_stats = {110, 78, 73, 76, 71, 60};
		Pokemon_Constructor Whiscash = new Pokemon_Constructor("Whiscash", Pokemon_Type_Database.water(), Pokemon_Type_Database.ground(), Pokemon_Ability_Database.Oblivious(), Pokemon_Ability_Database.Anticipation(), Pokemon_Ability_Database.Hydration(), base_stats);
		return Whiscash;
	}
	public static Pokemon_Constructor Shellos()
	{
		int[] base_stats = {76, 48, 48, 57, 62, 34};
		Pokemon_Constructor Shellos = new Pokemon_Constructor("Shellos", Pokemon_Type_Database.water(), null, Pokemon_Ability_Database.StickyHold(), Pokemon_Ability_Database.StormDrain(), Pokemon_Ability_Database.SandForce(), base_stats);
		return Shellos;
	}
	public static Pokemon_Constructor Gastrodon()
	{
		int[] base_stats = {111, 83, 68, 92, 82, 39};
		Pokemon_Constructor Gastrodon = new Pokemon_Constructor("Gastrodon", Pokemon_Type_Database.water(), Pokemon_Type_Database.ground(), Pokemon_Ability_Database.StickyHold(), Pokemon_Ability_Database.StormDrain(), Pokemon_Ability_Database.SandForce(), base_stats);
		return Gastrodon;
	}
	public static Pokemon_Constructor Wimpod()
	{
		int[] base_stats = {25, 35, 40, 20, 30, 80};
		Pokemon_Constructor Wimpod = new Pokemon_Constructor("Wimpod", Pokemon_Type_Database.bug(), Pokemon_Type_Database.water(), Pokemon_Ability_Database.WimpOut(), null, null, base_stats);
		return Wimpod;
	}
	public static Pokemon_Constructor Golisopod()
	{
		int[] base_stats = {75, 125, 140, 60, 90, 40};
		Pokemon_Constructor Golisopod = new Pokemon_Constructor("Golisopod", Pokemon_Type_Database.bug(), Pokemon_Type_Database.water(), Pokemon_Ability_Database.EmergencyExit(), null, null, base_stats);
		return Golisopod;
	}
	public static Pokemon_Constructor Binacle()
	{
		int[] base_stats = {42, 52, 67, 39, 56, 50};
		Pokemon_Constructor Binacle = new Pokemon_Constructor("Binacle", Pokemon_Type_Database.rock(), Pokemon_Type_Database.water(), Pokemon_Ability_Database.ToughClaws(), Pokemon_Ability_Database.Sniper(), Pokemon_Ability_Database.Pickpocket(), base_stats);
		return Binacle;
	}
	public static Pokemon_Constructor Barbaracle()
	{
		int[] base_stats = {72, 105, 115, 54, 86, 68};
		Pokemon_Constructor Barbaracle = new Pokemon_Constructor("Barbaracle", Pokemon_Type_Database.rock(), Pokemon_Type_Database.water(), Pokemon_Ability_Database.ToughClaws(), Pokemon_Ability_Database.Sniper(), Pokemon_Ability_Database.Pickpocket(), base_stats);
		return Barbaracle;
	}
	public static Pokemon_Constructor Corsola()
	{
		int[] base_stats = {60, 55, 100, 65, 100, 30};
		Pokemon_Constructor Corsola = new Pokemon_Constructor("Corsola", Pokemon_Type_Database.ghost(), null, Pokemon_Ability_Database.WeakArmor(), null, Pokemon_Ability_Database.CursedBody(), base_stats);
		return Corsola;
	}
	public static Pokemon_Constructor Cursola()
	{
		int[] base_stats = {60, 95, 50, 145, 130, 30};
		Pokemon_Constructor Cursola = new Pokemon_Constructor("Cursola", Pokemon_Type_Database.ghost(), null, Pokemon_Ability_Database.WeakArmor(), null, Pokemon_Ability_Database.PerishBody(), base_stats);
		return Cursola;
	}
	public static Pokemon_Constructor Impidimp()
	{
		int[] base_stats = {45, 45, 30, 55, 40, 50};
		Pokemon_Constructor Impidimp = new Pokemon_Constructor("Impidimp", Pokemon_Type_Database.dark(), Pokemon_Type_Database.fairy(), Pokemon_Ability_Database.Prankster(), Pokemon_Ability_Database.Frisk(), Pokemon_Ability_Database.Pickpocket(), base_stats);
		return Impidimp;
	}
	public static Pokemon_Constructor Morgrem()
	{
		int[] base_stats = {65, 60, 45, 75, 55, 70};
		Pokemon_Constructor Morgrem = new Pokemon_Constructor("Morgrem", Pokemon_Type_Database.dark(), Pokemon_Type_Database.fairy(), Pokemon_Ability_Database.Prankster(), Pokemon_Ability_Database.Frisk(), Pokemon_Ability_Database.Pickpocket(), base_stats);
		return Morgrem;
	}
	public static Pokemon_Constructor Grimmsnarl()
	{
		int[] base_stats = {95, 120, 65, 95, 75, 60};
		Pokemon_Constructor Grimmsnarl = new Pokemon_Constructor("Grimmsnarl", Pokemon_Type_Database.dark(), Pokemon_Type_Database.fairy(), Pokemon_Ability_Database.Prankster(), Pokemon_Ability_Database.Frisk(), Pokemon_Ability_Database.Pickpocket(), base_stats);
		return Grimmsnarl;
	}
	public static Pokemon_Constructor Hatenna()
	{
		int[] base_stats = {42, 30, 45, 56, 53, 39};
		Pokemon_Constructor Hatenna = new Pokemon_Constructor("Hatenna", Pokemon_Type_Database.psychic(), null, Pokemon_Ability_Database.Healer(), Pokemon_Ability_Database.Anticipation(), Pokemon_Ability_Database.MagicBounce(), base_stats);
		return Hatenna;
	}
	public static Pokemon_Constructor Hattrem()
	{
		int[] base_stats = {57, 40, 65, 86, 73, 49};
		Pokemon_Constructor Hattrem = new Pokemon_Constructor("Hattrem", Pokemon_Type_Database.psychic(), null, Pokemon_Ability_Database.Healer(), Pokemon_Ability_Database.Anticipation(), Pokemon_Ability_Database.MagicBounce(), base_stats);
		return Hattrem;
	}
	public static Pokemon_Constructor Hatterene()
	{
		int[] base_stats = {57, 90, 95, 136, 103, 29};
		Pokemon_Constructor Hatterene = new Pokemon_Constructor("Hatterene", Pokemon_Type_Database.psychic(), Pokemon_Type_Database.fairy(), Pokemon_Ability_Database.Healer(), Pokemon_Ability_Database.Anticipation(), Pokemon_Ability_Database.MagicBounce(), base_stats);
		return Hatterene;
	}
	public static Pokemon_Constructor Salandit()
	{
		int[] base_stats = {48, 44, 40, 71, 40, 77};
		Pokemon_Constructor Salandit = new Pokemon_Constructor("Salandit", Pokemon_Type_Database.poison(), Pokemon_Type_Database.fire(), Pokemon_Ability_Database.Corrosion(), null, Pokemon_Ability_Database.Oblivious(), base_stats);
		return Salandit;
	}
	public static Pokemon_Constructor Salazzle()
	{
		int[] base_stats = {68, 64, 60, 111, 60, 117};
		Pokemon_Constructor Salazzle = new Pokemon_Constructor("Salazzle", Pokemon_Type_Database.poison(), Pokemon_Type_Database.fire(), Pokemon_Ability_Database.Corrosion(), null, Pokemon_Ability_Database.Oblivious(), base_stats);
		return Salazzle;
	}
	public static Pokemon_Constructor Pawniard()
	{
		int[] base_stats = {45, 85, 70, 40, 40, 60};
		Pokemon_Constructor Pawniard = new Pokemon_Constructor("Pawniard", Pokemon_Type_Database.dark(), Pokemon_Type_Database.steel(), Pokemon_Ability_Database.Defiant(), Pokemon_Ability_Database.InnerFocus(), Pokemon_Ability_Database.Pressure(), base_stats);
		return Pawniard;
	}
	public static Pokemon_Constructor Bisharp()
	{
		int[] base_stats = {65, 125, 100, 60, 70, 70};
		Pokemon_Constructor Bisharp = new Pokemon_Constructor("Bisharp", Pokemon_Type_Database.dark(), Pokemon_Type_Database.steel(), Pokemon_Ability_Database.Defiant(), Pokemon_Ability_Database.InnerFocus(), Pokemon_Ability_Database.Pressure(), base_stats);
		return Bisharp;
	}
	public static Pokemon_Constructor Throh()
	{
		int[] base_stats = {120, 100, 85, 30, 85, 45};
		Pokemon_Constructor Throh = new Pokemon_Constructor("Throh", Pokemon_Type_Database.fighting(), null, Pokemon_Ability_Database.Guts(), Pokemon_Ability_Database.InnerFocus(), Pokemon_Ability_Database.MoldBreaker(), base_stats);
		return Throh;
	}
	public static Pokemon_Constructor Sawk()
	{
		int[] base_stats = {75, 125, 75, 30, 75, 85};
		Pokemon_Constructor Sawk = new Pokemon_Constructor("Sawk", Pokemon_Type_Database.fighting(), null, Pokemon_Ability_Database.Sturdy(), Pokemon_Ability_Database.InnerFocus(), Pokemon_Ability_Database.MoldBreaker(), base_stats);
		return Sawk;
	}
	public static Pokemon_Constructor Koffing()
	{
		int[] base_stats = {40, 65, 95, 60, 45, 35};
		Pokemon_Constructor Koffing = new Pokemon_Constructor("Koffing", Pokemon_Type_Database.poison(), null, Pokemon_Ability_Database.Levitate(), Pokemon_Ability_Database.NeutralizingGas(), Pokemon_Ability_Database.Stench(), base_stats);
		return Koffing;
	}
	public static Pokemon_Constructor Weezing()
	{
		int[] base_stats = {65, 90, 120, 85, 70, 60};
		Pokemon_Constructor Weezing = new Pokemon_Constructor("Weezing", Pokemon_Type_Database.poison(), Pokemon_Type_Database.fairy(), Pokemon_Ability_Database.Levitate(), Pokemon_Ability_Database.NeutralizingGas(), Pokemon_Ability_Database.MistySurge(), base_stats);
		return Weezing;
	}
	public static Pokemon_Constructor Bonsly()
	{
		int[] base_stats = {50, 80, 95, 10, 45, 10};
		Pokemon_Constructor Bonsly = new Pokemon_Constructor("Bonsly", Pokemon_Type_Database.rock(), null, Pokemon_Ability_Database.Sturdy(), Pokemon_Ability_Database.RockHead(), Pokemon_Ability_Database.Rattled(), base_stats);
		return Bonsly;
	}
	public static Pokemon_Constructor Sudowoodo()
	{
		int[] base_stats = {70, 100, 115, 30, 65, 30};
		Pokemon_Constructor Sudowoodo = new Pokemon_Constructor("Sudowoodo", Pokemon_Type_Database.rock(), null, Pokemon_Ability_Database.Sturdy(), Pokemon_Ability_Database.RockHead(), Pokemon_Ability_Database.Rattled(), base_stats);
		return Sudowoodo;
	}
	public static Pokemon_Constructor Cleffa()
	{
		int[] base_stats = {50, 25, 28, 45, 55, 15};
		Pokemon_Constructor Cleffa = new Pokemon_Constructor("Cleffa", Pokemon_Type_Database.fairy(), null, Pokemon_Ability_Database.CuteCharm(), Pokemon_Ability_Database.MagicGuard(), Pokemon_Ability_Database.FriendGuard(), base_stats);
		return Cleffa;
	}
	public static Pokemon_Constructor Clefairy()
	{
		int[] base_stats = {70, 45, 48, 60, 65, 35};
		Pokemon_Constructor Clefairy = new Pokemon_Constructor("Clefairy", Pokemon_Type_Database.fairy(), null, Pokemon_Ability_Database.CuteCharm(), Pokemon_Ability_Database.MagicGuard(), Pokemon_Ability_Database.FriendGuard(), base_stats);
		return Clefairy;
	}
	public static Pokemon_Constructor Clefable()
	{
		int[] base_stats = {95, 70, 73, 95, 90, 60};
		Pokemon_Constructor Clefable = new Pokemon_Constructor("Clefable", Pokemon_Type_Database.fairy(), null, Pokemon_Ability_Database.CuteCharm(), Pokemon_Ability_Database.MagicGuard(), Pokemon_Ability_Database.Unaware(), base_stats);
		return Clefable;
	}
	public static Pokemon_Constructor Togepi()
	{
		int[] base_stats = {35, 20, 65, 40, 65, 20};
		Pokemon_Constructor Togepi = new Pokemon_Constructor("Togepi", Pokemon_Type_Database.fairy(), null, Pokemon_Ability_Database.Hustle(), Pokemon_Ability_Database.SereneGrace(), Pokemon_Ability_Database.SuperLuck(), base_stats);
		return Togepi;
	}
	public static Pokemon_Constructor Togetic()
	{
		int[] base_stats = {55, 40, 85, 80, 105, 40};
		Pokemon_Constructor Togetic = new Pokemon_Constructor("Togetic", Pokemon_Type_Database.fairy(), Pokemon_Type_Database.flying(), Pokemon_Ability_Database.Hustle(), Pokemon_Ability_Database.SereneGrace(), Pokemon_Ability_Database.SuperLuck(), base_stats);
		return Togetic;
	}
	public static Pokemon_Constructor Togekiss()
	{
		int[] base_stats = {85, 50, 95, 120, 115, 80};
		Pokemon_Constructor Togekiss = new Pokemon_Constructor("Togekiss", Pokemon_Type_Database.fairy(), Pokemon_Type_Database.flying(), Pokemon_Ability_Database.Hustle(), Pokemon_Ability_Database.SereneGrace(), Pokemon_Ability_Database.SuperLuck(), base_stats);
		return Togekiss;
	}
	public static Pokemon_Constructor Munchlax()
	{
		int[] base_stats = {135, 85, 40, 40, 85, 5};
		Pokemon_Constructor Munchlax = new Pokemon_Constructor("Munchlax", Pokemon_Type_Database.normal(), null, Pokemon_Ability_Database.Pickup(), Pokemon_Ability_Database.ThickFat(), Pokemon_Ability_Database.Gluttony(), base_stats);
		return Munchlax;
	}
	public static Pokemon_Constructor Snorlax()
	{
		int[] base_stats = {160, 110, 65, 65, 110, 30};
		Pokemon_Constructor Snorlax = new Pokemon_Constructor("Snorlax", Pokemon_Type_Database.normal(), null, Pokemon_Ability_Database.Immunity(), Pokemon_Ability_Database.ThickFat(), Pokemon_Ability_Database.Gluttony(), base_stats);
		return Snorlax;
	}
	public static Pokemon_Constructor Cottonee()
	{
		int[] base_stats = {40, 27, 60, 37, 50, 66};
		Pokemon_Constructor Cottonee = new Pokemon_Constructor("Cottonee", Pokemon_Type_Database.grass(), Pokemon_Type_Database.fairy(), Pokemon_Ability_Database.Prankster(), Pokemon_Ability_Database.Infiltrator(), Pokemon_Ability_Database.Chlorophyll(), base_stats);
		return Cottonee;
	}
	public static Pokemon_Constructor Whimsicott()
	{
		int[] base_stats = {60, 67, 85, 77, 75, 116};
		Pokemon_Constructor Whimsicott = new Pokemon_Constructor("Whimsicott", Pokemon_Type_Database.grass(), Pokemon_Type_Database.fairy(), Pokemon_Ability_Database.Prankster(), Pokemon_Ability_Database.Infiltrator(), Pokemon_Ability_Database.Chlorophyll(), base_stats);
		return Whimsicott;
	}
	public static Pokemon_Constructor Rhyhorn()
	{
		int[] base_stats = {80, 85, 95, 30, 30, 25};
		Pokemon_Constructor Rhyhorn = new Pokemon_Constructor("Rhyhorn", Pokemon_Type_Database.ground(), Pokemon_Type_Database.rock(), Pokemon_Ability_Database.LightningRod(), Pokemon_Ability_Database.RockHead(), Pokemon_Ability_Database.Reckless(), base_stats);
		return Rhyhorn;
	}
	public static Pokemon_Constructor Rhydon()
	{
		int[] base_stats = {105, 130, 120, 45, 45, 40};
		Pokemon_Constructor Rhydon = new Pokemon_Constructor("Rhydon", Pokemon_Type_Database.ground(), Pokemon_Type_Database.rock(), Pokemon_Ability_Database.LightningRod(), Pokemon_Ability_Database.RockHead(), Pokemon_Ability_Database.Reckless(), base_stats);
		return Rhydon;
	}
	public static Pokemon_Constructor Rhyperior()
	{
		int[] base_stats = {115, 140, 130, 55, 55, 40};
		Pokemon_Constructor Rhyperior = new Pokemon_Constructor("Rhyperior", Pokemon_Type_Database.ground(), Pokemon_Type_Database.rock(), Pokemon_Ability_Database.LightningRod(), Pokemon_Ability_Database.SolidRock(), Pokemon_Ability_Database.Reckless(), base_stats);
		return Rhyperior;
	}
	public static Pokemon_Constructor Gothita()
	{
		int[] base_stats = {45, 30, 50, 55, 65, 45};
		Pokemon_Constructor Gothita = new Pokemon_Constructor("Gothita", Pokemon_Type_Database.psychic(), null, Pokemon_Ability_Database.Frisk(), Pokemon_Ability_Database.Competitive(), Pokemon_Ability_Database.ShadowTag(), base_stats);
		return Gothita;
	}
	public static Pokemon_Constructor Gothorita()
	{
		int[] base_stats = {60, 45, 70, 75, 85, 55};
		Pokemon_Constructor Gothorita = new Pokemon_Constructor("Gothorita", Pokemon_Type_Database.psychic(), null, Pokemon_Ability_Database.Frisk(), Pokemon_Ability_Database.Competitive(), Pokemon_Ability_Database.ShadowTag(), base_stats);
		return Gothorita;
	}
	public static Pokemon_Constructor Gothitelle()
	{
		int[] base_stats = {70, 55, 95, 95, 110, 65};
		Pokemon_Constructor Gothitelle = new Pokemon_Constructor("Gothitelle", Pokemon_Type_Database.psychic(), null, Pokemon_Ability_Database.Frisk(), Pokemon_Ability_Database.Competitive(), Pokemon_Ability_Database.ShadowTag(), base_stats);
		return Gothitelle;
	}
	public static Pokemon_Constructor Solosis()
	{
		int[] base_stats = {45, 30, 40, 105, 50, 20};
		Pokemon_Constructor Solosis = new Pokemon_Constructor("Solosis", Pokemon_Type_Database.psychic(), null, Pokemon_Ability_Database.Overcoat(), Pokemon_Ability_Database.MagicGuard(), Pokemon_Ability_Database.Regenerator(), base_stats);
		return Solosis;
	}
	public static Pokemon_Constructor Duosion()
	{
		int[] base_stats = {65, 40, 50, 125, 60, 30};
		Pokemon_Constructor Duosion = new Pokemon_Constructor("Duosion", Pokemon_Type_Database.psychic(), null, Pokemon_Ability_Database.Overcoat(), Pokemon_Ability_Database.MagicGuard(), Pokemon_Ability_Database.Regenerator(), base_stats);
		return Duosion;
	}
	public static Pokemon_Constructor Reuniclus()
	{
		int[] base_stats = {110, 65, 75, 125, 85, 30};
		Pokemon_Constructor Reuniclus = new Pokemon_Constructor("Reuniclus", Pokemon_Type_Database.psychic(), null, Pokemon_Ability_Database.Overcoat(), Pokemon_Ability_Database.MagicGuard(), Pokemon_Ability_Database.Regenerator(), base_stats);
		return Reuniclus;
	}
	public static Pokemon_Constructor Karrablast()
	{
		int[] base_stats = {50, 75, 45, 40, 45, 60};
		Pokemon_Constructor Karrablast = new Pokemon_Constructor("Karrablast", Pokemon_Type_Database.bug(), null, Pokemon_Ability_Database.Swarm(), Pokemon_Ability_Database.ShedSkin(), Pokemon_Ability_Database.NoGuard(), base_stats);
		return Karrablast;
	}
	public static Pokemon_Constructor Escavalier()
	{
		int[] base_stats = {70, 135, 105, 60, 105, 20};
		Pokemon_Constructor Escavalier = new Pokemon_Constructor("Escavalier", Pokemon_Type_Database.bug(), Pokemon_Type_Database.steel(), Pokemon_Ability_Database.Swarm(), Pokemon_Ability_Database.ShellArmor(), Pokemon_Ability_Database.Overcoat(), base_stats);
		return Escavalier;
	}
	public static Pokemon_Constructor Shelmet()
	{
		int[] base_stats = {50, 40, 85, 40, 65, 25};
		Pokemon_Constructor Shelmet = new Pokemon_Constructor("Shelmet", Pokemon_Type_Database.bug(), null, Pokemon_Ability_Database.Hydration(), Pokemon_Ability_Database.ShellArmor(), Pokemon_Ability_Database.Overcoat(), base_stats);
		return Shelmet;
	}
	public static Pokemon_Constructor Accelgor()
	{
		int[] base_stats = {80, 70, 40, 100, 60, 145};
		Pokemon_Constructor Accelgor = new Pokemon_Constructor("Accelgor", Pokemon_Type_Database.bug(), null, Pokemon_Ability_Database.Hydration(), Pokemon_Ability_Database.StickyHold(), Pokemon_Ability_Database.Unburden(), base_stats);
		return Accelgor;
	}
	public static Pokemon_Constructor Elgyem()
	{
		int[] base_stats = {55, 55, 55, 85, 55, 30};
		Pokemon_Constructor Elgyem = new Pokemon_Constructor("Elgyem", Pokemon_Type_Database.psychic(), null, Pokemon_Ability_Database.Telepathy(), Pokemon_Ability_Database.Synchronize(), Pokemon_Ability_Database.Analytic(), base_stats);
		return Elgyem;
	}
	public static Pokemon_Constructor Beheeyem()
	{
		int[] base_stats = {75, 75, 75, 125, 95, 40};
		Pokemon_Constructor Beheeyem = new Pokemon_Constructor("Beheeyem", Pokemon_Type_Database.psychic(), null, Pokemon_Ability_Database.Telepathy(), Pokemon_Ability_Database.Synchronize(), Pokemon_Ability_Database.Analytic(), base_stats);
		return Beheeyem;
	}
	public static Pokemon_Constructor Cubchoo()
	{
		int[] base_stats = {55, 70, 40, 60, 40, 40};
		Pokemon_Constructor Cubchoo = new Pokemon_Constructor("Cubchoo", Pokemon_Type_Database.ice(), null, Pokemon_Ability_Database.SnowCloak(), Pokemon_Ability_Database.SlushRush(), Pokemon_Ability_Database.Rattled(), base_stats);
		return Cubchoo;
	}
	public static Pokemon_Constructor Beartic()
	{
		int[] base_stats = {95, 130, 80, 70, 80, 50};
		Pokemon_Constructor Beartic = new Pokemon_Constructor("Beartic", Pokemon_Type_Database.ice(), null, Pokemon_Ability_Database.SnowCloak(), Pokemon_Ability_Database.SlushRush(), Pokemon_Ability_Database.SwiftSwim(), base_stats);
		return Beartic;
	}
	public static Pokemon_Constructor Rufflet()
	{
		int[] base_stats = {70, 83, 50, 37, 50, 60};
		Pokemon_Constructor Rufflet = new Pokemon_Constructor("Rufflet", Pokemon_Type_Database.normal(), Pokemon_Type_Database.flying(), Pokemon_Ability_Database.KeenEye(), Pokemon_Ability_Database.SheerForce(), Pokemon_Ability_Database.Hustle(), base_stats);
		return Rufflet;
	}
	public static Pokemon_Constructor Braviary()
	{
		int[] base_stats = {100, 123, 75, 57, 75, 80};
		Pokemon_Constructor Braviary = new Pokemon_Constructor("Braviary", Pokemon_Type_Database.normal(), Pokemon_Type_Database.flying(), Pokemon_Ability_Database.KeenEye(), Pokemon_Ability_Database.SheerForce(), Pokemon_Ability_Database.Defiant(), base_stats);
		return Braviary;
	}
	public static Pokemon_Constructor Vullaby()
	{
		int[] base_stats = {70, 55, 75, 45, 65, 60};
		Pokemon_Constructor Vullaby = new Pokemon_Constructor("Vullaby", Pokemon_Type_Database.dark(), Pokemon_Type_Database.flying(), Pokemon_Ability_Database.BigPecks(), Pokemon_Ability_Database.Overcoat(), Pokemon_Ability_Database.WeakArmor(), base_stats);
		return Vullaby;
	}
	public static Pokemon_Constructor Mandibuzz()
	{
		int[] base_stats = {110, 65, 105, 55, 95, 80};
		Pokemon_Constructor Mandibuzz = new Pokemon_Constructor("Mandibuzz", Pokemon_Type_Database.dark(), Pokemon_Type_Database.flying(), Pokemon_Ability_Database.BigPecks(), Pokemon_Ability_Database.Overcoat(), Pokemon_Ability_Database.WeakArmor(), base_stats);
		return Mandibuzz;
	}
	public static Pokemon_Constructor Skorupi()
	{
		int[] base_stats = {40, 50, 90, 30, 55, 65};
		Pokemon_Constructor Skorupi = new Pokemon_Constructor("Skorupi", Pokemon_Type_Database.poison(), Pokemon_Type_Database.bug(), Pokemon_Ability_Database.BattleArmor(), Pokemon_Ability_Database.Sniper(), Pokemon_Ability_Database.KeenEye(), base_stats);
		return Skorupi;
	}
	public static Pokemon_Constructor Drapion()
	{
		int[] base_stats = {70, 90, 110, 60, 75, 95};
		Pokemon_Constructor Drapion = new Pokemon_Constructor("Drapion", Pokemon_Type_Database.poison(), Pokemon_Type_Database.dark(), Pokemon_Ability_Database.BattleArmor(), Pokemon_Ability_Database.Sniper(), Pokemon_Ability_Database.KeenEye(), base_stats);
		return Drapion;
	}
	public static Pokemon_Constructor Litwick()
	{
		int[] base_stats = {50, 30, 55, 65, 55, 20};
		Pokemon_Constructor Litwick = new Pokemon_Constructor("Litwick", Pokemon_Type_Database.ghost(), Pokemon_Type_Database.fire(), Pokemon_Ability_Database.FlashFire(), Pokemon_Ability_Database.FlameBody(), Pokemon_Ability_Database.Infiltrator(), base_stats);
		return Litwick;
	}
	public static Pokemon_Constructor Lampent()
	{
		int[] base_stats = {60, 40, 60, 95, 60, 55};
		Pokemon_Constructor Lampent = new Pokemon_Constructor("Lampent", Pokemon_Type_Database.ghost(), Pokemon_Type_Database.fire(), Pokemon_Ability_Database.FlashFire(), Pokemon_Ability_Database.FlameBody(), Pokemon_Ability_Database.Infiltrator(), base_stats);
		return Lampent;
	}
	public static Pokemon_Constructor Chandelure()
	{
		int[] base_stats = {60, 55, 90, 145, 90, 80};
		Pokemon_Constructor Chandelure = new Pokemon_Constructor("Chandelure", Pokemon_Type_Database.ghost(), Pokemon_Type_Database.fire(), Pokemon_Ability_Database.FlashFire(), Pokemon_Ability_Database.FlameBody(), Pokemon_Ability_Database.Infiltrator(), base_stats);
		return Chandelure;
	}
	public static Pokemon_Constructor Inkay()
	{
		int[] base_stats = {53, 54, 53, 37, 46, 45};
		Pokemon_Constructor Inkay = new Pokemon_Constructor("Inkay", Pokemon_Type_Database.dark(), Pokemon_Type_Database.psychic(), Pokemon_Ability_Database.Contrary(), Pokemon_Ability_Database.SuctionCups(), Pokemon_Ability_Database.Infiltrator(), base_stats);
		return Inkay;
	}
	public static Pokemon_Constructor Malamar()
	{
		int[] base_stats = {86, 92, 88, 68, 75, 73};
		Pokemon_Constructor Malamar = new Pokemon_Constructor("Malamar", Pokemon_Type_Database.dark(), Pokemon_Type_Database.psychic(), Pokemon_Ability_Database.Contrary(), Pokemon_Ability_Database.SuctionCups(), Pokemon_Ability_Database.Infiltrator(), base_stats);
		return Malamar;
	}
	public static Pokemon_Constructor Sneasel()
	{
		int[] base_stats = {55, 95, 55, 35, 75, 115};
		Pokemon_Constructor Sneasel = new Pokemon_Constructor("Sneasel", Pokemon_Type_Database.dark(), Pokemon_Type_Database.ice(), Pokemon_Ability_Database.InnerFocus(), Pokemon_Ability_Database.KeenEye(), Pokemon_Ability_Database.Pickpocket(), base_stats);
		return Sneasel;
	}
	public static Pokemon_Constructor Weavile()
	{
		int[] base_stats = {70, 120, 65, 45, 85, 125};
		Pokemon_Constructor Weavile = new Pokemon_Constructor("Weavile", Pokemon_Type_Database.dark(), Pokemon_Type_Database.ice(), Pokemon_Ability_Database.Pressure(), null, Pokemon_Ability_Database.Pickpocket(), base_stats);
		return Weavile;
	}
	public static Pokemon_Constructor Sableye()
	{
		int[] base_stats = {50, 75, 75, 65, 65, 50};
		Pokemon_Constructor Sableye = new Pokemon_Constructor("Sableye", Pokemon_Type_Database.dark(), Pokemon_Type_Database.ghost(), Pokemon_Ability_Database.KeenEye(), Pokemon_Ability_Database.Stall(), Pokemon_Ability_Database.Prankster(), base_stats);
		return Sableye;
	}
	public static Pokemon_Constructor Mawile()
	{
		int[] base_stats = {50, 85, 85, 55, 55, 50};
		Pokemon_Constructor Mawile = new Pokemon_Constructor("Mawile", Pokemon_Type_Database.steel(), Pokemon_Type_Database.fairy(), Pokemon_Ability_Database.HyperCutter(), Pokemon_Ability_Database.Intimidate(), Pokemon_Ability_Database.SheerForce(), base_stats);
		return Mawile;
	}
	public static Pokemon_Constructor Maractus()
	{
		int[] base_stats = {75, 86, 67, 106, 67, 60};
		Pokemon_Constructor Maractus = new Pokemon_Constructor("Maractus", Pokemon_Type_Database.grass(), null, Pokemon_Ability_Database.WaterAbsorb(), Pokemon_Ability_Database.Chlorophyll(), Pokemon_Ability_Database.StormDrain(), base_stats);
		return Maractus;
	}
	public static Pokemon_Constructor Sigilyph()
	{
		int[] base_stats = {72, 58, 80, 103, 80, 97};
		Pokemon_Constructor Sigilyph = new Pokemon_Constructor("Sigilyph", Pokemon_Type_Database.psychic(), Pokemon_Type_Database.flying(), Pokemon_Ability_Database.WonderSkin(), Pokemon_Ability_Database.MagicGuard(), Pokemon_Ability_Database.TintedLens(), base_stats);
		return Sigilyph;
	}
	public static Pokemon_Constructor Riolu()
	{
		int[] base_stats = {40, 70, 40, 35, 40, 60};
		Pokemon_Constructor Riolu = new Pokemon_Constructor("Riolu", Pokemon_Type_Database.fighting(), null, Pokemon_Ability_Database.Steadfast(), Pokemon_Ability_Database.InnerFocus(), Pokemon_Ability_Database.Prankster(), base_stats);
		return Riolu;
	}
	public static Pokemon_Constructor Lucario()
	{
		int[] base_stats = {70, 110, 70, 115, 70, 90};
		Pokemon_Constructor Lucario = new Pokemon_Constructor("Lucario", Pokemon_Type_Database.fighting(), Pokemon_Type_Database.steel(), Pokemon_Ability_Database.Steadfast(), Pokemon_Ability_Database.InnerFocus(), Pokemon_Ability_Database.Justified(), base_stats);
		return Lucario;
	}
	public static Pokemon_Constructor Torkoal()
	{
		int[] base_stats = {70, 85, 140, 85, 70, 20};
		Pokemon_Constructor Torkoal = new Pokemon_Constructor("Torkoal", Pokemon_Type_Database.fire(), null, Pokemon_Ability_Database.WhiteSmoke(), Pokemon_Ability_Database.Drought(), Pokemon_Ability_Database.ShellArmor(), base_stats);
		return Torkoal;
	}
	public static Pokemon_Constructor Mimikyu()
	{
		int[] base_stats = {55, 90, 80, 50, 105, 96};
		Pokemon_Constructor Mimikyu = new Pokemon_Constructor("Mimikyu", Pokemon_Type_Database.ghost(), Pokemon_Type_Database.fairy(), Pokemon_Ability_Database.Disguise(), null, null, base_stats);
		return Mimikyu;
	}
	public static Pokemon_Constructor Cufant()
	{
		int[] base_stats = {72, 80, 49, 40, 49, 40};
		Pokemon_Constructor Cufant = new Pokemon_Constructor("Cufant", Pokemon_Type_Database.steel(), null, Pokemon_Ability_Database.SheerForce(), null, Pokemon_Ability_Database.HeavyMetal(), base_stats);
		return Cufant;
	}
	public static Pokemon_Constructor Copperajah()
	{
		int[] base_stats = {122, 130, 69, 80, 69, 30};
		Pokemon_Constructor Copperajah = new Pokemon_Constructor("Copperajah", Pokemon_Type_Database.steel(), null, Pokemon_Ability_Database.SheerForce(), null, Pokemon_Ability_Database.HeavyMetal(), base_stats);
		return Copperajah;
	}
	public static Pokemon_Constructor Qwilfish()
	{
		int[] base_stats = {65, 95, 85, 55, 55, 85};
		Pokemon_Constructor Qwilfish = new Pokemon_Constructor("Qwilfish", Pokemon_Type_Database.water(), Pokemon_Type_Database.poison(), Pokemon_Ability_Database.PoisonPoint(), Pokemon_Ability_Database.SwiftSwim(), Pokemon_Ability_Database.Intimidate(), base_stats);
		return Qwilfish;
	}
	public static Pokemon_Constructor Frillish()
	{
		int[] base_stats = {55, 40, 50, 65, 85, 40};
		Pokemon_Constructor Frillish = new Pokemon_Constructor("Frillish", Pokemon_Type_Database.water(), Pokemon_Type_Database.ghost(), Pokemon_Ability_Database.WaterAbsorb(), Pokemon_Ability_Database.CursedBody(), Pokemon_Ability_Database.Damp(), base_stats);
		return Frillish;
	}
	public static Pokemon_Constructor Jellicent()
	{
		int[] base_stats = {100, 60, 70, 85, 105, 60};
		Pokemon_Constructor Jellicent = new Pokemon_Constructor("Jellicent", Pokemon_Type_Database.water(), Pokemon_Type_Database.ghost(), Pokemon_Ability_Database.WaterAbsorb(), Pokemon_Ability_Database.CursedBody(), Pokemon_Ability_Database.Damp(), base_stats);
		return Jellicent;
	}
	public static Pokemon_Constructor Mareanie()
	{
		int[] base_stats = {50, 53, 62, 43, 52, 45};
		Pokemon_Constructor Mareanie = new Pokemon_Constructor("Mareanie", Pokemon_Type_Database.poison(), Pokemon_Type_Database.water(), Pokemon_Ability_Database.Merciless(), Pokemon_Ability_Database.Limber(), Pokemon_Ability_Database.Regenerator(), base_stats);
		return Mareanie;
	}
	public static Pokemon_Constructor Toxapex()
	{
		int[] base_stats = {50, 63, 152, 53, 142, 35};
		Pokemon_Constructor Toxapex = new Pokemon_Constructor("Toxapex", Pokemon_Type_Database.poison(), Pokemon_Type_Database.water(), Pokemon_Ability_Database.Merciless(), Pokemon_Ability_Database.Limber(), Pokemon_Ability_Database.Regenerator(), base_stats);
		return Toxapex;
	}
	public static Pokemon_Constructor Cramorant()
	{
		int[] base_stats = {70, 85, 55, 85, 95, 85};
		Pokemon_Constructor Cramorant = new Pokemon_Constructor("Cramorant", Pokemon_Type_Database.flying(), Pokemon_Type_Database.water(), Pokemon_Ability_Database.GulpMissile(), null, null, base_stats);
		return Cramorant;
	}
	public static Pokemon_Constructor Toxel()
	{
		int[] base_stats = {40, 38, 35, 54, 35, 40};
		Pokemon_Constructor Toxel = new Pokemon_Constructor("Toxel", Pokemon_Type_Database.electric(), Pokemon_Type_Database.poison(), Pokemon_Ability_Database.Rattled(), Pokemon_Ability_Database.Static(), Pokemon_Ability_Database.Klutz(), base_stats);
		return Toxel;
	}
	public static Pokemon_Constructor Toxtricity()
	{
		int[] base_stats = {75, 98, 70, 114, 70, 75};
		Pokemon_Constructor Toxtricity = new Pokemon_Constructor("Toxtricity", Pokemon_Type_Database.electric(), Pokemon_Type_Database.poison(), Pokemon_Ability_Database.PunkRock(), Pokemon_Ability_Database.Plus(), Pokemon_Ability_Database.Technician(), base_stats);
		return Toxtricity;
	}
	public static Pokemon_Constructor Silicobra()
	{
		int[] base_stats = {52, 57, 75, 35, 50, 46};
		Pokemon_Constructor Silicobra = new Pokemon_Constructor("Silicobra", Pokemon_Type_Database.ground(), null, Pokemon_Ability_Database.SandSpit(), Pokemon_Ability_Database.ShedSkin(), Pokemon_Ability_Database.SandVeil(), base_stats);
		return Silicobra;
	}
	public static Pokemon_Constructor Sandaconda()
	{
		int[] base_stats = {72, 107, 125, 65, 70, 71};
		Pokemon_Constructor Sandaconda = new Pokemon_Constructor("Sandaconda", Pokemon_Type_Database.ground(), null, Pokemon_Ability_Database.SandSpit(), Pokemon_Ability_Database.ShedSkin(), Pokemon_Ability_Database.SandVeil(), base_stats);
		return Sandaconda;
	}
	public static Pokemon_Constructor Hippopotas()
	{
		int[] base_stats = {68, 72, 78, 38, 42, 32};
		Pokemon_Constructor Hippopotas = new Pokemon_Constructor("Hippopotas", Pokemon_Type_Database.ground(), null, Pokemon_Ability_Database.SandStream(), null, Pokemon_Ability_Database.SandForce(), base_stats);
		return Hippopotas;
	}
	public static Pokemon_Constructor Hippowdon()
	{
		int[] base_stats = {108, 112, 118, 68, 72, 47};
		Pokemon_Constructor Hippowdon = new Pokemon_Constructor("Hippowdon", Pokemon_Type_Database.ground(), null, Pokemon_Ability_Database.SandStream(), null, Pokemon_Ability_Database.SandForce(), base_stats);
		return Hippowdon;
	}
	public static Pokemon_Constructor Durant()
	{
		int[] base_stats = {58, 109, 112, 48, 48, 109};
		Pokemon_Constructor Durant = new Pokemon_Constructor("Durant", Pokemon_Type_Database.bug(), Pokemon_Type_Database.steel(), Pokemon_Ability_Database.Swarm(), Pokemon_Ability_Database.Hustle(), Pokemon_Ability_Database.Truant(), base_stats);
		return Durant;
	}
	public static Pokemon_Constructor Heatmor()
	{
		int[] base_stats = {85, 97, 66, 105, 66, 65};
		Pokemon_Constructor Heatmor = new Pokemon_Constructor("Heatmor", Pokemon_Type_Database.fire(), null, Pokemon_Ability_Database.Gluttony(), Pokemon_Ability_Database.FlashFire(), Pokemon_Ability_Database.WhiteSmoke(), base_stats);
		return Heatmor;
	}
	public static Pokemon_Constructor Helioptile()
	{
		int[] base_stats = {44, 38, 33, 61, 43, 70};
		Pokemon_Constructor Helioptile = new Pokemon_Constructor("Helioptile", Pokemon_Type_Database.electric(), Pokemon_Type_Database.normal(), Pokemon_Ability_Database.DrySkin(), Pokemon_Ability_Database.SandVeil(), Pokemon_Ability_Database.SolarPower(), base_stats);
		return Helioptile;
	}
	public static Pokemon_Constructor Heliolisk()
	{
		int[] base_stats = {62, 55, 52, 109, 94, 109};
		Pokemon_Constructor Heliolisk = new Pokemon_Constructor("Heliolisk", Pokemon_Type_Database.electric(), Pokemon_Type_Database.normal(), Pokemon_Ability_Database.DrySkin(), Pokemon_Ability_Database.SandVeil(), Pokemon_Ability_Database.SolarPower(), base_stats);
		return Heliolisk;
	}
	public static Pokemon_Constructor Hawlucha()
	{
		int[] base_stats = {78, 92, 75, 74, 63, 118};
		Pokemon_Constructor Hawlucha = new Pokemon_Constructor("Hawlucha", Pokemon_Type_Database.fighting(), Pokemon_Type_Database.flying(), Pokemon_Ability_Database.Limber(), Pokemon_Ability_Database.Unburden(), Pokemon_Ability_Database.MoldBreaker(), base_stats);
		return Hawlucha;
	}
	public static Pokemon_Constructor Trapinch()
	{
		int[] base_stats = {45, 100, 45, 45, 45, 10};
		Pokemon_Constructor Trapinch = new Pokemon_Constructor("Trapinch", Pokemon_Type_Database.ground(), null, Pokemon_Ability_Database.HyperCutter(), Pokemon_Ability_Database.ArenaTrap(), Pokemon_Ability_Database.SheerForce(), base_stats);
		return Trapinch;
	}
	public static Pokemon_Constructor Vibrava()
	{
		int[] base_stats = {50, 70, 50, 50, 50, 70};
		Pokemon_Constructor Vibrava = new Pokemon_Constructor("Vibrava", Pokemon_Type_Database.ground(), Pokemon_Type_Database.dragon(), Pokemon_Ability_Database.Levitate(), null, null, base_stats);
		return Vibrava;
	}
	public static Pokemon_Constructor Flygon()
	{
		int[] base_stats = {80, 100, 80, 80, 80, 100};
		Pokemon_Constructor Flygon = new Pokemon_Constructor("Flygon", Pokemon_Type_Database.ground(), Pokemon_Type_Database.dragon(), Pokemon_Ability_Database.Levitate(), null, null, base_stats);
		return Flygon;
	}
	public static Pokemon_Constructor Axew()
	{
		int[] base_stats = {46, 87, 60, 30, 40, 57};
		Pokemon_Constructor Axew = new Pokemon_Constructor("Axew", Pokemon_Type_Database.dragon(), null, Pokemon_Ability_Database.Rivalry(), Pokemon_Ability_Database.MoldBreaker(), Pokemon_Ability_Database.Unnerve(), base_stats);
		return Axew;
	}
	public static Pokemon_Constructor Fraxure()
	{
		int[] base_stats = {66, 117, 70, 40, 50, 67};
		Pokemon_Constructor Fraxure = new Pokemon_Constructor("Fraxure", Pokemon_Type_Database.dragon(), null, Pokemon_Ability_Database.Rivalry(), Pokemon_Ability_Database.MoldBreaker(), Pokemon_Ability_Database.Unnerve(), base_stats);
		return Fraxure;
	}
	public static Pokemon_Constructor Haxorus()
	{
		int[] base_stats = {76, 147, 90, 60, 70, 97};
		Pokemon_Constructor Haxorus = new Pokemon_Constructor("Haxorus", Pokemon_Type_Database.dragon(), null, Pokemon_Ability_Database.Rivalry(), Pokemon_Ability_Database.MoldBreaker(), Pokemon_Ability_Database.Unnerve(), base_stats);
		return Haxorus;
	}
	public static Pokemon_Constructor Yamask()
	{
		int[] base_stats = {38, 55, 85, 30, 65, 30};
		Pokemon_Constructor Yamask = new Pokemon_Constructor("Yamask", Pokemon_Type_Database.ground(), Pokemon_Type_Database.ghost(), Pokemon_Ability_Database.WanderingSpirit(), null, null, base_stats);
		return Yamask;
	}
	public static Pokemon_Constructor Runerigus()
	{
		int[] base_stats = {58, 95, 145, 50, 105, 30};
		Pokemon_Constructor Runerigus = new Pokemon_Constructor("Runerigus", Pokemon_Type_Database.ground(), Pokemon_Type_Database.ghost(), Pokemon_Ability_Database.WanderingSpirit(), null, null, base_stats);
		return Runerigus;
	}
	public static Pokemon_Constructor Cofagrigus()
	{
		int[] base_stats = {58, 50, 145, 95, 105, 30};
		Pokemon_Constructor Cofagrigus = new Pokemon_Constructor("Cofagrigus", Pokemon_Type_Database.ghost(), null, Pokemon_Ability_Database.Mummy(), null, null, base_stats);
		return Cofagrigus;
	}
	public static Pokemon_Constructor Honedge()
	{
		int[] base_stats = {45, 80, 100, 35, 37, 28};
		Pokemon_Constructor Honedge = new Pokemon_Constructor("Honedge", Pokemon_Type_Database.steel(), Pokemon_Type_Database.ghost(), Pokemon_Ability_Database.NoGuard(), null, null, base_stats);
		return Honedge;
	}
	public static Pokemon_Constructor Doublade()
	{
		int[] base_stats = {59, 110, 150, 45, 49, 35};
		Pokemon_Constructor Doublade = new Pokemon_Constructor("Doublade", Pokemon_Type_Database.steel(), Pokemon_Type_Database.ghost(), Pokemon_Ability_Database.NoGuard(), null, null, base_stats);
		return Doublade;
	}
	public static Pokemon_Constructor Aegislash()
	{
		int[] base_stats = {60, 50, 140, 50, 140, 60};
		Pokemon_Constructor Aegislash = new Pokemon_Constructor("Aegislash", Pokemon_Type_Database.steel(), Pokemon_Type_Database.ghost(), Pokemon_Ability_Database.StanceChange(), null, null, base_stats);
		return Aegislash;
	}
	public static Pokemon_Constructor Ponyta()
	{
		int[] base_stats = {50, 85, 55, 65, 65, 90};
		Pokemon_Constructor Ponyta = new Pokemon_Constructor("Ponyta", Pokemon_Type_Database.psychic(), null, Pokemon_Ability_Database.RunAway(), Pokemon_Ability_Database.PastelVeil(), Pokemon_Ability_Database.Anticipation(), base_stats);
		return Ponyta;
	}
	public static Pokemon_Constructor Rapidash()
	{
		int[] base_stats = {65, 100, 70, 80, 80, 105};
		Pokemon_Constructor Rapidash = new Pokemon_Constructor("Rapidash", Pokemon_Type_Database.psychic(), Pokemon_Type_Database.fairy(), Pokemon_Ability_Database.RunAway(), Pokemon_Ability_Database.PastelVeil(), Pokemon_Ability_Database.Anticipation(), base_stats);
		return Rapidash;
	}
	public static Pokemon_Constructor Sinistea()
	{
		int[] base_stats = {40, 45, 45, 74, 54, 50};
		Pokemon_Constructor Sinistea = new Pokemon_Constructor("Sinistea", Pokemon_Type_Database.ghost(), null, Pokemon_Ability_Database.WeakArmor(), null, Pokemon_Ability_Database.CursedBody(), base_stats);
		return Sinistea;
	}
	public static Pokemon_Constructor Polteageist()
	{
		int[] base_stats = {60, 65, 65, 134, 114, 70};
		Pokemon_Constructor Polteageist = new Pokemon_Constructor("Polteageist", Pokemon_Type_Database.ghost(), null, Pokemon_Ability_Database.WeakArmor(), null, Pokemon_Ability_Database.CursedBody(), base_stats);
		return Polteageist;
	}
	public static Pokemon_Constructor Indeedee()
	{
		int[] base_stats = {60, 65, 55, 105, 95, 95};
		Pokemon_Constructor Indeedee = new Pokemon_Constructor("Indeedee", Pokemon_Type_Database.psychic(), Pokemon_Type_Database.normal(), Pokemon_Ability_Database.InnerFocus(), Pokemon_Ability_Database.Synchronize(), Pokemon_Ability_Database.PsychicSurge(), base_stats);
		return Indeedee;
	}
	public static Pokemon_Constructor Phantump()
	{
		int[] base_stats = {43, 70, 48, 50, 60, 38};
		Pokemon_Constructor Phantump = new Pokemon_Constructor("Phantump", Pokemon_Type_Database.ghost(), Pokemon_Type_Database.grass(), Pokemon_Ability_Database.NaturalCure(), Pokemon_Ability_Database.Frisk(), Pokemon_Ability_Database.Harvest(), base_stats);
		return Phantump;
	}
	public static Pokemon_Constructor Trevenant()
	{
		int[] base_stats = {85, 110, 76, 65, 82, 56};
		Pokemon_Constructor Trevenant = new Pokemon_Constructor("Trevenant", Pokemon_Type_Database.ghost(), Pokemon_Type_Database.grass(), Pokemon_Ability_Database.NaturalCure(), Pokemon_Ability_Database.Frisk(), Pokemon_Ability_Database.Harvest(), base_stats);
		return Trevenant;
	}
	public static Pokemon_Constructor Morelull()
	{
		int[] base_stats = {40, 35, 55, 65, 75, 15};
		Pokemon_Constructor Morelull = new Pokemon_Constructor("Morelull", Pokemon_Type_Database.grass(), Pokemon_Type_Database.fairy(), Pokemon_Ability_Database.Illuminate(), Pokemon_Ability_Database.EffectSpore(), Pokemon_Ability_Database.RainDish(), base_stats);
		return Morelull;
	}
	public static Pokemon_Constructor Shiinotic()
	{
		int[] base_stats = {60, 45, 80, 90, 100, 30};
		Pokemon_Constructor Shiinotic = new Pokemon_Constructor("Shiinotic", Pokemon_Type_Database.grass(), Pokemon_Type_Database.fairy(), Pokemon_Ability_Database.Illuminate(), Pokemon_Ability_Database.EffectSpore(), Pokemon_Ability_Database.RainDish(), base_stats);
		return Shiinotic;
	}
	public static Pokemon_Constructor Oranguru()
	{
		int[] base_stats = {90, 60, 80, 90, 110, 60};
		Pokemon_Constructor Oranguru = new Pokemon_Constructor("Oranguru", Pokemon_Type_Database.normal(), Pokemon_Type_Database.psychic(), Pokemon_Ability_Database.InnerFocus(), Pokemon_Ability_Database.Telepathy(), Pokemon_Ability_Database.Symbiosis(), base_stats);
		return Oranguru;
	}
	public static Pokemon_Constructor Passimian()
	{
		int[] base_stats = {100, 120, 90, 40, 60, 80};
		Pokemon_Constructor Passimian = new Pokemon_Constructor("Passimian", Pokemon_Type_Database.fighting(), null, Pokemon_Ability_Database.Receiver(), null, Pokemon_Ability_Database.Defiant(), base_stats);
		return Passimian;
	}
	public static Pokemon_Constructor Morpeko()
	{
		int[] base_stats = {58, 95, 58, 70, 58, 97};
		Pokemon_Constructor Morpeko = new Pokemon_Constructor("Morpeko", Pokemon_Type_Database.electric(), Pokemon_Type_Database.dark(), Pokemon_Ability_Database.HungerSwitch(), null, null, base_stats);
		return Morpeko;
	}
	public static Pokemon_Constructor Falinks()
	{
		int[] base_stats = {65, 100, 100, 70, 60, 75};
		Pokemon_Constructor Falinks = new Pokemon_Constructor("Falinks", Pokemon_Type_Database.fighting(), null, Pokemon_Ability_Database.BattleArmor(), null, Pokemon_Ability_Database.Defiant(), base_stats);
		return Falinks;
	}
	public static Pokemon_Constructor Drampa()
	{
		int[] base_stats = {78, 60, 85, 135, 91, 36};
		Pokemon_Constructor Drampa = new Pokemon_Constructor("Drampa", Pokemon_Type_Database.normal(), Pokemon_Type_Database.dragon(), Pokemon_Ability_Database.Berserk(), Pokemon_Ability_Database.SapSipper(), Pokemon_Ability_Database.CloudNine(), base_stats);
		return Drampa;
	}
	public static Pokemon_Constructor Turtonator()
	{
		int[] base_stats = {60, 78, 135, 91, 85, 36};
		Pokemon_Constructor Turtonator = new Pokemon_Constructor("Turtonator", Pokemon_Type_Database.fire(), Pokemon_Type_Database.dragon(), Pokemon_Ability_Database.ShellArmor(), null, null, base_stats);
		return Turtonator;
	}
	public static Pokemon_Constructor Togedemaru()
	{
		int[] base_stats = {65, 98, 63, 40, 73, 96};
		Pokemon_Constructor Togedemaru = new Pokemon_Constructor("Togedemaru", Pokemon_Type_Database.electric(), Pokemon_Type_Database.steel(), Pokemon_Ability_Database.IronBarbs(), Pokemon_Ability_Database.LightningRod(), Pokemon_Ability_Database.Sturdy(), base_stats);
		return Togedemaru;
	}
	public static Pokemon_Constructor Snom()
	{
		int[] base_stats = {30, 25, 35, 45, 30, 20};
		Pokemon_Constructor Snom = new Pokemon_Constructor("Snom", Pokemon_Type_Database.ice(), Pokemon_Type_Database.bug(), Pokemon_Ability_Database.ShieldDust(), null, Pokemon_Ability_Database.IceScales(), base_stats);
		return Snom;
	}
	public static Pokemon_Constructor Frosmoth()
	{
		int[] base_stats = {70, 65, 60, 125, 90, 65};
		Pokemon_Constructor Frosmoth = new Pokemon_Constructor("Frosmoth", Pokemon_Type_Database.ice(), Pokemon_Type_Database.bug(), Pokemon_Ability_Database.ShieldDust(), null, Pokemon_Ability_Database.IceScales(), base_stats);
		return Frosmoth;
	}
	public static Pokemon_Constructor Clobbopus()
	{
		int[] base_stats = {50, 68, 60, 50, 50, 32};
		Pokemon_Constructor Clobbopus = new Pokemon_Constructor("Clobbopus", Pokemon_Type_Database.fighting(), null, Pokemon_Ability_Database.Limber(), null, Pokemon_Ability_Database.Technician(), base_stats);
		return Clobbopus;
	}
	public static Pokemon_Constructor Grapploct()
	{
		int[] base_stats = {80, 118, 90, 70, 80, 42};
		Pokemon_Constructor Grapploct = new Pokemon_Constructor("Grapploct", Pokemon_Type_Database.fighting(), null, Pokemon_Ability_Database.Limber(), null, Pokemon_Ability_Database.Technician(), base_stats);
		return Grapploct;
	}
	public static Pokemon_Constructor Pincurchin()
	{
		int[] base_stats = {48, 101, 95, 91, 85, 15};
		Pokemon_Constructor Pincurchin = new Pokemon_Constructor("Pincurchin", Pokemon_Type_Database.electric(), null, Pokemon_Ability_Database.LightningRod(), null, Pokemon_Ability_Database.ElectricSurge(), base_stats);
		return Pincurchin;
	}
	public static Pokemon_Constructor Mantyke()
	{
		int[] base_stats = {45, 20, 50, 60, 120, 50};
		Pokemon_Constructor Mantyke = new Pokemon_Constructor("Mantyke", Pokemon_Type_Database.water(), Pokemon_Type_Database.flying(), Pokemon_Ability_Database.SwiftSwim(), Pokemon_Ability_Database.WaterAbsorb(), Pokemon_Ability_Database.WaterVeil(), base_stats);
		return Mantyke;
	}
	public static Pokemon_Constructor Mantine()
	{
		int[] base_stats = {85, 40, 70, 80, 140, 70};
		Pokemon_Constructor Mantine = new Pokemon_Constructor("Mantine", Pokemon_Type_Database.water(), Pokemon_Type_Database.flying(), Pokemon_Ability_Database.SwiftSwim(), Pokemon_Ability_Database.WaterAbsorb(), Pokemon_Ability_Database.WaterVeil(), base_stats);
		return Mantine;
	}
	public static Pokemon_Constructor Wailmer()
	{
		int[] base_stats = {130, 70, 35, 70, 35, 60};
		Pokemon_Constructor Wailmer = new Pokemon_Constructor("Wailmer", Pokemon_Type_Database.water(), null, Pokemon_Ability_Database.WaterVeil(), Pokemon_Ability_Database.Oblivious(), Pokemon_Ability_Database.Pressure(), base_stats);
		return Wailmer;
	}
	public static Pokemon_Constructor Wailord()
	{
		int[] base_stats = {170, 90, 45, 90, 45, 60};
		Pokemon_Constructor Wailord = new Pokemon_Constructor("Wailord", Pokemon_Type_Database.water(), null, Pokemon_Ability_Database.WaterVeil(), Pokemon_Ability_Database.Oblivious(), Pokemon_Ability_Database.Pressure(), base_stats);
		return Wailord;
	}
	public static Pokemon_Constructor Bergmite()
	{
		int[] base_stats = {55, 69, 85, 32, 35, 28};
		Pokemon_Constructor Bergmite = new Pokemon_Constructor("Bergmite", Pokemon_Type_Database.ice(), null, Pokemon_Ability_Database.OwnTempo(), Pokemon_Ability_Database.IceBody(), Pokemon_Ability_Database.Sturdy(), base_stats);
		return Bergmite;
	}
	public static Pokemon_Constructor Avalugg()
	{
		int[] base_stats = {95, 117, 184, 44, 46, 28};
		Pokemon_Constructor Avalugg = new Pokemon_Constructor("Avalugg", Pokemon_Type_Database.ice(), null, Pokemon_Ability_Database.OwnTempo(), Pokemon_Ability_Database.IceBody(), Pokemon_Ability_Database.Sturdy(), base_stats);
		return Avalugg;
	}
	public static Pokemon_Constructor Dhelmise()
	{
		int[] base_stats = {70, 131, 100, 86, 90, 40};
		Pokemon_Constructor Dhelmise = new Pokemon_Constructor("Dhelmise", Pokemon_Type_Database.ghost(), Pokemon_Type_Database.grass(), Pokemon_Ability_Database.Steelworker(), null, null, base_stats);
		return Dhelmise;
	}
	public static Pokemon_Constructor Lapras()
	{
		int[] base_stats = {130, 85, 80, 85, 95, 60};
		Pokemon_Constructor Lapras = new Pokemon_Constructor("Lapras", Pokemon_Type_Database.water(), Pokemon_Type_Database.ice(), Pokemon_Ability_Database.WaterAbsorb(), Pokemon_Ability_Database.ShellArmor(), Pokemon_Ability_Database.Hydration(), base_stats);
		return Lapras;
	}
	public static Pokemon_Constructor Lunatone()
	{
		int[] base_stats = {90, 55, 65, 95, 85, 70};
		Pokemon_Constructor Lunatone = new Pokemon_Constructor("Lunatone", Pokemon_Type_Database.rock(), Pokemon_Type_Database.psychic(), Pokemon_Ability_Database.Levitate(), null, null, base_stats);
		return Lunatone;
	}
	public static Pokemon_Constructor Solrock()
	{
		int[] base_stats = {90, 95, 85, 55, 65, 70};
		Pokemon_Constructor Solrock = new Pokemon_Constructor("Solrock", Pokemon_Type_Database.rock(), Pokemon_Type_Database.psychic(), Pokemon_Ability_Database.Levitate(), null, null, base_stats);
		return Solrock;
	}
	public static Pokemon_Constructor MimeJr()
	{
		int[] base_stats = {20, 25, 45, 70, 90, 60};
		Pokemon_Constructor MimeJr = new Pokemon_Constructor("MimeJr", Pokemon_Type_Database.psychic(), Pokemon_Type_Database.fairy(), Pokemon_Ability_Database.Soundproof(), Pokemon_Ability_Database.Filter(), Pokemon_Ability_Database.Technician(), base_stats);
		return MimeJr;
	}
	public static Pokemon_Constructor MrMime()
	{
		int[] base_stats = {50, 65, 65, 90, 90, 100};
		Pokemon_Constructor MrMime = new Pokemon_Constructor("MrMime", Pokemon_Type_Database.psychic(), Pokemon_Type_Database.fairy(), Pokemon_Ability_Database.VitalSpirit(), Pokemon_Ability_Database.ScreenCleaner(), Pokemon_Ability_Database.IceBody(), base_stats);
		return MrMime;
	}
	public static Pokemon_Constructor MrRime()
	{
		int[] base_stats = {80, 85, 75, 110, 100, 70};
		Pokemon_Constructor MrRime = new Pokemon_Constructor("MrRime", Pokemon_Type_Database.ice(), Pokemon_Type_Database.psychic(), Pokemon_Ability_Database.TangledFeet(), Pokemon_Ability_Database.ScreenCleaner(), Pokemon_Ability_Database.IceBody(), base_stats);
		return MrRime;
	}
	public static Pokemon_Constructor Darumaka()
	{
		int[] base_stats = {70, 90, 45, 15, 45, 50};
		Pokemon_Constructor Darumaka = new Pokemon_Constructor("Darumaka", Pokemon_Type_Database.ice(), null, Pokemon_Ability_Database.Hustle(), null, Pokemon_Ability_Database.InnerFocus(), base_stats);
		return Darumaka;
	}
	public static Pokemon_Constructor Darmanitan()
	{
		int[] base_stats = {105, 140, 55, 30, 55, 95};
		Pokemon_Constructor Darmanitan = new Pokemon_Constructor("Darmanitan", Pokemon_Type_Database.fire(), null, Pokemon_Ability_Database.GorillaTactics(), null, Pokemon_Ability_Database.ZenMode(), base_stats);
		return Darmanitan;
	}
	public static Pokemon_Constructor Stonjourner()
	{
		int[] base_stats = {100, 125, 135, 20, 20, 70};
		Pokemon_Constructor Stonjourner = new Pokemon_Constructor("Stonjourner", Pokemon_Type_Database.rock(), null, Pokemon_Ability_Database.PowerSpot(), null, null, base_stats);
		return Stonjourner;
	}
	public static Pokemon_Constructor Eiscue()
	{
		int[] base_stats = {75, 80, 110, 65, 90, 50};
		Pokemon_Constructor Eiscue = new Pokemon_Constructor("Eiscue", Pokemon_Type_Database.ice(), null, Pokemon_Ability_Database.IceFace(), null, null, base_stats);
		return Eiscue;
	}
	public static Pokemon_Constructor Duraludon()
	{
		int[] base_stats = {70, 95, 115, 120, 50, 85};
		Pokemon_Constructor Duraludon = new Pokemon_Constructor("Duraludon", Pokemon_Type_Database.steel(), Pokemon_Type_Database.dragon(), Pokemon_Ability_Database.LightMetal(), Pokemon_Ability_Database.HeavyMetal(), Pokemon_Ability_Database.Stalwart(), base_stats);
		return Duraludon;
	}
	public static Pokemon_Constructor Rotom()
	{
		int[] base_stats = {50, 50, 77, 95, 77, 91};
		Pokemon_Constructor Rotom = new Pokemon_Constructor("Rotom", Pokemon_Type_Database.electric(), Pokemon_Type_Database.ghost(), Pokemon_Ability_Database.Levitate(), null, null, base_stats);
		return Rotom;
	}
	public static Pokemon_Constructor Ditto()
	{
		int[] base_stats = {48, 48, 48, 48, 48, 48};
		Pokemon_Constructor Ditto = new Pokemon_Constructor("Ditto", Pokemon_Type_Database.normal(), null, Pokemon_Ability_Database.Limber(), null, Pokemon_Ability_Database.Imposter(), base_stats);
		return Ditto;
	}
	public static Pokemon_Constructor Dracozolt()
	{
		int[] base_stats = {90, 100, 90, 80, 70, 75};
		Pokemon_Constructor Dracozolt = new Pokemon_Constructor("Dracozolt", Pokemon_Type_Database.electric(), Pokemon_Type_Database.dragon(), Pokemon_Ability_Database.VoltAbsorb(), Pokemon_Ability_Database.Hustle(), Pokemon_Ability_Database.SandRush(), base_stats);
		return Dracozolt;
	}
	public static Pokemon_Constructor Arctozolt()
	{
		int[] base_stats = {90, 100, 90, 90, 80, 55};
		Pokemon_Constructor Arctozolt = new Pokemon_Constructor("Arctozolt", Pokemon_Type_Database.electric(), Pokemon_Type_Database.ice(), Pokemon_Ability_Database.VoltAbsorb(), Pokemon_Ability_Database.Static(), Pokemon_Ability_Database.SlushRush(), base_stats);
		return Arctozolt;
	}
	public static Pokemon_Constructor Dracovish()
	{
		int[] base_stats = {90, 90, 100, 70, 80, 75};
		Pokemon_Constructor Dracovish = new Pokemon_Constructor("Dracovish", Pokemon_Type_Database.water(), Pokemon_Type_Database.dragon(), Pokemon_Ability_Database.WaterAbsorb(), Pokemon_Ability_Database.StrongJaw(), Pokemon_Ability_Database.SandRush(), base_stats);
		return Dracovish;
	}
	public static Pokemon_Constructor Arctovish()
	{
		int[] base_stats = {90, 90, 100, 80, 90, 55};
		Pokemon_Constructor Arctovish = new Pokemon_Constructor("Arctovish", Pokemon_Type_Database.water(), Pokemon_Type_Database.ice(), Pokemon_Ability_Database.WaterAbsorb(), Pokemon_Ability_Database.IceBody(), Pokemon_Ability_Database.SlushRush(), base_stats);
		return Arctovish;
	}
	public static Pokemon_Constructor Charmander()
	{
		int[] base_stats = {39, 52, 43, 60, 50, 65};
		Pokemon_Constructor Charmander = new Pokemon_Constructor("Charmander", Pokemon_Type_Database.fire(), null, Pokemon_Ability_Database.Blaze(), null, Pokemon_Ability_Database.SolarPower(), base_stats);
		return Charmander;
	}
	public static Pokemon_Constructor Charmeleon()
	{
		int[] base_stats = {58, 64, 58, 80, 65, 80};
		Pokemon_Constructor Charmeleon = new Pokemon_Constructor("Charmeleon", Pokemon_Type_Database.fire(), null, Pokemon_Ability_Database.Blaze(), null, Pokemon_Ability_Database.SolarPower(), base_stats);
		return Charmeleon;
	}
	public static Pokemon_Constructor Charizard()
	{
		int[] base_stats = {78, 84, 78, 109, 85, 100};
		Pokemon_Constructor Charizard = new Pokemon_Constructor("Charizard", Pokemon_Type_Database.fire(), Pokemon_Type_Database.flying(), Pokemon_Ability_Database.Blaze(), null, Pokemon_Ability_Database.SolarPower(), base_stats);
		return Charizard;
	}
	public static Pokemon_Constructor TypeNull()
	{
		int[] base_stats = {95, 95, 95, 95, 95, 59};
		Pokemon_Constructor TypeNull = new Pokemon_Constructor("TypeNull", Pokemon_Type_Database.normal(), null, Pokemon_Ability_Database.BattleArmor(), null, null, base_stats);
		return TypeNull;
	}
	public static Pokemon_Constructor Silvally()
	{
		int[] base_stats = {95, 95, 95, 95, 95, 95};
		Pokemon_Constructor Silvally = new Pokemon_Constructor("Silvally", Pokemon_Type_Database.normal(), null, Pokemon_Ability_Database.RKSSystem(), null, null, base_stats);
		return Silvally;
	}
	public static Pokemon_Constructor Larvitar()
	{
		int[] base_stats = {50, 64, 50, 45, 50, 41};
		Pokemon_Constructor Larvitar = new Pokemon_Constructor("Larvitar", Pokemon_Type_Database.rock(), Pokemon_Type_Database.ground(), Pokemon_Ability_Database.Guts(), null, Pokemon_Ability_Database.SandVeil(), base_stats);
		return Larvitar;
	}
	public static Pokemon_Constructor Pupitar()
	{
		int[] base_stats = {70, 84, 70, 65, 70, 51};
		Pokemon_Constructor Pupitar = new Pokemon_Constructor("Pupitar", Pokemon_Type_Database.rock(), Pokemon_Type_Database.ground(), Pokemon_Ability_Database.ShedSkin(), null, null, base_stats);
		return Pupitar;
	}
	public static Pokemon_Constructor Tyranitar()
	{
		int[] base_stats = {100, 134, 110, 95, 100, 61};
		Pokemon_Constructor Tyranitar = new Pokemon_Constructor("Tyranitar", Pokemon_Type_Database.rock(), Pokemon_Type_Database.dark(), Pokemon_Ability_Database.SandStream(), null, Pokemon_Ability_Database.Unnerve(), base_stats);
		return Tyranitar;
	}
	public static Pokemon_Constructor Deino()
	{
		int[] base_stats = {52, 65, 50, 45, 50, 38};
		Pokemon_Constructor Deino = new Pokemon_Constructor("Deino", Pokemon_Type_Database.dark(), Pokemon_Type_Database.dragon(), Pokemon_Ability_Database.Hustle(), null, null, base_stats);
		return Deino;
	}
	public static Pokemon_Constructor Zweilous()
	{
		int[] base_stats = {72, 85, 70, 65, 70, 58};
		Pokemon_Constructor Zweilous = new Pokemon_Constructor("Zweilous", Pokemon_Type_Database.dark(), Pokemon_Type_Database.dragon(), Pokemon_Ability_Database.Hustle(), null, null, base_stats);
		return Zweilous;
	}
	public static Pokemon_Constructor Hydreigon()
	{
		int[] base_stats = {92, 105, 90, 125, 90, 98};
		Pokemon_Constructor Hydreigon = new Pokemon_Constructor("Hydreigon", Pokemon_Type_Database.dark(), Pokemon_Type_Database.dragon(), Pokemon_Ability_Database.Levitate(), null, null, base_stats);
		return Hydreigon;
	}
	public static Pokemon_Constructor Goomy()
	{
		int[] base_stats = {45, 50, 35, 55, 75, 40};
		Pokemon_Constructor Goomy = new Pokemon_Constructor("Goomy", Pokemon_Type_Database.dragon(), null, Pokemon_Ability_Database.SapSipper(), Pokemon_Ability_Database.Hydration(), Pokemon_Ability_Database.Gooey(), base_stats);
		return Goomy;
	}
	public static Pokemon_Constructor Sliggoo()
	{
		int[] base_stats = {68, 75, 53, 83, 113, 60};
		Pokemon_Constructor Sliggoo = new Pokemon_Constructor("Sliggoo", Pokemon_Type_Database.dragon(), null, Pokemon_Ability_Database.SapSipper(), Pokemon_Ability_Database.Hydration(), Pokemon_Ability_Database.Gooey(), base_stats);
		return Sliggoo;
	}
	public static Pokemon_Constructor Goodra()
	{
		int[] base_stats = {90, 100, 70, 110, 150, 80};
		Pokemon_Constructor Goodra = new Pokemon_Constructor("Goodra", Pokemon_Type_Database.dragon(), null, Pokemon_Ability_Database.SapSipper(), Pokemon_Ability_Database.Hydration(), Pokemon_Ability_Database.Gooey(), base_stats);
		return Goodra;
	}
	public static Pokemon_Constructor Jangmo_o()
	{
		int[] base_stats = {45, 55, 65, 45, 45, 45};
		Pokemon_Constructor Jangmo_o = new Pokemon_Constructor("Jangmo_o", Pokemon_Type_Database.dragon(), null, Pokemon_Ability_Database.Bulletproof(), Pokemon_Ability_Database.Soundproof(), Pokemon_Ability_Database.Overcoat(), base_stats);
		return Jangmo_o;
	}
	public static Pokemon_Constructor Hakamo_o()
	{
		int[] base_stats = {55, 75, 90, 65, 70, 65};
		Pokemon_Constructor Hakamo_o = new Pokemon_Constructor("Hakamo_o", Pokemon_Type_Database.dragon(), Pokemon_Type_Database.fighting(), Pokemon_Ability_Database.Bulletproof(), Pokemon_Ability_Database.Soundproof(), Pokemon_Ability_Database.Overcoat(), base_stats);
		return Hakamo_o;
	}
	public static Pokemon_Constructor Kommo_o()
	{
		int[] base_stats = {75, 110, 125, 100, 105, 85};
		Pokemon_Constructor Kommo_o = new Pokemon_Constructor("Kommo_o", Pokemon_Type_Database.dragon(), Pokemon_Type_Database.fighting(), Pokemon_Ability_Database.Bulletproof(), Pokemon_Ability_Database.Soundproof(), Pokemon_Ability_Database.Overcoat(), base_stats);
		return Kommo_o;
	}
	public static Pokemon_Constructor Dreepy()
	{
		int[] base_stats = {28, 60, 30, 40, 30, 82};
		Pokemon_Constructor Dreepy = new Pokemon_Constructor("Dreepy", Pokemon_Type_Database.dragon(), Pokemon_Type_Database.ghost(), Pokemon_Ability_Database.ClearBody(), Pokemon_Ability_Database.Infiltrator(), Pokemon_Ability_Database.CursedBody(), base_stats);
		return Dreepy;
	}
	public static Pokemon_Constructor Drakloak()
	{
		int[] base_stats = {68, 80, 50, 60, 50, 102};
		Pokemon_Constructor Drakloak = new Pokemon_Constructor("Drakloak", Pokemon_Type_Database.dragon(), Pokemon_Type_Database.ghost(), Pokemon_Ability_Database.ClearBody(), Pokemon_Ability_Database.Infiltrator(), Pokemon_Ability_Database.CursedBody(), base_stats);
		return Drakloak;
	}
	public static Pokemon_Constructor Dragapult()
	{
		int[] base_stats = {88, 120, 75, 100, 75, 142};
		Pokemon_Constructor Dragapult = new Pokemon_Constructor("Dragapult", Pokemon_Type_Database.dragon(), Pokemon_Type_Database.ghost(), Pokemon_Ability_Database.ClearBody(), Pokemon_Ability_Database.Infiltrator(), Pokemon_Ability_Database.CursedBody(), base_stats);
		return Dragapult;
	}
	public static Pokemon_Constructor Zacian()
	{
		int[] base_stats = {92, 130, 115, 80, 115, 138};
		Pokemon_Constructor Zacian = new Pokemon_Constructor("Zacian", Pokemon_Type_Database.fairy(), null, Pokemon_Ability_Database.IntrepidSword(), null, null, base_stats);
		return Zacian;
	}
	public static Pokemon_Constructor Zamazenta()
	{
		int[] base_stats = {92, 130, 115, 80, 115, 138};
		Pokemon_Constructor Zamazenta = new Pokemon_Constructor("Zamazenta", Pokemon_Type_Database.fighting(), null, Pokemon_Ability_Database.DauntlessShield(), null, null, base_stats);
		return Zamazenta;
	}
	public static Pokemon_Constructor Eternatus()
	{
		int[] base_stats = {140, 85, 95, 145, 95, 130};
		Pokemon_Constructor Eternatus = new Pokemon_Constructor("Eternatus", Pokemon_Type_Database.poison(), Pokemon_Type_Database.dragon(), Pokemon_Ability_Database.Pressure(), null, null, base_stats);
		return Eternatus;
	}

}