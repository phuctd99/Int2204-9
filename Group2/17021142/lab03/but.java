public class but {
    private String Ten;
    private String LoaiMuc;
    private String CoBut;
    
    public but(String Ten, String LoaiMuc, String CoBut)
    {
        this.Ten = Ten;
        this.LoaiMuc = LoaiMuc;
        this.CoBut = CoBut;
    }
    
    public void setTen(String Ten)
    {
        this.Ten = Ten;
    }
    public void setLoaiMuc(String LoaiMuc)
    {
         this.LoaiMuc = LoaiMuc;
    }
    public void setCoBut(String CoBut)
    {
         this.CoBut = CoBut;
    }
    
    public String getTen()
    {
        return this.Ten;
    }
    public String getLoaiMuc()
    {
        return this.LoaiMuc;
    }
    public String getCoBut()
    {
        return this.CoBut;
    }
    public void prin()
    {
        System.out.printf(this.Ten + " " + this.LoaiMuc + " " + this.CoBut);
    }
}
