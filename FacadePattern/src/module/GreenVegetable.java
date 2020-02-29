package module;

public class GreenVegetable extends Vegetable {

	public GreenVegetable() {
		this.name = "青菜";
	}
	
	public void clean() {
		System.out.println("将青菜洗净");
	}
	
	public void cut() {
		System.out.println("切菜");
	}
	
	public void pickled() {
		System.out.println("腌制");
	}
	
}
