public class baiHat {
    private String ten;
    private String tacGia;
    private int namSangTac;
    private String caSiTheHien;

    public baiHat(){
        ten = "";
        tacGia = "";
        namSangTac = 0;
        caSiTheHien = "";
    }

    //Cac phuong thuc get/set

    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTacGia() {
        return tacGia;
    }
    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamSangTac() {
        return namSangTac;
    }
    public void setNamSangTac(int namSangTac) {
        this.namSangTac = namSangTac;
    }

    public String getCaSiTheHien() {
        return caSiTheHien;
    }
    public void setCaSiTheHien(String caSiTheHien) {
        this.caSiTheHien = caSiTheHien;
    }
}
