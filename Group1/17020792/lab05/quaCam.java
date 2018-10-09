/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.Scanner;

/**
 *
 * @author CCNE
 */
public class quaCam extends hoaQua{
    protected String vungSanXuat ;
        public String getVungSanXuat(){
            return vungSanXuat ;
        }
     public void setVungSanXuat(String v){
        this.vungSanXuat = v ;
    }
    public quaCam(){
        
        this.setTen("Quả cam"); 
        this.setVungSanXuat(this.vungSanXuat);
        
        
    }
                  //hàm in tên Vùng sản xuất cam 
    public void inThongTin(){
        super.inThongTin();
        System.out.println("Vùng sản xuát : " + this.vungSanXuat);
    }
}
