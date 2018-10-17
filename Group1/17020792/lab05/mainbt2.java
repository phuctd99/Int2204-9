/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;


import javafx.scene.shape.Circle;

/**
 *
 * @author CCNE
 */
public class mainbt2 {
    
    public static void main(String[] args){
            Shape s = new Shape("xanh", true);
            Cicrle c = new Cicrle(2, "vang", true);
            Rectangle r = new Rectangle(2, 4, "đỏ", true);
            Square sp = new Square(3, "cam", true);
            System.out.println(s.toString());
            System.out.println(c.toString());
            System.out.println(r.toString());
            System.out.println(sp.toString());
    }
            
            
}
