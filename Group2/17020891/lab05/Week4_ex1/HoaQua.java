package com.company;
import java.util.Date;

public class HoaQua {

    private String ten;
    private double khoiLuong;
    private String nguonGoc;
    private String ngayNhap;

    //constructor
    public HoaQua(String ten, double khoiLuong, String nguonGoc, String ngayNhap) {
        this.ten = ten;
        this.khoiLuong = khoiLuong;
        this.nguonGoc = nguonGoc;
        this.ngayNhap = ngayNhap;
    }

    //getter & setter
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getKhoiLuong() {
        return khoiLuong;
    }

    public void setKhoiLuong(double khoiLuong) {
        this.khoiLuong = khoiLuong;
    }

    public String getNguonGoc() {
        return nguonGoc;
    }

    public void setNguonGoc(String nguonGoc) {
        this.nguonGoc = nguonGoc;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    //toString
    @Override
    public String toString() {
        return "HoaQua{" +
                "Ten = '" + ten + '\'' +
                ", Khoi luong = '" + khoiLuong + '\'' +
                ",Nguon goc = '" + nguonGoc + '\'' +
                ", Ngay nhap = '" + ngayNhap + '\'' +
                '}';
    }
}
