package client;

import food.Meat;
import food.Vegetable;

public class TemplateTest {
	
	public static void main(String[] args) {
		Vegetable vegetable = new Vegetable();
		vegetable.provid();
		System.out.println("");
		
		Meat meat = new Meat();
		meat.provid();
		System.out.println("");
		
		meat.setLight(true);//换清单口味
		meat.provid();
	}
	
}
