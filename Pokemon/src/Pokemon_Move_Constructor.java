
public class Pokemon_Move_Constructor 
{
	String name;
	Pokemon_Type_Constructor type;
	String category;
	String pp;
	String base_power;
	String accuracy;	
	String effect;
	
	public Pokemon_Move_Constructor()
	{}
	
	public Pokemon_Move_Constructor(String name, Pokemon_Type_Constructor type, String category, String pp, String base_power, String accuracy, String effect)
	{
		this.name = name;
		this.type = type;
		this.category = category;
		this.pp = pp;
		this.base_power = base_power;
		this.accuracy = accuracy;
		this.effect = effect;
	}
	
	public String getName()
	{
		return name;
	}
	
	public Pokemon_Type_Constructor getType()
	{
		return type;
	}
	
	public String getCategory()
	{
		return category;
	}
	
	public String getPP()
	{
		return pp;
	}
	
	public String getBasePower()
	{
		return base_power;
	}
	
	public String getAccuracy()
	{
		return accuracy;
	}
	
	public String getEffect()
	{
		return effect;
	}
}
