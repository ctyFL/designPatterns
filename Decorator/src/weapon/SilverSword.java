package weapon;

public class SilverSword extends Weapon {
	
	public SilverSword() {
		this.name = "����";
	}
	
	public void attack() {
		System.out.println(getName() +  "��ͨ����+3");
	}

}
