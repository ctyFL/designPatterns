package doubleLockMode;

/**
 * @author ctyFL
 * 双重检查加锁模式
 * 线程安全，延迟初始化。这种方式采用双锁机制，安全且在多线程情况下能保持高性能
 * java5 1.4之前版本此方法失效
 */
public class GymContextVdoubleLock {

	private volatile static GymContextVdoubleLock gymContextVdoubleLock;
	
	private String opentime;
	
	private GymContextVdoubleLock() {
		
	}
	
	public static GymContextVdoubleLock getInstance() {
		if(gymContextVdoubleLock == null) { //如果为NULL则进入同步区块
			synchronized (GymContextVdoubleLock.class) { //只有第一次才彻底执行这里的代码
				if(gymContextVdoubleLock == null) { // 再次检查一次
					gymContextVdoubleLock = new GymContextVdoubleLock();
				}
			}
		}
		return gymContextVdoubleLock;
	}

	public String getOpentime() {
		return opentime;
	}

	public void setOpentime(String opentime) {
		this.opentime = opentime;
	}
	
}
