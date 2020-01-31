package table;

import tableAbstractFactory.TableComponentAbstractFactory;

public class AmericanStyleDailyTable extends Table {

	public AmericanStyleDailyTable(TableComponentAbstractFactory tableComponentFactory) {
		super(tableComponentFactory);
		this.style = "美式风格";
	}
	
	public void useFor() {
		//日常用桌
	}
	
}
