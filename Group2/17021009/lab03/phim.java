public class phim {
    private String ten;
    private String daoDien;
    private int namSanXuat;

    public phim()
    {
        ten = "";
        daoDien = "";
        namSanXuat = 0;
    }

    //Cac phuong thuc get/set

    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDaoDien() {
        return daoDien;
    }
    public void setDaoDien(String daoDien) {
        this.daoDien = daoDien;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }
    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }
}
