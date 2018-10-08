package Bai_tap_tuan_05;

public class Rectangle extends Shape {
    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }

    protected double rong = 1;
    protected double dai = 2;

    public Rectangle(String color, boolean filled, double rong, double dai) {
        super(color, filled);
        this.rong = rong;
        this.dai = dai;
    }


    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public double tinhDienTich() {
        return rong*dai;
    }

    @Override
    public String toString() {


        String s1 = ("Day la Hinh chu nhat\n"
                +    "co chieu rong la: " + rong +"\n"
                  +  "va chieu dai la : " + dai + "\n"   );
        String s2 = super.toString();
        return (s1 + s2);
    }
}
