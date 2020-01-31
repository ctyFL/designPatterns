package tableAbstractFactory;

import tableComponent.tableBearing.ModernStyleTableBearing;
import tableComponent.tableBearing.TableBearing;
import tableComponent.tableDeskTop.DeskTop;
import tableComponent.tableDeskTop.ModernStyleDeskTop;
import tableComponent.tableLeg.ModernStyleTableLeg;
import tableComponent.tableLeg.TableLeg;

public class ModernStyleTableFactory implements TableComponentAbstractFactory {

	public DeskTop buildDeskTop() {
		System.out.println("建造现代风格桌面");
		return new ModernStyleDeskTop();
	}
	
	public TableLeg buildTableLeg() {
		System.out.println("建造现代风格桌腿");
		return new ModernStyleTableLeg();
	}
	
	public TableBearing buildTableBearing() {
		System.out.println("建造现代风格桌承");
		return new ModernStyleTableBearing();
	}
	
}
