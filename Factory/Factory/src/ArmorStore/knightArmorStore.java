package ArmorStore;

import armor.Armor;
import armor.HeavyArmor;
import armor.HeavyBoot;
import armor.HeavyHand;


public class knightArmorStore extends ArmorStore {

	Armor armor;
	
	public Armor createArmor(String partOfBody) {
		if("body".equals(partOfBody)) {
			armor = new HeavyArmor();
		}else if("hand".equals(partOfBody)) {
			armor = new HeavyHand();
		}else if("foot".equals(partOfBody)) {
			armor = new HeavyBoot();
		}
		return armor;
	}
	
}
