package test05;

public class Rectangle extends Shape { //class hình chữ nhật kế thừa một phần của shape
    protected double width;
    protected double length;
    protected double area;
    protected double perimeter;
    protected double Ax;
    protected double Ay;
    protected double Bx;
    protected double By;
    protected double Cx;
    protected double Cy;

    public double getAx() {
        return Ax;
    }

    public void setAx(double ax) {
        Ax = ax;
    }

    public double getAy() {
        return Ay;
    }

    public void setAy(double ay) {
        Ay = ay;
    }

    public double getBx() {
        return Bx;
    }

    public void setBx(double bx) {
        Bx = bx;
    }

    public double getBy() {
        return By;
    }

    public void setBy(double by) {
        By = by;
    }

    public double getCx() {
        return Cx;
    }

    public void setCx(double cx) {
        Cx = cx;
    }

    public double getCy() {
        return Cy;
    }

    public void setCy(double cy) {
        Cy = cy;
    }

    public Rectangle(){  //kb không khởi tạo
        this.area = 0;
        this.length = 0;
        this.width = 0;
        this.perimeter = 0;
        this.getFilled(true);
        this.getColor("red");
        this.Ax = 0;
        this.Bx = 0;
        this.Ay = 0;
        this.By = 0;
        this.Cx = 0;
        this.Cy = 0;
    }

    public Rectangle(double width, double length, String color, boolean filled,
                     double perimeter, double area, double ax, double bx, double cx, double ay, double by, double cy){ //kb tương tự
        this.area = area;
        this.length = length;
        this.width = width;
        this.perimeter = perimeter;
        this.filled = filled;
        this.color = color;
        this.Ax = ax;
        this.Bx = bx;
        this.Ay = ay;
        this.By = by;
        this.Cx = cx;
        this.Cy = cx;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth() {
        this.width = Math.sqrt((Ax - this.Bx)*(Ax - this.Bx) + (Ay - By)*(Ay - By));
    }

    public double getLength() {
        return length;
    }

    public void setLength() {
        this.length = Math.sqrt((Cx - Bx)*(Cx - By) + (Cy - By)*(Cy - By));
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

    public void cvdt(Rectangle r1){// chu vi diện tích
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
