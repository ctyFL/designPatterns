package facade;

import module.Chicken;
import module.GreenVegetable;
import module.LightSoySauce;
import module.Meat;
import module.Oil;
import module.OldPump;
import module.Pan;
import module.Vegetable;
import module.Salt;
import module.Seasoning;

public class AutoCookingFacade {
	
	private Pan pan;
	private Meat meat;
	private Vegetable vegetable;
	private LightSoySauce lightSoySauce;
	private OldPump oldPump;
	private Salt salt;
	private Oil oil;
	private Seasoning seasoning;

	public AutoCookingFacade(Pan pan, Meat meat, Vegetable vegetable, LightSoySauce lightSoySauce,
			OldPump oldPump, Salt salt, Oil oil, Seasoning seasoning) {
		this.pan = pan;
		this.meat = meat;
		this.vegetable = vegetable;
		this.lightSoySauce = lightSoySauce;
		this.oldPump = oldPump;
		this.salt = salt;
		this.oil = oil;
		this.seasoning = seasoning;
	}
	
	//炖鸡汤
	public void braisedChickenSoup() {
		if(meat instanceof Chicken) {
			meat = new Chicken();
			meat.kill();
			meat.cutIntoSmallPieces();
			meat.washClean();
			meat.blanch();
			
			pan.intoTheMeat(meat);
			pan.addWater();
			
			lightSoySauce.open();
			lightSoySauce.addAScoopOf();
			lightSoySauce.turnOff();
			
			salt.addAnyg(30);
			
			seasoning.add();
			
			pan.stew();
		}else {
			System.out.println("请放入鸡肉");
		}
	}
	
	//炒青菜
	public void friedGreenVegetables() {
		if(vegetable instanceof GreenVegetable) {
			vegetable = new GreenVegetable();
			vegetable.clean();
			
			salt.add10g();
			
			oil.add();
			
			pan.intoVegetables(vegetable);
			
			pan.fried();
		}else {
			System.out.println("请放入青菜");
		}
	}
	
}
