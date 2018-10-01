/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bafi_2;

/**
 *
 * @author HP
 */
public class PhanSo{
    private int tu, mau;
    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }
    public void setTu(int tu) {
        this.tu = tu;
    }
    public void setMau(int mau) {
        this.mau = mau;
    }
    public int getTu() {
        return this.tu;
    }
    public int getMau() {
        return this.mau;
    }
    public int UCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            }
            else {
                b = b - a;
            }
        }
        return a;
    }
    public void rutgon(){
        int UCLN = UCLN(this.getTu(),this.getMau());
        this.setTu(this.getTu() / UCLN);
        this.setMau(this.getMau() / UCLN);
    }
    public void congPS(PhanSo PS){
        int a = this.getTu()*PS.getMau() + PS.getTu()*this.getMau();
        int b = this.getMau()*PS.getMau();
        PhanSo k = new PhanSo(a,b);
        k.rutgon();
        System.out.println("Cong PS: " + k.tu + "/" + k.mau);
    }
    public void truPS(PhanSo PS){
        int a = this.getTu()*PS.getMau() - PS.getTu()*this.getMau();
        int b = this.getMau()*PS.getMau();
        PhanSo k = new PhanSo(a,b);
        k.rutgon();
        System.out.println("Tru PS: " + k.tu + "/" + k.mau);
    }
    public void nhanPS(PhanSo PS) {
        int a = this.getTu()*PS.getTu();
        int b = this.getMau()*PS.getMau();
        PhanSo k = new PhanSo(a,b);
        k.rutgon();
        System.out.println("Nhan PS: " + k.tu + "/" + k.mau);
    }
    public void chiaPS(PhanSo PS) {
        int a = this.getTu()*PS.getMau() ;
        int b = this.getMau()*PS.getTu();
        PhanSo k = new PhanSo(a,b);
        k.rutgon();
        System.out.println("Chia PS: " + k.tu + "/" + k.mau);
    }
    public boolean equals(PhanSo PS){
        int a = this.getTu()*PS.getMau();
        int b = PS.getTu()*this.getMau();
        if (a - b == 0) {System.out.println("YES");}
        else {System.out.println("NO");}
        return true;
    }
    public static void main(String[] args){
        PhanSo ps = new PhanSo(16,5);
        PhanSo ps1 = new PhanSo(8,4);
        ps.congPS(ps1);
        ps.truPS(ps1);
        ps.nhanPS(ps1);
        ps.chiaPS(ps1);
        ps.equals(ps1);
    }
}