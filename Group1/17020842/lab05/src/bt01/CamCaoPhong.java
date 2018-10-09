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
public class CamCaoPhong extends QuaCam {
    
    public CamCaoPhong(String nguonGoc, Double giaBan, int soLuong, String ngayNhap, String mauSac, String kieuCauTao, String dangVo) {
        super(nguonGoc, giaBan, soLuong, ngayNhap, mauSac, kieuCauTao, dangVo);
    }

    @Override
    public String toString() {
        return "CamCaoPhong { " + super.toString() + " }";
    }
    
    
    
}
