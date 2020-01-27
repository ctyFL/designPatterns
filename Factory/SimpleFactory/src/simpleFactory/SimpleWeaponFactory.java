package simpleFactory;

import weapon.Axe;
import weapon.Bow;
import weapon.Dagger;
import weapon.Sword;
import weapon.Weapon;

public class SimpleWeaponFactory {
	
	private Weapon weapon;
	
	public Weapon createWeapon(String professional) {
		if("assassin".equals(professional)) {
			weapon = new Dagger();
		}else if("warrior".equals(professional)) {
			weapon = new Axe();
		}else if("knight".equals(professional)) {
			weapon = new Sword();
		}else if("ranger".equals(professional)) {
			weapon = new Bow();
		}
		return weapon;
	}
}
