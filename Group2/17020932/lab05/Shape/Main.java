package Shape;

public class Main {
    public static void main(String[] args) {
        circle c = new circle(3.5);
        System.out.println(c.toString());
        System.out.println("Area : " + c.getArea());

        Rectangle r = new Rectangle(13.5, 20.0);
        System.out.println(r.toString());
        System.out.println("Area : " + r.getArea());

        Square s = new Square("green", true, 4.5);
        System.out.println(s.toString());
        s.setLength(4.5);
        s.setWidth(4.5);
        System.out.println("Area : " + s.getArea());
        Square square = new Square(5);
        System.out.println(square.getArea());
        square.setSide(4);
        System.out.println(square.getArea());
        square.setWidth(7);
        square.setLength(7);
        System.out.println(square.getArea());
    }
}
