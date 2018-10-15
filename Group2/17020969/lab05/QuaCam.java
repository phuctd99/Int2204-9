package lab05;

public class QuaCam extends HoaQua{
	private String nguonGoc;
	private double canNang;
	public QuaCam() {
		super();
		this.nguonGoc ="";
		this.canNang = 400;
	}
	public double getCanNang() {
		return canNang;
	}
	public void setCanNang(double canNang) {
		this.canNang = canNang;
	}
	public String getNguonGoc() {
		return nguonGoc;
	}

	public void setNguonGoc(String nguonGoc) {
		this.nguonGoc = nguonGoc;
	}
	public void GetInfo() {
		this.setLoaiQua("Qua tao");
		this.setNgayNhap("10/10/2018");
		this.setSoLuong(100);
		this.setGia(60000);
		this.nguonGoc = "Hoa Binh";
		System.out.println(this.getInfo());
		System.out.println("Nguon goc: " + this.nguonGoc);
		System.out.println("Can nang 1 qua: " + this.canNang + " gam");
	}
}
