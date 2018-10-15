package lab05;
public class HoaQua {
	private String loaiQua;
	private String ngayNhap;
	private int soLuong;
	private double gia;
	
	public HoaQua() {
		this.loaiQua = "Qua";
		this.ngayNhap = "";
		this.soLuong = 50;
		this.gia = 50000;
	}
	public String getLoaiQua() {
		return loaiQua;
	}
	public void setLoaiQua(String loaiQua) {
		this.loaiQua = loaiQua;
	}
	public String getNgayNhap() {
		return ngayNhap;
	}
	public void setNgayNhap(String ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	public String getInfo() {
		return("Loai Qua: "+ this.loaiQua +"\nNgay Nhap: " + this.ngayNhap + "\nSo luong: " 
	            + this.soLuong + " qua" + "\nGia ban: " + this.gia + " dong");
	}
}
