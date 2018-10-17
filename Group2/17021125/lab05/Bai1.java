class HoaQua {
    String name;
    String NguonGoc;
    String NgayNhap;
    double GiaBan;
    double SoLuong;

    public HoaQua(){
        this.name = "";
        this.NguonGoc = "";
        this.NgayNhap = "";
        this.GiaBan = 0;
        this.SoLuong = 0;
    }

    public HoaQua(String name, String NguonGoc, String NgayNhap, double GiaBan, double SoLuong){
        this.name = name;
        this.NguonGoc = NguonGoc;
        this.NgayNhap = NgayNhap;
        this.GiaBan = GiaBan;
        this.SoLuong = SoLuong;
    }

    public void setName (String name){
        this.name = name;
    }
    public String getName (){
        return name;
    }

    public void setNguonGoc (String NguonGoc){
        this.NguonGoc = NguonGoc;
    }
    public String getNguonGoc (){
        return NguonGoc;
    }

    public void setNgayNhap (String NgayNhap){
        this.NgayNhap = NgayNhap;
    }
    public String getNgayNhap (){
        return NgayNhap;
    }

    public void setGiaBan (Double GiaBan){
        this.GiaBan = GiaBan;
    }
    public Double getGiaBan (){
        return GiaBan;
    }

    public void setSoLuong (Double SoLuong){
        this.SoLuong = SoLuong;
    }
    public Double getSoLuong (){
        return SoLuong;
    }
}

class QuaCam extends HoaQua {
    String LoaiCam;

    public QuaCam(){
        this.LoaiCam = "";
    }

    public QuaCam (String LoaiCam){
        this.LoaiCam = LoaiCam;
    }
    public void setLoaiCam (String LoaiCam) {
        this.LoaiCam = LoaiCam;
    }
    public String getLoaiCam (){
        return LoaiCam;
    }
}

class QuaTao extends HoaQua {
    String LoaiTao;

    public QuaTao(String LoaiTao){
        this.LoaiTao = LoaiTao;
    }

    public void setLoaiTao (String LoaiTao){
        this.LoaiTao = LoaiTao;
    }
    public String getLoaiTao (){
        return LoaiTao;
    }
}

class CamCaoPhong extends QuaCam {
    String color;
    String size;
    public CamCaoPhong(String color, String size){
        this.color = color;
        this.size = size;
    }

    public void setColor (String color){
        this.color = color;
    }
    public String getColor (){
        return  color;
    }
    public void setSize (String size){
        this.size = size;
    }
    public String getSize (){
        return  size;
    }
}

class CamSanh extends QuaCam {
    String color;
    String size;
    public CamSanh(String color, String size){
        this.color = color;
        this.size = size;
    }

    public void setColor (String color){
        this.color = color;
    }
    public String getColor (){
        return  color;
    }
    public void setSize (String size){
        this.size = size;
    }
    public String getSize (){
        return  size;
    }
}


public class Bai1{
    public static void main(String[] args) {
        HoaQua hq = new HoaQua("nhan", "Hung Yen", "1/10/2018", 35000, 500);
        QuaCam qc = new QuaCam("Cam sanh");
        QuaTao qt = new QuaTao("Tao dai");
        CamCaoPhong  ccp = new CamCaoPhong("mau vang","be");
        CamSanh cs = new CamSanh("mau xanh", "to");
    }
}