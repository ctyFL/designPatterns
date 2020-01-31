package tableStore;

import table.ChineseStyleDailyTable;
import table.Table;
import tableAbstractFactory.ChineseStyleTableFactory;
import tableAbstractFactory.TableComponentAbstractFactory;

public class ChineseStyleTableStore extends TableStore {

	public Table createTable(String useFor) {
		TableComponentAbstractFactory tableComponentFactory = new ChineseStyleTableFactory();
		if("daily".equals(useFor)) {
			table = new ChineseStyleDailyTable(tableComponentFactory);
		}else if("office".equals(useFor)) {
			//...中式办公用桌
		}else if("Computer".equals(useFor)) {
			//...中式电脑桌
		}else if ("tool".equals(useFor)) {
			//...中式工具台
		}
		return table;
	}
	
}
