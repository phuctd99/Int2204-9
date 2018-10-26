/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package okmen;

/**
 *
 * @author VIETTEL
 */
public abstract class hexagon extends Shape{
 protected int a ;
    
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;}
   
   @Override
     public void inputtoado(){
       // super.input();
        System.out.println("Nhap toa do a: ");
        a = super.scan.nextInt();
    }
    
    @Override
    public void outputtoado(){
        //super.output();
        System.out.println("toa do cua Hexagon: ");
        System.out.println("kich thuoc la: " + a);
    }
    
}
    
    

