package magicComponent;

import weapon.Weapon;

public class Injured extends Magic {

	Weapon weapon;
	
	public Injured(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void attack() {
		weapon.attack();
		System.out.println("��������Ч����ÿ���˺�+1������5��");
	}
}
