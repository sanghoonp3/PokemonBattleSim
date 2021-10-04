
public class Pokemon_Ability_Constructor 
{
	private String name;
	private String effect;
	private String generation;
	
	public Pokemon_Ability_Constructor()
	{}
	
	public Pokemon_Ability_Constructor(String name, String effect, String generation)
	{
		this.name = name;
		this.effect = effect;
		this.generation = generation;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getEffect()
	{
		return effect;
	}
}
