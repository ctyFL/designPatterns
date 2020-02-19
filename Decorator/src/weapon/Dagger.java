package weapon;

public class Dagger extends Weapon {

	public Dagger() {
		this.name = "匕首";
	}
	
	public void attack() {
		System.out.println(getName() + "普通攻击+1");
	}
}
