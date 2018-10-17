import java.util.ArrayList;

public class TestDriver {
    public static void main(String[] args) {
        Shape circle = new Circle(new Point(10,10), 1);
        Shape rectangle = new Rectangle(new Point(20, 20), 20, 30);
        Shape square = new Square(new Point(60,60), 2);
        Shape triangle = new Triangle(new Point(100,100), new Point(100,200), new Point(200,250));
        Diagram diagram = new Diagram();
        ArrayList<Layer> listLayer = new ArrayList<>();
        diagram.setListLayer(listLayer);
        Layer layer = new Layer();
        ArrayList<Shape> listShape = new ArrayList<>();
        listShape.add(circle);
        listShape.add(rectangle);
        listShape.add(square);
        listShape.add(triangle);
        layer.setListShape(listShape);
        listLayer.add(layer);
        diagram.removeAllCircle();
        diagram.getListLayer().get(0).removeAllTriangle();
        for (int i = 0; i < diagram.getListLayer().size(); i++) {
            for (int j = 0; j < diagram.getListLayer().get(i).getListShape().size(); j++)
                diagram.getListLayer().get(i).getListShape().get(j).getInfo();
        }
    }
}
