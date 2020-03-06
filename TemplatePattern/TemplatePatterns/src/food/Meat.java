package food;

import template.AbstractFood;

public class Meat extends AbstractFood {

	/**
	 * 是否清淡
	 */
	private boolean isLight = false;
	
	@Override
	protected void cut() {
		System.out.println("把肉剁成多块");
	}
	
	@Override
	protected void cooking() {
		System.out.println("加油，加酱油、辣椒爆炒");
	}
	
	@Override
	protected boolean needSeasoning() {
		if(isLight) {
			return false;
		}else {
			return true;
		}
	}

	public boolean isLight() {
		return isLight;
	}

	public void setLight(boolean isLight) {
		this.isLight = isLight;
	}
	
}
