/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class hoaQua {
     //thuoc tinh 
       private String ten ;
        private String nguonGoc  ;
        int soLuong ;
        
        //phuong thuc khoi tao
        public String getTen(){
               return ten;
        }
        public void setTen(String t){
            this.ten = t ;
        }
        
         public String getnguonGoc(){
            return nguonGoc ;
        }
        public void setnguonGoc(String n){
            this.nguonGoc = n ;
        }
        
         public int getsoLuong(){
            return soLuong ;
        }
        public void setsoLuong(int s){
            this.soLuong = s ;
        }
        
        public hoaQua(){
            
        }
        //hàm nhập thông tin hoa Qua
        public void nhap(){
                Scanner sc = new Scanner(System.in);
                System.out.println("Nhập tên loại quả ") ;
                this.ten  = sc.nextLine();
                System.out.println("Nhập nguồn gốc ") ;
                this.nguonGoc = sc.nextLine() ;
                System.out.println(" Nhập số Lượng ");
                this.soLuong = sc.nextInt() ;
        }
        
       // in ra thông tin hoa quả
        public void in() {
                System.out.println("Tên : " + this.ten);
                System.out.println("Nguồn gốc : " + this.nguonGoc);
                System.out.println("Số Lượng : " + this.soLuong + "kg");
    }
}
