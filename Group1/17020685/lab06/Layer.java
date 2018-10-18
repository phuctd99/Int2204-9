/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan_6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
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
        OUTER:
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
            switch (luachon) {
                case 1:
                    {
                        Shape s = new Circle();
                        s.input();
                        layer.add(s);
                        break;
                    }
                case 2:
                    {
                        Shape s = new Rectangle();
                        s.input();
                        layer.add(s);
                        break;
                    }
                case 3:
                    {
                        Shape s = new Square();
                        s.input();
                        layer.add(s);
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
    
    public void removeTriangle() {
        for (int i = 1; i < layer.size(); i++) {
            if (getLayer().get(i) instanceof Triangle) {
                getLayer().remove(i);
                i--;
            }
        }
    }

    
//    public static void main(String[] args) {
//        Layer la = new Layer();
//        la.input();
//        la.output();
//    }
}