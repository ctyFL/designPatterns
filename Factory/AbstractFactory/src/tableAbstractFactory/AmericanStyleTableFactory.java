package tableAbstractFactory;

import tableComponent.tableBearing.AmericanStyleTableBearing;
import tableComponent.tableBearing.TableBearing;
import tableComponent.tableDeskTop.AmericanStyleDeskTop;
import tableComponent.tableDeskTop.DeskTop;
import tableComponent.tableLeg.AmericanStyleTableLeg;
import tableComponent.tableLeg.TableLeg;

public class AmericanStyleTableFactory implements TableComponentAbstractFactory {

	public DeskTop buildDeskTop() {
		System.out.println("建造美式风格桌面");
		return new AmericanStyleDeskTop();
	}
	
	public TableLeg buildTableLeg() {
		System.out.println("建造美式风格桌腿");
		return new AmericanStyleTableLeg();
	}
	
	public TableBearing buildTableBearing() {
		System.out.println("建造美式风格桌承");
		return new AmericanStyleTableBearing();
	}
	
}
