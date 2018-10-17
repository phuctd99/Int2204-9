/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

/**
 *
 * @author Admin
 */
public class Lab05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HoaQua newHoaQua = new HoaQua(10000,"VN","22/12/2017",100);
        QuaTao newQuaTao = new QuaTao("ngot lim",12000,"VN","22/1/2018",200);
        QuaCam newQuaCam = new QuaCam();
        newQuaCam.setGiaban(1000);
        CamSanh newCamSanh = new CamSanh("hoi chua",21000,"TQ","14/2/2018",50);
        System.out.println(newHoaQua.toString());
        System.out.println(newQuaCam.toString());
        Shape newShape = new Shape("blue",false);
        Circle newCircle = new Circle("green", true, 2);
        System.out.println(newShape.toString());
        Rectangle newRectangle = new Rectangle(2,2);
        System.out.println(newRectangle.getColor());
       // System.err.println(newCircle.getArea());
       Square newSquare = new Square(4);
    }
    
}
