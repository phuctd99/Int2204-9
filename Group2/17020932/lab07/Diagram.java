/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap07;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Diagram {
   protected ArrayList<Layer> layers = new ArrayList<>();
    
   public String[] toList(int i) {
       return layers.get(i).toList();
   } 
    
   public  String[] toList() {
       String[] listLayer = new String[layers.size()];
       for(int i = 0; i<listLayer.length; i++) {
           listLayer[i] = "layer " + Integer.toString(i+1);
       }
       return listLayer;
   }
   
   public void addLayer() {
       layers.add(new Layer());
   }
   
   public void addShape(int i, Shape s) {
       
      layers.get(i).shapes.add(s);
   }
   
   public void deleteEmptyLayer() {
       for(int i=0; i<layers.size(); i++) {
           if(layers.get(i).shapes.isEmpty()){
               layers.remove(i);
               i--;
           }       
       }
   }
   
   public void sort() {
       while(layers.size() < 5) {
           addLayer();
       }
       
       for(int i=0; i<layers.size(); i++){
           for(int j = 0; j<layers.get(i).shapes.size(); j++) {
               Shape tmp = layers.get(i).shapes.get(j);
               if(tmp instanceof Rectangle && i!=0){
                   layers.get(i).shapes.remove(tmp);
                   j--;
                   layers.get(0).shapes.add(tmp);
               }
               if(tmp instanceof Square && i!=1){
                   layers.get(i).shapes.remove(tmp);
                   j--;
                   layers.get(1).shapes.add(tmp);
               }
               if(tmp instanceof Triangle && i!=2){
                   layers.get(i).shapes.remove(tmp);
                   j--;
                   layers.get(2).shapes.add(tmp);
               }
               if(tmp instanceof Circle && i!=3){
                   layers.get(i).shapes.remove(tmp);
                   j--;
                   layers.get(3).shapes.add(tmp);
               }
               if(tmp instanceof Hexagon && i!=4){
                   layers.get(i).shapes.remove(tmp);
                   j--;
                   layers.get(4).shapes.add(tmp);
               }
           }
       }
       deleteEmptyLayer();
   }
   
    
    
}
