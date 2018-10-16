import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Shape> shapes = new ArrayList<>();
        for (int i=0; i<10; i++) {
            shapes.add(new Rectangle());
            shapes.add(new Square());
            shapes.add(new Circle());
            shapes.add(new Triangle());
        }

        Layer layer = new Layer(shapes);
        layer.removeTriangle();
        layer.print();
        System.out.println("=========================================================");
        Diagram diagram = new Diagram(layer);
        diagram.removeCircle();
        diagram.print();


    }
}
