import java.util.ArrayList;

public class Pokemon_Type_Database 
{
	public static void main(String[] args)
	{
		ArrayList<Pokemon_Type_Constructor> test = createAllTypes();
	}
	
	public static ArrayList<Pokemon_Type_Constructor> createAllTypes()
	{
		ArrayList<Pokemon_Type_Constructor> All_Pokemon_Types = new ArrayList<Pokemon_Type_Constructor>();
		
		Pokemon_Type_Constructor normal = normal();
		All_Pokemon_Types.add(normal);
		Pokemon_Type_Constructor fire = fire();
		All_Pokemon_Types.add(fire);
		Pokemon_Type_Constructor water = water();
		All_Pokemon_Types.add(water);
		Pokemon_Type_Constructor electric = electric();
		All_Pokemon_Types.add(electric);
		Pokemon_Type_Constructor grass = grass();
		All_Pokemon_Types.add(grass);
		Pokemon_Type_Constructor ice = ice();
		All_Pokemon_Types.add(ice);
		Pokemon_Type_Constructor fighting = fighting();
		All_Pokemon_Types.add(fighting);
		Pokemon_Type_Constructor poison = poison();
		All_Pokemon_Types.add(poison);
		Pokemon_Type_Constructor ground = ground();
		All_Pokemon_Types.add(ground);
		Pokemon_Type_Constructor flying = flying();
		All_Pokemon_Types.add(flying);
		Pokemon_Type_Constructor psychic = psychic();
		All_Pokemon_Types.add(psychic);
		Pokemon_Type_Constructor bug = bug();
		All_Pokemon_Types.add(bug);
		Pokemon_Type_Constructor rock = rock();
		All_Pokemon_Types.add(rock);
		Pokemon_Type_Constructor ghost = ghost();
		All_Pokemon_Types.add(ghost);
		Pokemon_Type_Constructor dragon = dragon();
		All_Pokemon_Types.add(dragon);
		Pokemon_Type_Constructor dark = dark();
		All_Pokemon_Types.add(dark);
		Pokemon_Type_Constructor steel = steel();
		All_Pokemon_Types.add(steel);
		Pokemon_Type_Constructor fairy = fairy();
		All_Pokemon_Types.add(fairy);
		
		return All_Pokemon_Types;
	}
	
	public static Pokemon_Type_Constructor normal() //Checked
	{
		ArrayList<String> normal_superEffective = new ArrayList<String>();
		
		ArrayList<String> normal_neutral = new ArrayList<String>();
		normal_neutral.add("normal");
		normal_neutral.add("fire");
		normal_neutral.add("water");
		normal_neutral.add("electric");
		normal_neutral.add("grass");
		normal_neutral.add("ice");
		normal_neutral.add("fighting");
		normal_neutral.add("poison");
		normal_neutral.add("ground");
		normal_neutral.add("flying");
		normal_neutral.add("psychic");
		normal_neutral.add("bug");
		normal_neutral.add("dragon");
		normal_neutral.add("dark");
		normal_neutral.add("fairy");
		
		ArrayList<String> normal_ineffective = new ArrayList<String>();
		normal_ineffective.add("rock");
		normal_ineffective.add("steel");
		
		ArrayList<String> normal_immune = new ArrayList<String>();
		normal_immune.add("ghost");

		Pokemon_Type_Constructor normal = new Pokemon_Type_Constructor("normal", normal_superEffective, normal_neutral, normal_ineffective, normal_immune);
		return normal;
	}
	
	public static Pokemon_Type_Constructor fire() //Checked
	{
		ArrayList<String> fire_superEffective = new ArrayList<String>();		
		fire_superEffective.add("grass");
		fire_superEffective.add("ice");
		fire_superEffective.add("bug");
		fire_superEffective.add("steel");
		
		ArrayList<String> fire_neutral = new ArrayList<String>();
		fire_neutral.add("normal");
		fire_neutral.add("electric");
		fire_neutral.add("fighting");
		fire_neutral.add("poison");
		fire_neutral.add("ground");
		fire_neutral.add("flying");
		fire_neutral.add("psychic");
		fire_neutral.add("ghost");
		fire_neutral.add("dark");
		fire_neutral.add("fairy");
		
		ArrayList<String> fire_ineffective = new ArrayList<String>();
		fire_ineffective.add("fire");
		fire_ineffective.add("water");
		fire_ineffective.add("rock");
		fire_ineffective.add("dragon");

		
		ArrayList<String> fire_immune = new ArrayList<String>();

		Pokemon_Type_Constructor fire = new Pokemon_Type_Constructor("fire", fire_superEffective, fire_neutral, fire_ineffective, fire_immune);
		return fire;
	}
	
