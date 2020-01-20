package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock {

	private String year;
	private String month;
	private String day;
	private String hour;
	private String minute;
	private String seconds;
	private SimpleDateFormat sdf;
	private Date date;
	private String dateStr;
	
	public Clock() {
		date = new Date();
		sdf = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
		dateStr = sdf.format(date);
	}

	public String getYear() {
		return dateStr.split("-")[0];
	}

	public String getMonth() {
		return dateStr.split("-")[1];
	}

	public String getDay() {
		return dateStr.split("-")[2];
	}

	public String getHour() {
		return dateStr.split("-")[3];
	}

	public String getMinute() {
		return dateStr.split("-")[4];
	}

	public String getSeconds() {
		return dateStr.split("-")[5];
	}
	
	public String getCalendar() {
		return getYear() + "年" + getMonth() + "月" + getDay() + "日";
	}
	
	public String getAllTime() {
		return getCalendar() + " " + getHour() + "时" + getMinute() + "分" + getSeconds() + "秒";
	}
	
}
