package object;

public class Shoe extends Costume {

	public Shoe(String type, String color, int style) {
		this.name = "鞋子";
		this.type = type;
		this.color = color;
		this.style = style;
	}
	
	public void preview() {
		String sty = style==0?"女":"男";
		System.out.println("这双" + color + "的" + name + "，款式为：" + sty + "款。");
	}
	
}
