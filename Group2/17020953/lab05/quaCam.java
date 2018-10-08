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
public class quaCam extends hoaQua{
                  String vungSanXuat ;
                  public String getVungSanXuat(){
                         return vungSanXuat ;
                  }
                  public void setVungSanXuat(String v){
                         this.vungSanXuat = v ;
                  }
                  public quaCam(){
                       super() ;
                  }
                  public void nhapTenVung(){
                      Scanner sc = new Scanner(System.in);
                      System.out.println("Tên vùng sản xuất cam : ") ;
                      this.vungSanXuat = sc.nextLine() ;
                  }
                  //hàm in tên Vùng sản xuất cam 
                  public void inTenVung(){
                    System.out.println("Vùng sản xuất Cam " + this.vungSanXuat);                 
                  }
}
    
