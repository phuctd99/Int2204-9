package Lab06;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

Diagram Diagram = new Diagram();
Layer layer = new Layer();
Diagram.Layers.add(layer);

        layer.Shapes.add(new Rectangle(2, 5, true, false, 2.1, 3.2));
        layer.Shapes.add(new Rectangle(2, 5, true, false, 2.1, 3.2));

        layer.Shapes.add(new Circle(6, 9, true, true, 2.3));
        layer.Shapes.add(new Circle(15, 85, true, true, 19.3));
        layer.Shapes.add(new Circle(15, 85, true, true, 19.3));

        layer.Shapes.add(new Triangle(50, 70, true, true, 10, 20, 04, 20));
        //layer.TriangleRemove();
        //Diagram.CircleRemove();
        layer.DeleteSame();
	System.out.println("There are " + layer.Shapes.size() + " shape(s)");

    }
}

