package concretelterator;

import iterator.Iterator;
import object.Shoe;

public class ShoeStoreIterator implements Iterator {

	private Shoe[] shoes;
	private int index;
	
	public ShoeStoreIterator(Shoe[] shoes) {
		index = 0;
		this.shoes = shoes;
	}
	
	@Override
	public boolean hasNext() {
		if(shoes[index] != null && index < shoes.length) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public Object next() {
		Shoe shoe = shoes[index];
		index ++;
		return shoe;
	}
	
}
