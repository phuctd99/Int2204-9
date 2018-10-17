
package lab06;

import java.util.*;

public class Layer {
    public ArrayList<Shape> layer = new ArrayList<>();
    Scanner scan = new Scanner(System.in);


    public ArrayList<Shape> getLayer() {
        return layer;
    }

    public void setLayer(ArrayList<Shape> layer) {
        this.layer = layer;
    }
    public void input() {
        int luachon;
        do {
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Triangle");
            System.out.println("5. Thoat");
            do {
                System.out.println("Nhap lua chon: ");
                luachon = scan.nextInt();
                if ( luachon < 0 || luachon > 5) {
                    System.out.println("Ko hop le");
                }
            } while (luachon < 0 || luachon > 5);
            if (luachon == 1) {
                Shape s = new Circle();
                s.input();
                layer.add(s);
            } else if (luachon == 2) {
                Shape s = new Rectangle();
                s.input();
                layer.add(s);
            } else if (luachon == 3) {
                Shape s = new Square();
                s.input();
                layer.add(s);
            } else if (luachon == 4) {
                Shape s = new Triangle();
                s.input();
                layer.add(s);
            } else if (luachon == 5) {
                break;
            }
        } while (luachon > 0 && luachon < 6 );
    }
    
    public void output() {
        for (int i = 1; i <= layer.size(); i++) {
            layer.get(i).output();
        }
    }
    
    public void removeTriangle() {
        for (int i = layer.size()-1; i >=0; i--) {
            if (getLayer().get(i) instanceof Triangle) {
                getLayer().remove(i);
            }
        }
    }

}