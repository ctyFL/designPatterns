package concreteAggregate;

import aggregate.Store;
import concretelterator.ShoeStoreIterator;
import iterator.Iterator;
import object.Shoe;

public class ShoeStore implements Store {
	
	private static final int MAX_SIZE = 9;
	private Shoe[] shoes;
	private int index;
	
	public ShoeStore() {
		index = 0;
		shoes = new Shoe[MAX_SIZE];
		importShoe("靴子", "黑色", 1);
		importShoe("运动鞋", "白色", 1);
		importShoe("高跟鞋", "红色", 0);
		importShoe("拖鞋", "灰色", 0);
		importShoe("登山鞋", "黑色", 1);
		importShoe("马丁靴", "棕色", 1);
		importShoe("靴子", "黑色", 0);
	}
	
	private void importShoe(String type, String color, int style) {
		Shoe shoe = new Shoe(type, color, style);
		if(index < shoes.length) {
			shoes[index] = shoe;
			index ++;
		}else {
			System.err.println("满了");
		}
	}
	
	@Override
	public Iterator createIterator() {
		return new ShoeStoreIterator(shoes);
	}

	public Shoe[] getShoes() {
		return shoes;
	}
	
}
