package component;
/**
 * 
 * @author ctyFL
 * ���ڵ�-������������
 */
public abstract class DistrictComponent {
	
	protected String name;
	protected String population;
	protected String description;
	
	//��֦�ڵ���з���-�����ӽڵ�
	public void add(DistrictComponent cityComponent) {
		throw new UnsupportedOperationException();
	}
	
	//��֦�ڵ���з���-ɾ���ӽڵ�
	public void remove(DistrictComponent cityComponent) {
		throw new UnsupportedOperationException();
	}
	
	//��֦�ڵ���з���-�õ��ض��±���ӽڵ�
	public DistrictComponent getChild(int index) {
		throw new UnsupportedOperationException();
	}
	
	//��������
	public void printDescription() {
		throw new UnsupportedOperationException();
	}
	
	//��������
	public void printName() {
		throw new UnsupportedOperationException();
	}
	
	//��������
	public void printPopulation() {
		throw new UnsupportedOperationException();	
	}
	
}
