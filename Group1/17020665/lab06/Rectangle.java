public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(String vitri, double kichthuoc, boolean tomau, boolean dichuyen, double width, double length){
        super(vitri, kichthuoc, tomau, dichuyen);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
