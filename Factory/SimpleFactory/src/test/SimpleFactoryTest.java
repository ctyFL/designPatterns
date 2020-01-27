package test;

import simpleFactory.SimpleWeaponFactory;
import weapon.Weapon;
import weapon.WeaponStore;

public class SimpleFactoryTest {
	
	public static void main(String[] args) {
		Weapon weapon;
		SimpleWeaponFactory simpleWeaponFactory = new SimpleWeaponFactory();
		WeaponStore weaponStore = new WeaponStore(simpleWeaponFactory);
		weaponStore.weaponTest("assassin");
		weaponStore.weaponTest("warrior");
		weaponStore.weaponTest("knight");
		weaponStore.weaponTest("ranger");
		//确认选择骑士武器
		weapon = weaponStore.orderWeapon("knight");
	}

}
