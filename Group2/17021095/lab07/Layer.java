/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.btt6;

import java.util.ArrayList;

/**
 *
 * @author SONY
 */
public class Layer {
    
    private Boolean visible;
    // xóa hình Triangle
    public ArrayList<Shape> lr = new ArrayList();    
    public void  DeleteTriangle(){
        for(int i=0; i<lr.size(); i++ ){
            if(lr.get(i) instanceof Triangle){
                lr.remove(i);
            i--;
        }
    }
}

    public Layer(Boolean visible) {
        this.visible = visible;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }
        
    // xóa các hình trùng nhau trong một Layer
    public void deleteSame(){
        
        for(int i=0; i<lr.size(); i++){
            for(int j =i+1; j<lr.size(); j++){
           if(lr.get(i) instanceof Rectangle && lr.get(j) instanceof Rectangle ){
               if(lr.get(i).equals(lr.get(j))){
                   lr.remove(j);
                    j--;
               }
           }                                      
            if(lr.get(i) instanceof Square && lr.get(j) instanceof Square){
               if(lr.get(i).equals(lr.get(j))){
                   lr.remove(j);
                   j--;
               }           
           } 
            if(lr.get(i) instanceof Triangle && lr.get(j) instanceof Triangle ){
               if(lr.get(i).equals(lr.get(j))){
                   lr.remove(j);    
                   j--;
               }            
           }  
            if(lr.get(i) instanceof Circle && lr.get(j) instanceof Circle){
               if(lr.get(i).equals(lr.get(j))){
                   lr.remove(j);
                   j--;
               }
            if(lr.get(i) instanceof Hexagon && lr.get(j) instanceof Hexagon){
               if(lr.get(i).equals(lr.get(j))){
                   lr.remove(j);
                   j--;
               }                                     
           }
        }
        }
    }
    }
}
