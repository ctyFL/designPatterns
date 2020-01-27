package weapon;

public class Sword extends Weapon {

	public Sword() {
		this.name = "剑";
		this.attack = 29;
		this.price = 500;
	}
	
	public void attack() {
		System.out.println(this.name + "近战攻击，造成" + this.attack + "点伤害");
	}
}
