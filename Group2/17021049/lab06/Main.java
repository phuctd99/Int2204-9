package lab6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Shape cir = new Circle(new Point(0,0), 2);
        Shape rec = new Rectangle(new Point(10, 10), new Point(40,45));
        Shape sq = new Square(new Point(60,60), new Point(70,70));
        Shape tri = new  Triangle(new Point(50,50), new Point(70,100), new Point(120,150));
        ArrayList<Layer> listLayer = new ArrayList<>();
        Diagram di = new Diagram();
        di.setListLayer(listLayer);
        Layer layer = new Layer();
        ArrayList<Shape> listShape = new ArrayList<>();
        listShape.add(cir);
        listShape.add(rec);
        listShape.add(sq);
        listShape.add(tri);
        layer.setListShape(listShape);
        listLayer.add(layer);
        di.eraseAllCircle();
        layer.eraseAllTriangle();
        System.out.println(listShape.size());
    }
}
