package bai2;

public class main2 {
    public static void main(String []args){

        Shape s = new Shape();
        System.out.println(s.toString());

        Circle c = new Circle();

        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
        System.out.println(c.toString());

        Rectangle r = new Rectangle();

        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
        System.out.println(r.toString());

        Square square = new Square();
        square.setSide(5);
        System.out.println(square.toString());


    }
}
