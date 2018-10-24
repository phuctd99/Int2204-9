/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;
import java.util.*;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
 *
 * @author CCNE
 */
public class Layer extends JPanel{
    private List<Shape> shapes;
    private boolean visible;
    public Layer(){
        shapes = new LinkedList<>();
        visible = true;
        init();
    }
    public Layer(List<Shape> shapes){
        this.shapes = shapes;
        visible = true;
        init();
    }
    public List<Shape> getShapes() {
        return shapes;
    }
    public void setShapes(List<Shape> shapes) {
        this.shapes = shapes;
    }
    @Override
    public boolean isVisible() {
        return visible;
    }
    @Override
    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    public void removeTriangle(){
        for(Shape var : shapes){
            if(var instanceof Triangle){
                shapes.remove(var);
            }
        }
    }
    public void removeDuplicate(){
        for(Shape v1 : shapes){
            for(Shape v2 : shapes){
                if(v1.hashCode() != v2.hashCode() && v1.equals(v2)){
                    shapes.remove(v2);
                }
            }
        }
    }
    public void printlnComponent(){
        for(Shape v1 : shapes){
            System.out.println(v1);
        }        
    }
    public void init(){       
        setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        setBackground(new java.awt.Color(204, 204, 204));     
        setLocation(0,0);
        setSize(400,400);
        
        for(Shape var : shapes) {
            add(var);
        }
    }
}
