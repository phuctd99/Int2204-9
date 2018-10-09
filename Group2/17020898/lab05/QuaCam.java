package com.company;
public class QuaCam extends Hoaqua {
    public String mauSac;
    public String hinhDang;
    public QuaCam(){
        super();
        this.mauSac = " orange";
        this.hinhDang = "cau";
    }
    public QuaCam(String mauSac, String hinhDang) {
        super();
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

    @Override
    public String toString() {
        return "QuaCam{" +
                "mauSac='" + mauSac + '\'' +
                ", hinhDang='" + hinhDang + '\'' +
                ", nguonGoc='" + nguonGoc + '\'' +
                ", ngayNhap='" + ngayNhap + '\'' +
                ", soLuong=" + soLuong +
                ", gia=" + gia +
                '}';
    }

    public static void main(String[] args) {
        QuaCam p = new QuaCam();
        System.out.print(p.toString());
    }
}
