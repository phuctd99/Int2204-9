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
public class Rectangle extends Shape{
    protected int length, width;
   
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
    
    @Override
    public void inputtoado() {
//        super.input();
        System.out.println("toado dai la: ");
        setLength(super.scan.nextInt());
        System.out.println("toado la: ");
        setWidth(super.scan.nextInt());
    }
    
    @Override
    public void outputtoado() {
//        super.output();
        System.out.println("toado Rectangle la: " +"( "+ getWidth()+" " + getLength()+ " )");
        System.out.println("kich thuoc la:" + getWidth()*getLength());
    }
    
}
 

