package Exercise;

import java.util.ArrayList;
import java.util.List;

public class Layer {
    public List<Shape> shapes = new ArrayList<Shape>();

    //constructor
    public Layer() {
    }


    //function
    public void addShape(Shape shape) {
        shapes.add(shape);
    }
    public void printInfo() {
        for (int i = 0; i < shapes.size(); i++) {
            System.out.println(shapes.get(i));
        }
    }
    public void removeCircle() {
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Circle) {
                shapes.remove(i);
                i--;
            }
        }
    }

    public void removeSquare() {
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Square) {
                shapes.remove(i);
                i--;
            }
        }
    }

    public void removeRectangle() {
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Rectangle) {
                shapes.remove(i);
                i--;
            }
        }
    }

    public void removeTriangle() {
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Triangle) {
                shapes.remove(i);
                i--;
            }
        }
    }
}