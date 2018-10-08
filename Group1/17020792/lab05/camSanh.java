/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author CCNE
 */
public class camSanh extends quaCam{
    private String mauSac;

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }
    
    public void inThongTin(){
        super.inThongTin();
        System.out.println("Màu sắc : " + this.mauSac);
    }
}
