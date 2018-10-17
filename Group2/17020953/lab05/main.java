/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import thuchanh5.ex2;

/**
 *
 * @author Admin
 */
public class main {
    public static void main(String [] agrs){
        Shape s = new Shape() ;
            System.out.println(s.toString() );
            Cicrle c = new Cicrle(5.0) ;
            System.out.println(c.toString() );
            System.out.println("dien tich hinh  tron :"+c.getArea() );
           Rectangle r = new Rectangle(2.0 , 3.0 , "Green" , true ) ;
            System.out.println(r.toString() );
            System.out.println("Chu vi hinh chu nhat : "+r.getPerimeter() );
            Square sq = new Square() ;
            sq.setSize(4.0);
            System.out.println(sq.toString() );
    }
}
