package Fruit;

public class HoaQua {
    protected String ten;
    protected int gia;
    protected String nguonGoc;
    protected int soLuong;

    //constructor
    public HoaQua() {
        gia = 0;
        soLuong = 0;
    }

    public HoaQua(String ten, int gia, String nguonGoc, int soLuong) {
        this.ten = ten;
        this.gia = gia;
        this.nguonGoc = nguonGoc;
        this.soLuong = soLuong;
    }

    //getter
    public String getTen() {
        return ten;
    }

    public int getGia() {
        return gia;
    }

    public String getNguonGoc() {
        return nguonGoc;
    }

    public int getSoLuong() {
        return soLuong;
    }


    //setter
    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public void setNguonGoc(String nguonGoc) {
        this.nguonGoc = nguonGoc;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "HoaQua{" +
                "gia=" + gia +
                ", soLuong=" + soLuong +
                '}';
    }

    public static void main(String[] args) {
        HoaQua hoaQua = new HoaQua();
        QuaCam quaCam = new QuaCam();
        QuaTao quaTao = new QuaTao();
        CamCaoPhong camCaoPhong = new CamCaoPhong("Cam Cao Phong", 25000, "Viet Nam", 1500);
        System.out.println(hoaQua);
        System.out.println(quaCam);
        System.out.println(quaTao);
        System.out.println(camCaoPhong);
        System.out.println(new CamSanh());
    }

}
