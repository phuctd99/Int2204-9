/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab06;

import java.util.ArrayList;

/**
 *
 * @author SONY
 */
public class Layer {
    public ArrayList<Shape> als = new ArrayList();  

     
    private Boolean visible;
    // xóa hình Triangle
      
    public void  DeleteTriangle(){
        for(int i=0; i<als.size(); i++ ){
            if(als.get(i) instanceof Triangle){
                als.remove(i);
            i--;
        }
    }
}
    // Thuộc tính visible
    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }
    
    
        
    // xóa các hình trùng nhau trong một Layer
    public void deleteSame(){
        
        for(int i=0; i<als.size(); i++){
            for(int j =i+1; j<als.size(); j++){
           if(als.get(i) instanceof Rectangle && als.get(j) instanceof Rectangle ){
               if(als.get(i).equals(als.get(j))){
                   als.remove(j);
                    j--;
               }
           }                                      
            if(als.get(i) instanceof Square && als.get(j) instanceof Square){
               if(als.get(i).equals(als.get(j))){
                   als.remove(j);
                   j--;
               }           
           } 
            if(als.get(i) instanceof Triangle && als.get(j) instanceof Triangle ){
               if(als.get(i).equals(als.get(j))){
                   als.remove(j);    
                   j--;
               }            
           }  
            if(als.get(i) instanceof Circle && als.get(j) instanceof Circle){
               if(als.get(i).equals(als.get(j))){
                   als.remove(j);
                   j--;
               }
            if(als.get(i) instanceof Hexagon && als.get(j) instanceof Hexagon){
               if(als.get(i).equals(als.get(j))){
                   als.remove(j);
                   j--;
               }                                     
           }
        }
        }
    }
    }
}
