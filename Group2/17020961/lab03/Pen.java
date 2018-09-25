package lap03;

public class Pen {
	private String color;
	private String type;
	private int cost;
	public void setColor(String s){
		this.color=s;
	}
	public String getColor(){
		return this.color;
	}
	public void setType(String s){
		this.type=s;
	}
	public String getType(){
		return this.type;
	}
	public void setCost(int x){
		this.cost=x;
	}
	public int getCost(){
		return this.cost;
	}
	//so sanh mau sac
	public boolean sameColor(Pen pen){
		if(this.color == pen.color) return true;
		return false;
	}
	//in ra thong tin
	public void getInfor(){
		System.out.println("color: "+this.color);
		System.out.println("type: "+this.type);
		System.out.println("cost: "+this.cost);
	}
}
