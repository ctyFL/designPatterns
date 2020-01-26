package magicComponent;

import weapon.Weapon;

public class Injured extends Magic {

	Weapon weapon;
	
	public Injured(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void attack() {
		weapon.attack();
		System.out.println("增加受伤效果，每秒伤害+1，持续5秒");
	}
}
