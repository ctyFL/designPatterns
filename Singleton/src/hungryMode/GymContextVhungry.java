package hungryMode;

/**
 * @author ctyFL
 * 饿汉模式
 * 线程安全，急切需要使用此单件，比较常用，但容易产生垃圾，因为一开始就初始化
 */
public class GymContextVhungry {
	
	private static GymContextVhungry gymContextVhungry = new GymContextVhungry();
	
	private String opentime;
	
	private GymContextVhungry() {
		
	}
	
	public static GymContextVhungry getInstance() {
		return gymContextVhungry;
	}

	public String getOpentime() {
		return opentime;
	}

	public void setOpentime(String opentime) {
		this.opentime = opentime;
	}

}
