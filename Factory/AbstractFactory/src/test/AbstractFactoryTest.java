package test;

import tableStore.AmericanStyleTableStore;
import tableStore.ChineseStyleTableStore;
import tableStore.FrenchStyleTableStore;
import tableStore.ModernStyleTableStore;
import tableStore.TableStore;

public class AbstractFactoryTest {
	
	public static void main(String[] args) {
		TableStore tableStore;
		
		System.out.println("购买中式日常用桌-------------");
		tableStore = new ChineseStyleTableStore();
		tableStore.orderTable("daily");
		
		System.out.println("购买美式日常用桌-------------");
		tableStore = new AmericanStyleTableStore();
		tableStore.orderTable("daily");
		
		System.out.println("购买法式日常用桌-------------");
		tableStore = new FrenchStyleTableStore();
		tableStore.orderTable("daily");
		
		System.out.println("购买现代风格日常用桌-------------");
		tableStore = new ModernStyleTableStore();
		tableStore.orderTable("daily");
	}

}
