package table;

import tableAbstractFactory.TableComponentAbstractFactory;

public class ChineseStyleDailyTable extends Table {

	public ChineseStyleDailyTable(TableComponentAbstractFactory tableComponentFactory) {
		super(tableComponentFactory);
		this.style = "中式风格";
	}
	
	public void useFor() {
		//日常用桌
	}
	
}
