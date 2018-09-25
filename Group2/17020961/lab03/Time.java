package lap03;

public class Time {
	private int second;
	private int minute;
	private int hour;
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public boolean sameTime(Time time){
		if(this.second==time.second && this.minute==time.minute && this.hour==time.hour)
			return true;
		return false;
	}
	public void getInfor(){
		System.out.println("second: "+this.second);
		System.out.println("minute: "+this.minute);
		System.out.println("hour: "+this.hour);
		
	}
}
