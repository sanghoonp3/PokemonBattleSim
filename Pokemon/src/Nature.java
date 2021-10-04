
public class Nature 
{
	private String name;
	private double attack;
	private double defense;
	private double special_attack;
	private double special_defense;
	private double speed;

	public Nature()
	{
		String name = "";
		double attack = 1;
		double defense = 1;
		double special_attack = 1;
		double special_defense = 1;
		double speed = 1;
	}
	
	public Nature(String name, double attack, double defense, double special_attack, double special_defense, double speed)
	{
		this.name = name;
		this.attack = attack;
		this.defense = defense;
		this.special_attack = special_attack;
		this.special_defense = special_defense;
		this.speed = speed;
	}
	
	public String getNatureName()
	{
		return name;
	}
	
	public double getNatureAttack()
	{
		return attack;
	}
	
	public double getNatureDefense()
	{
		return defense;
	}
	
	public double getNatureSpecialAttack()
	{
		return special_attack;
	}
	
	public double getNatureSpecialDefense()
	{
		return special_defense;
	}
	
	public double getNatureSpeed()
	{
		return speed;
	}

	//Doens't change stats
	public static Nature hardy()
	{
		Nature hardy = new Nature("hardy", 1, 1, 1, 1, 1);
		return hardy;
	}
	
	public static Nature docile()
	{
		Nature docile = new Nature("docile", 1, 1, 1, 1, 1);
		return docile;
	}
	
	public static Nature serious()
	{
		Nature serious = new Nature("serious", 1, 1, 1, 1, 1);
		return serious;
	}
	
	public static Nature basheful()
	{
		Nature basheful = new Nature("basheful", 1, 1, 1, 1, 1);
		return basheful;
	}
	
	public static Nature quirky()
	{
		Nature quirky = new Nature("quirky", 1, 1, 1, 1, 1);
		return quirky;
	}
	
	//Increases Attack
	public static Nature lonely()
	{
		Nature lonely = new Nature("lonely", 1.1, 0.9, 1, 1, 1);
		return lonely;
	}
	
	public static Nature adamant()
	{
		Nature adamant = new Nature("adamant", 1.1, 1, 0.9, 1, 1);
		return adamant;
	}
	
	public static Nature naughty()
	{
		Nature naughty = new Nature("naughty", 1.1, 1, 1, 0.9, 1);
		return naughty;
	}

	public static Nature brave()
	{
		Nature brave = new Nature("brave", 1.1, 1, 1, 1, 0.9);
		return brave;
	}

	//Increases Defense
	public static Nature bold()
	{
		Nature bold = new Nature("bold", 0.9, 1.1, 1, 1, 1);
		return bold;
	}
	
	public static Nature impish()
	{
		Nature impish = new Nature("impish", 1, 1.1, 0.9, 1, 1);
		return impish;
	}
	
	public static Nature lax()
	{
		Nature lax = new Nature("lax", 1, 1.1, 1, 0.9, 1);
		return lax;
	}

	public static Nature relaxed()
	{
		Nature relaxed = new Nature("relaxed", 1, 1.1, 1, 1, 0.9);	
		return relaxed;
	}
	
	//Increases Speed
	public static Nature timid()
	{
		Nature timid = new Nature("timid", 0.9, 1, 1, 1, 1.1);
		return timid;
	}
	
	public static Nature hasty()
	{
		Nature hasty = new Nature("hasty", 1, 0.9, 1, 1, 1.1);
		return hasty;
	}
	
	public static Nature jolly()
	{
		Nature jolly = new Nature("jolly", 1, 1, 0.9, 1, 1.1);
		return jolly;
	}

	public static Nature naive()
	{
		Nature naive = new Nature("naive", 1, 1, 1, 0.9, 1.1);
		return naive;
	}
	
	//Increases Special Attack
	public static Nature modest()
	{
		Nature modest = new Nature("modest", 0.9, 1, 1.1, 1, 1);
		return modest;
	}
	
	public static Nature mild()
	{
		Nature mild = new Nature("mild", 1, 0.9, 1.1, 1, 1);
		return mild;
	}
	
	public static Nature rash()
	{
		Nature rash = new Nature("rash", 1, 1, 1.1, 0.9, 1);
		return rash;
	}

	public static Nature quiet()
	{
		Nature quiet = new Nature("quiet", 1, 1, 1.1, 1, 0.9);
		return quiet;
	}

	//Increases Special Defense
	public static Nature calm()
	{
		Nature calm = new Nature("calm", 0.9, 1, 1, 1.1, 1);
		return calm;
	}
	
	public static Nature gentle()
	{
		Nature gentle = new Nature("gentle", 1, 0.9, 1, 1.1, 1);
		return gentle;
	}
	
	public static Nature careful()
	{
		Nature careful = new Nature("careful", 1, 1, 0.9, 1.1, 1);
		return careful;
	}

	public static Nature sassy()
	{
		Nature sassy = new Nature("sassy", 1, 1, 1, 1.1, 0.9);
		return sassy;
	}
}
