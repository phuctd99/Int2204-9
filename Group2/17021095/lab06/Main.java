/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.btt6;

/**
 *
 * @author SONY
 */
public class Main {
    
    public static void main (String args[]){
            Layer d = new Layer();
            Diagram a = new Diagram();
            Triangle g = new Triangle();
            d.lr.add(g);
            d.DeleteTriangle();
            Circle c = new Circle();
            d.lr.add(c);
            a.dg.add(d);
            a.DeleteCircle();           
            
    }
    
}
