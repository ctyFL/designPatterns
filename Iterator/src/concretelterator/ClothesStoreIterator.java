package concretelterator;

import java.util.List;

import iterator.Iterator;
import object.Clothes;

public class ClothesStoreIterator implements Iterator {

	private List<Clothes> clothes;
	private int index;
	
	public ClothesStoreIterator(List<Clothes> clothes) {
		index = 0;
		this.clothes = clothes;
	}
	
	@Override
	public boolean hasNext() {
		if(index < clothes.size() && clothes.get(index) != null) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public Object next() {
		Clothes clo = clothes.get(index);
		index ++;
		return clo;
	}
	
}
