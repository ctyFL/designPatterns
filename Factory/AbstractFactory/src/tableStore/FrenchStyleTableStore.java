package tableStore;

import table.FrenchStyleDailyTable;
import table.Table;
import tableAbstractFactory.FrenchStyleTableFactory;
import tableAbstractFactory.TableComponentAbstractFactory;

public class FrenchStyleTableStore extends TableStore {
	
	public Table createTable(String useFor) {
		TableComponentAbstractFactory tableComponentFactory = new FrenchStyleTableFactory();
		if("daily".equals(useFor)) {
			table = new FrenchStyleDailyTable(tableComponentFactory);
		}else if("office".equals(useFor)) {
			//...法式办公用桌
		}else if("Computer".equals(useFor)) {
			//...法式电脑桌
		}else if ("tool".equals(useFor)) {
			//...法式工具台
		}
		return table;
	}

}
