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
public class QuaCam extends HoaQua {
    String ngayNhap;
    public QuaCam() {
        
    }
    
    
    public QuaCam(String loai, String ngaySx , String xuatXu , int soLuong, String ngayNhap) {
       super(loai, ngaySx, xuatXu, soLuong);
       this.ngayNhap = ngayNhap;
        
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    @Override
     public void NhapThongTin() {
         super.NhapThongTin();
         Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ngay Nhap: ");
        sc.nextLine();
       
       
    }
    @Override
    public void XuatThongTin(){
        super.XuatThongTin();
        System.out.println("Ten loai hoa qua : " + ngayNhap);
        
    
    
    }
}
