package weapon;

public class Axe extends Weapon {

	public Axe() {
		this.name = "��ͷ";
		this.attack = 30;
		this.price = 450;
	}
	
	public void attack() {
		System.out.println(this.name + "��ս���������" + attack + "���˺�");
	}
}
