/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.lab6;

/**
 *
 * @author Admin
 */
public class Square extends Rectangle{

    @Override
    public ToaDo getA() {
        return super.getA(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ToaDo getB() {
        return super.getB(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ToaDo getC() {
        return super.getC(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ToaDo getD() {
        return super.getD(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setA(ToaDo A) {
        super.setA(A); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setB(ToaDo B) {
        super.setB(B); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setC(ToaDo C) {
        super.setC(C); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setD(ToaDo D) {
        super.setD(D); //To change body of generated methods, choose Tools | Templates.
    }

    public Square(ToaDo A, ToaDo B, ToaDo C, ToaDo D, String color) {
        super(A, B, C, D, color, true);
    }
    
     public boolean isSquare(ToaDo A, ToaDo B, ToaDo C, ToaDo D) {
         ToaDo td = new ToaDo();
         if(super.isRectangle() && td.DoDai(A, B) == td.DoDai(C, D)) return true;
         return false;
             
     }
    
    @Override
    public String getNameShape(){
        return "Hình vuông";
    }
    
}
