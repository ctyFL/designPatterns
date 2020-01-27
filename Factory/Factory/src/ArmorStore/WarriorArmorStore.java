package ArmorStore;

import armor.Armor;
import armor.Cuirass;
import armor.Gauntlet;
import armor.LegGuard;

public class WarriorArmorStore extends ArmorStore {
	
	Armor armor;
	
	public Armor createArmor(String partOfBody) {
		if("body".equals(partOfBody)) {
			armor = new Cuirass();
		}else if("hand".equals(partOfBody)) {
			armor = new Gauntlet();
		}else if("foot".equals(partOfBody)) {
			armor = new LegGuard();
		}
		return armor;
	}

}
