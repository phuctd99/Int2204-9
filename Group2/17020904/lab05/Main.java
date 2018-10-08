package Lab052;

public class Main {
    public static void main(String args[]) {
        Circle c = new Circle(2.10);
        System.out.println(c.getArea());
        System.out.println(c.getColor());

        Rectangle r = new Rectangle(3.0, 5.0);
        Square s = new Square(3);
        System.out.println(s.getArea());
        System.out.println(r.getArea());

        Square q = new Square(42.0);
    }
}
