/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author CACLV
 */
public class HoaQua {
    public String nguonGoc;     // nguồn gốc xuất sứ
    public Double giaBan;       //giá bán ?/kg
    public int soLuong;         // số lượng hoa quả (kg)
    public String ngayNhap;     // ngày nhập hàng về
    public String mauSac;       // màu sắc;
    public String kieuCauTao;   // chia ra nhìu múi or đặc or nhìu hạt

    // constructor truyền vào các thuộc tính
    public HoaQua(String nguonGoc, Double giaBan, int soLuong, String ngayNhap, String mauSac, String kieuCauTao) {
        this.nguonGoc = nguonGoc;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.ngayNhap = ngayNhap;
        this.mauSac = mauSac;
        this.kieuCauTao = kieuCauTao;
    }
    
    // get/set
    public Double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Double giaBan) {
        this.giaBan = giaBan;
    }

    public String getNguonGoc() {
        return nguonGoc;
    }

    public void setNguonGoc(String nguonGoc) {
        this.nguonGoc = nguonGoc;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getKieuCauTao() {
        return kieuCauTao;
    }

    public void setKieuCauTao(String kieuCauTao) {
        this.kieuCauTao = kieuCauTao;
    }

    // trả về thong tin của hoa quả
    @Override
    public String toString() {
        return  "nguonGoc = " + nguonGoc + ", giaBan = " + giaBan + ", soLuong = " + soLuong + ", ngayNhap = " + ngayNhap + ", mauSac = " + mauSac + ", kieuCauTao = " + kieuCauTao ;
    }
    
}
