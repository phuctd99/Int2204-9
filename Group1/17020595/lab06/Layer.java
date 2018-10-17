/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_t6;

import java.util.*;

/**
 *
 * @author Administrator
 */
public class Layer {
    ArrayList list = new ArrayList();
    public void inLayer(){
        
    Shape s = new Circle();
        list.add(s);
        s = new Trianghle();
        list.add(s);
        s = new Square();
        list.add(s);
        s= new Circle();
        list.add(s);
        s= new Square();
        list.add(s);
        
    }
    
    
    public ArrayList<Shape> deleteTri(){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) instanceof Trianghle){
                list.remove(i);
                System.out.println("Da xoa");
                
            }           
        }
        return list;
    }
}