	public static Pokemon_Type_Constructor water() //Checked
	{
		ArrayList<String> water_superEffective = new ArrayList<String>();
		water_superEffective.add("fire");
		water_superEffective.add("ground");
		water_superEffective.add("rock");
		
		ArrayList<String> water_neutral = new ArrayList<String>();
		water_neutral.add("normal");
		water_neutral.add("electric");
		water_neutral.add("ice");
		water_neutral.add("fighting");
		water_neutral.add("poison");
		water_neutral.add("flying");
		water_neutral.add("psychic");
		water_neutral.add("bug");
		water_neutral.add("ghost");
		water_neutral.add("dark");
		water_neutral.add("steel");
		water_neutral.add("fairy");
		
		ArrayList<String> water_ineffective = new ArrayList<String>();
		water_ineffective.add("water");
		water_ineffective.add("grass");
		water_ineffective.add("dragon");
		
		ArrayList<String> water_immune = new ArrayList<String>();

		Pokemon_Type_Constructor water = new Pokemon_Type_Constructor("water", water_superEffective, water_neutral, water_ineffective, water_immune);
		return water;
	}
	
	public static Pokemon_Type_Constructor electric() //Checked
	{
		ArrayList<String> electric_superEffective = new ArrayList<String>();
		electric_superEffective.add("water");
		electric_superEffective.add("flying");
		
		ArrayList<String> electric_neutral = new ArrayList<String>();
		electric_neutral.add("normal");
		electric_neutral.add("fire");
		electric_neutral.add("ice");
		electric_neutral.add("fighting");
		electric_neutral.add("poison");
		electric_neutral.add("psychic");
		electric_neutral.add("bug");
		electric_neutral.add("rock");
		electric_neutral.add("ghost");
		electric_neutral.add("dark");
		electric_neutral.add("steel");
		electric_neutral.add("fairy");
		
		ArrayList<String> electric_ineffective = new ArrayList<String>();
		electric_ineffective.add("electric");
		electric_ineffective.add("grass");
		electric_ineffective.add("dragon");
		
		ArrayList<String> electric_immune = new ArrayList<String>();
		electric_immune.add("ground");

		Pokemon_Type_Constructor electric = new Pokemon_Type_Constructor("electric", electric_superEffective, electric_neutral, electric_ineffective, electric_immune);
		return electric;
	}
	
	public static Pokemon_Type_Constructor grass() //Checked
	{
		ArrayList<String> grass_superEffective = new ArrayList<String>();
		grass_superEffective.add("water");
		grass_superEffective.add("ground");
		grass_superEffective.add("rock");
		
		ArrayList<String> grass_neutral = new ArrayList<String>();
		grass_neutral.add("normal");
		grass_neutral.add("electric");
		grass_neutral.add("ice");
		grass_neutral.add("fighting");
		grass_neutral.add("psychic");
		grass_neutral.add("ghost");
		grass_neutral.add("dark");
		grass_neutral.add("fairy");
		
		ArrayList<String> grass_ineffective = new ArrayList<String>();
		grass_ineffective.add("fire");
		grass_ineffective.add("grass");
		grass_ineffective.add("poison");
		grass_ineffective.add("flying");
		grass_ineffective.add("bug");
		grass_ineffective.add("dragon");
		grass_ineffective.add("steel");
		
		ArrayList<String> grass_immune = new ArrayList<String>();

		Pokemon_Type_Constructor grass = new Pokemon_Type_Constructor("grass", grass_superEffective, grass_neutral, grass_ineffective, grass_immune);
		return grass;
	}
	
