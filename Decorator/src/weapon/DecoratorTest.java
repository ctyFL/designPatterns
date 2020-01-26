package weapon;

import magicComponent.Fire;
import magicComponent.Ice;
import magicComponent.Injured;
import magicComponent.Poison;

public class DecoratorTest {

	public static void main(String[] args) {
		//����
		System.out.println("����==================");
		Weapon SilverSword = new SilverSword();
		SilverSword.attack();
		System.out.println("---------------------");
		
		//���ӻ�����
		SilverSword = new Fire(SilverSword);
		SilverSword.attack();
		System.out.println("---------------------");
		
		//���ӱ�����
		SilverSword = new Ice(SilverSword);
		SilverSword.attack();
		System.out.println("---------------------");
		
		//��������Ч��
		SilverSword = new Injured(SilverSword);
		SilverSword.attack();
		
		//����
		System.out.println("����==================");
		Weapon bow = new Bow();
		bow.attack();
		System.out.println("---------------------");
		
		//���Ӷ�����
		bow = new Poison(bow);
		bow.attack();
		System.out.println("---------------------");
		
		//��������Ч��
		bow = new Injured(bow);
		bow.attack();
		
	}
	
}
