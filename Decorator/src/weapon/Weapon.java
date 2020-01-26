package weapon;

public abstract class Weapon {

	public String name;
	
	public String getName() {
		return name;
	}
	
	public abstract void attack(); 
}
