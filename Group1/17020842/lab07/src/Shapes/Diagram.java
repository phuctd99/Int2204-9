/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes;

import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Duykypaul
 */
public class Diagram extends JFrame{

    ArrayList<Layer> layers = new ArrayList<>();
    ArrayList<Layer> layers1 = new ArrayList<>();
    ArrayList<String> names = new ArrayList<>();

    public void init(int n) {
        for (int i = 0; i < n; i++) {
            Layer layer = new Layer(true);
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

    public int numberType() {
        for (int i = 0; i < layers.size(); i++) {
            for (int j = 0; j < layers.get(i).shapes.size(); j++) {
                if (!names.contains(layers.get(i).shapes.get(j).getClass().getName())) {
                    names.add(layers.get(i).shapes.get(j).getClass().getName());
                }
            }
        }
        return names.size();
    }

    public void balan() {
//        int size = layers.size();
//        if (layers.size() < numberType()) {
//            for (int i = 0; i < numberType() - size; i++) {
//                Layer layer = new Layer();
//                layers.add(layer);
//            }
//        }
        for (int i = 0; i < numberType(); i++) {
            Layer layer = new Layer(true);
            layers1.add(layer);
        }
    }

    public void distributeShapes() {

        for (int i = 0; i < layers.size(); i++) {

            for (int j = 0; j < layers.get(i).shapes.size(); j++) {

                for (int k = 0; k < names.size(); k++) {

                    String str = layers.get(i).shapes.get(j).getClass().getName();

                    if (str.equals(names.get(k))) {
                        layers1.get(k).shapes.add(layers.get(i).shapes.get(j));
                    }
                }
            }
        }
    }

    /*public void distributeShapes1() {

        for (int i = 0; i < layers.size(); i++) {

            for (int j = 0; j < layers.get(i).shapes.size(); j++) {

                for (int k = 0; k < names.size(); k++) {

                    String str = layers.get(i).shapes.get(j).getClass().getName();

                    // && !layers.get(k).shapes.contains(layers.get(i).shapes.get(j))
                    if (str.equals(names.get(k))) {
                        layers.get(k).shapes.add(layers.get(i).shapes.get(j));
                        layers.get(i).shapes.remove(j);
                        j--;
                        break;
                    }
                }
            }
        }
    }*/

    public static void main(String[] args) {
        Diagram diagram = new Diagram();
        diagram.init(2);

//        diagram.balan();
//        System.out.println(diagram.numberType() + " " + diagram.layers.size());
//        diagram.distributeShapes();
//        
//        diagram.layers = diagram.layers1;
//        //diagram.layers1.clear();
//        for (int i = 0; i < diagram.layers.size(); i++) {
//
//            for (int j = 0; j < diagram.layers.get(i).shapes.size(); j++) {
//
//                System.out.println(diagram.layers.get(i).shapes.get(j).getClass().getName());
//            }
//            System.out.println();
//        }
        
        
        
    }
}
