package weapon;

public class Axe extends Weapon {

	public Axe() {
		this.name = "斧头";
		this.attack = 30;
		this.price = 450;
	}
	
	public void attack() {
		System.out.println(this.name + "近战攻击，造成" + attack + "点伤害");
	}
}
