package test;

import facade.AutoCookingFacade;
import module.Chicken;
import module.GreenVegetable;
import module.LightSoySauce;
import module.Meat;
import module.Oil;
import module.OldPump;
import module.Pan;
import module.Salt;
import module.Seasoning;
import module.Vegetable;

public class SmartHome {
	
	public static void main(String[] args) {
		Pan pan = new Pan();
		Meat meat = new Chicken();
		Vegetable vegetable = new GreenVegetable();
		LightSoySauce lightSoySauce = new LightSoySauce();
		OldPump oldPump = new OldPump();
		Salt salt = new Salt();
		Oil oil = new Oil();
		Seasoning seasoning = new Seasoning();
		
		AutoCookingFacade autoCookingFacade =
				new AutoCookingFacade(pan, meat, vegetable, lightSoySauce, oldPump, salt, oil, seasoning);
		
		autoCookingFacade.braisedChickenSoup();
		
		autoCookingFacade.friedGreenVegetables();
	}

}
