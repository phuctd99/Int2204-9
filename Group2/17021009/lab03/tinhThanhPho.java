public class tinhThanhPho {
    private String ten;
    private double dienTich;
    private int danSo;
    private double GDP;

    public tinhThanhPho()
    {
        ten = "";
        dienTich = 0;
        danSo = 0;
        GDP = 0;
    }

    //Cac phuong thuc get/set

    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDienTich() {
        return dienTich;
    }
    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public int getDanSo() {
        return danSo;
    }
    public void setDanSo(int danSo) {
        this.danSo = danSo;
    }

    public double getGDP() {
        return GDP;
    }
    public void setGDP(double GDP) {
        this.GDP = GDP;
    }
}
