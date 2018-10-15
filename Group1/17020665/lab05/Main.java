public class Main {
    public static void main(String [] args){
        Shape shape = new Shape();
        System.out.println(shape.getColor());
        Circle circle = new Circle();
        System.out.println(circle.getArea() + " " + circle.getPerimeter());
        if (circle.isFilled()){
            System.out.println("FILLED");
        } else {
            System.out.println("NOT FILLED");
        }
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.getArea() + " " + rectangle.getPerimeter());
        Square square = new Square();
        System.out.println(square.getSide());
    }
}
