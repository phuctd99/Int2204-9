package lap03;

public class Exam {
	private double point;
	private int timeExam;
	private int numberquestion;
	public double getTimeExam() {
		return timeExam;
	}
	public void setTimeExam(int time) {
		this.timeExam = time;
	}
	public double getPoint() {
		return point;
	}
	public void setPoint(double point) {
		this.point = point;
	}
	public int getNumberquestion() {
		return numberquestion;
	}
	public void setNumberquestion(int numberquestion) {
		this.numberquestion = numberquestion;
	}
	//ham kiem tra pass
	public boolean pass(){
		if(this.point >= 4.0)return true;
		return false;
	}
	//tinh thoi gian cho 1 cau hoi
	public double timeToOneQuestion(){
		return (this.timeExam*1.0/this.numberquestion);
	}
	//ham in thong tin
	public void getInfor(){
		System.out.println("point: "+this.point);
		System.out.println("timeExam: "+this.timeExam);
		System.out.println("numberquestion: "+this.numberquestion);
		
	}
}
