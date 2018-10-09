/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2kethua;

/**
 *
 * @author Nguyễn Giang
 */
public class Bai2Kethua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle tron = new Circle("red", true, 2.0);
        System.out.println(tron.toString());
        Circle tron2 = new Circle(3.0);
        System.out.println(tron2.toString());
        Square vuong = new Square(2.0, "blue", true);
        System.out.println(vuong.toString());
        Rectangle hcn = new Rectangle(2.0, 3.0, "yellow", true);
        System.out.println(hcn.toString());
    }
    
}
