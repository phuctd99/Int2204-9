public class QuaTao extends HoaQua {
    private int SoLuong;
    // loại vỏ ( trơn, nhăn, có gai)
    private String LoaiVo;

    public QuaTao(){
        new HoaQua();
        SoLuong = 0;
        LoaiVo = "Trơn";
    }
    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public String getLoaiVo() {
        return LoaiVo;
    }

    public void setLoaiVo(String loaiVo) {
        LoaiVo = loaiVo;
    }
    public void getInfo (){
        this.setLoaiQua("Quả Táo");
        this.setLoaiVo("Trơn");
        this.setVi("Ngọt");
        System.out.println("Loại quả "+ this.getLoaiQua());
        System.out.println("Loại vỏ" + this.getLoaiVo());
        System.out.println("Vị " + this.getVi());
    }
}
