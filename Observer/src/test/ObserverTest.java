package test;

import observer.Man;
import observer.Woman;
import subject.Gym;

public class ObserverTest {

	public static void main(String args[]) {
		Gym gym = new Gym();
		Woman woman = new Woman(gym);
		Man man = new Man(gym);
		woman.joinGym();
		man.joinGym();
		System.out.println("消息1：--------------------");
		gym.launchNewCourse("流瑜伽");
		
		System.out.println("消息2：--------------------");
		gym.addGoods("欧普特萌");
		
		System.out.println("消息3：--------------------");
		gym.addGoods("支链氨基酸");
		
		System.out.println("消息4：--------------------");
		gym.removeGoods("欧普特萌");
		
		System.out.println("消息5：--------------------");
		gym.endCoach("流瑜伽");
		
		System.out.println("消息6：--------------------");
		gym.launchNewCourse("普拉提");
		
		woman.quitGym();
		System.out.println("消息7：--------------------");
		gym.addGoods("谷氨酰胺");
		
		System.out.println("消息8：--------------------");
		gym.endCoach("普拉提");
		
		System.out.println("-------------------------");
		gym.showLog();
	}
	
}
