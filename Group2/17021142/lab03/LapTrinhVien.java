public class LapTrinhVien {
    private String Ten;
    private String NgonNgu;
    
    public LapTrinhVien(String Ten, String NgonNgu)
    {
        this.Ten = Ten;
        this.NgonNgu = NgonNgu;
    }
    
    public void setTen(String Ten)
    {
        this.Ten = Ten;
    }
    public void setNgonNgu(String NgonNgu)
    {
         this.NgonNgu = NgonNgu;
    }
    
    public String getTen()
    {
        return this.Ten;
    }
    public String getNgonNgu()
    {
        return this.NgonNgu;
    }
    public void prin()
    {
        System.out.printf(this.Ten + " " + this.NgonNgu);
    }
}
