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
public class ToaDo {
    private double X0;
    private double Y0;

    public void setX0(double X0) {
        this.X0 = X0;
    }

    public void setY0(double Y0) {
        this.Y0 = Y0;
    }

    public double getX0() {
        return X0;
    }

    public double getY0() {
        return Y0;
    }

    public ToaDo() {
    }
    
    public ToaDo(double X0, double Y0) {
        this.X0 = X0;
        this.Y0 = Y0;
    }
    public ToaDo Linear(ToaDo A, ToaDo B) {
        double a = (A.Y0-B.Y0)/(A.X0-B.X0);
        double b = A.Y0 - a*A.X0;
        ToaDo Vectors =new ToaDo(a, b);
        return Vectors;
    }
    public boolean Direction(ToaDo A, ToaDo B) {
        if(A.X0 != 0) {
            double k = B.X0/A.X0;
            if(B.Y0 == A.Y0*k) return true;
        }
        if(A.Y0 != 0) {
            
            double k = B.Y0/A.Y0;
            if(B.X0 == A.X0*k) return true;
        }
        return false;
    }
    public boolean Perpendicular(ToaDo A, ToaDo B) {
        if(A.X0*A.Y0+B.X0*B.Y0 == 0) return true;
        return false;
    }
    public double DoDai(ToaDo A, ToaDo B) {
        return Math.pow((A.X0-B.X0)*(A.X0-B.X0) + (A.Y0-B.Y0)*(A.Y0-B.Y0), 0.5);
    }
}
