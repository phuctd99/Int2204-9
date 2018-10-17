package Bai_tap_tuan_05;

public class Square extends Rectangle {


    public Square(String color, boolean filled) {
        super(color, filled);
    }

    public Square(String color, boolean filled, double rong) {
        super(color, filled, rong, rong);
    }

    public boolean isSquare() {
        return ( rong == dai );
    }

    @Override
    public double tinhDienTich() {
        if( this.getRong() == this.getDai())
             return super.tinhDienTich();
        return -1;
    }

    @Override
    public String toString() {
        String s = super.toString();
        String s2 = "Nen day la hinh vuong";
        return  s+s2;
    }
}
