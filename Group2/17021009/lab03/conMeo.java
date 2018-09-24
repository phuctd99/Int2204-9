public class conMeo {
    private String ten;
    private int tuoi;
    private String giongLoai;
    private String mauLong;

    public conMeo()
    {
        ten = "";
        tuoi = 0;
        giongLoai = "";
        mauLong = "";
    }

    //Cac phuong thuc get/set

    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGiongLoai() {
        return giongLoai;
    }
    public void setGiongLoai(String giongLoai) {
        this.giongLoai = giongLoai;
    }

    public String getMauLong() {
        return mauLong;
    }
    public void setMauLong(String mauLong) {
        this.mauLong = mauLong;
    }
}
