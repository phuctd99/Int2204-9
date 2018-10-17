package Cau1;

public class HoaQua {
	
	public int		giaBan;
	public String	nguonGoc;
	public String	ngayNhap;
	public int		soLuong;
	public String	loaiQua;
		
	public HoaQua () {
		this.giaBan		= 0;
		this.nguonGoc	= "";
		this.ngayNhap	= "";
		this.soLuong	= 0;
	}
	
	public HoaQua (int giaBan, String nguonGoc, String ngayNhap, int soLuong, String loaiQua) {
		this.giaBan		= giaBan;
		this.nguonGoc	= nguonGoc;
		this.ngayNhap	= ngayNhap;
		this.soLuong	= soLuong;
		this.loaiQua	= loaiQua;
	}
	// Giá bán
	public int getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(int giaBan) {
		this.giaBan = giaBan;
	}
	// Nguồn gốc
	public String getNguonGoc() {
		return nguonGoc;
	}

	public void setNguonGoc(String nguonGoc) {
		this.nguonGoc = nguonGoc;
	}
	
	// Ngày nhập

	public String getNgayNhap() {
		return ngayNhap;
	}
	
	public void setNgayNhap(String ngayNhap) {
		this.ngayNhap = ngayNhap;
	}

	// Số Lượng
	public int getSoLuong() {
		return soLuong;
	}
	
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	// Loại quả

	public String getLoaiQua() {
		return loaiQua;
	}

	public void setLoaiQua(String loaiQua) {
		this.loaiQua = loaiQua;
	}
	
	public void inThongTin() {
		System.out.println("Loại quả: " + this.loaiQua);
		System.out.println("Nguồn gốc: " + this.nguonGoc);
		System.out.println("Ngày nhập: " + this.ngayNhap);
		System.out.println("Số lượng: " + this.soLuong);
		System.out.println("Giá bán: " + this.giaBan);
	}
}
