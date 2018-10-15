/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_t5;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class OOP_T5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        hoaQua h = new hoaQua();
        h.output();
    }
    
}
class hoaQua{
    // CAC THUOC TINH CO BAN
    String nguonGoc;      
    long giaBan;
    long giaNhap;
    String chungLoai;
    public hoaQua() {
    
    }
    public hoaQua(String nguonGoc, long giaBan, long giaNhap, String chungLoai){
        this.chungLoai = chungLoai;
        this.giaBan = giaBan;
        this.giaNhap = giaNhap;
        this.nguonGoc = nguonGoc;
    }
    
    public String getNguonGoc() {
        return nguonGoc;
    }

    public void setNguonGoc(String nguocGoc) {
        this.nguonGoc = nguocGoc;
    }

    public long getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(long giaBan) {
        this.giaBan = giaBan;
    }

    public long getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(long giaNhap) {
        this.giaNhap = giaNhap;
    }

    public String getChungLoai() {
        return chungLoai;
    }

    public void setChungLoai(String chungLoai) {
        this.chungLoai = chungLoai;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chung loai hoa qua : ");
        chungLoai = sc.nextLine();
        System.out.print("Nhap gia ban : ");
        giaBan = sc.nextLong();
        System.out.print("Nhap gia mua ve :");
        giaNhap = sc.nextLong();
        sc.nextLine();
        System.out.print("Nhap nguon goc : ");
        nguonGoc = sc.nextLine();
    }
    public void output(){
        QuaCam in = new QuaCam();
        System.out.println(in.getNguonGoc());
     }
    
}


