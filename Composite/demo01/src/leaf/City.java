package leaf;

import component.DistrictComponent;
/**
 * 
 * @author ctyFL
 * Ҷ�ӽڵ�-����
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
		System.out.println(name + "�е��˿ڣ�" + population);
	}
	
	@Override
	public void printName() {
		System.out.println("����Ϊ��" + name);
	}
	
}
