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
public class Circle extends Shape{
      private int radius,x;
    
  @Override
    public void inputtoado() {
//        super.input();
        System.out.println("Nhap ban kinh: ");
        radius = super.scan.nextInt();
    }
    
    @Override
    public void outputtoado() {
//        super.outputtoado();
        System.out.println("toado Circle la : "+" tam" +"( 0, "+x+")"+" ban kinh la "+radius);
        System.out.println("kich thuoc la: " + radius*3.14);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getX() {
        return x;
    }
    public void setX() {
        this.x = x;
    }
}
