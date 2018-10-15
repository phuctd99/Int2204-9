package Fruit;

public class QuaTao extends HoaQua {

    //constructor
    public QuaTao() {
        setTen("Tao");
    }

    public QuaTao(String ten, int gia, String nguonGoc, int soLuong) {
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
