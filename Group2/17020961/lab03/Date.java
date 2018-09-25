package lap03;

public class Date {
	private String day;
	private String month;
	private String year;
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	//ham kiem tra 
	public boolean sameDate(Date date){
		if(this.day==date.day && this.month==date.month && this.year==date.year)
			return true;
		return false;
	}
	public void getInfor(){
		System.out.println("day: "+this.day);
		System.out.println("month: "+this.month);
		System.out.println("year: "+this.year);
		
	}
	
}
