public class HoaQua {
    private int gia;
    private double soCan;
    private int soLuong;
    private String loaiQua;

    public HoaQua(){
        gia = 0;
        soCan =0;
        soLuong =0;
        loaiQua = "";
    }
    public HoaQua(String loaiQua){
        gia = 0;
        soCan =0;
        soLuong =0;
        loaiQua = loaiQua;
    }


    public void setGia(int gia) {
        this.gia = gia;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public void setSoCan(double soCan) {
        this.soCan = soCan;
    }
    public void setLoaiQua(String loaiQua) {
        this.loaiQua = loaiQua;
    }

    public int getGia() {
        return gia;
    }
    public double getSoCan() {
        return soCan;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public String getLoaiQua() {
        return loaiQua;
    }

    public static void main(String[] args){
        QuaCam qc = new QuaCam();
        qc.setGia(100);
       CamCaoPhong ccp = new CamCaoPhong();
       ccp.setGia(120000);
       ccp.getInfo();
       QuaTao qt = new QuaTao();
       qt.setGia(10000);
       qt.setSoCan(1.5);
       qt.setLoai(1);
       qt.tinhGiatien();
    }
}
