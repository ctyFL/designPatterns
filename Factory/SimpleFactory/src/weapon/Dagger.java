package weapon;

public class Dagger extends Weapon {

	public Dagger() {
		this.name = "匕首";
		this.attack = 27;
		this.price = 400;
	}

	public void attack() {
		System.out.println(this.name + "偷袭，造成" + this.attack + "点伤害");
	}
	
}
