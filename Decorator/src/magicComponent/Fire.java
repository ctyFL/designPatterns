package magicComponent;

import weapon.Weapon;

public class Fire extends Magic {

	Weapon weapon;
	
	public Fire(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void attack() {
		weapon.attack();
		System.out.println("���ӻ����Թ���+2");
	}
}
