package lab05;

public class QuaTao extends HoaQua{
	private double canNang;
	public QuaTao() {
		super();
		this.canNang = 300;
	}
	public double getCanNang() {
		return canNang;
	}
	public void setCanNang(double canNang) {
		this.canNang = canNang;
	}
	public void GetInfo() {
		this.setLoaiQua("Qua tao");
		this.setNgayNhap("10/10/2018");
		this.setSoLuong(100);
		this.setGia(60000);
		System.out.println(this.getInfo());
		System.out.println("Can nang 1 qua: " + this.canNang + " gam");
	}
}
