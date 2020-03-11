package concreteAggregate;

import java.util.ArrayList;
import java.util.List;

import aggregate.Store;
import concretelterator.ClothesStoreIterator;
import iterator.Iterator;
import object.Clothes;

public class ClothesStore implements Store {
	
	List<Clothes> clothes;
	
	public ClothesStore() {
		clothes = new ArrayList<Clothes>();
		add("����", "��ɫ", 1);
		add("����", "��ɫ", 1);
		add("ë��", "��ɫ", 0);
		add("����", "��ɫ", 0);
		add("����", "��ɫ", 0);
		add("����", "��ɫ", 1);
		add("T��", "��ɫ", 1);
		add("ţ������", "��ɫ", 0);
		add("�п�", "��ɫ", 1);
		add("����", "��ɫ", 0);
	}

	private void add(String type, String color, int style) {
		Clothes clo = new Clothes(type, color, style);
		clothes.add(clo);
	}
	
	@Override
	public Iterator createIterator() {
		return new ClothesStoreIterator(clothes);
	}

	public List<Clothes> getClothes() {
		return clothes;
	}
	
}
