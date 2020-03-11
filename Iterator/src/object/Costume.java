package object;

public abstract class Costume {

	protected String name;
	protected String type;
	protected String color;
	protected int style;//0:Ůʽ 1:��ʽ
	
	public abstract void preview();
	
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}

	public String getColor() {
		return color;
	}

	public int getStyle() {
		return style;
	}
	
}
