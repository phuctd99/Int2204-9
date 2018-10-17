public class Main {

    public static void main(String[] args) {
        Diagram diagram = new Diagram(3);
        Shape shape1 = new Rectangle();
        Shape shape2 = new Circle(1.5, 10, 5, "blue");
        diagram.addShape(0, shape1);
        diagram.addShape(1, shape2);
        diagram.addShape(1, new Triangle());
        diagram.addShape(1, new Square());
        diagram.addShape(2, new Triangle());

        shape1.moveTo(15,15);

        diagram.printInfo();
        diagram.removeCircle();
        diagram.layers.get(2).removeTriangle();
        diagram.printInfo();
    }
}


