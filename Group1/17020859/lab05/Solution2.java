public class Solution2 {

    public static void main (String[] args) {
        Shape Shape = new Shape();
        System.out.println(Shape.getColor());
        Circle Circle = new Circle();
        System.out.println(Circle.getArea() + " " + Circle.getPerimeter());
        if (Circle.isFilled()) {
            System.out.println("filled");
        } else {
            System.out.println("notfilled");
        }
        Rectangle Rectangle = new Rectangle();
        System.out.println(Rectangle.getArea() + " " + Rectangle.getPerimeter());
        Square Square = new Square();
        System.out.println(Square.getSide());
    }
}
