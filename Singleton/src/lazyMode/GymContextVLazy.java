package lazyMode;

/**
 * @author ctyFL
 * 懒汉模式
 * 线程不安全，延迟初始化，严格意义上不是不是单例模式
 */
public class GymContextVLazy {

	private static GymContextVLazy gymContextVLazy;
	
	private String opentime;
	
	private GymContextVLazy() {
		
	}
	
	public static GymContextVLazy getInstance() {
		if(gymContextVLazy == null) {
			gymContextVLazy = new GymContextVLazy();
		}
		return gymContextVLazy;
	}

	public String getOpentime() {
		return opentime;
	}

	public void setOpentime(String opentime) {
		this.opentime = opentime;
	}
	
}
