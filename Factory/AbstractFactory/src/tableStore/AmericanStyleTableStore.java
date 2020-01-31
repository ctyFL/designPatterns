package tableStore;

import table.AmericanStyleDailyTable;
import table.Table;
import tableAbstractFactory.AmericanStyleTableFactory;
import tableAbstractFactory.TableComponentAbstractFactory;

public class AmericanStyleTableStore extends TableStore {

	public Table createTable(String useFor) {
		TableComponentAbstractFactory tableComponentFactory = new AmericanStyleTableFactory();
		if("daily".equals(useFor)) {
			table = new AmericanStyleDailyTable(tableComponentFactory);
		}else if("office".equals(useFor)) {
			//...美式办公用桌
		}else if("Computer".equals(useFor)) {
			//...美式电脑桌
		}else if ("tool".equals(useFor)) {
			//...美式工具台
		}
		return table;
	}
	
}