	public static Pokemon_Type_Constructor ice() //Checked
	{
		ArrayList<String> ice_superEffective = new ArrayList<String>();
		ice_superEffective.add("grass");
		ice_superEffective.add("ground");
		ice_superEffective.add("flying");
		ice_superEffective.add("dragon");
		
		ArrayList<String> ice_neutral = new ArrayList<String>();
		ice_neutral.add("normal");
		ice_neutral.add("electric");
		ice_neutral.add("fighting");
		ice_neutral.add("poison");
		ice_neutral.add("psychic");
		ice_neutral.add("bug");
		ice_neutral.add("rock");
		ice_neutral.add("ghost");
		ice_neutral.add("dark");
		ice_neutral.add("fairy");
		
		ArrayList<String> ice_ineffective = new ArrayList<String>();
		ice_ineffective.add("fire");
		ice_ineffective.add("water");
		ice_ineffective.add("ice");
		ice_ineffective.add("steel");
		
		ArrayList<String> ice_immune = new ArrayList<String>();

		Pokemon_Type_Constructor ice = new Pokemon_Type_Constructor("ice", ice_superEffective, ice_neutral, ice_ineffective, ice_immune);
		return ice;
	}
	
	public static Pokemon_Type_Constructor fighting() //Checked
	{
		ArrayList<String> fighting_superEffective = new ArrayList<String>();
		fighting_superEffective.add("normal");
		fighting_superEffective.add("ice");
		fighting_superEffective.add("rock");
		fighting_superEffective.add("dark");
		fighting_superEffective.add("steel");
		
		ArrayList<String> fighting_neutral = new ArrayList<String>();
		fighting_neutral.add("fire");
		fighting_neutral.add("water");
		fighting_neutral.add("grass");
		fighting_neutral.add("electric");
		fighting_neutral.add("fighting");
		fighting_neutral.add("ground");
		fighting_neutral.add("dragon");
		
		ArrayList<String> fighting_ineffective = new ArrayList<String>();
		fighting_ineffective.add("poison");
		fighting_ineffective.add("flying");
		fighting_ineffective.add("psychic");
		fighting_ineffective.add("bug");
		fighting_ineffective.add("fairy");
		
		ArrayList<String> fighting_immune = new ArrayList<String>();
		fighting_immune.add("ghost");
		
		Pokemon_Type_Constructor fighting = new Pokemon_Type_Constructor("fighting", fighting_superEffective, fighting_neutral, fighting_ineffective, fighting_immune);
		return fighting;
	}
	
	public static Pokemon_Type_Constructor poison() //Checked
	{
		ArrayList<String> poison_superEffective = new ArrayList<String>();
		poison_superEffective.add("grass");
		poison_superEffective.add("fairy");

		ArrayList<String> poison_neutral = new ArrayList<String>();
		poison_neutral.add("normal");
		poison_neutral.add("fire");
		poison_neutral.add("water");
		poison_neutral.add("electric");
		poison_neutral.add("ice");
		poison_neutral.add("fighting");
		poison_neutral.add("flying");
		poison_neutral.add("psychic");
		poison_neutral.add("bug");
		poison_neutral.add("dragon");
		poison_neutral.add("dark");
		
		ArrayList<String> poison_ineffective = new ArrayList<String>();
		poison_ineffective.add("poison");
		poison_ineffective.add("ground");
		poison_ineffective.add("rock");
		poison_ineffective.add("ghost");
		
		ArrayList<String> poison_immune = new ArrayList<String>();
		poison_immune.add("steel");

		Pokemon_Type_Constructor poison = new Pokemon_Type_Constructor("poison", poison_superEffective, poison_neutral, poison_ineffective, poison_immune);
		return poison;
	}
	
	public static Pokemon_Type_Constructor ground() //Checked
	{
		ArrayList<String> ground_superEffective = new ArrayList<String>();
		ground_superEffective.add("fire");
		ground_superEffective.add("electric");
		ground_superEffective.add("poison");
		ground_superEffective.add("rock");
		
		ArrayList<String> ground_neutral = new ArrayList<String>();
		ground_neutral.add("normal");
		ground_neutral.add("water");
		ground_neutral.add("ice");
		ground_neutral.add("fighting");
		ground_neutral.add("ground");
		ground_neutral.add("psychic");
		ground_neutral.add("ghost");
		ground_neutral.add("dragon");
		ground_neutral.add("dark");
		ground_neutral.add("fairy");
		
		ArrayList<String> ground_ineffective = new ArrayList<String>();
		ground_ineffective.add("grass");
		ground_ineffective.add("bug");
		ground_ineffective.add("steel");
		
		ArrayList<String> ground_immune = new ArrayList<String>();
		ground_immune.add("flying");

		Pokemon_Type_Constructor ground = new Pokemon_Type_Constructor("ground", ground_superEffective, ground_neutral, ground_ineffective, ground_immune);
		return ground;
	}
	
