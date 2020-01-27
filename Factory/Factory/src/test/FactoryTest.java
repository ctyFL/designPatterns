package test;

import ArmorStore.ArmorStore;
import ArmorStore.AssassinArmorStore;
import ArmorStore.WarriorArmorStore;
import ArmorStore.knightArmorStore;
import armor.Armor;

public class FactoryTest {

	public static void main(String args[]) {
		
		Armor armor;
		
		//查看并购买刺客装备
		ArmorStore armorStore = new AssassinArmorStore();
		armor = armorStore.sellArmor("hand");
		
		//查看并购买战士装备
		armorStore = new WarriorArmorStore();
		armor = armorStore.sellArmor("body");
		
		//查看并购买骑士装备
		armorStore = new knightArmorStore();
		armor = armorStore.sellArmor("foot");
	}
	
}
