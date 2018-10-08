package Bai_tap_tuan_05;

public class Circle extends Shape {
    private double banKinh = 0;
    public final double pi = 3.1415926;


    public Circle(String color, boolean filled) {
        super(color, filled);
    }

    public Circle(String color, boolean filled, double banKinh) {
        super(color, filled);
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public double getPi() {
        return pi;
    }

    public double tinhDienTich () {
        return (banKinh*banKinh*pi);
    }

    @Override
    public String toString() {
        System.out.println("day la hinh tron, co ban kinh la: " + banKinh);
        return super.toString();
    }
}
