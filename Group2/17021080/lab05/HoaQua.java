package Bai_tap_tuan_05;

import java.util.Date;
/*
    lop cha : superClass hoac parentClass
    lop con : drivedClass hoac child Class
 */
public class HoaQua {
    private int giaBan ;
    private String nguonGoc ;
    private int soLuongKg;
    private String ngayNhap;

    public HoaQua() { }

    public HoaQua(int giaBan, String nguonGoc, int soLuongKg, String ngayNhap) {
        this.giaBan = giaBan;
        this.nguonGoc = nguonGoc;
        this.soLuongKg = soLuongKg;
        this.ngayNhap = ngayNhap;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public String getNguonGoc() {
        return nguonGoc;
    }

    public void setNguonGoc(String nguonGoc) {
        this.nguonGoc = nguonGoc;
    }

    public int getSoLuongKg() {
        return soLuongKg;
    }

    public void setSoLuongKg(int soLuongKg) {
        this.soLuongKg = soLuongKg;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public void showInfo() {
        System.out.println("gia ban   : " + giaBan + "\n"
                          +"Nguon goc : " + nguonGoc + "\n"
                          +"Ngay nhap : " + ngayNhap + "\n"
                          +"So luong  : " + soLuongKg +"\n");

    }

    public int sumMoney() { // tinh tong tien cua loai qua nay
        return this.soLuongKg * this.giaBan;
    }

}
