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
public class Rectangle extends Shape{
    protected ToaDo A, B, C, D;

    public Rectangle(ToaDo A, ToaDo B, ToaDo C, ToaDo D) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }

    public Rectangle(ToaDo A, ToaDo B, ToaDo C, ToaDo D, String color, boolean filled) {
        super(color, filled);
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }

    public Rectangle() {
    }

    public ToaDo getA() {
        return A;
    }

    public ToaDo getB() {
        return B;
    }

    public ToaDo getC() {
        return C;
    }

    public ToaDo getD() {
        return D;
    }

    public void setA(ToaDo A) {
        this.A = A;
    }

    public void setB(ToaDo B) {
        this.B = B;
    }

    public void setC(ToaDo C) {
        this.C = C;
    }

    public void setD(ToaDo D) {
        this.D = D;
    }
    public boolean isRectangle() {
        if(A.equals(B) || A.equals(C)|| A.equals(D) || B.equals(C)|| B.equals(D) || C.equals(D)) return false;
        if(A.Direction(A.Linear(A, B), C.Linear(C, D)) 
                && A.Direction(A.Linear(A, D), B.Linear(B, C)) 
                && A.Perpendicular(A.Linear(A, B), A.Linear(A, D))) return true;
        return false;
    }
    @Override
    public String getNameShape(){
        return "Hình chữ nhật";
    }
    
}
