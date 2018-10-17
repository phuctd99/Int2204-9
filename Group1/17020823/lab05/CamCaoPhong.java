/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap5;

/**
 *
 * @author Hoang Vu Huong
 */
public class CamCaoPhong extends QuaCam {
        private String ThanhPhan;
    private String DinhDuong;
    private String HinhDang;
    private String DuongKinh;

    public String getThanhPhan() {
        return ThanhPhan;
    }

    public void setThanhPhan(String ThanhPhan) {
        this.ThanhPhan = ThanhPhan;
    }

    public String getDinhDuong() {
        return DinhDuong;
    }

    public void setDinhDuong(String DinhDuong) {
        this.DinhDuong = DinhDuong;
    }

    public String getHinhDang() {
        return HinhDang;
    }

    public void setHinhDang(String HinhDang) {
        this.HinhDang = HinhDang;
    }

    public String getDuongKinh() {
        return DuongKinh;
    }

    public void setDuongKinh(String DuongKinh) {
        this.DuongKinh = DuongKinh;
    }

    public CamCaoPhong(String ThanhPhan, String DinhDuong, String HinhDang, String DuongKinh, String SoMui, String NgayThuHoach, String HanDung, String LoaiQua, String Mui, String Vi, String XuatXu, String NgayNhap, float CanNang) {
        super(SoMui, NgayThuHoach, HanDung, LoaiQua, Mui, Vi, XuatXu, NgayNhap, CanNang);
        this.ThanhPhan = ThanhPhan;
        this.DinhDuong = DinhDuong;
        this.HinhDang = HinhDang;
        this.DuongKinh = DuongKinh;
    }
}
