package module;

public class Chicken extends Meat {

	public Chicken() {
		this.name = "鸡肉";
	}
	
	public void kill() {
		System.out.println("将鸡宰杀");
	}

	public void cutIntoSmallPieces() {
		System.out.println("将鸡肉切块");
	}
	
	public void washClean() {
		System.out.println("洗净");
	}

	public void frozen() {
		System.out.println("冰冻");
	}
	
	public void thaw() {
		System.out.println("解冻");
	}
	
	public void pickled() {
		System.out.println("腌制");
	}
	
	public void blanch() {
		System.out.println("焯水");
	}
	
}
