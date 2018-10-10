/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author CCNE
 */
public class quaTao extends hoaQua{
    
        private double giaBan ;
        public double getgiaBan1kg(){
              return giaBan ;
        }
        public void setgiaBan1kg(double s){
            this.giaBan = s ;
        }
          
        public void inThongTin(){
            super.inThongTin();
            System.out.println("Giá bán : " + this.giaBan + " vnd");
        }
    
}
