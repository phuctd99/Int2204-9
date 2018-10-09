/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhkethua;

/**
 *
 * @author Nguyễn Giang
 */
public class HoaQua {
    int gia;
    String nguonGoc;
    int soluong;
    int ngayNhap;

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getNguonGoc() {
        return nguonGoc;
    }

    public void setNguonGoc(String nguonGoc) {
        this.nguonGoc = nguonGoc;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(int ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public HoaQua(int gia, String nguonGoc, int soluong, int ngayNhap) {
        this.gia = gia;
        this.nguonGoc = nguonGoc;
        this.soluong = soluong;
        this.ngayNhap = ngayNhap;
    }
    
}
