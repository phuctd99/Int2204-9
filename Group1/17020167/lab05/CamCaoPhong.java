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
public class CamCaoPhong extends QuaCam {
    protected String mausac="vang";
    //Constructor
    public CamCaoPhong() {
        
    }
    public CamCaoPhong(String Dochua, double giaban, String nguongoc, String ngaynhap, int soluong) {
        super(Dochua, giaban, nguongoc, ngaynhap, soluong);
    }
    //getter and setter
    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    //toString

    @Override
    public String toString() {
        return "CamCaoPhong{" + "mausac=" + mausac + '}';
    }
    
    
}
