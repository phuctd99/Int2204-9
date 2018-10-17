/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab05.Fruit;

/**
 *
 * @author admin
 */
public class QuaCam extends fruit{
    private byte soLoaiCam ;            //Số loại cam nhập về
    private int khoiLuongCam ;          //Tổng số kg cam nhập về
    private int tienNhapCam;            //Tiền nhập cam

    public byte getSoLoaiCam() {
        return soLoaiCam;
    }

    public void setSoLoaiCam(byte soLoaiCam) {
        this.soLoaiCam = soLoaiCam;
    }

    public int getKhoiLuongCam() {
        return khoiLuongCam;
    }

    public void setKhoiLuongCam(int khoiLuongCam) {
        this.khoiLuongCam = khoiLuongCam;
    }

    public int getTienNhapCam() {
        return tienNhapCam;
    }

    public void setTienNhapCam(int tienNhapCam) {
        this.tienNhapCam = tienNhapCam;
    }

   
}