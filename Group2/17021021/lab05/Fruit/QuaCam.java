package Fruit;

public class QuaCam extends HoaQua {

    //constructor
    public QuaCam() {
        setTen("Cam");
    }

    public QuaCam(String ten, int gia, String nguonGoc, int soLuong) {
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
