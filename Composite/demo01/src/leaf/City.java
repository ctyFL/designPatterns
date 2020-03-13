package leaf;

import component.DistrictComponent;
/**
 * 
 * @author ctyFL
 * 叶子节点-城市
 */
public class City extends DistrictComponent{
	
	public City(String name, String population) {
		this.name = name;
		this.population = population;
	}
	
	@Override
	public void printDescription() {
		printName();
		printPopulation();
	}
	
	@Override
	public void printPopulation() {
		System.out.println(name + "市的人口：" + population);
	}
	
	@Override
	public void printName() {
		System.out.println("该市为：" + name);
	}
	
}
