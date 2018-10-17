/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;

import java.util.ArrayList;

/**
 *
 * @author phixuanhoan
 */
public class Diagram {

    ArrayList<Layer> layers = new ArrayList<>();

    public void init(int n) {
        for (int i = 0; i < n; i++) {
            Layer layer = new Layer();
            layer.init();
            layers.add(layer);
        }
    }

    public void removeCircleLayer() {
        for (int i = 0; i < layers.size(); i++) {
            layers.get(i).removeCircle();
        }
    }

    public void removeTriangleLayer() {
        for (int i = 0; i < layers.size(); i++) {
            layers.get(i).removeTriangle();
        }
    }

    public void output() {
        for (int i = 0; i < layers.size(); i++) {
            layers.get(i).output();
        }
    }

    public static void main(String[] args) {
        Diagram diagram = new Diagram();
        diagram.init(1);
        diagram.output();
        diagram.removeCircleLayer();
        System.out.println("\nSAU KHI XÓA Circle");
        diagram.output();
        diagram.removeTriangleLayer();
        System.out.println("\nSAU KHI XÓA Triangle");
        diagram.output();
        
        diagram.layers.get(0).shapes.get(0).moveTo(10, 15);
        diagram.layers.get(0).shapes.get(0).output();
       
    }
}

/*interface Printable {
}

class A implements Printable {

    public void a() {
        System.out.println("Phuong thuc a");
    }
}

class B implements Printable {

    public void b() {
        System.out.println("Phuong thuc b");
    }
}

class Call {

    void invoke(Printable p) { //Day la upcasting
        if (p instanceof A) {
            A a = (A) p;//Day la Downcasting
            a.a();
        }
        if (p instanceof B) {
            B b = (B) p;//Day la Downcasting
            b.b();
        }

    }
}//Phan cuoi cua lop Call

class Test4 {

    public static void main(String args[]) {
        Printable p = new B();
        Call c = new Call();
        c.invoke(p);
    }
}*/
