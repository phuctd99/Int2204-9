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
public class camCaoPhong extends quaCam {
    private String moTa;

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    
    public void inThongTin(){
        super.inThongTin();
        System.out.println("Mùi vị của quả cam : " + this.moTa);
    }
}
