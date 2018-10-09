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
public class QuaCam extends HoaQua {
    protected String Dochua;
    //Constructor
    public QuaCam() {
    }
    public QuaCam(String Dochua, double giaban, String nguongoc, String ngaynhap, int soluong) {
        super(giaban, nguongoc, ngaynhap, soluong);
        this.Dochua = Dochua;
    }
    //getter and setter
    public String getDochua() {
        return Dochua;
    }

    public void setDochua(String Dochua) {
        this.Dochua = Dochua;
    }


    //toString

    @Override
    public String toString() {
        return "QuaCam{" + "Dochua=" + Dochua + ", giaban=" + giaban + ", nguongoc=" + nguongoc + ", ngaynhap=" + ngaynhap + ", soluong=" + soluong + '}';
    }
    
   
    
}
