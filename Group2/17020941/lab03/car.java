package bai3;

public class car {
	private String name;
	private double cost;
	private double speed;
	public String getName() { 
		return name;
	}
	public void setName(String name) { 
		this.name = name;
	}
	public double getCost() { 
		return cost;
	}
	public void setCost(double cost) { 
		this.cost = cost;
	}
	public double getSpeed() { 
		return speed;
	}
	public void setSpeed(double speed) { 
		this.speed = speed;
	}
	public int carFaster(car car2) {
		if (this.speed > car2.getSpeed()) {
			return 1; // if carfaster return 1 that mean car 1 faster than car 2
		} 
		else if (this.speed == car2.getSpeed()) {
			return 0; // 
		}else {
			return -1; // car 2 faster than car 1
		}
	}
	car(String name, double cost, double speed) {
		this.name = name;
		this.cost = cost;
		this.speed = speed;	
	}
	public void printInfo() {
		System.out.println(this.name + " " + this.cost + " " + this.speed);
	}
	public void findCar (int cost){
		// tim xe co gia duoi muc gia cho truoc
		if (this.cost <= cost) {
			printInfo();
		}
	}
}
