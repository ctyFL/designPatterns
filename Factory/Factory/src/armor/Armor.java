package armor;

public abstract class Armor {

	public String name;
	public float defense;
	public float cost;
	public String attribute;
	public String skill;
	
	public void build() {
		System.out.println("制造一件" + this.name + "花费" + cost + "元");
	}
	
	public void protect() {
		System.out.println("防御力：" + this.defense);
	}
	
	public void showAttribute() {
		System.out.println(this.attribute);
	}
	
	public void showSkill() {
		System.out.println(this.skill);
	}
	
	public String getName() {
		return name;
	}
	
}
