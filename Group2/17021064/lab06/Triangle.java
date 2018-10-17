public class Triangle extends Shape {
    private Location A, B, C;
    //setter/getter
    public Location getA() {
        return A;
    }

    public void setA(Location a) {
        A = a;
    }

    public Location getB() {
        return B;
    }

    public void setB(Location b) {
        B = b;
    }

    public Location getC() {
        return C;
    }

    public void setC(Location c) {
        C = c;
    }
    //Khởi tạo
    public Triangle(Location A, Location B, Location C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }
    public Triangle(Location A, Location B, Location C, String color, boolean filler) {
        super(color, filler);
        this.A = A;
        this.B = B;
        this.C = C;
    }

    //tính diên tích
    public double getArea() {
        double p = (A.distance(B) + B.distance(C) + A.distance(C)) / 2;
        double heron = p * (p - A.distance(B)) * (p - B.distance(C)) * (p - A.distance(C)); //Công thức He-ron;
        heron  = Math.sqrt(heron);
        return heron;
    }
    //tính chu vi
    public double getPerimeter() {
        return( A.distance(B) + B.distance(C) + A.distance(C) );
    }

    @Override
    public String toString() {
        return "Diện tích: " + this.getArea() + " | Chu vi: " + this.getPerimeter() + " | " + super.toString();
    }
}