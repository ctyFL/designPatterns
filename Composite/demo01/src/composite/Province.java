package composite;

import java.util.ArrayList;
import java.util.List;

import component.DistrictComponent;
import leaf.City;

/**
 * 
 * @author ctyFL
 * 树枝节点-省份
 */
public class Province extends DistrictComponent {

	private List<DistrictComponent> cities;
	private String name;
	private String population;
	
	public Province(String name, String population) {
		cities = new ArrayList<DistrictComponent>();
		this.name = name;
		this.population = population;
	}
	
	@Override
	public void add(DistrictComponent cityComponent) {
		cities.add(cityComponent);
	}
	
	@Override
	public void remove(DistrictComponent cityComponent) {
		cities.remove(cityComponent);
	}
	
	@Override
	public DistrictComponent getChild(int index) {
		return cities.get(index);
	}

	@Override
	public void printDescription() {
		printName();
		printPopulation();
		for(DistrictComponent district : cities) {
			district.printDescription();
		}
	}
	
	@Override
	public void printPopulation() {
		System.out.println(name + "省的人口为：" + population);
	}
	
	@Override
	public void printName() {
		System.out.println("该省为：" + name);
	}
}
