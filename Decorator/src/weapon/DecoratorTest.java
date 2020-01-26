package weapon;

import magicComponent.Fire;
import magicComponent.Ice;
import magicComponent.Injured;
import magicComponent.Poison;

public class DecoratorTest {

	public static void main(String[] args) {
		//银剑
		System.out.println("银剑==================");
		Weapon SilverSword = new SilverSword();
		SilverSword.attack();
		System.out.println("---------------------");
		
		//增加火属性
		SilverSword = new Fire(SilverSword);
		SilverSword.attack();
		System.out.println("---------------------");
		
		//增加冰属性
		SilverSword = new Ice(SilverSword);
		SilverSword.attack();
		System.out.println("---------------------");
		
		//增加受伤效果
		SilverSword = new Injured(SilverSword);
		SilverSword.attack();
		
		//弓箭
		System.out.println("弓箭==================");
		Weapon bow = new Bow();
		bow.attack();
		System.out.println("---------------------");
		
		//增加毒属性
		bow = new Poison(bow);
		bow.attack();
		System.out.println("---------------------");
		
		//增加受伤效果
		bow = new Injured(bow);
		bow.attack();
		
	}
	
}
