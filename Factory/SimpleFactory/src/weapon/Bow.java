package weapon;

public class Bow extends Weapon {

	public Bow() {
		this.name = "弓";
		this.attack = 17;
		this.price = 300;
	}

	public void attack() {
		System.out.println(this.name + "远程攻击，造成" + this.attack + "点伤害");
	}
	
}
