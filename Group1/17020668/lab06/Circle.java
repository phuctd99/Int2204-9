package test05;


class Circle extends Shape{// class circle kế thừa class shape
    protected final double Pi = 3.14;
    protected double radius;
    protected double area;
    protected double perimeter;
    protected double xtam;
    protected double ytam;

    public double getxTam() {
        return xtam;
    }

    public void setxTam(double x) {
        this.xtam = x;
    }

    public double getYtam() {
        return ytam;
    }

    public void setYtam(double ytam) {
        this.ytam = ytam;
    }

    public Circle(){ //kb không khởi tạo
        this.radius = 1.0;
        this.color = "red";
        this.filled = true;
        this.area = 0;
        this.perimeter = 0;
        this.xtam = 0;
        this.ytam = 0;
    }

    public Circle(double radius, String color, boolean filled, double area,
                  double perimeter, final double Pi, double x, double y)                           {//khai báo tương tự
        this.radius = radius;
        this.color = color;
        this.filled = filled;
        this.area = area;
        this.perimeter = perimeter;
        this.xtam = x;
        this.ytam = y;
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
