package test05;

class Circle extends Shape{// class circle kế thừa class shape
    private final double Pi = 3.14;
    private double radius;
    private double area;
    private double perimeter;

    public Circle(){ //kb không khởi tạo
        this.radius = 1.0;
        this.color = "red";
        this.filled = true;
        this.area = 0;
        this.perimeter = 0;
    }

    public Circle(double radius, String color, boolean filled, double area,
                  double perimeter, final double Pi )                           {//khai báo tương tự
        this.radius = radius;
        this.color = color;
        this.filled = filled;
        this.area = area;
        this.perimeter = perimeter;
    }

    public double getPi() {
        return Pi;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
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

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color +
                ", Pi=" + Pi +
                ", radius=" + radius +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }

    public void area(Circle cc){ // tính chu vi diện tích
        cc.setArea(cc.getRadius() * cc.getRadius() * cc.getPi());
        cc.setPerimeter(cc.getRadius() * 2 * cc.getPi());
    }

}
