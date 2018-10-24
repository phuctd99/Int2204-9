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
public class Square extends Shape{
     protected int length;
    
    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
    
    @Override
    public void inputtoado(){
//        super.input();
        System.out.println("Nhap toa do Square : ");
        length = super.scan.nextInt();
    }
    
    @Override
     public void outputtoado(){
//        super.output();
        System.out.println("toa do cuaSquare  la: " +" ("+ " "+length+" " + length+" "+length+" "+ length+" "+")");
        System.out.println("kich thuoc la:"+ length*length);
    }
     

}


