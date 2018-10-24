package lab07;

class Triangle extends Shape {
    private Position vertex1;
    private Position vertex2;
    private Position vertex3;
    
    // constructor
    public Triangle() {
    }

    public Triangle(Position vertex1, Position vertex2, Position vertex3) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.vertex3 = vertex3;
    }
    
    // setter
    public void setVertex1(double x, double y) {
        this.vertex1.setX(x);
        this.vertex1.setY(y);
    }
    
    public void setVertex2(double x, double y) {
        this.vertex2.setX(x);
        this.vertex2.setY(y);
    }
    
    public void setVertex3(double x, double y) {
        this.vertex3.setX(x);
        this.vertex3.setY(y);
    }
    
    //getter
    public Position getVertex1() {
        return vertex1;
    }

    public Position getVertex2() {
        return vertex2;
    }

    public Position getVertex3() {
        return vertex3;
    }
    
    // Override cac phuong thuc cua class Shape
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
        if (!(obj instanceof Triangle)) {
            return false;
        }
        Triangle tragl = (Triangle) obj;
        boolean bool1 = tragl.getVertex1().equals(this.getVertex1());
        boolean bool2 = tragl.getVertex2().equals(this.getVertex2());
        boolean bool3 = tragl.getVertex3().equals(this.getVertex3());
        return (bool1 && bool2 && bool3);
    }
    // lay ra do dai 3 canh
    public double getE1() {
        double difX = vertex2.getX() - vertex1.getX();
        double difY = vertex2.getY() - vertex1.getY();
        return Math.sqrt(difX*difX + difY*difY);
    }
    
    public double getE2() {
        double difX = vertex3.getX() - vertex2.getX();
        double difY = vertex3.getY() - vertex2.getY();
        return Math.sqrt(difX*difX + difY*difY);
    }
    
    public double getE3() {
        double difX = vertex1.getX() - vertex3.getX();
        double difY = vertex1.getY() - vertex3.getY();
        return Math.sqrt(difX*difX + difY*difY);
    }
    
    // tinh chu vi
    public double getPerimeter() {
        return getE1() + getE2() + getE3();
    }
    
    // tinh dien tich
    public double getArea() {
        // Heron's Formula
        double p = getPerimeter()/2;
        return Math.sqrt( p*(p - getE1())*(p - getE2())*(p - getE3()) );
    }
}