package test05;

public class Rectangle extends Shape { //class hình chữ nhật kế thừa một phần của shape
    protected double width;
    protected double length;
    protected double area;
    protected double perimeter;

    public Rectangle(){  //kb không khởi tạo
        this.area = 0;
        this.length = 0;
        this.width = 0;
        this.perimeter = 0;
        this.getFilled(true);
        this.getColor("red");
    }

    public Rectangle(double width, double length, String color, boolean filled,
                     double perimeter, double area){ //kb tương tự
        this.area = area;
        this.length = length;
        this.width = width;
        this.perimeter = perimeter;
        this.filled = filled;
        this.color = color;
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

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void cvdt(Rectangle r1){
        r1.setArea(r1.getLength() * r1.getWidth());
        r1.setPerimeter((r1.getLength() + r1.getWidth()) * 2);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                ", width=" + width +
                ", length=" + length +
                ", color=" + color +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
