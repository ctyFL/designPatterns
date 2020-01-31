package table;

import tableAbstractFactory.TableComponentAbstractFactory;

public class ModernStyleDailyTable extends Table {

	public ModernStyleDailyTable(TableComponentAbstractFactory tableComponentFactory) {
		super(tableComponentFactory);
		this.style = "现代风格";
	}
	
	public void useFor() {
		//日常用桌
	}
	
}
