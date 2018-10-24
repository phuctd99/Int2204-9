package lab07;

class Rectangle extends Shape {
    protected Position vertex1;
    protected Position vertex2;
    protected Position vertex3;
    protected Position vertex4;

    // constructor
    public Rectangle(Position vertex1, Position vertex2, Position vertex3, Position vertex4) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.vertex3 = vertex3;
        this.vertex4 = vertex4;
    }

    public Rectangle() {
    }
    // kiem tra hai hinh chu nhat co trung nhau
    public boolean isTheSame(Rectangle rec) {
        boolean bool1 = rec.getVertex1().equals(this.getVertex1());
        boolean bool2 = rec.getVertex2().equals(this.getVertex2());
        boolean bool3 = rec.getVertex3().equals(this.getVertex3());
        boolean bool4 = rec.getVertex4().equals(this.getVertex4());
        return (bool1 && bool2 && bool3 && bool4);
    }
    // ghi de cac phuong thuc cua class Shape
    @Override
    public boolean isFilled() {
        return true;
    }

    @Override
    public boolean canBeMoved() {
        return true;
    }
    // kiem tra hai hinh chu nhat co trung nhau khong
    @Override
    public boolean isTheSame(Object obj) {
        if (!(obj instanceof Rectangle)) {
            return false;
        }
        Rectangle rec = (Rectangle) obj;
        boolean bool1 = rec.getVertex1().equals(this.getVertex1());
        boolean bool2 = rec.getVertex2().equals(this.getVertex2());
        boolean bool3 = rec.getVertex3().equals(this.getVertex3());
        boolean bool4 = rec.getVertex4().equals(this.getVertex4());
        return (bool1 && bool2 && bool3 && bool4);
    }
    
    // getter va setter cac dinh
    public Position getVertex1() {
        return vertex1;
    }

    public void setVertex1(double x, double y) {
        this.vertex1.setX(x);
        this.vertex1.setY(y);
    }

    public Position getVertex2() {
        return vertex2;
    }

    public void setVertex2(double x, double y) {
        this.vertex2.setX(x);
        this.vertex2.setY(y);
    }

    public Position getVertex3() {
        return vertex3;
    }

    public void setVertex3(double x, double y) {
        this.vertex3.setX(x);
        this.vertex3.setY(y);
    }

    public Position getVertex4() {
        return vertex4;
    }

    public void setVertex4(double x, double y) {
        this.vertex4.setX(x);
        this.vertex4.setY(y);
    }

    //lay ra chieu dai va chieu rong
    public double getLength() {
        double difX = vertex2.getX() - vertex1.getX();
        double difY = vertex2.getY() - vertex1.getY();
        return Math.sqrt(difX*difX + difY*difY);
    }
    
    public double getWidth() {
        double difX = vertex3.getX() - vertex2.getX();
        double difY = vertex3.getY() - vertex2.getY();
        return Math.sqrt(difX*difX + difY*difY);
    }
    
    // tinh dien tich hinh chu nhat
    public double getArea() {
        return getLength()*getWidth();
    }
    
    // tinh chu vi hinh chu nhat
    public double getPerimeter() {
        return 2*(getLength() + getWidth());
    }
    
}
