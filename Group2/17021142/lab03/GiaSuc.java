public class GiaSuc {
    private String Ten;
    private String XuatXu;
    private String ThucAn;
    
    public GiaSuc(String Ten, String XuatXu, String ThucAn)
    {
        this.Ten = Ten;
        this.XuatXu = XuatXu;
        this.ThucAn = ThucAn;
    }
    
    public void setTen(String Ten)
    {
        this.Ten = Ten;
    }
    public void setXuatXu(String XuatXu)
    {
         this.XuatXu = XuatXu;
    }
    public void setThucAn(String ThucAn)
    {
         this.ThucAn = ThucAn;
    }
    
    public String getTen()
    {
        return this.Ten;
    }
    public String getXuatXu()
    {
        return this.XuatXu;
    }
    public String getThucAn()
    {
        return this.ThucAn;
    }
    public void prin()
    {
        System.out.printf(this.Ten + " " + this.XuatXu + " " + this.ThucAn);
    }
}
