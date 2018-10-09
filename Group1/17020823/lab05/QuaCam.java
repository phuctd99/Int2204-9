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
public class QuaCam extends HoaQua{
    private String SoMui;
    private String NgayThuHoach;
    private String HanDung;

    public QuaCam(String SoMui, String NgayThuHoach, String HanDung, String LoaiQua, String Mui, String Vi, String XuatXu, String NgayNhap, float CanNang) {
        super(LoaiQua, Mui, Vi, XuatXu, NgayNhap, CanNang);
        this.SoMui = SoMui;
        this.NgayThuHoach = NgayThuHoach;
        this.HanDung = HanDung;
    }

    public String getSoMui() {
        return SoMui;
    }

    public void setSoMui(String SoMui) {
        this.SoMui = SoMui;
    }

    public String getNgayThuHoach() {
        return NgayThuHoach;
    }

    public void setNgayThuHoach(String NgayThuHoach) {
        this.NgayThuHoach = NgayThuHoach;
    }

    public String getHanDung() {
        return HanDung;
    }

    public void setHanDung(String HanDung) {
        this.HanDung = HanDung;
    }

    public QuaCam(String LoaiQua, String Mui, String Vi, String XuatXu, String NgayNhap, float CanNang) {
        super(LoaiQua, Mui, Vi, XuatXu, NgayNhap, CanNang);
    }
}
