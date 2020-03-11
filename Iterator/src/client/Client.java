package client;

import aggregate.Store;
import iterator.Iterator;
import object.Costume;

public class Client {

	public void shopping(Store store) {
		Iterator iterator = store.createIterator();
		while(iterator.hasNext()) {
			Costume costume = (Costume) iterator.next();
			costume.preview();
		}
	}
	
}