	public static Pokemon_Type_Constructor flying() //Checked
	{
		ArrayList<String> flying_superEffective = new ArrayList<String>();
		flying_superEffective.add("grass");
		flying_superEffective.add("fighting");
		flying_superEffective.add("bug");
		
		ArrayList<String> flying_neutral = new ArrayList<String>();
		flying_neutral.add("normal");
		flying_neutral.add("fire");
		flying_neutral.add("water");
		flying_neutral.add("ice");
		flying_neutral.add("poison");
		flying_neutral.add("ground");
		flying_neutral.add("flying");
		flying_neutral.add("psychic");
		flying_neutral.add("ghost");
		flying_neutral.add("dragon");
		flying_neutral.add("dark");
		flying_neutral.add("fairy");
		
		ArrayList<String> flying_ineffective = new ArrayList<String>();
		flying_ineffective.add("electric");
		flying_ineffective.add("rock");
		flying_ineffective.add("steel");
		
		ArrayList<String> flying_immune = new ArrayList<String>();

		Pokemon_Type_Constructor flying = new Pokemon_Type_Constructor("flying", flying_superEffective, flying_neutral, flying_ineffective, flying_immune);
		return flying;
	}
	
	public static Pokemon_Type_Constructor psychic() 
	{
		ArrayList<String> psychic_superEffective = new ArrayList<String>();
		psychic_superEffective.add("fighting");
		psychic_superEffective.add("poison");
		
		ArrayList<String> psychic_neutral = new ArrayList<String>();
		psychic_neutral.add("normal");
		psychic_neutral.add("fire");
		psychic_neutral.add("water");
		psychic_neutral.add("electric");
		psychic_neutral.add("grass");
		psychic_neutral.add("ice");
		psychic_neutral.add("ground");
		psychic_neutral.add("flying");
		psychic_neutral.add("bug");
		psychic_neutral.add("rock");
		psychic_neutral.add("ghost");
		psychic_neutral.add("dragon");
		psychic_neutral.add("fairy");
		
		ArrayList<String> psychic_ineffective = new ArrayList<String>();
		psychic_ineffective.add("psychic");
		psychic_ineffective.add("steel");
		
		ArrayList<String> psychic_immune = new ArrayList<String>();
		psychic_immune.add("dark");

		Pokemon_Type_Constructor psychic = new Pokemon_Type_Constructor("psychic", psychic_superEffective, psychic_neutral, psychic_ineffective, psychic_immune);
		return psychic;
	}
	
	public static Pokemon_Type_Constructor bug() 
	{
		ArrayList<String> bug_superEffective = new ArrayList<String>();
		bug_superEffective.add("grass");
		bug_superEffective.add("psychic");
		bug_superEffective.add("dark");
		
		ArrayList<String> bug_neutral = new ArrayList<String>();
		bug_neutral.add("normal");
		bug_neutral.add("water");
		bug_neutral.add("electric");
		bug_neutral.add("ice");
		bug_neutral.add("ground");
		bug_neutral.add("bug");
		bug_neutral.add("rock");
		bug_neutral.add("dragon");
		bug_neutral.add("fairy");
		
		ArrayList<String> bug_ineffective = new ArrayList<String>();
		bug_ineffective.add("fire");
		bug_ineffective.add("fighting");
		bug_ineffective.add("poison");
		bug_ineffective.add("flying");
		bug_ineffective.add("ghost");
		bug_ineffective.add("steel");
		bug_ineffective.add("fairy");
		
		ArrayList<String> bug_immune = new ArrayList<String>();

		Pokemon_Type_Constructor bug = new Pokemon_Type_Constructor("bug", bug_superEffective, bug_neutral, bug_ineffective, bug_immune);
		return bug;
	}
	
	public static Pokemon_Type_Constructor rock() 
	{
		ArrayList<String> rock_superEffective = new ArrayList<String>();
		rock_superEffective.add("fire");
		rock_superEffective.add("ice");
		rock_superEffective.add("flying");
		rock_superEffective.add("bug");
		
		ArrayList<String> rock_neutral = new ArrayList<String>();
		rock_neutral.add("normal");
		rock_neutral.add("water");
		rock_neutral.add("electric");
		rock_neutral.add("grass");
		rock_neutral.add("poison");
		rock_neutral.add("psychic");
		rock_neutral.add("rock");
		rock_neutral.add("ghost");
		rock_neutral.add("dragon");
		rock_neutral.add("dark");
		rock_neutral.add("fairy");
		
		ArrayList<String> rock_ineffective = new ArrayList<String>();
		rock_ineffective.add("fighting");
		rock_ineffective.add("ground");
		rock_ineffective.add("steel");
		
		ArrayList<String> rock_immune = new ArrayList<String>();
		
		Pokemon_Type_Constructor rock = new Pokemon_Type_Constructor("rock", rock_superEffective, rock_neutral, rock_ineffective, rock_immune);
		return rock;
	}
	
