/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author CACLV
 */
public class QuaTao extends HoaQua { 
    public QuaTao(String nguonGoc, Double giaBan, int soLuong, String ngayNhap, String mauSac, String kieuCauTao) {
        super(nguonGoc, giaBan, soLuong, ngayNhap, mauSac, kieuCauTao);
    } 

    @Override
    public String toString() {
        return "QuaTao" + " { " + super.toString() + " }";
    }
    
}
