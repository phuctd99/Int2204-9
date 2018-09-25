// class thông tin lập trình viên
public class NhanVien {
	// khoi tao cac thuoc tinh thuoc class ve cac lap trinh vien: gom ma nhan vien, ho ten, sdt, email, tuoi, luong/thang
    private String maNhanVien, hoTen, soDienThoai, mail;
    private int tuoi;
    protected int luong;
    // phuong thuc sao cheo 
    public NhanVien(String maNhanVien, String hoTen, String soDienThoai, String mail, int tuoi, int luong) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.mail = mail;
        this.tuoi = tuoi;
        this.luong = luong;
    }
    // phuong thuc gan gia tri va tra ve gia tri cac thuoc tinh
    public String getMaNhanVien() {
        return maNhanVien;
    }
    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getSoDienThoai() {
        return soDienThoai;
    }
    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    } 
    public int getTuoi() {
        return tuoi;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public int getLuong() {
        return luong;
    }
    public void setLuong(int luong) {
        this.luong = luong;
    }
    public String toString() {
        return ("Ma nhan vien: " + this.maNhanVien + ", Ho ten " + this.hoTen + ", SDT " + this.soDienThoai 
        		+ ", mail: " + this.mail + ", Tuoi: " + this.tuoi + " , Luong: " + this.luong);
    }
}