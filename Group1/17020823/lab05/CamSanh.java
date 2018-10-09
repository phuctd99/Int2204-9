/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap5;

/**
 *
 * @author Hoang Vu Huong
 */
public class CamSanh extends QuaCam{
       private String NoiTrong;

    public String getNoiTrong() {
        return NoiTrong;
    }

    public void setNoiTrong(String NoiTrong) {
        this.NoiTrong = NoiTrong;
    }

    public CamSanh(String NoiTrong, String SoMui, String NgayThuHoach, String HanDung, String LoaiQua, String Mui, String Vi, String XuatXu, String NgayNhap, float CanNang) {
        super(SoMui, NgayThuHoach, HanDung, LoaiQua, Mui, Vi, XuatXu, NgayNhap, CanNang);
        this.NoiTrong = NoiTrong;
    }
}
