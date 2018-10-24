/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OppLab7;

/**
 *
 * @author Admin
 */
public class ToaDo {
    private int X0;
    private int Y0;

    public void setX0(int X0) {
        this.X0 = X0;
    }

    public void setY0(int Y0) {
        this.Y0 = Y0;
    }

    public int getX0() {
        return X0;
    }

    public int getY0() {
        return Y0;
    }

    public ToaDo() {
    }
    
    public ToaDo(int X0, int Y0) {
        this.X0 = X0;
        this.Y0 = Y0;
    }
}
