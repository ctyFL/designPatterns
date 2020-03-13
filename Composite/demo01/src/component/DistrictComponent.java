package component;
/**
 * 
 * @author ctyFL
 * 根节点-行政区抽象类
 */
public abstract class DistrictComponent {
	
	protected String name;
	protected String population;
	protected String description;
	
	//树枝节点独有方法-增加子节点
	public void add(DistrictComponent cityComponent) {
		throw new UnsupportedOperationException();
	}
	
	//树枝节点独有方法-删除子节点
	public void remove(DistrictComponent cityComponent) {
		throw new UnsupportedOperationException();
	}
	
	//树枝节点独有方法-得到特定下标的子节点
	public DistrictComponent getChild(int index) {
		throw new UnsupportedOperationException();
	}
	
	//公共方法
	public void printDescription() {
		throw new UnsupportedOperationException();
	}
	
	//公共方法
	public void printName() {
		throw new UnsupportedOperationException();
	}
	
	//公共方法
	public void printPopulation() {
		throw new UnsupportedOperationException();	
	}
	
}
