/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.ArrayList;

/**
 *
 * @author CCNE
 */
public class Layer {
     private boolean visible;

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public ArrayList<Shape> getLayer() {
        return layer;
    }

    public void setLayer(ArrayList<Shape> layer) {
        this.layer = layer;
    }
    ArrayList<Shape> layer = new ArrayList<>();

    public ArrayList<Shape> getSha() {
        return layer;
    }

    public void setSha(ArrayList<Shape> sha) {
        this.layer = sha;
    }
    
    
    public void delete() {
        for(int i= getSha().size() -1 ; i >=0;i--){
            if(getSha().get(i) instanceof Triangle ){
                getSha().remove(i);
              }
        }
    }
    public boolean sameShape(Shape s1, Shape s2){
         if(s1 instanceof Cicrle && s2 instanceof Cicrle){
             if(((Cicrle)s1).sameCircle((Cicrle)s2)){
                 return true;
             }
         }
          if(s1 instanceof Rectangle && s2 instanceof Rectangle){
             if(((Rectangle)s1).sameRectangle((Rectangle)s2)){
                 return true;
             }
         }
          if(s1 instanceof Square && s2 instanceof Square){
             if(((Square)s1).sameSquare((Square)s2)){
                 return true;
             }
         }
          if(s1 instanceof Triangle && s2 instanceof Triangle){
             if(((Triangle)s1).sameTriangle((Triangle)s2)){
                 return true;
             }
         }
          if(s1 instanceof Hexagon && s2 instanceof Hexagon){
             if(((Hexagon)s1).sameHexagon((Hexagon)s2)){
                 return true;
             }
         }
         return false;
     }
     public void removeSameShape(){
         for(int i = 0; i < layer.size(); i++){
             for(int j = i + 1; j < layer.size(); j++){
                 if(sameShape(layer.get(i), layer.get(j)) == true){
                    layer.remove(j);
                    j--;
                 }
             }
         }
     }

   
    
}
