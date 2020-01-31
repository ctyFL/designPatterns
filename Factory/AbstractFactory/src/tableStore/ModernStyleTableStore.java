package tableStore;

import table.ModernStyleDailyTable;
import table.Table;
import tableAbstractFactory.ModernStyleTableFactory;
import tableAbstractFactory.TableComponentAbstractFactory;

public class ModernStyleTableStore extends TableStore {

	public Table createTable(String useFor) {
		TableComponentAbstractFactory tableComponentFactory = new ModernStyleTableFactory();
		if("daily".equals(useFor)) {
			table = new ModernStyleDailyTable(tableComponentFactory);
		}else if("office".equals(useFor)) {
			//...现代风格办公用桌
		}else if("Computer".equals(useFor)) {
			//...现代风格电脑桌
		}else if ("tool".equals(useFor)) {
			//...现代风格工具台
		}
		return table;
	}
	
}
