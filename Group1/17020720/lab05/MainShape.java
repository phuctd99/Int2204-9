package DoThi;

public class MainShape {
    public static void main(String[] args){
        Shape shape = new Shape("xanh", true);
        System.out.println("Shape: " + shape.toString());
        System.out.println();

        Shape square = new Square("do cam", true, 10, 10, 15);
        System.out.println("Square: " + square.toString());
        System.out.println();

        Shape rectangle = new Rectangle("vang", true, 5, 7);
        System.out.println("Rectangle: " + rectangle.toString() );
        System.out.println();

        Shape circle = new Circle("Vang", true, 3);
        System.out.println("Circle: " + circle.toString());
    }
}
