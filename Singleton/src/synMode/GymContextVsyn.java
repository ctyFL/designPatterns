package synMode;

/**
 * @author ctyFL
 * 加同步锁
 * 线程安全，但是大大影响性能
 */
public class GymContextVsyn {

	private static GymContextVsyn gymContextVsyn;
	
	private String opentime;
	
	private GymContextVsyn() {
		
	}
	
	public static synchronized GymContextVsyn getInstance() {
		if(gymContextVsyn == null) {
			gymContextVsyn = new GymContextVsyn();
		}
		return gymContextVsyn;
	}

	public String getOpentime() {
		return opentime;
	}

	public void setOpentime(String opentime) {
		this.opentime = opentime;
	}
	
}
