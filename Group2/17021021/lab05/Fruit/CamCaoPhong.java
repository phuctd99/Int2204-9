package Fruit;

public class CamCaoPhong extends QuaCam {

    //constructor
    public CamCaoPhong() {
        setTen("Cam Cao Phong");
    }

    public CamCaoPhong(String ten, int gia, String nguonGoc, int soLuong) {
        super(ten, gia, nguonGoc, soLuong);
    }

    @Override
    public String toString() {
        return "HoaQua{" +
                "ten='" + getTen() + '\'' +
                ", gia=" + getGia() +
                ", nguonGoc='" + getNguonGoc() + '\'' +
                ", soLuong=" + getSoLuong() +
                '}';
    }
}
