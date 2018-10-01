/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phanso;

/**
 *
 * @author Tommmm^^
 */
public class PhanSo {
    int tu;
    int mau;

    PhanSo(int tu , int mau){
        this.tu = tu;
        this.mau=mau;
    }

    public int getTu() {
        return tu;
    }

    public int getMau() {
        return mau;
    }
    public void cong(PhanSo ps) {
        int ts = this.getTu() * ps.getMau() + ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        PhanSo Tong = new PhanSo(ts, ms);
        System.out.println("Tổng hai phân số = " + Tong.tu + "/" + Tong.mau);
    }
      
    public void tru(PhanSo ps) {
        int ts = this.getTu() * ps.getMau() - ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        PhanSo Hieu = new PhanSo(ts, ms);
        System.out.println("Hiệu hai phân số = " + Hieu.tu + "/" + Hieu.mau);
    }
     
    public void nhan(PhanSo ps) {
        int ts = this.getTu() * ps.getTu();
        int ms = this.getMau() * ps.getMau();
        PhanSo Tich = new PhanSo(ts, ms);
       
        System.out.println("Tích hai phân số = " + Tich.tu + "/" + Tich.mau);
    }
    public void chia(PhanSo ps) {
        int ts = this.getTu() * ps.getMau();
        int ms = this.getMau() * ps.getTu();
        PhanSo Thuong = new PhanSo(ts, ms);
        
        System.out.println("Thương hai phân số = " + Thuong.tu + "/" + Thuong.mau);
    }
     

    public static void main(String[] args) {
        PhanSo phanSo1=new PhanSo(16,3);    
        PhanSo phanSo2=new PhanSo(4,8); 
         
        
        phanSo1.cong(phanSo2);
        phanSo1.tru(phanSo2);
        phanSo1.nhan(phanSo2);
        phanSo1.chia(phanSo2);
    }
    
}
