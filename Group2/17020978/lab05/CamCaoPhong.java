public class CamCaoPhong extends QuaCam {
    public String giaban;

    public CamCaoPhong()
    {
        giaban = "15$/kg";
    }
    public String getGiaban() {
        return giaban;
    }

    public void setGiaban(String giaban) {
        this.giaban = giaban;
    }

    public void printCCP()
    {
        System.out.println(this.giaban);
    }

}
