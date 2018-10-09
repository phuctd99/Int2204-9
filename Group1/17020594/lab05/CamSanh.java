/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoaqua;

/**
 *
 * @author Tommmm^^
 */
public class CamSanh extends HoaQua {
    String KhoiLuong;
    public CamSanh(String loai, String ngaySx , String xuatXu , int soLuong, String KhoiLuong) {
        super(loai, ngaySx, xuatXu, soLuong);
        this.KhoiLuong = KhoiLuong;
    }
    
}
