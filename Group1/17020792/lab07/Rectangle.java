/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;



/**
 *
 * @author CCNE
 */
public class Rectangle extends Shape{
             double width ;
             double length ;
             protected Location l1 = new Location();
            protected Location l2 = new Location();
            protected Location l3 = new Location();
            public Rectangle(){
                  
             }
            public Rectangle(double w, double l ){
                  this.width = w ;
                  this.length = l ;
             }
            public Rectangle(double w, double l , String c , boolean f ){
                   this.width = w ;
                   this.length = l;
                   this.color = c ;
                   this.filled = f;
              }
            public double getWidth(){
               return width ;
            }
            public void setWidth(double w){
               this.width = w;
            }
             public double getLength(){
               return length ;
            }
            public void setLength(double l){
               this.length = l;
            }
            public double getArea(){
               return this.width*this.length ;
            }
            public double getPerimeter(){
               return 2*(this.width + this.length) ;
            }
            public boolean sameRectangle(Rectangle r2) {
        if (this.l1.sameLocation(r2.l1) && this.l2.sameLocation(r2.l2) && this.l3.sameLocation(r2.l3) && l.sameLocation(r2.l)) {
            return true;
        }

        return false;
    }
            @Override
            public String toString(){
                return "Rectangle" + this.getArea()+ " " + this.getPerimeter() + " " + color+" "+filled+" "+width+" "+length;  
             }
 }  
  

