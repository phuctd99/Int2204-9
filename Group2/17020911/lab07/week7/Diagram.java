/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

/**
 *
 * @author CCNE
 */
//public class Diagram {
//    Layer x=new Layer();
//    public void removecircle()
//    {
//        for(int i=0;i<x.layer.size();i++)
//        {
//            if(x.layer.get(i) instanceof Circle)
//            {
//                x.layer.remove(i);
//                i--;
//            }
//        }
//    }
//}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author DELL
 */
public class Diagram extends JFrame {

    ArrayList<Layer> diagram = new ArrayList<>();

    public ArrayList<Layer> getLayers() {
        return diagram;
    }

    public void setLayers(ArrayList<Layer> layers) {
        this.diagram = diagram;
    }

    // Delete Circle in Diagram
    public void removeCircle() {
        for (int i = 0; i < diagram.size(); i++) {
            for (int j = 0; j < diagram.get(i).layer.size(); j++) {
                if (diagram.get(i).layer.get(j) instanceof Circle) {
                    diagram.get(i).layer.remove(j);
                    j--;
                }
            }
        }

    }

    // Chuyển tất cả hình tròn vào 1 layer
    public void circleToLayer(ArrayList<Shape> listShapes) {
        
        for (int i = 0; i < diagram.size(); i++) {
 
            for (int j = 0; j < diagram.get(i).layer.size(); j++) {
                if (diagram.get(i).layer.get(j) instanceof Circle) {
            
                    listShapes.add(diagram.get(i).layer.get(j));
                }
            }
        }
        for (int i = 0; i < diagram.size(); i++) {
            for (int j = 0; j < diagram.get(i).layer.size(); j++) {
               
                if (diagram.get(i).layer.get(j) instanceof Circle) {
                    diagram.get(i).layer.remove(j);
                    j--;
                }
            }
        }
    }

}