package Cau1;


import java.time.LocalDate;

public class QuaCam extends HoaQua {
    private String loaiCam;
    private int giaBan1Can;
    private String nguonGoc;
    private LocalDate ngayNhap;
    private double soLuongKg;

    //hàm khởi tạo cho cam
    public QuaCam(String loaiHoaQua, String loaiCam, int giaBan1Can, String nguonGoc, LocalDate ngayNhap, double soLuongKg) {
        super(loaiHoaQua);
        this.loaiCam = loaiCam;
        this.giaBan1Can = giaBan1Can;
        this.nguonGoc = nguonGoc;
        this.ngayNhap = ngayNhap;
        this.soLuongKg = soLuongKg;
    }

    public String getLoaiCam() {
        return loaiCam;
    }

    public void setLoaiCam(String loaiCam) {
        this.loaiCam = loaiCam;
    }
    public int getGiaBan1Can() {
        return giaBan1Can;
    }

    public void setGiaBan1Can(int giaBan1Can) {
        this.giaBan1Can = giaBan1Can;
    }

    public String getNguonGoc() {
        return nguonGoc;
    }

    public void setNguonGoc(String nguonGoc) {
        this.nguonGoc = nguonGoc;
    }

    public LocalDate getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(LocalDate  ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public double getSoLuongKg() {
        return soLuongKg;
    }

    public void setSoLuongKg(double soLuongKg) {
        this.soLuongKg = soLuongKg;
    }
}
