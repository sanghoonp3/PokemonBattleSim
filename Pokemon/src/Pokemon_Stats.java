import java.lang.Math;

public class Pokemon_Stats 
{
	private Pokemon_Constructor pokemon;
	private Pokemon_Type_Constructor type1;
	private Pokemon_Type_Constructor type2;
	private Pokemon_Ability_Constructor ability;
	private Pokemon_Ability_Constructor ability2;
	private Pokemon_Ability_Constructor hidden_ability;
	private Nature nature;
	private int[] base_stat;

	public Pokemon_Stats()
	{}
	
	//Do damage calculations at https://bulbapedia.bulbagarden.net/wiki/Statistic#Hit_Points
	
	public Pokemon_Stats(Pokemon_Constructor pokemon, Pokemon_Type_Constructor type1, Pokemon_Type_Constructor type2, Pokemon_Ability_Constructor ability, Nature nature, int[] base_stat)
	{
		this.pokemon = pokemon;
		this.type1 = type1;
		this.type2 = type2;
		this.ability = ability;
		this.nature = nature;
		this.base_stat = base_stat;
	}
		
	public int[] getBaseStats(Pokemon_Stats pokemon)
	{
		return base_stat;
	}
	
	public int getHP(Pokemon_Stats pokemon)
	{
		return base_stat[0];
	}
	
	public int getAttack(Pokemon_Stats pokemon)
	{
		return base_stat[1];
	}
	
	public int getDefense(Pokemon_Stats pokemon)
	{
		return base_stat[2];
	}
	
	public int getSpecialAttack(Pokemon_Stats pokemon)
	{
		return base_stat[3];
	}
	
	public int getSpecialDefense(Pokemon_Stats pokemon)
	{
		return base_stat[4];
	}
	
	public int getSpeed(Pokemon_Stats pokemon)
	{
		return base_stat[5];
	}
	
	public static int calculateHP(int baseHP, int HP_iv, int HP_ev, int level)
	{
		int HP = (int) (Math.floor((((2 * baseHP) + HP_iv + Math.floor(HP_ev / 4)) * level) / 100)) + level + 10;
		return HP;
	}
	
	public static int calculateAttack(int baseAttack, int Attack_iv, int Attack_ev, int level, Nature nature)
	{
		int Attack = (int) Math.floor(Math.floor((((2 * baseAttack + Attack_iv + Math.floor(Attack_ev / 4)) * level) / 100) + 5) * nature.getNatureAttack());
		return Attack;
	}
	
	public static int calculateDefense(int baseDefense, int Defense_iv, int Defense_ev, int level, Nature nature)
	{
		int Defense = (int) Math.floor(Math.floor((((2 * baseDefense+ Defense_iv + Math.floor(Defense_ev / 4)) * level) / 100) + 5) * nature.getNatureDefense());
		return Defense;
	}
	
	public static int calculateSpecialAttack(int baseSpecialAttack, int Special_Attack_iv, int Special_Attack_ev, int level, Nature nature)
	{
		int SpecialAttack = (int) Math.floor(Math.floor((((2 * baseSpecialAttack + Special_Attack_iv + Math.floor(Special_Attack_ev / 4)) * level) / 100) + 5) * nature.getNatureSpecialAttack());
		return SpecialAttack;
	}
	
	public static int calculateSpecialDefense(int baseSpecialDefense, int Special_Defense_iv, int Special_Defense_ev, int level, Nature nature)
	{
		int SpecialDefense = (int) Math.floor(Math.floor((((2 * baseSpecialDefense + Special_Defense_iv + Math.floor(Special_Defense_ev / 4)) * level) / 100) + 5) * nature.getNatureSpecialDefense());
		return SpecialDefense;
	}
	
	public static int calculateSpeed(int baseSpeed, int Speed_iv, int Speed_ev, int level, Nature nature)
	{
		int Speed = (int) Math.floor(Math.floor((((2 * baseSpeed + Speed_iv + Math.floor(Speed_ev / 4)) * level) / 100) + 5) * nature.getNatureSpeed());
		return Speed;
	}
	
	public static void main(String[] args)
	{		
		Pokemon_Constructor Goodra = Pokemon_Database.Goodra();
		Pokemon_Stats goodra = new Pokemon_Stats(Goodra, Goodra.getType1(), null, Goodra.getAbility1(), Nature.modest(), Goodra.getBaseStats());
		int goodraHP = Pokemon_Stats.calculateHP(goodra.getBaseStats(goodra)[0], 31, 4, 100);
		System.out.println(goodraHP);
		
		int goodraAttack = Pokemon_Stats.calculateAttack(goodra.getBaseStats(goodra)[1], 31, 0, 100, Nature.modest());
		System.out.println(goodraAttack);
		
		int goodraDefense = Pokemon_Stats.calculateDefense(goodra.getBaseStats(goodra)[2], 31, 0, 100, Nature.modest());
		System.out.println(goodraDefense);
		
		int goodraSpecialAttack = Pokemon_Stats.calculateSpecialAttack(goodra.getBaseStats(goodra)[3], 31, 252, 100, Nature.modest());
		System.out.println(goodraSpecialAttack);
		
		int goodraSpecialDefense= Pokemon_Stats.calculateSpecialDefense(goodra.getBaseStats(goodra)[4], 31, 0, 100, Nature.modest());
		System.out.println(goodraSpecialDefense);
		
		int goodraSpeed = Pokemon_Stats.calculateSpeed(goodra.getBaseStats(goodra)[5], 31, 252, 100, Nature.modest());
		System.out.println(goodraSpeed);
	}
}
