// class ve sach
public class BOOK {
	// tạo các thuộc tính loại sách, tên sách, tuổi phù hợp, giá bán cho class BOOK
	private String loaiSach;
	private String tenSach;
	private int tuoiPhuHop;
	private double gia;
	
	// sao chép thông tin 
	public BOOK(String loaiSach, String tenSach, int tuoiPhuHop, double gia) {
		this.loaiSach = loaiSach;
		this.tenSach = tenSach;
		this.tuoiPhuHop = tuoiPhuHop;
		this.gia = gia;
	}
	// gán giá trị của biến vào các thuộc tính
	public void setTen(String loaiSach) { 
		this.loaiSach = loaiSach;
	}
	public void setNSX(String tenSach) {
		this.tenSach = tenSach;
	}
	public void setHSD(int tuoiPhuHop) {
		this.tuoiPhuHop = tuoiPhuHop;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	// phuong thuc tra gia tri của cac thuoc tinh trong class BOOK
	public String getTen() {
		return loaiSach;
	}
	public String getNSX() {
		return tenSach;
	}
	public int getHSD() {
		return tuoiPhuHop;
	}
	public double getGia() {
		return gia;
	}
	
	public String getInfo() {
		return("Loai Sach: " + this.loaiSach + ", Ten sach: " + this.tenSach 
				+ ", Lua tuoi phu hop: " + this.tuoiPhuHop + ", Gia ban: " + this.gia +" dong");
	}
}
