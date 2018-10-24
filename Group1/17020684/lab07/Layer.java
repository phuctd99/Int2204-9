
package tuan_6;

import java.util.ArrayList;
import java.util.Scanner;


public class Layer {
    public ArrayList<Shape> layer = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    private boolean visible;


    public ArrayList<Shape> getLayer() {
        return layer;
    }

    public void setLayer(ArrayList<Shape> layer) {
        this.layer = layer;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    
    public void input() {
        int luachon;
        OUTER:
        do {
            System.out.println("Nhap thuoc tinh TRUEorFALSE: ");
            visible = scan.nextBoolean();
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Triangle");
             System.out.println("5. Hexagon");
            System.out.println("6. Thoat");
            do {
                System.out.println("Nhap lua chon: ");
                luachon = scan.nextInt();
                if ( luachon < 0 || luachon > 6) {
                    System.out.println("Ko hop le");
                }
            } while (luachon < 0 || luachon > 6);
            switch (luachon) {
                case 1:
                    {
                        Shape sh = new Circle();
                        sh.input();
                        layer.add(sh);
                        break;
                    }
                case 2:
                    {
                        Shape sh = new Rectangle();
                        sh.input();
                        layer.add(sh);
                        break;
                    }
                case 3:
                    {
                        Shape sh = new Square();
                        sh.input();
                        layer.add(sh);
                        break;
                    }
                case 4:
                    {
                        Shape s = new Triangle();
                        s.input();
                        layer.add(s);
                        break;
                    }
                case 5:
                {
                    Shape s = new Hexagon();
                    s.input();
                    layer.add(s);
                }
                case 6:
                    break OUTER;
                default:
                    break;
            }
        } while (luachon > 0 && luachon < 6);
    }
    
    public void output() {
        for (int i = 1; i <= layer.size(); i++) {
            layer.get(i).output();
        }
    }
    
    public void xoaTriangle() {
        for (int i = 1; i < layer.size(); i++) {
            if (getLayer().get(i) instanceof Triangle) {
                getLayer().remove(i);
                i--;
            }
        }
    }
    
    public boolean sameShape(Shape s1, Shape s2) {
        if (s1 instanceof Circle && s2 instanceof Circle) {
            if (((Circle)s1).sameCircle((Circle)s2)) {
                return true;
            }
        }
        
        if (s1 instanceof Rectangle && s2 instanceof Rectangle) {
            if (((Rectangle)s1).sameRectangle((Rectangle)s2)) {
                return true;
            }
        }
        
        if (s1 instanceof Triangle && s2 instanceof Triangle) {
            if (((Triangle)s1).sameTriangle((Triangle)s2)) {
                return true;
            }
        }
        
        if (s1 instanceof Square && s2 instanceof Square) {
            if (((Square)s1).sameSquare((Square)s2)) {
                return true;
            }
        }
        
        if (s1 instanceof Hexagon && s2 instanceof Hexagon) {
            if (((Hexagon)s1).sameHexagon((Hexagon)s2)) {
                return true;
            }
        }
        return false;    
        
    }
    
    public void removeShape() {
        for (int i = 0; i < layer.size(); i++) {
            for (int j = i+1; j < layer.size(); j++) {
                if ((sameShape(layer.get(i), layer.get(j))) == true) {
                    layer.remove(j);
                    j--;
                }
            }
        }
    }
//    public static void main(String[] args) {
//        Layer la = new Layer();
//        la.input();
//        la.output();
//    }
}