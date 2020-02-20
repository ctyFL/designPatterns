package receiver;
/**
 * 
 * @author ctyFL
 * 风扇
 */

import java.util.HashMap;
import java.util.Map;

public abstract class Fan {

	public static final int HIGH = 3;
	
	public static final int MEDIUM = 2;
	
	public static final int LOW = 1;
	
	public static final int OFF = 0;
	
	public static Map<Integer, String> fanSpeedMap;
	
	static {
		fanSpeedMap = new HashMap<Integer, String>();
		fanSpeedMap.put(1, "低速");
		fanSpeedMap.put(2, "中速");
		fanSpeedMap.put(3, "高速");
	}
	
	public int speed = OFF;
	
	public void on() {
		speed = LOW;
		System.out.println("电扇启动");
	}
	
	public void off() {
		speed = OFF;
		System.out.println("电扇关闭");
	}
	
	public void setSpeedHigh() {
		speed = HIGH;
		setSpeed(speed);
	}
	
	public void setSpeedMedium() {
		speed = MEDIUM;
		setSpeed(speed);
	}
	
	public void setSpeedLow() {
		speed = LOW;
		setSpeed(speed);
	}
	
	private void setSpeed(int speed) {
		System.out.println("风速调整为" + fanSpeedMap.get(speed));
	}
	
	public int getSpeed() {
		return speed;
	}
	
}
