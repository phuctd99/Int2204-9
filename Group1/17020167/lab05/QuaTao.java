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
//Class Qua Tao
public class QuaTao extends HoaQua {
    protected String Dongot;
    //Constructor
    public QuaTao() {
    }
    public QuaTao(String Dongot, double giaban, String nguongoc, String ngaynhap, int soluong) {
        super(giaban, nguongoc, ngaynhap, soluong);
        this.Dongot = Dongot;
    }
    //Setter and getter
    public String getDongot() {
        return Dongot;
    }

    public void setDongot(String Dongot) {
        this.Dongot = Dongot;
    }

    
    //toString
    @Override
    public String toString() {
        return "QuaTao{" + "Dongot=" + Dongot + '}';
    }
    
    
}
