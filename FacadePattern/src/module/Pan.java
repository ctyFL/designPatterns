package module;

public class Pan {

	public void addWater() {
		System.out.println("加水");
	}
	
	public void intoTheMeat(Meat meat) {
		System.out.println("锅中放入" + meat.name);
	}
	
	public void intoVegetables(Vegetable vegetable) {
		System.out.println("锅中放入" + vegetable.name);
	}
	
	public void fried() {
		System.out.println("炒");
	}
	
	public void steamed() {
		System.out.println("蒸");
	}
	
	public void stew() {
		System.out.println("炖");
	}
	
}
