/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

/**
 *
 * @author Admin
 */
public class HoaQua {
    protected double giaban;
    protected String nguongoc;
    protected String ngaynhap;
    protected int soluong;
    //Constructor
    public HoaQua(){
    }
    public HoaQua(double giaban, String nguongoc, String ngaynhap, int soluong) {
        this.giaban = giaban;
        this.nguongoc = nguongoc;
        this.ngaynhap = ngaynhap;
        this.soluong = soluong;
    }
    //Getter and setter
    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public String getNguongoc() {
        return nguongoc;
    }

    public void setNguongoc(String nguongoc) {
        this.nguongoc = nguongoc;
    }

    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
    //toString
    @Override
    public String toString() {
        return "HoaQua{" + "giaban=" + giaban + ", nguongoc=" + nguongoc + ", ngaynhap=" + ngaynhap + ", soluong=" + soluong + '}';
    }
    
}
