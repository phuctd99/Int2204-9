package com.company;

public class QuaTao extends Hoaqua {
    public String mauSac;
    public String hinhDang;
    public QuaTao(){
        super();
        this.mauSac = "red";
        this.hinhDang = "cau";
    }

    public QuaTao(String nguonGoc, String ngayNhap, int soLuong, double gia, String mauSac, String hinhDang) {
        super(nguonGoc, ngayNhap, soLuong, gia);
        this.mauSac = mauSac;
        this.hinhDang = hinhDang;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setHinhDang(String hinhDang) {
        this.hinhDang = hinhDang;
    }

    public String getHinhDang() {
        return hinhDang;
    }


}
