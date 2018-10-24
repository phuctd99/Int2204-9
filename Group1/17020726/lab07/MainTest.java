public class MainTest {

    public static void main(String[] args) {
        //Test tinh chu vi
        System.out.println("Chu vi: "+new Triangle("white",1, 2, 5,3,4).getPerimeter());

        //Test print layer
        Layer layer = new Layer();
        layer.add(new Triangle("white",1, 2, 5,3,4));
        layer.add(new Square("black",2, 5, 4 ));
        layer.add(new Circle("black",4, 2, 5));
        layer.add(new Rectangle("red",2, 3, 1, 5 ));
        layer.add(new Hexagon("blue",1, 2, 10 ));
        layer.add(new Hexagon("no color", 1, 2, 10));
        System.out.println(layer);

        //Test remove SameShape
        layer.removeSame();
        System.out.println(layer);

        //Tets remove Triangle
        System.out.println("Remove Triangle");
        layer.removeTriangle();



        // Test print diagram
        System.out.println("Diagram:");
        Diagram diagram = new Diagram("Example diagram");
        diagram.addLayer(layer);
        Layer layer_1 = new Layer();
        layer_1.add(new Rectangle("no color",2, 3, 6, 10));
        layer_1.add(new Hexagon("black", 1, 3, 4));
        layer_1.add(new Circle("pink",2, 2, 6));
        diagram.addLayer(layer_1);
        System.out.println(diagram.toString());

        //remove circle from diagram
        System.out.println("Remove circle: ");
        diagram.removeCircle();
        System.out.println(diagram.toString());

        //tach cac hinh ve tung layer
        layer.setVisible(true);
        layer.add(new Circle("red", 4, 4, 4));
        layer_1.add(new Circle("pink", 2, 4, 8));
        System.out.println(diagram);
        System.out.println("Tach ve tung layer thu duoc: ");
        diagram.formatLayer();
        System.out.println(diagram);

        //test visible
        layer.setVisible(false);
        System.out.println(diagram);
    }
}

