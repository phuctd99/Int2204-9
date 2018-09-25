// class mo ta ve thuoc ban tren thi truong
public class Thuoc {
	// khai bao cac thuoc tinh
	private String tenThuoc;
	private String NSX;
	private String HSD;
	private String diaChi;
	private float gia;
	// phuong thuc sao chep
	public Thuoc(String tenThuoc, String NSX, String HSD, String diaChi, float gia) {
		this.tenThuoc = tenThuoc;
		this.NSX = NSX;
		this.HSD = HSD;
		this.diaChi = diaChi;
		this.gia = gia;
	}
	// gan gia tri cho thuoc tinh
	public void setTen(String tenThuoc) { 
		this.tenThuoc = tenThuoc;
	}
	public void setNSX(String NSX) {
		this.NSX = NSX;
	}
	public void setHSD(String HSD) {
		this.HSD = HSD;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public void setGia(float gia) {
		this.gia = gia;
	}
	// tra ve gia tri
	public String getTen() {
		return tenThuoc;
	}
	public String getNSX() {
		return NSX;
	}
	public String getHSD() {
		return HSD;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public float getGia() {
		return gia;
	}
	
	public String getInfo() {
		return("Ten thuoc: " + this.tenThuoc + ", NSX: " + this.NSX + ", HSD: " + this.HSD 
				+ ", Dia chi: " + this.diaChi + ", Gia ban: " + this.gia);
	}
}
