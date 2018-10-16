/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_06;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Layer {
    ArrayList<Shape> listShape = new ArrayList();
       Shape cr = new Circle("red", 2, 3, 5);
       Shape re = new Rectangle("red", 2, 3, 7, 8);
       Shape tri = new Triangle("red", 0, 0, 5, 6, 7,8);
       Shape sq = new Square("yelow", 0, 0, 8);
    
    public void addLayer(){
        listShape.add(cr);
        listShape.add(re);
        listShape.add(tri);
        listShape.add(sq);
               
       
    }
    
    public void delShape_Rectangle(){
        for (int i = 0; i < listShape.size(); i++){
            if(listShape.get(i) instanceof Rectangle)
                listShape.remove(i);
    }
    }
    
    public void delShape_Circle(){
        for(int i = listShape.size(); i>0 ; i--){
            if(listShape.get(i) instanceof Circle)
                listShape.remove(i);
        }
    }
   
}
        
