/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package okmen;
import java.util.*;

/**
 *
 * @author VIETTEL
 */
public class Layer {
      private String nameLayer;
    public ArrayList<Shape> layer = new ArrayList<Shape>();
    Scanner scan = new Scanner(System.in);

    public String getNameLayer() {
        return nameLayer;
    }

    public void setNameLayer(String nameLayer) {
        this.nameLayer = nameLayer;
    }

    public ArrayList<Shape> getLayer() {
        return layer;
    }

    public void setLayer(ArrayList<Shape> layer) {
        this.layer = layer;
    }
    public void inputtoado() {
        System.out.println("Nhap ten Layer: ");
        nameLayer = scan.nextLine();
       
        int luachon;
        do {
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Triangle");
            System.out.println("5. Thoat va hien ket qua");
            do {
                System.out.println("Nhap lua chon: ");
                luachon = scan.nextInt();
                if ( luachon < 0 || luachon > 5) {
                    System.out.println("Ko hop le");
                }
            } while (luachon < 0 || luachon > 5);
            if (luachon == 1) {
                Shape s = new Circle();
                s.inputtoado();
                layer.add(s);
            } else if (luachon == 2) {
                Shape s = new Rectangle();
                s.inputtoado();
                layer.add(s);
            } else if (luachon == 3) {
                Shape s = new Square();
                s.inputtoado();
                layer.add(s);
            } else if (luachon == 4) {
                Shape s = new Triangle();
                s.inputtoado();
                layer.add(s);
            } else if (luachon == 5) {
      
                break;
            }
        } while (luachon > 0 && luachon < 6 );
    }
    
    public void outputtoado() {
        System.out.println("Ten: " + nameLayer);
        for (int i = 1; i <= layer.size(); i++) {
            layer.get(i).outputtoado();
        }
    }
    
    public void removeTriangle() {
        for (int i = 1; i < layer.size(); i++) {
            if (getLayer().get(i) instanceof Triangle) {
                getLayer().remove(i);
                i--;
            }
        }
    }

    public void removeCircle() {
        for (int i = 1; i < layer.size(); i++) {
            if (getLayer().get(i) instanceof Circle) {
                getLayer().remove(i);
                i--;
            }
        }
    }
}
    

