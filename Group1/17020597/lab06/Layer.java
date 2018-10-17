/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.lab6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Layer {
    public ArrayList<Shape> shapeArr = new ArrayList<> ();
    public ArrayList<Shape> input() {
        Scanner scan = new Scanner(System.in);
        
        return shapeArr;
    }
    
    public void RemoveCircle() {
        for(int i = 0; i < shapeArr.size(); i ++) {
            if(shapeArr.get(i) instanceof Circle) shapeArr.remove(i);
        }
        System.out.println("removed Circle");
    }
    
    public void RemoveTriangle() {
        for(int i = 0; i < shapeArr.size(); i ++) {
            if(shapeArr.get(i) instanceof Triangle) shapeArr.remove(i);
        }
        System.out.println("removed Triangle");
    }
    public void printLayer() {
        
        for(Shape shape : shapeArr){
            System.out.println(shape.getNameShape());
        }
        System.out.println();
    }
}
