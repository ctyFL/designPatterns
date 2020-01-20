package observer;

import subject.Gym;
import subject.Subject;

public class Man implements Observer {

	private String news;
	
	private Subject subject;
	
	public Man(Subject subject) {
		this.subject = subject;
	}
	
	public void joinGym() {
		if(subject != null && subject instanceof Gym) {
			Gym gym = (Gym) subject;
			gym.registerObserver(this);
		}
	}
	
	public void quitGym() {
		if(subject != null && subject instanceof Gym) {
			Gym gym = (Gym) subject;
			gym.removeObserver(this);
		}
	}
	
	@Override
	public void update(Subject subject) {
		if(subject != null && subject instanceof Gym) {
			Gym gym = (Gym) subject;
			System.out.println("man收到新消息！");
			this.news = gym.getNoticeBoard();
			handleMsg(news);
		}
	}
	
	private void handleMsg(String news) {
		if(isCare(news)) {
			System.out.println("man查看商品信息:");
			System.out.println(news);
		}else {
			System.out.println("man不关注此消息。");
		}
	}
	
	private boolean isCare(String news) {
		return news != null && !"".equals(news) && news.indexOf("商品") > -1;
	}
	
}
