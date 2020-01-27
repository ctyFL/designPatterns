package ArmorStore;

import armor.Armor;

public abstract class ArmorStore {

	Armor armor;
	
	public Armor sellArmor(String partOfBody) {
		armor = createArmor(partOfBody);
		armor.build();
		armor.protect();
		armor.showAttribute();
		armor.showSkill();
		return armor;
	}
	
	public abstract Armor createArmor(String partOfBody);
	
}
