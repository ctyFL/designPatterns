package template;

public abstract class AbstractFood {
	
	/**
	 * 模板方法-提供食物
	 */
	public final void provid() {
		wash();
		cut();
		cooking();
		if(needSeasoning()) {
			addSeasoning();
		}
		sabot();
	}
	
	/**
	 * 清洗
	 */
	protected void wash() {
		System.out.println("清洗食物");
	}
	
	/**
	 * 切
	 */
	protected abstract void cut();
	
	/**
	 * 烹饪
	 */
	protected abstract void cooking();
	
	/**
	 * 加调料
	 */
	protected void addSeasoning() {
		System.out.println("添加调料");
	}
	
	/**
	 * 装盘
	 */
	protected void sabot() {
		System.out.println("装盘");
	}
	
	/**
	 * 钩子
	 * 是否需要加调料
	 * @return
	 */
	protected boolean needSeasoning() {
		return true;
	}
	
}
