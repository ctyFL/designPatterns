package weapon;

import simpleFactory.SimpleWeaponFactory;

public class WeaponStore {
	
	SimpleWeaponFactory simpleWeaponFactory;
	
	Weapon weapon;
	
	public WeaponStore(SimpleWeaponFactory simpleWeaponFactory) {
		this.simpleWeaponFactory = simpleWeaponFactory;
	}

	public void orderWeapon(String professional) {
		weapon = simpleWeaponFactory.createWeapon(professional);
		weapon.cost();
	}
	
	public void weaponTest(String professional) {
		weapon = simpleWeaponFactory.createWeapon(professional);
		weapon.attack();
	}
	
	
}
