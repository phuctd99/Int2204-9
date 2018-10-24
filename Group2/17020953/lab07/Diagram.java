/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Diagram {
    Layer Circles = new Layer() ;
    Layer Rectangles = new Layer();
    Layer Squares = new Layer();
    Layer Triangles = new Layer();
    Layer Hexagons = new Layer();
    private ArrayList<Layer> layerArrayList = new ArrayList<>();

    public ArrayList<Layer> getLayerArrayList() {
        return layerArrayList;
    }

    public void setLayerArrayList(ArrayList<Layer> layerArrayList) {
        this.layerArrayList = layerArrayList;
    }

    public void delete (){
        for(int i = layerArrayList.size() - 1; i >= 0;i--){
            for(int j = 0; j < getLayerArrayList().get(i).getShapeArrayList().size();j++)
                if(layerArrayList.get(i).getShapeArrayList().get(j)instanceof Circle){
                    layerArrayList.get(i).getShapeArrayList().remove(j);
                    j--;
                }
        }
    }
     // them hinh ve moi loai vao layer khac nhau
    public void insertLayer(){
      for(int i = layerArrayList.size()-1 ; i>=0 ; i--){
          for(int j =0 ; j<getLayerArrayList().get(i).getShapeArrayList().size() ; j++){
                 Shape s = layerArrayList.get(i).getShapeArrayList().get(j);
                 if(s instanceof Circle){
                      this.Circles.getShapeArrayList().add(s);
                 }
                 else {
                     if(s instanceof Rectangle){
                         this.Rectangles.getShapeArrayList().add(s); 
                     }
                     else{
                         if(s instanceof Square ){
                            this.Squares.getShapeArrayList().add(s);
                        }
                         else{
                             if (s instanceof Triangle) {
                                 this.Triangles.getShapeArrayList().add(s);
                             }
                             else this.Hexagons.getShapeArrayList().add(s);
                         }
                           
                     }               
                 }
      
          } 
      }
    } 
    
    
}
