package table;

import tableAbstractFactory.TableComponentAbstractFactory;

public class FrenchStyleDailyTable extends Table {

	public FrenchStyleDailyTable(TableComponentAbstractFactory tableComponentFactory) {
		super(tableComponentFactory);
		this.style = "法式风格";
	}
	
	public void useFor() {
		//日常用桌
	}
	
}
