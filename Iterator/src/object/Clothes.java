package object;

public class Clothes extends Costume {
	
	public Clothes(String type, String color, int style) {
		this.name = "�·�";
		this.type = type;
		this.color = color;
		this.style = style;
	}
	
	public void preview() {
		String sty = style==0?"Ů":"��";
		System.out.println("��" + name + "����Ϊ��" + type + "����ɫΪ��" + color + "����ʽΪ��" + sty + "�");
	}
	
}
