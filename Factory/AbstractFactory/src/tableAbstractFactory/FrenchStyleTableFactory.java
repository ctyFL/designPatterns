package tableAbstractFactory;

import tableComponent.tableBearing.FrenchStyleTableBearing;
import tableComponent.tableBearing.TableBearing;
import tableComponent.tableDeskTop.DeskTop;
import tableComponent.tableDeskTop.FrenchStyleDeskTop;
import tableComponent.tableLeg.FrenchStyleTableLeg;
import tableComponent.tableLeg.TableLeg;

public class FrenchStyleTableFactory implements TableComponentAbstractFactory {

	public DeskTop buildDeskTop() {
		System.out.println("建造法式风格桌面");
		return new FrenchStyleDeskTop();
	}
	
	public TableLeg buildTableLeg() {
		System.out.println("建造法式风格桌腿");
		return new FrenchStyleTableLeg();
	}
	
	public TableBearing buildTableBearing() {
		System.out.println("建造法式风格桌承");
		return new FrenchStyleTableBearing();
	}
	
}
