package lap03;

public class Teacher {
	private int age;
	private double height;
	private double weight;
	private String subject;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	//ham khoi tao
	Teacher(int age,double height,double weight,String subject){
		this.age=age;
		this.height=height;
		this.weight=weight;
		this.subject=subject;
	}
	//in thong tin
	public void getInfor(){
		System.out.println("age: "+this.age);
		System.out.println("height: "+this.height);
		System.out.println("weight: "+this.weight);
		System.out.println("Subject: "+this.subject);
		
	}
}
