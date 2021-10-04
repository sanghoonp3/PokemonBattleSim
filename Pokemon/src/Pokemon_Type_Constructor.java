import java.util.ArrayList;

public class Pokemon_Type_Constructor 
{	
	private String type_name;
	private ArrayList<String> type_superEffective;
	private ArrayList<String> type_neutral;
	private ArrayList<String> type_ineffective;
	private ArrayList<String> type_immune;
	
	public Pokemon_Type_Constructor()
	{
	}
	
	public Pokemon_Type_Constructor(String name, ArrayList<String> superEffective, ArrayList<String> neutral, ArrayList<String> ineffective, ArrayList<String> noEffect)
	{
		type_name = name;
		type_superEffective = superEffective;
		type_neutral = neutral;
		type_ineffective = ineffective;
		type_immune = noEffect;
	}

	public ArrayList<String> getSuperEffective()
	{
		return type_superEffective;
	}
	
	public ArrayList<String> getNeutral()
	{
		return type_neutral;
	}
	
	public ArrayList<String> getIneffective()
	{
		return type_ineffective;
	}
	
	public ArrayList<String> getImmune()
	{
		return type_immune;
	}
	
	public String getName()
	{
		return type_name;
	}
	
	public double checkTypeMatchup(Pokemon_Type_Constructor type)
	{
		double damageModifier = 1.0;
		
		if(type_superEffective.contains(type.getName()))
		{
			damageModifier = 2.0;
			return damageModifier;
		}
		else if(type_neutral.contains(type.getName()))
		{
			damageModifier = 1.0;
			return damageModifier;
		}
		else if(type_ineffective.contains(type.getName()))
		{
			damageModifier = 0.5;
			return damageModifier;
		}
		else
		{
			damageModifier = 0;
			return damageModifier;
		}
	}
	
	public double checkDoubleTypeMatchup(Pokemon_Type_Constructor type1, Pokemon_Type_Constructor type2)
	{
		double damageModifierType1 = 1.0;
		double damageModifierType2 = 1.0;
		
		if(type1 == null)
		{
			damageModifierType1 = 1;
		}
		else
		{

			if(type_superEffective.contains(type1.getName()))
			{
				damageModifierType1 = 2.0;
			}
			else if(type_neutral.contains(type1.getName()))
			{
				damageModifierType1 = 1.0;
			}
			else if(type_ineffective.contains(type1.getName()))
			{
				damageModifierType1 = 0.5;
			}
			else
			{
				damageModifierType1 = 0;
			}
		}
		
		if(type2 == null)
		{
			damageModifierType2 = 1;
		}
		else
		{
			if(type_superEffective.contains(type2.getName()))
			{
				damageModifierType2 = 2.0;
			}
			else if(type_neutral.contains(type2.getName()))
			{
				damageModifierType2 = 1.0;
			}
			else if(type_ineffective.contains(type2.getName()))
			{
				damageModifierType2 = 0.5;
			}
			else
			{
				damageModifierType2 = 0;
			}
		}
		
		double finalDamageModifier = damageModifierType1 * damageModifierType2;
		return finalDamageModifier;
	}
}
