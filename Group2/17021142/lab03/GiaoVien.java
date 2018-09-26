public class GiaoVien {
    private String Ten;
    private String LopDay;
    
    public GiaoVien(String Ten, String LopDay)
    {
        this.Ten = Ten;
        this.LopDay = LopDay;
    }
    
    public void setTen(String Ten)
    {
        this.Ten = Ten;
    }
    public void setLopDay(String LopDay)
    {
         this.LopDay = LopDay;
    }
    
    public String getTen()
    {
        return this.Ten;
    }
    public String getLopDay()
    {
        return this.LopDay;
    }
    public void prin()
    {
        System.out.printf(this.Ten + " " + this.LopDay);
    }
}
