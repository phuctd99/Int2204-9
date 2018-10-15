/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import thuchanh5.Thuchanh5;

/**
 *
 * @author Admin
 */
public class camCaoPhong extends quaCam {
          private double giaBan1kg ;
           public double getgiaBan1kg(){
              return giaBan1kg ;
        }
        public void setgiaBan1kg(double s){
            this.giaBan1kg = s ;
        }
        public camCaoPhong(){
            this.vungSanXuat = "Hòa Bình" ;
            this.giaBan1kg = 0.0;
        }
    }
