/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoaqua;

import java.util.Scanner;

/**
 *
 * @author Tommmm^^
 */
public class HoaQua {
    String loai;
    String ngaySx;
    String xuatXu;
    int soLuong;
    public HoaQua() {
        
    }
    public HoaQua(String loai, String ngaySx , String xuatXu , int soLuong) { 
    this.loai = loai;
    this.ngaySx = ngaySx;
    this.xuatXu = xuatXu;
    this.soLuong = soLuong;
    }

    public String getloai() {
        return loai;
    }

    public void setloai(String loai) {
        this.loai = loai;
    }

    public String getNgaySx() {
        return ngaySx;
    }

    public void setNgaySx(String ngaySx) {
        this.ngaySx = ngaySx;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public void NhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap loai hoa qua : ");
        loai =sc.nextLine();
        System.out.print("Nhap ngay san xuat : ");
        ngaySx=sc.nextLine();
        System.out.print("Nhap Xuat Xu :");
        xuatXu=sc.nextLine();
        System.out.print("Nhap So luong : ");
        soLuong=sc.nextInt();
       
    }
    public void XuatThongTin(){
        System.out.println("Ten loai hoa qua : " + loai);
        System.out.println("Ngay san xuat : "+ngaySx);
        System.out.println("Xuat xu : "+xuatXu);
        System.out.println("So luong :" +soLuong);
    }
    
}
