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
		importShoe("ѥ��", "��ɫ", 1);
		importShoe("�˶�Ь", "��ɫ", 1);
		importShoe("�߸�Ь", "��ɫ", 0);
		importShoe("��Ь", "��ɫ", 0);
		importShoe("��ɽЬ", "��ɫ", 1);
		importShoe("��ѥ", "��ɫ", 1);
		importShoe("ѥ��", "��ɫ", 0);
	}
	
	private void importShoe(String type, String color, int style) {
		Shoe shoe = new Shoe(type, color, style);
		if(index < shoes.length) {
			shoes[index] = shoe;
			index ++;
		}else {
			System.err.println("����");
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