	public static Pokemon_Type_Constructor ghost() 
	{
		ArrayList<String> ghost_superEffective = new ArrayList<String>();
		ghost_superEffective.add("psychic");
		ghost_superEffective.add("ghost");
		
		ArrayList<String> ghost_neutral = new ArrayList<String>();
		ghost_neutral.add("fire");
		ghost_neutral.add("water");
		ghost_neutral.add("electric");
		ghost_neutral.add("grass");
		ghost_neutral.add("ice");
		ghost_neutral.add("fighting");
		ghost_neutral.add("poison");
		ghost_neutral.add("ground");
		ghost_neutral.add("flying");
		ghost_neutral.add("bug");
		ghost_neutral.add("rock");
		ghost_neutral.add("ghost");
		ghost_neutral.add("dragon");
		ghost_neutral.add("dark");
		ghost_neutral.add("steel");
		ghost_neutral.add("fairy");
		
		ArrayList<String> ghost_ineffective = new ArrayList<String>();
		ghost_ineffective.add("dark");
		
		ArrayList<String> ghost_immune = new ArrayList<String>();
		ghost_immune.add("normal");
		
		Pokemon_Type_Constructor ghost = new Pokemon_Type_Constructor("ghost", ghost_superEffective, ghost_neutral, ghost_ineffective, ghost_immune);
		return ghost;
	}
	
	public static Pokemon_Type_Constructor dragon() 
	{
		ArrayList<String> dragon_superEffective = new ArrayList<String>();
		dragon_superEffective.add("dragon");
		
		ArrayList<String> dragon_neutral = new ArrayList<String>();
		dragon_neutral.add("normal");
		dragon_neutral.add("fire");
		dragon_neutral.add("water");
		dragon_neutral.add("electric");
		dragon_neutral.add("grass");
		dragon_neutral.add("ice");
		dragon_neutral.add("fighting");
		dragon_neutral.add("poison");
		dragon_neutral.add("ground");
		dragon_neutral.add("flying");
		dragon_neutral.add("psychic");
		dragon_neutral.add("bug");
		dragon_neutral.add("rock");
		dragon_neutral.add("ghost");
		dragon_neutral.add("dark");
		
		ArrayList<String> dragon_ineffective = new ArrayList<String>();
		dragon_ineffective.add("steel");
		
		ArrayList<String> dragon_immune = new ArrayList<String>();
		dragon_immune.add("fairy");
		
		Pokemon_Type_Constructor dragon = new Pokemon_Type_Constructor("dragon", dragon_superEffective, dragon_neutral, dragon_ineffective, dragon_immune);
		return dragon;
	}
	
	public static Pokemon_Type_Constructor dark() 
	{
		ArrayList<String> dark_superEffective = new ArrayList<String>();
		dark_superEffective.add("psychic");
		dark_superEffective.add("ghost");
		
		ArrayList<String> dark_neutral = new ArrayList<String>();
		dark_neutral.add("normal");
		dark_neutral.add("fire");
		dark_neutral.add("water");
		dark_neutral.add("electric");
		dark_neutral.add("grass");
		dark_neutral.add("ice");
		dark_neutral.add("poison");
		dark_neutral.add("ground");
		dark_neutral.add("flying");
		dark_neutral.add("bug");
		dark_neutral.add("rock");
		dark_neutral.add("dragon");
		dark_neutral.add("steel");
		
		ArrayList<String> dark_ineffective = new ArrayList<String>();
		dark_ineffective.add("fighting");
		dark_ineffective.add("dark");
		dark_ineffective.add("fairy");
		
		ArrayList<String> dark_immune = new ArrayList<String>();
		
		Pokemon_Type_Constructor dark = new Pokemon_Type_Constructor("dark", dark_superEffective, dark_neutral, dark_ineffective, dark_immune);
		return dark;
	}
	
