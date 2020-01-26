package magicComponent;

import weapon.Weapon;

public class Ice extends Magic {

	Weapon weapon;
	
	public Ice(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void attack() {
		weapon.attack();
		System.out.println("���ӱ����Թ���+2");
	}
}
