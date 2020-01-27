package weapon;

public abstract class Weapon {
	
	public String name;
	
	public float attack;
	
	public float price;
	
	public String getName() {
		return name;
	}
	
	public void cost() {
		System.out.println("制造一把" + name + "花费" + price + "元");
	}
	
	public abstract void attack();

}
