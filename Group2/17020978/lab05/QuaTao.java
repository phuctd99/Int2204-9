public class QuaTao extends HoaQua {
    protected String giaban;
    protected String mausac;
    public QuaTao()
    {
        giaban = "20$/kg";
        mausac = "Do";
    }
    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    public String getGiaban() {
        return giaban;
    }

    public void setGiaban(String giaban) {
        this.giaban = giaban;
    }

    public void printQT()
    {
        System.out.println(this.giaban + " "+ this.mausac);
    }


}
