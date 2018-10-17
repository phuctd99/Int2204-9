/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baituan5;

/**
 *
 * @author CCNE
 */
public class qua_cam extends Hoa_qua {
    public qua_cam(){
        
    }
    public qua_cam(String nguon_goc, int gia, String ngay_nhap, int so_luong){
        super(nguon_goc,gia,ngay_nhap,so_luong);
    }

    @Override
    public String toString() {
        return "qua_cam{" + "nguon_goc=" + nguon_goc + ", gia=" + gia + ", ngay_nhap=" + ngay_nhap + ", so_luong=" + so_luong+"}";
    }
    
}
