package lab07;

class Circle extends Shape {
    private double radius; // ban kinh
    private Position position;
    public static final double PI = 3.1415;
    // constructor kieu sau la khong hop le
    /*
    public Circle(double radius, double I_x, double I_y) {
        this.radius = radius;
        this.position.setX(I_x);
        this.position.setY(I_y);
    }
    
    public Circle(double radius) {
        this.radius = radius;
        this.position.setX(0);
        this.position.setY(0);
    }
     */
    
    // constructor hop le
    public Circle(double radius, Position position) {
        this.radius = radius;
        this.position = position;
    }
    
    public Circle() {
    }
    
    // ghi de cac phuong thuc o abstract class
    @Override
    public boolean isFilled() {
        return false;
    }

    @Override
    public boolean canBeMoved() {
        return true;
    }
    // kiem tra hai hinh tron co trung nhau
    @Override
    public boolean isTheSame(Object obj) {
        if (!(obj instanceof Circle)) {
            return false;
        }
        Circle circle = (Circle) obj;
        return ( circle.getRadius() == this.getRadius() && circle.getPosition().equals(this.getPosition()) );
    }
    // getter & setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(double x, double y) {
        this.position.setX(x);
        this.position.setY(y);
    }
    
    // tinh dien tich
    public double getArea() {
        return PI*radius*radius;
    }
    
    // tinh chu vi
    public double getPerimeter() {
        return 2*PI*radius;
    }
    
    // in ra thong tin
    public void printInfo() {
        boolean canBeMoved = this.canBeMoved();
        System.out.println("Hinh tron co tam (" + position.getX() + ", " + position.getY() + ")");
        System.out.println("Ban kinh hinh tron: " + radius);
        System.out.println("Chu vi: " + getPerimeter());
        System.out.println("Dien tich: " + getArea());
        if (isFilled()) {
            System.out.println("Hinh tron nay duoc to mau");
        }
        else System.out.println("Hinh tron nay duoc to mau");
        if (canBeMoved()) {
            System.out.println("Hinh tron nay co the di chuyen");
        }
        else System.out.println("Hinh tron nay khong the di chuyen");
    }
}
