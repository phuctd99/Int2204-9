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
public class cam_cao_phong extends qua_cam{
    public cam_cao_phong(){
        
    }
    public cam_cao_phong(String nguon_goc, int gia, String ngay_nhap, int so_luong){
        super(nguon_goc,gia,ngay_nhap,so_luong);
    };
    public String toString() {
        return "cam_cao_phong{" + "nguon_goc=" + nguon_goc + ", gia=" + gia + ", ngay_nhap=" + ngay_nhap + ", so_luong=" + so_luong+"}";
    }
}
