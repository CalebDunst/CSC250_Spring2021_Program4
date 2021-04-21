public class HearthstoneCard 
{
	private Object cost;
	private Object attack;
	private Object health;
	private Object name;
	
	public HearthstoneCard(Object name, Object cost, Object attack, Object health)
	{
		this.cost = cost;
		this.attack = attack;
		this.health = health;
		this.name = name;
	}
	
	//setters allow us to conditionally change the value of a private member
	public void setName(String name)
	{
		if(name.length() >= 5)
		{
			this.name = name;
		}
	}
	
	void display()
	{
		System.out.println("Name: " + this.name + "\nCost" + this.cost + "\nAttack: " + this.attack + " Health: " + this.health);
		//System.out.format("Name: %s \nCost: %d \nAttack: %d Defense: %d\n", this.name, this.cost, this.attack,this.health);
	}
}