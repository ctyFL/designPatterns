package test;

import simpleFactory.SimpleWeaponFactory;
import weapon.WeaponStore;

public class SimpleFactoryTest {
	
	public static void main(String[] args) {
		SimpleWeaponFactory simpleWeaponFactory = new SimpleWeaponFactory();
		WeaponStore weaponStore = new WeaponStore(simpleWeaponFactory);
		weaponStore.weaponTest("assassin");
		weaponStore.weaponTest("warrior");
		weaponStore.weaponTest("knight");
		weaponStore.weaponTest("ranger");
		weaponStore.orderWeapon("knight");
	}

}
