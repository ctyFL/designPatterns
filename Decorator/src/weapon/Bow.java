package weapon;

public class Bow extends Weapon {

	public Bow() {
		this.name = "弓";
	}
	
	public void attack() {
		System.out.println("普通攻击+1");
	}
}
