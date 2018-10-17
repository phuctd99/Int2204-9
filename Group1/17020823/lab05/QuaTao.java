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
public class QuaTao extends HoaQua{
    private int SoLuong;
    private int GiaBan;
    private String MauSac;
    public QuaTao(){
        this.SoLuong = 0;
        this.GiaBan = 0;
        this.MauSac ="";
    }
    public QuaTao(int SoLuong, int GiaBan, String MauSac, String LoaiQua, String Mui, String Vi, String XuatXu, String NgayNhap, float CanNang) {
        super(LoaiQua, Mui, Vi, XuatXu, NgayNhap, CanNang);
        this.SoLuong = SoLuong;
        this.GiaBan = GiaBan;
        this.MauSac = MauSac;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(int GiaBan) {
        this.GiaBan = GiaBan;
    }

    public String getMauSac() {
        return MauSac;
    }

    public void setMauSac(String MauSac) {
        this.MauSac = MauSac;
    }
    public QuaTao(String LoaiQua, String Mui, String Vi, String XuatXu, String NgayNhap, float CanNang) {
        super(LoaiQua, Mui, Vi, XuatXu, NgayNhap,CanNang);
    }
    public float GiaTien(){
        return SoLuong*GiaBan*this.getCanNang();
    }
}
