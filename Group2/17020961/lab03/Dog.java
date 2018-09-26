package lap03;

public class Dog {
	private String color;
	private double weight;
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//ham so sanh can nang 
	public boolean weighter(Dog dog){
		if(this.weight > dog.weight) return true;
		return false;
	}
	public void getInfor(){
		System.out.println("color: "+this.color);
		System.out.println("weight: "+this.weight);
		
	}
}
