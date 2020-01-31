package table;

import tableAbstractFactory.TableComponentAbstractFactory;
import tableComponent.tableBearing.TableBearing;
import tableComponent.tableDeskTop.DeskTop;
import tableComponent.tableLeg.TableLeg;

public class Table {

	public String style;
	
	public DeskTop deskTop;//桌面
	
	public TableLeg tableLeg;//桌腿
	
	public TableBearing tableBearing;//桌承
	
	public TableComponentAbstractFactory tableComponentFactory;
	
	public boolean isiInstall = false;
	
	public Table(TableComponentAbstractFactory tableComponentFactory) {
		this.tableComponentFactory = tableComponentFactory;
	}
	
	public void install() {
		deskTop = tableComponentFactory.buildDeskTop();
		tableLeg = tableComponentFactory.buildTableLeg();
		tableBearing = tableComponentFactory.buildTableBearing();
		System.out.println("组装" + getStyle() + "桌子");
		isiInstall = true;
	}
	
	public void sell() {
		if(!isiInstall) {
			System.out.println("请先完成组装桌子");
		}else {
			System.out.println("出售一张" + getStyle() + "的桌子");
		}
	}
	
	public void pack() {
		if(!isiInstall) {
			System.out.println("请先完成组装桌子");
		}else {
			System.out.println("包装");
		}
	}
	
	public void shipment() {
		if(!isiInstall) {
			System.out.println("请先完成组装桌子");
		}else {
			System.out.println("装运");
		}
	}
	
	public String getStyle() {
		return style;
	}
	
}
