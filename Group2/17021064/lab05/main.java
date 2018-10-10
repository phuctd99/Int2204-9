public class main {

    public static void main(String[] args){
        Shape s = new Shape("xanh", true);
        Circle c = new Circle(4, "vang", true);
        Rectangle r = new Rectangle(2, 4, "đỏ", true);
        Square sq = new Square(3, "cam", true);
        System.out.println("shape: " + s.toString());
        System.out.println("circle: " + c.toString());
        System.out.println("rectangle: " +  r.toString());
        System.out.println("square: " + sq.toString());
    }

}
