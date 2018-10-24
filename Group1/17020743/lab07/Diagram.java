/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

import java.util.List;
import java.util.LinkedList;
import javax.swing.*;
        
/**
 *
 * @author CCNE
 */
public class Diagram extends JFrame{
    private List<Layer> layers;
    public Diagram(){
        layers = new LinkedList<>();
        initComponent();
    }
    public Diagram(List<Layer> layers) {
        this.layers = layers;
        initComponent();
    }
    
    public List<Layer> getLayers() {
        return layers;
    }
    public void setLayers(List<Layer> layers) {
        this.layers = layers;
    }
    public void removeCircle(){
        for(Layer v1 : layers){
            List<Shape> shapes = v1.getShapes();
            for(Shape v2: shapes){
                if(v2 instanceof Circle){
                    shapes.remove(v2);
                }
            }
            v1.setShapes(shapes);
        }
    }
    public void divideShapes(){
        // gộp cung các shape
        List<Shape> nShapes = new LinkedList<>();
        for(Layer var: layers){
            List<Shape> shapes = var.getShapes();
            nShapes.addAll(shapes);
        }
        //tách ra từng layer
        layers.removeAll(layers);
        for(Shape v1: nShapes){
            List<Shape> shapes = new LinkedList<>();
            shapes.add(v1);
            for(Shape v2: nShapes){
               if(v2.hashCode()!= v1.hashCode()
               && v1.getClass() == v2.getClass()){
                   shapes.add(v2);
                   nShapes.remove(v2);
               }
            }
            layers.add(new Layer(shapes));
        }
    }
    
    public void printComponent(){
        for(Layer v1 : layers){
            List<Shape> shapes = v1.getShapes();
            for(Shape v2: shapes){
                System.out.println(v2);
            }
        }
    }
    
    private void initComponent(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocation(550, 25);
        setVisible(true);
        //
        Shape s = new Circle(100,0,0); 
        Shape s1 = new Circle(100,20, 20); 
        List<Shape> shapes = new LinkedList<>();
        shapes.add(s);
        shapes.add(s1);
        Layer l = new Layer(shapes);
        getContentPane().add(l);
        
    }
}
