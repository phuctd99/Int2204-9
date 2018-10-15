public class CamSanh extends QuaCam{
    public String giaban;

    public CamSanh()
    {
        giaban = "10$/kg";
    }
    public String getGiaban() {
        return giaban;
    }

    public void setGiaban(String giaban) {
        this.giaban = giaban;
    }
    public void printCS()
    {
        System.out.println(this.giaban);
    }
}
