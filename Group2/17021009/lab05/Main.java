package Cau2;

public class Main {
    public static void main( String[] args) {

        Circle circle = new Circle( 6.0, "blue", true);
        System.out.println( "Hình tròn: ");
        System.out.println( "Bán kính: " + circle.getRadius() );
        System.out.println( "Màu sắc: " + circle.getColor() );
        System.out.println( "Is filled: " + circle.isFilled() );
        System.out.println( "Chu vi: " + circle.getPerimeter() );
        System.out.println( "Diện tích: " + circle.getArea() );
        System.out.println( circle.toString() );
        System.out.println();


        Rectangle rectangle = new Rectangle(3.0, 2.0, "blue", true);
        System.out.println( "Hình chữ nhật: ");
        System.out.println( "Chiều rộng: " + rectangle.getWidth() );
        System.out.println( "Chiều cao: " + rectangle.getLength() );
        System.out.println( "Màu sắc: " + rectangle.getColor() );
        System.out.println( "Is filled: " + rectangle.isFilled() );
        System.out.println( "Chu vi: " + rectangle.getPerimeter() );
        System.out.println( "Diện tích: " + rectangle.getArea() );
        System.out.println( rectangle.toString() );
        System.out.println();


        Square square = new Square( "red", true, 2);
        System.out.println( "Hình vuông: ");
        System.out.println( "Cạnh: " + square.getSide());
        System.out.println( "Màu sắc: " + square.getColor());
        System.out.println( "Is filled: " + square.isFilled());
        System.out.println( "Chu vi: " + square.getPerimeter() );
        System.out.println( "Diện tích: " + square.getArea() );
        System.out.println( square.toString());
        System.out.println();
    }
}
