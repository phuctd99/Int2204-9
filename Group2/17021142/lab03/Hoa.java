public class Hoa {
    private String Ten;
    private String XuatXu;
    private int gia;
    
    public Hoa(String Ten, String XuatXu, int gia)
    {
        this.Ten = Ten;
        this.XuatXu = XuatXu;
        this.gia = gia;
    }
    
    public void setTen(String Ten)
    {
        this.Ten = Ten;
    }
    public void setXuatXu(String XuatXu)
    {
         this.XuatXu = XuatXu;
    }
    public void setGia(int gia)
    {
         this.gia = gia;
    }
    
    public String getTen()
    {
        return this.Ten;
    }
    public String getXuatXu()
    {
        return this.XuatXu;
    }
    public int getGia()
    {
        return this.gia;
    }
    public void prin()
    {
        System.out.printf(this.Ten + " " + this.XuatXu + " " + this.gia);
    }
}
