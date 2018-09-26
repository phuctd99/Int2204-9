// class ve cac hang dien tu khach hang muon mua 
public class HangDienTu {
	// tao ra cac thuoc tinh ten hang dien tu, ten san pham, mau cua san pham, dia chi san xuat, gia ban cua class
	private String tenHang;
	private String tenSP;
	private String mauSP;
	private String diaChi;
	private double gia;
	// phuong thuc khoi tao sao chep
	public HangDienTu(String tenHang, String tenSP, String mauSP, String diaChi, double gia) {
		this.tenHang = tenHang;
		this.tenSP = tenSP;
		this.mauSP = mauSP;
		this.diaChi = diaChi;
		this.gia = gia;
	}
	// gan gia tri tham so vao cac thuoc tinh
	public void setTen(String tenHang) { 
		this.tenHang = tenHang;
	}
	public void setNSX(String tenSP) {
		this.tenSP =tenSP;
	}
	public void setHSD(String mauSP) {
		this.mauSP =mauSP;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	// phuong thuc tra ve gia tri cac thuoc tinh
	public String getTen() {
		return tenHang;
	}
	public String getNSX() {
		return tenSP;
	}
	public String getHSD() {
		return mauSP;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public double getGia() {
		return gia;
	}
	
	public String getInfo() {
		return("Ten hang san phan duoc chon: " + this.tenHang + ", ten SP: " + this.tenSP + ", mau SP: " + this.mauSP
				+ ", Dia chi SX: " + this.diaChi + ", Gia ban: " + this.gia + " dong");
	}
}
