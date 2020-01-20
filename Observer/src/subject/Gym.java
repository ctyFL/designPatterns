package subject;

import java.util.ArrayList;
import java.util.List;

import observer.Observer;
import util.Clock;

public class Gym implements Subject {
	
	private String name;
	private String address;
	private String openTime;
	private List<String> goods;
	private List<String> schedule;
	private String noticeBoard;
	private List<Observer> members;
	private String historyLog;
	private Clock clock;
	
	public Gym() {
		name = "FLbrotherhood";
		address = "china";
		openTime = "7:00am~22:00pm";
		noticeBoard = "暂无公告";
		historyLog = "";
		goods = new ArrayList<String>();
		schedule = new ArrayList<String>();
		members = new ArrayList<Observer>(); 
	}		
	
	@Override
	public void registerObserver(Observer o) {
		members.add(o);
	}
	
	@Override
	public void removeObserver(Observer o) {
		int index = members.indexOf(o);
		if(index > -1) {
			members.remove(o);
		}
	}
	
	@Override
	public void notifyObserver() {
		for(Observer o : members) {
			o.update(this);
		}
	}
	
	public void notice() {
		notifyObserver();
	}
	
	public void launchNewCourse(String courseName) {
		schedule.add(courseName);
		noticeBoard = getTime() + "：新课程上线：" + courseName;
		historyLog += noticeBoard + "\n";
		notice();
	}
	
	public void endCoach(String courseName) {
		int index = schedule.indexOf(courseName);
		if(index > -1) {
			schedule.remove(courseName);
		}
		noticeBoard = getTime() + "：课程结束：" + courseName;
		historyLog += noticeBoard + "\n";
		notice();
	}
	
	public void addGoods(String goodsName) {
		goods.add(goodsName);
		noticeBoard = getTime() + "：新商品上架：" + goodsName;
		historyLog += noticeBoard + "\n";
		notice();
	}
	
	public void removeGoods(String goodsName) {
		int index = goods.indexOf(goodsName);
		if(index > -1) {
			goods.remove(goodsName);
		}
		noticeBoard = getTime() + "商品；" + goodsName + "已售完";
		historyLog += noticeBoard + "\n";
		notice();
	}
	
	public void showLog() {
		System.out.println(historyLog);
	}
	
	private String getTime() {
		clock = new Clock();
		return clock.getAllTime();
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getOpenTime() {
		return openTime;
	}

	public List<String> getGoods() {
		return goods;
	}

	public List<String> getSchedule() {
		return schedule;
	}

	public String getNoticeBoard() {
		return noticeBoard;
	}

	public List<Observer> getMembers() {
		return members;
	}

	public String getHistoryLog() {
		return historyLog;
	}
	
}
