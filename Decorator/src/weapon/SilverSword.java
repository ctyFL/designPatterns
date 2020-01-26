package weapon;

public class SilverSword extends Weapon {
	
	public SilverSword() {
		this.name = "银剑";
	}
	
	public void attack() {
		System.out.println(getName() +  "普通攻击+3");
	}

}
