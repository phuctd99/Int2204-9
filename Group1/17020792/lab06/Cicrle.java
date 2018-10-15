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
public abstract class Cicrle extends Shape{
       private double radius ;
       private final double PI = 3.14159 ; 
       public Cicrle(){
       
       }
       public Cicrle(double r){
          this.radius = r ;
       }
       public Cicrle(double r , String c , boolean f){
           this.radius = r ;
           this.color =  c ;
           this.filled = f ;
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
            return "Cicrle : " + this.getArea()+ " " + this.getPerimeter() + " " + super.toString()+ " "+ radius;  
 }  
}
