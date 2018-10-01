public class mayTinh {
    private String ten;
    private int namSanXuat;
    private String hangSanXuat;
    private String RAM;
    private String oCung;

    public mayTinh(){
        ten = "";
        namSanXuat = 0;
        hangSanXuat = "";
        RAM = "";
        oCung = "";
    }

    //Cac phuong thuc get/set

    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }
    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }
    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public String getRAM() {
        return RAM;
    }
    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getoCung() {
        return oCung;
    }
    public void setoCung(String oCung) {
        this.oCung = oCung;
    }
}
