package magicComponent;

import weapon.Weapon;

public class Poison extends Magic {

	Weapon weapon;
	
	public Poison(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void attack() {
		weapon.attack();
		System.out.println("���Ӷ����Թ���+3");
	}
	
}
