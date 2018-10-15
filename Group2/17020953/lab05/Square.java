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
 // Square là lớp kế thừa của Rectangle 
   public class Square extends Rectangle{
            public Square(){
                super();
            }
            public Square(double size){
                super(size , size);
            }
            public Square(double size , String c , boolean f ){
                 super(size , size , c , f);
              }
            public double getSize(){
                return super.getWidth() ;
            }
            public void setSize(double size){
                this.width = size ;
                this.length = size ;
            }
         
            @Override
            public void setWidth(double size){
                 super.setWidth(size); 
                 super.setLength(size);
            }
            @Override
            public void setLength(double size){
                 super.setLength(size);
                 super.setWidth(size) ;
            }
            @Override
            public String toString(){
                return color+" "+filler+" "+width;  
            }
   }