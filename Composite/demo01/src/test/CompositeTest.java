package test;

import component.DistrictComponent;
import composite.Province;
import leaf.City;

public class CompositeTest {

	public static void main(String[] args) {
		DistrictComponent china = new Province("china", "1.4B");
		DistrictComponent zhejiang = new Province("zhejiang", "5000W");
		DistrictComponent shanghai = new City("shanghai", "2000W");
		DistrictComponent hangzhou = new City("hangzhou", "450W");
		DistrictComponent ningbo = new City("ningbo", "300W");
		DistrictComponent jinghua = new City("jinghua", "200W");
		DistrictComponent shaoxin = new City("shaoxin", "200W");
		DistrictComponent zhoushan = new City("zhoushan", "200W");
		DistrictComponent chongqing = new City("chongqing", "3000W");
		DistrictComponent taiwan = new City("taiwan", "30W");
		
		china.add(zhejiang);
		china.add(taiwan);
		china.add(shanghai);
		china.add(chongqing);
		zhejiang.add(hangzhou);
		zhejiang.add(ningbo);
		zhejiang.add(jinghua);
		zhejiang.add(zhoushan);
		zhejiang.add(shaoxin);
		
		china.printDescription();
	}
	
}