	public static Pokemon_Type_Constructor steel() 
	{
		ArrayList<String> steel_superEffective = new ArrayList<String>();
		steel_superEffective.add("ice");
		steel_superEffective.add("rock");
		steel_superEffective.add("fairy");
		
		ArrayList<String> steel_neutral = new ArrayList<String>();
		steel_neutral.add("normal");
		steel_neutral.add("grass");
		steel_neutral.add("fighting");
		steel_neutral.add("poison");
		steel_neutral.add("ground");
		steel_neutral.add("flying");
		steel_neutral.add("psychic");
		steel_neutral.add("bug");
		steel_neutral.add("rock");
		steel_neutral.add("ghost");
		steel_neutral.add("dragon");
		steel_neutral.add("dark");
		
		ArrayList<String> steel_ineffective = new ArrayList<String>();
		steel_ineffective.add("fire");
		steel_ineffective.add("water");
		steel_ineffective.add("electric");
		steel_ineffective.add("steel");
		
		ArrayList<String> steel_immune = new ArrayList<String>();
		
		Pokemon_Type_Constructor steel = new Pokemon_Type_Constructor("steel", steel_superEffective, steel_neutral, steel_ineffective, steel_immune);
		return steel;
	}
	
	public static Pokemon_Type_Constructor fairy() 
	{
		ArrayList<String> fairy_superEffective = new ArrayList<String>();
		fairy_superEffective.add("fighting");
		fairy_superEffective.add("dragon");
		fairy_superEffective.add("dark");
		
		ArrayList<String> fairy_neutral = new ArrayList<String>();
		fairy_neutral.add("normal");
		fairy_neutral.add("water");
		fairy_neutral.add("grass");
		fairy_neutral.add("electric");
		fairy_neutral.add("ice");
		fairy_neutral.add("poison");
		fairy_neutral.add("ground");
		fairy_neutral.add("flying");
		fairy_neutral.add("psychic");
		fairy_neutral.add("bug");
		fairy_neutral.add("rock");
		fairy_neutral.add("ghost");
		fairy_neutral.add("fairy");
		
		ArrayList<String> fairy_ineffective = new ArrayList<String>();
		fairy_ineffective.add("fire");
		fairy_ineffective.add("poison");
		fairy_ineffective.add("steel");
		
		ArrayList<String> fairy_immune = new ArrayList<String>();

		Pokemon_Type_Constructor fairy = new Pokemon_Type_Constructor("fairy", fairy_superEffective, fairy_neutral, fairy_ineffective, fairy_immune);
		return fairy;
	}
	
	public static void printTypeChart()
	{
		double[][] typeChart = new double[18][18];
		
		Pokemon_Type_Constructor[] type1 = new Pokemon_Type_Constructor[]{normal(), fire(), water(), electric(), grass(), ice(), fighting(), poison(), ground(), 
									  			flying(), psychic(), bug(), rock(), ghost(), dragon(), dark(), steel(), fairy()};
		
		Pokemon_Type_Constructor[] type2 = new Pokemon_Type_Constructor[]{normal(), fire(), water(), electric(), grass(), ice(), fighting(), poison(), ground(), 
				  								flying(), psychic(), bug(), rock(), ghost(), dragon(), dark(), steel(), fairy()};
		
		for(int i = 0; i < typeChart.length; i++)
		{
			for(int j = 0; j < typeChart.length; j++)
			{
				typeChart[j][i] = type1[i].checkTypeMatchup(type2[j]);
			}
		}
		
		System.out.print("\t" + "\t");
		
		for(int i = 0; i < type1.length; i++)
		{
			if(type1[i].getName().length() > 7)
			{
				System.out.print(type1[i].getName());
			}
			else
			{
				System.out.print(type1[i].getName() + "\t");
			}
			
		}
		
		System.out.println();
		
		for(int i = 0; i < typeChart.length; i++)
		{	
			if(type2[i].getName().length() > 7)
			{
				System.out.print(type2[i].getName() + "\t");
			}
			else
			{
				System.out.print(type2[i].getName() + "\t" + "\t");
			}
			
			for(int j = 0; j < typeChart.length; j++)
			{				
				if(typeChart[i][j] == 1)
				{
					System.out.print("-" + "\t");
				}
				else if(typeChart[i][j] == 0.5)
				{
					System.out.print("not" + "\t");
				}
				else if(typeChart[i][j] == 2)
				{
					System.out.print("super" + "\t");
				}
				else
				{
					System.out.print("immune" + "\t");
				}
			}
			
			System.out.println();
		}
	}
}
