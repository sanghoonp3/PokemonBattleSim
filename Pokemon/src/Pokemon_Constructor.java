
public class Pokemon_Constructor 
{
	private String name;
	private Pokemon_Type_Constructor type1;
	private Pokemon_Type_Constructor type2;
	private Pokemon_Ability_Constructor ability;
	private Pokemon_Ability_Constructor ability2;
	private Pokemon_Ability_Constructor hidden_ability;
	private int[] base_stat;
	
	public Pokemon_Constructor()
	{
		String name = ""; //1
		String type1 = ""; //2
		String type2 = ""; //3
		String ability = ""; //4
		String ability2 = ""; //5
		String hidden_ability = ""; //6
		int[] base_stat = {1, 1, 1, 1, 1, 1}; //7-12
	}
	
	public Pokemon_Constructor(String name, Pokemon_Type_Constructor type1, Pokemon_Type_Constructor type2, Pokemon_Ability_Constructor ability, Pokemon_Ability_Constructor ability2, Pokemon_Ability_Constructor hidden_ability, int[] base_stat)
	{
		this.name = name;
		this.type1 = type1;
		this.type2 = type2;
		this.ability = ability;
		this.ability2 = ability2;
		this.hidden_ability = hidden_ability;
		this.base_stat = base_stat;
	}
	
	public String getName()
	{
		return name;
	}
	
	public Pokemon_Type_Constructor getType1()
	{
		return type1;
	}
	
	public Pokemon_Type_Constructor getType2()
	{
		return type2;
	}
	
	public Pokemon_Ability_Constructor getAbility1()
	{
		return ability;
	}
	
	public Pokemon_Ability_Constructor getAbility2()
	{
		return ability2;
	}
	
	public Pokemon_Ability_Constructor getHiddenAbility()
	{
		return hidden_ability;
	}
	
	public int[] getBaseStats()
	{
		return base_stat;
	}
}
