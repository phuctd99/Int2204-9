/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap06;

import java.util.ArrayList;

/**
 *
 * @author Hoang Vu Huong
 */
public class Diagram {
    ArrayList<Layer> listLayer = new ArrayList<>();
    public void init(int n) {
        for (int i = 0; i < n; i++) {
            Layer l = new Layer();
            l.init();
            listLayer.add(l);
        }
    }

    public void removeCircleLayer() {
        for (int i = 0; i < listLayer.size(); i++) {
            listLayer.get(i).removeCircle();
        }
    }

    public void removeTriangleLayer() {
        for (int i = 0; i < listLayer.size(); i++) {
            listLayer.get(i).removeTriangle();
        }
    }

    public void output() {
        for (int i = 0; i < listLayer.size(); i++) {
            listLayer.get(i).output();
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
        
        diagram.listLayer.get(0).listShape.get(0).moveTo(10, 15);
        diagram.listLayer.get(0).listShape.get(0).output();
        int a = 1, b = 2;
       
    }
}
