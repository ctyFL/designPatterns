package adapter;

import adaptee.Women;
import object.Man;
/**
 * 
 * @author ctyFL
 * 适配器
 */
public class WomanAdapter implements Man {

	Women women;
	
	public WomanAdapter(Women women) {
		this.women = women;
	}
	
	@Override
	public void powerfulAttack() {
		for(int i=0; i<3; i++) {
			women.gentleAttack();
		}
	}
	
}
