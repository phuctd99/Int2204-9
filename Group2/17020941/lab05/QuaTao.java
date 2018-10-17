package bai1;

public class QuaTao extends HoaQua {
	private String taste;
	
	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public QuaTao(String color, String taste, double gia) {
		this.setCost(gia); 
		this.setTaste(taste);
		this.setColor(color);
		
	}
	public double tinhTien() {
		System.out.print("nhap so can tao: ");
		int can = this.input.nextInt();
		return can * this.getCost();
	}
	public void printQuaTao() {
		System.out.println("thong tin qua tao: ");
		System.out.println("gia ban: " + this.getCost());
		System.out.println("mui vi: " + this.getTaste());
		System.out.println("gia ban: " + this.getCost());
		System.out.println(this.tinhTien());
	}
}
