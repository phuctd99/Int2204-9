public class ao {
    private String Loai;
    private String ThuongHieu;
    private int gia;
    
    public ao(String Loai, String ThuongHieu, int gia)
    {
        this.Loai = Loai;
        this.ThuongHieu = ThuongHieu;
        this.gia = gia;
    }
    
    public void setLoai(String Loai)
    {
        this.Loai = Loai;
    }
    public void setThuongHieu(String ThuongHieu)
    {
         this.ThuongHieu = ThuongHieu;
    }
    public void setGia(int gia)
    {
         this.gia = gia;
    }
    
    public String getLoai()
    {
        return this.Loai;
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
        System.out.printf(this.Loai + " " + this.ThuongHieu + " " + this.gia);
    }
}
