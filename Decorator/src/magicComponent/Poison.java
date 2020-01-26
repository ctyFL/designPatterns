package magicComponent;

import weapon.Weapon;

public class Poison extends Magic {

	Weapon weapon;
	
	public Poison(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void attack() {
		weapon.attack();
		System.out.println("增加毒属性攻击+3");
	}
	
}
