package client;
/**
 * 
 * @author ctyFL
 * 亭长
 */

import java.util.ArrayList;
import java.util.List;
import object.Man;

public class TingChang {
	
	List<Man> soldiers;
	
	public TingChang() {
		soldiers = new ArrayList<Man>();
	}
	
	//征兵
	public void conscription(Man man) {
		soldiers.add(man);
	} 
	
	//训练
	public void training() {
		if(soldiers != null && soldiers.size() > 0) {
			for(Man man : soldiers) {
				man.powerfulAttack();
			}
		}else {
			System.out.println("还没有招募到士兵");
		}
	}
	
}
