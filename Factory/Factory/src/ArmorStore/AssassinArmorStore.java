package ArmorStore;

import armor.Armor;
import armor.LightArmguard;
import armor.LightArmour;
import armor.LightBoot;

public class AssassinArmorStore extends ArmorStore {
	
	Armor armor;
	
	public Armor createArmor(String partOfBody) {
		if("body".equals(partOfBody)) {
			armor = new LightArmour();
		}else if("hand".equals(partOfBody)) {
			armor = new LightArmguard();
		}else if("foot".equals(partOfBody)) {
			armor = new LightBoot();
		}
		return armor;
	}

}
