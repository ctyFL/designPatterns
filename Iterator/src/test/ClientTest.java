package test;

import aggregate.Store;
import client.Client;
import concreteAggregate.ClothesStore;
import concreteAggregate.ShoeStore;

public class ClientTest {

	public static void main(String[] args) {
		Store clothesStore = new ClothesStore();
		Store shoeStore = new ShoeStore();
		Client client = new Client();
		
		client.shopping(clothesStore);
		client.shopping(shoeStore);
	}
	
}
