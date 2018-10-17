package lab05;

public class CamCaoPhong extends QuaCam{
	private String dacDiem;
	public CamCaoPhong() {
		super();
		this.dacDiem = "mau vang dam, co hat, mui thom nong";
	}
	public String getDacDiem() {
		return dacDiem;
	}
	public void setDacDiem(String dacDiem) {
		this.dacDiem = dacDiem;
	}
	public void GetInfo() {
		this.setLoaiQua("Cam cao phong");
		this.setNgayNhap("07/10/2018");
		this.setSoLuong(150);
		this.setGia(65000);
		System.out.println(this.getInfo());
		System.out.println("Dac diem: " + this.dacDiem);
    }
}
