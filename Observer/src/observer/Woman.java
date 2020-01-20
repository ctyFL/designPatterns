package observer;

import subject.Gym;
import subject.Subject;

public class Woman implements Observer {

	private String news;
	
	private Subject subject;
	
	public Woman(Subject subject) {
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
			System.out.println("woman收到新消息！");
			this.news = gym.getNoticeBoard();
			handleMsg(news);
		}
	}
	
	private void handleMsg(String news) {
		if(isCare(news)) {
			System.out.println("woman查看课程信息:");
			System.out.println(news);
		}else {
			System.out.println("woman不关注此消息。");
		}
	}
	
	private boolean isCare(String news) {
		return news != null && !"".equals(news) && news.indexOf("课程") > -1;
	}
}
