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
public class Shape {
       String color = "Red"  ;   /*biến không để private để cho các class con 
                              kế thừa thuộc tính */
        boolean filler = true;
        private boolean getPerimeter;
        public Shape(){
             
        }
        public Shape(String colors , boolean fillers){
             this.color = colors ;
             this.filler = fillers ;
        }
        public String getColor(){
            return color ;
        }
        public void setColor(String c){
            this.color = c ;
        }
        public boolean isFiller(){
             return true ;
        }
        public void setFiller(boolean f){
              this.filler = f;
        }
        @Override
        public String toString(){//ghi de phuong thuc toString()  
            return color+" "+filler;  
 }  
}
