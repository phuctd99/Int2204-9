public class MayTinh {
    private String Ten;
    private String ThuongHieu;
    private int gia;
    
    public MayTinh(String Ten, String ThuongHieu, int gia)
    {
        this.Ten = Ten;
        this.ThuongHieu = ThuongHieu;
        this.gia = gia;
    }
    
    public void setTen(String Ten)
    {
        this.Ten = Ten;
    }
    public void setThuongHieu(String ThuongHieu)
    {
         this.ThuongHieu = ThuongHieu;
    }
    public void setGia(int gia)
    {
         this.gia = gia;
    }
    
    public String getTen()
    {
        return this.Ten;
    }
    public String getThuongHieu()
    {
        return this.ThuongHieu;
    }
    public int getGia()
    {
        return this.gia;
    }
    public void prin()
    {
        System.out.printf(this.Ten + " " + this.ThuongHieu + " " + this.gia);
    }
}
