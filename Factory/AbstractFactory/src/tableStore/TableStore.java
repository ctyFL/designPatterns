package tableStore;

import table.Table;

public abstract class TableStore {
	
	public Table table;
	
	public Table orderTable(String useFor) {
		table = createTable(useFor);
		table.install();
		table.sell();
		table.pack();
		table.shipment();
		return table;
	}

	public abstract Table createTable(String useFor);
	
}
