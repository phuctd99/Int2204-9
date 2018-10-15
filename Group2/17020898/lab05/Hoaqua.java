package com.company;
public class Hoaqua {
    protected String nguonGoc;
    protected String ngayNhap;
    protected   int soLuong;
    protected double gia;

    public Hoaqua() {
        this.nguonGoc = " Viet Nam";
        this.ngayNhap = " 1/1/2018";
        this.soLuong = 1000;
        this.gia = 10.5;
    }

    public Hoaqua(String nguonGoc, String ngayNhap, int soLuong, double gia) {
        this.nguonGoc = nguonGoc;
        this.ngayNhap = ngayNhap;
        this.soLuong = soLuong;
        this.gia = gia;
    }

    public void setNguonGoc(String nguonGoc) {
        this.nguonGoc = nguonGoc;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public double getGia() {
        return gia;
    }

    @Override
    public String toString() {
        return "Hoaqua{" +
                "nguonGoc='" + nguonGoc + '\'' +
                ", ngayNhap='" + ngayNhap + '\'' +
                ", soLuong=" + soLuong +
                ", gia=" + gia +
                '}';
    }
}
