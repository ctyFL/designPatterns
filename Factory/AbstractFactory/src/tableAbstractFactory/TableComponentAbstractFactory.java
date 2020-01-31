package tableAbstractFactory;

import tableComponent.tableBearing.TableBearing;
import tableComponent.tableDeskTop.DeskTop;
import tableComponent.tableLeg.TableLeg;

public interface TableComponentAbstractFactory {

	DeskTop buildDeskTop();
	
	TableLeg buildTableLeg();
	
	TableBearing buildTableBearing();
	
}
