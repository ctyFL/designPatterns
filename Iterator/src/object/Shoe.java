package object;

public class Shoe extends Costume {

	public Shoe(String type, String color, int style) {
		this.name = "Ь��";
		this.type = type;
		this.color = color;
		this.style = style;
	}
	
	public void preview() {
		String sty = style==0?"Ů":"��";
		System.out.println("��˫" + color + "��" + name + "����ʽΪ��" + sty + "�");
	}
	
}
