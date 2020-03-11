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
		add("卫衣", "黑色", 1);
		add("大衣", "棕色", 1);
		add("毛衣", "白色", 0);
		add("雨衣", "黑色", 0);
		add("衬衫", "红色", 0);
		add("背心", "黄色", 1);
		add("T恤", "蓝色", 1);
		add("牛仔外套", "蓝色", 0);
		add("夹克", "灰色", 1);
		add("卫衣", "绿色", 0);
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
