package object;

public class Clothes extends Costume {
	
	public Clothes(String type, String color, int style) {
		this.name = "衣服";
		this.type = type;
		this.color = color;
		this.style = style;
	}
	
	public void preview() {
		String sty = style==0?"女":"男";
		System.out.println("此" + name + "类型为：" + type + "，颜色为：" + color + "，款式为；" + sty + "款。");
	}
	
}
