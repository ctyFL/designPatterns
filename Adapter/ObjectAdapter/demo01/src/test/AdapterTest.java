package test;

import adaptee.MuLan;
import adaptee.Women;
import adapter.WomanAdapter;
import client.TingChang;
import object.LiSi;
import object.Man;
import object.ZhanSan;

public class AdapterTest {
	
	public static void main(String[] args) {
		TingChang tingChang = new TingChang();
		Man zhansan = new ZhanSan();
		Man lisi = new LiSi();
		Women mulan = new MuLan();
		
		tingChang.conscription(zhansan);
		tingChang.conscription(lisi);
		
		//tingChang.conscription(mulan);
		
		WomanAdapter womanAdapter = new WomanAdapter(mulan);
		tingChang.conscription(womanAdapter);
		
		tingChang.training();
	}

}
