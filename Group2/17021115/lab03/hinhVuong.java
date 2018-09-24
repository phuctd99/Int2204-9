/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CCNE
 */
public class hinhVuong {
    private double doDaiCanh;

    public double getDoDaiCanh() {
        return doDaiCanh;
    }

    public void setDoDaiCanh(double doDaiCanh) {
        this.doDaiCanh = doDaiCanh;
    }
    
    public double tinhDienTich(){
        double dienTich = this.doDaiCanh*this.doDaiCanh;
        return dienTich;
    }
    public double tinhChuVi(){
        double chuVi = this.doDaiCanh*4;
        return chuVi;
    }
}
