package lap03;

public class Car {
	private String color;
	private int speed;
	private int cost;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	//ham so sanh toc do
	public boolean faster(Car car){
		if(this.speed > car.speed) return true;
		return false;
	}
	//ham in thong tin
	public void getInfor(){
		System.out.println("color: "+this.color);
		System.out.println("speed: "+this.speed);
		System.out.println("cost: "+this.cost);
	}
}
