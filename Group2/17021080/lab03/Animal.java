package Doi_tuong_xung_quanh;

public class Animal // mieu ta mot dong vat
{
    String ten;
    String nhom;
    String chuNhan;
    int canNang;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }

    public String getChuNhan() {
        return chuNhan;
    }

    public void setChuNhan(String chuNhan) {
        this.chuNhan = chuNhan;
    }

    public int getCanNang() {
        return canNang;
    }

    public void setCanNang(int canNang) {
        this.canNang = canNang;
    }

    public Animal(String ten, String nhom, String chuNhan, int canNang) {
        this.ten = ten;
        this.nhom = nhom;
        this.chuNhan = chuNhan;
        this.canNang = canNang;
    }
}
