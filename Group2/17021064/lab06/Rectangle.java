
public class Rectangle extends Shape {
    private Location A, B, C, D;

    public Rectangle() {
        this.A = new Location(0, 0);
        this.B = new Location(0, 0);
        this.C = new Location(0, 0);
        this.D = new Location(0, 0);
    }

    public Rectangle(Location A, Location B, Location C, Location D) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }

    public Rectangle(Location A, Location B, Location C, Location D, String c, boolean f) {
        super(c, f);
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }

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

    public Location getD() {
        return D;
    }

    public void setD(Location d) {
        D = d;
    }

    public double getArea() {
        return (A.distance(B)) * (B.distance(C));
    }

    public double getPerimeter() {
        return 2 * (A.distance(B) + C.distance(B));
    }

    @Override
    public String toString() {
        return "Diện tích: " + this.getArea() + " | Chu vi: " + this.getPerimeter() + " | " + super.toString();
    }
}