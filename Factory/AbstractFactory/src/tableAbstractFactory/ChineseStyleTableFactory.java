package tableAbstractFactory;

import tableComponent.tableBearing.ChineseStyleTableBearing;
import tableComponent.tableBearing.TableBearing;
import tableComponent.tableDeskTop.ChineseStyleDeskTop;
import tableComponent.tableDeskTop.DeskTop;
import tableComponent.tableLeg.ChineseStyleTableLeg;
import tableComponent.tableLeg.TableLeg;

public class ChineseStyleTableFactory implements TableComponentAbstractFactory {

	public DeskTop buildDeskTop() {
		System.out.println("建造中式风格桌面");
		return new ChineseStyleDeskTop();
	}
	
	public TableLeg buildTableLeg() {
		System.out.println("建造中式风格桌腿");
		return new ChineseStyleTableLeg();
	}
	
	public TableBearing buildTableBearing() {
		System.out.println("建造中式风格桌承");
		return new ChineseStyleTableBearing();
	}
	
}
