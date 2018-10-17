package Fruit;

public class CamSanh extends QuaCam {

    //constructor
    public CamSanh() {
        setTen("Cam Sanh");
    }

    public CamSanh(String ten, int gia, String nguonGoc, int soLuong) {
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
