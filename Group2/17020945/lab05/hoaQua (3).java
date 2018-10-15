public class hoaQua {
	private String fruit;
	private String figure;
	private String taste;
	private float cost;
	public hoaQua(){
		fruit = "";
		figure = "";
		taste = "";
		cost = 0;
	}
	public hoaQua(String Qua){
		fruit = Qua;
		figure = "";
		taste = "";
		cost = 0;
	}

	public String getFruit() {
		return fruit;
	}

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}

	public String getFigure() {
		return figure;
	}

	public void setFigure(String figure) {
		this.figure = figure;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
}
