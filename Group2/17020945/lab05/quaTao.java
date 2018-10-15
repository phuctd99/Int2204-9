public class quaTao extends hoaQua {
	private String color;
	private int quantity;
	public quaTao(){
		new hoaQua();
		color = "";
		quantity = 0;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void getInfo(){
		this.setFruit("qua tao");
		this.setColor("xanh");
		this.setFigure("tron");
		this.setTaste("ngot");
		this.setCost(50000);
		System.out.println("loai qua: "+this.getFruit());
		System.out.println("mau: "+this.getColor());
		System.out.println("hinh dang: "+this.getFigure());
		System.out.println("vi: "+this.getTaste());
		System.out.println("gia: "+this.getCost());
	}
}
