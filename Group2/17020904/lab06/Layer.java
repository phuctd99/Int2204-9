package Lab06;

import java.util.ArrayList;

public class Layer {
    public ArrayList<Shape> sp = new ArrayList<Shape>();

    public void DeleteTriangle(ArrayList a) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) instanceof Triangle) {
                a.remove(i);
                i--;
            }
        }
    }
}