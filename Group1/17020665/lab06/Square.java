public class Square extends Shape{
    private double canh;

    public Square(String vitri, double kichthuoc, boolean tomau, boolean dichuyen, double size){
        super(vitri, kichthuoc, tomau, dichuyen);
        this.canh = size;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }
}
