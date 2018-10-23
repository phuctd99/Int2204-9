package Bai_tap;

import java.util.Scanner;

abstract class Hinh_hoc {

    public Hinh_hoc() {
    }

    protected Scanner scanner = new Scanner(System.in);
    protected Oxy oxy ;

    protected String ten ;
    protected Toa_do trongTam;
    protected String mau;

    public String getTen() {
        return ten;
    }

    public Toa_do getTrongTam() {
        return trongTam;
    }

    public String getMau() {
        return mau;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTrongTam(Toa_do trongTam) {
        this.trongTam = trongTam;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public Hinh_hoc(String ten, Toa_do trongTam, String mau) {
        this.ten = ten;
        this.trongTam = trongTam;
        this.mau = mau;
    }

    public Hinh_hoc(Toa_do trongTam, String mau) {
        this.trongTam = trongTam;
        this.mau = mau;
    }

    abstract public void khoiTao();
    public void inThongTin() {
        System.out.println("day la hinh " + ten);
        System.out.println("hinh nay co mau " + mau );
    }

    public boolean cungLoai( Hinh_hoc hinh_hoc ) {
        return ten.equalsIgnoreCase(  hinh_hoc.getTen());
    }

    public boolean isHinhVuong() {
        return ten.equalsIgnoreCase("hinh vuong");
    }

    public boolean isHinhChuNhat() {
        return ten.equalsIgnoreCase("hinh chu nhat");
    }

    public boolean isHinhTron() {
        return ten.equalsIgnoreCase("hinh tron");
    }

    public boolean isHinhTamGiac() {
        return ten.equalsIgnoreCase("hinh vuong");
    }

    abstract public boolean trungNhau( Hinh_tam_giac hinh_tam_giac );
    abstract public boolean trungNhau( Hinh_chu_nhat hinh_chu_nhat );
    abstract public boolean trungNhau( Hinh_tron hinh_tron );
    public boolean hinhTrungNhau( Hinh_hoc hinh_hoc) {
        if(  hinh_hoc.isHinhChuNhat() ) {
            Hinh_chu_nhat hinh_chu_nhat = (Hinh_chu_nhat) hinh_hoc;
            return trungNhau( hinh_chu_nhat);
        }
        if(  hinh_hoc.isHinhTamGiac() ) {
            Hinh_tam_giac hinh_tam_giac = (Hinh_tam_giac) hinh_hoc;
            return trungNhau( hinh_tam_giac);
        }

       if (hinh_hoc.isHinhTron( )  ) {
           Hinh_tron hinh_tron = (Hinh_tron) hinh_hoc;
           return trungNhau(hinh_tron);
       }

       if ( hinh_hoc.isHinhVuong()) {
           Hinh_vuong hinh_vuong = (Hinh_vuong) hinh_hoc;
           return trungNhau(hinh_vuong);
       }
       return false;

    }
}
