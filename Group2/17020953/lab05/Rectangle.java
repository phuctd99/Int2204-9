/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;



/**
 *
 * @author Admin
 */
public class Rectangle extends Shape{
             double width = 1.0 ;
             double length = 1.0 ;
            public Rectangle(){
                  super();
             }
            public Rectangle(double w, double l ){
                  super();
                  this.width = w ;
                  this.length = l ;
             }
            public Rectangle(double w, double l , String c , boolean f ){
                   super(c, f);
                   this.width = w ;
                   this.length = l;
                   
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
              @Override
        public String toString(){
            return color+" "+filler+" "+width+" "+length;  
         }
 }  