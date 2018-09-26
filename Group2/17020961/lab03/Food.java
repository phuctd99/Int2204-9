package lap03;

public class Food {
	private String nameOfFood;
	private int cost;
	public String getNameOfFood() {
		return nameOfFood;
	}
	public void setNameOfFood(String nameOfFood) {
		this.nameOfFood = nameOfFood;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	//ham khoi tao
	Food(String name,int cost){
		this.nameOfFood=name;
		this.cost=cost;
	}
	public void getInfor(){
		System.out.println("nameoffood: "+this.nameOfFood);
		System.out.println("cost: "+this.cost);
	}
}
