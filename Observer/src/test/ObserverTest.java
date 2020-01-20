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
		System.out.println("��Ϣ1��--------------------");
		gym.launchNewCourse("���٤");
		
		System.out.println("��Ϣ2��--------------------");
		gym.addGoods("ŷ������");
		
		System.out.println("��Ϣ3��--------------------");
		gym.addGoods("֧��������");
		
		System.out.println("��Ϣ4��--------------------");
		gym.removeGoods("ŷ������");
		
		System.out.println("��Ϣ5��--------------------");
		gym.endCoach("���٤");
		
		System.out.println("��Ϣ6��--------------------");
		gym.launchNewCourse("������");
		
		woman.quitGym();
		System.out.println("��Ϣ7��--------------------");
		gym.addGoods("�Ȱ�����");
		
		System.out.println("��Ϣ8��--------------------");
		gym.endCoach("������");
		
		System.out.println("-------------------------");
		gym.showLog();
	}
	
}
