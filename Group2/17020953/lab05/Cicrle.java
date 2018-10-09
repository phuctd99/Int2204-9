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
public class Cicrle extends Shape{
       private double radius = 1.0;
       private final double PI = 3.14159 ; // PI là hằng nên để final.
       public Cicrle(){
           
       }
       public Cicrle(double r){
          super();
          this.radius = r ;
       }
       public Cicrle(double r , String c , boolean f){
            super(c ,f);
            this.radius = r ;
       }
        public double getRadius(){
             return radius ;
        }
        public void setRadius(double r){
             this.radius = r ;
        }
        public double getArea(){
              return PI*(this.radius * this.radius) ;
        }
        public double getPerimeter(){
              return 2*PI*radius ;
        }
         @Override
        public String toString(){//ghi de phuong thuc toString()  
            return color+" "+filler+" "+ radius;  
 }  
   }