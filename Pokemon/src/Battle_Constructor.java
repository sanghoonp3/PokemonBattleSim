import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class Battle_Constructor 
{
	public Battle_Constructor()
	{}
	
	public static void main(String[] args) throws IOException
	{
		Pokemon_Constructor dragapult = Pokemon_Database.Dragapult();		
		Pokemon_Constructor tyranitar = Pokemon_Database.Tyranitar();
		Pokemon_Constructor goodra = Pokemon_Database.Goodra();
		ArrayList<Pokemon_Move_Constructor> move = Pokemon_Move_Database.All_Pokemon_Move_Database(); 
		Pokemon_Move_Constructor attack = move.get(625);
		
		for(int i = 0; i < dragapult.getBaseStats().length; i++)
		{
			System.out.println(dragapult.getBaseStats()[i]);
		}		
		
		System.out.println();
		
		for(int i = 0; i < tyranitar.getBaseStats().length; i++)
		{
			System.out.println(tyranitar.getBaseStats()[i]);
		}		

		System.out.print("\n");
		
		double testDamage = baseDamageCalculator(Integer.parseInt(attack.getBasePower()), attack, dragapult, tyranitar);
		System.out.println(testDamage);
		double testDamage2 = baseDamageCalculator(Integer.parseInt(attack.getBasePower()), attack, dragapult, goodra);
		System.out.println(testDamage2);
	}
	
	public static double round(double number)
	{
		if((number - Math.floor(number)) < 0.5)
		{
			number = Math.floor(number);
		}
		else
		{
			number = Math.round(number);
		}
		return number;
	}
	
	public static double pokeRound(double number)
	{
		if((number - Math.floor(number)) <= 0.5)
		{
			number = Math.floor(number);
		}
		else
		{
			number = Math.round(number);
		}
		return number;
	}
	
	public static double floor(double number)
	{
		return Math.floor(number);
	}
	
	
	public static double singleModifierCalculator(double oldValue, double modifier)
	{
		return pokeRound(oldValue * modifier / 4096);
	}
	
	public static double combinedModifierCalculator(double oldCombinedModifier, double nextModifier)
	{
		return Math.round(oldCombinedModifier * nextModifier / 4096);
	}
	
	public static double baseDamageCalculator(int level, Pokemon_Move_Constructor attack, Pokemon_Constructor offensePokemon, Pokemon_Constructor defensePokemon)
	{
		double power = Double.parseDouble(attack.getBasePower());
		double AttOrSpA = 0;
		double DefOrSpDef = 0;

		if(attack.getCategory().toLowerCase().equals("physical"))
		{
			AttOrSpA = (double) offensePokemon.getBaseStats()[1];
			DefOrSpDef = (double) defensePokemon.getBaseStats()[2];
		}
		else if(attack.getCategory().toLowerCase().equals("special"))
		{
			AttOrSpA = (double) offensePokemon.getBaseStats()[3];
			DefOrSpDef = (double) defensePokemon.getBaseStats()[4];
		}
		
		double x = floor(((2.0 * level) / 5.0) + 2);
		double y = floor((x * power * AttOrSpA) / DefOrSpDef);
		double z = floor(y / 50.0) + 2;

		return z;
	}
	
	public static double isSpread(Boolean check)
	{
		if(check == true)
		{
			return 0.75;
		}
		else
		{
			return 1;
		}
	}
	
	public static double weather(Pokemon_Move_Constructor move, String weather)
	{
		if(weather.equals("rain"))
		{
			if(move.getType().getName().equals("water"))
			{
				return 1.5;
			}
			else if(move.getType().getName().equals("fire"))
			{
				return 0.5;
			}
			else
			{
				return 1;
			}
		}
		else if(weather.equals("sun"))
		{
			if(move.getType().getName().equals("water"))
			{
				return 0.5;
			}
			else if(move.getType().getName().equals("fire"))
			{
				return 1.5;
			}
			else
			{
				return 1;
			}
		}
		else
		{
			return 1;
		}
	}
	
	public static double isCrit(Boolean check)
	{
		if(check == true)
		{
			return 1.5;
		}
		else
		{
			return 1;
		}
	}
	
	//Remember to floor after you multiply by the current damage
	public static double randomFactor()
	{
		Random rand = new Random();
		int randomInt = rand.nextInt(16);
		System.out.println(randomInt);
		double randomDamage = (100.0 - randomInt) / 100.0;
		return randomDamage;
	}
	
	public static double isSTAB(Pokemon_Constructor offense, Pokemon_Move_Constructor move)
	{
		if(move.getType().getName().equals(offense.getType1().getName()) || move.getType().getName().equals(offense.getType2().getName()))
		{
			return 1.5;
		}
		else
		{
			return 1;
		}
	}
	
	public static double typeMatchup(Pokemon_Move_Constructor attack, Pokemon_Constructor pokemon)
	{
		if(pokemon.getType2() == null)
		{
			double modifier = attack.getType().checkTypeMatchup(pokemon.getType1());
			return modifier;
		}
		else
		{
			double modifier = attack.getType().checkDoubleTypeMatchup(pokemon.getType1(), pokemon.getType2());
			return modifier;
		}
	}
	
	public static double isBurned(Pokemon_Move_Constructor move, Boolean burned)
	{
		if(move.getCategory().equals("physical") && (burned == true))
		{
			return 0.5;
		}
		else
		{
			return 1;
		}
	}
	
	public static double oneDamageCheck(double damage)
	{
		if(damage == 0)
		{
			return 1;
		}
		else
		{
			return damage;
		}
	}
	
	public static double maxDamageCheck(double damage)
	{
		if(damage >= 65535)
		{
			damage = damage % 65535;
		}
		return damage;
	}
}
