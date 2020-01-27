package weapon;

import simpleFactory.SimpleWeaponFactory;

public class WeaponStore {
	
	SimpleWeaponFactory simpleWeaponFactory;
	
	Weapon weapon;
	
	public WeaponStore(SimpleWeaponFactory simpleWeaponFactory) {
		this.simpleWeaponFactory = simpleWeaponFactory;
	}

	public Weapon orderWeapon(String professional) {
		weapon = simpleWeaponFactory.createWeapon(professional);
		weapon.cost();
		return weapon;
	}
	
	public void weaponTest(String professional) {
		weapon = simpleWeaponFactory.createWeapon(professional);
		weapon.attack();
	}
	
	
}
