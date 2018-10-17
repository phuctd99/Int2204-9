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
public class QuaTao extends fruit {
    private byte soLoaiTao ;            //Số loại táo nhập về
    private int khoiLuongTao ;          //Tổng số kg táo nhập về
    private int tienNhapTao;            //Tiền nhập táo

    public byte getSoLoaiTao() {
        return soLoaiTao;
    }

    public void setSoLoaiTao(byte soLoaiTao) {
        this.soLoaiTao = soLoaiTao;
    }

    public int getKhoiLuongTao() {
        return khoiLuongTao;
    }

    public void setKhoiLuongTao(int khoiLuongTao) {
        this.khoiLuongTao = khoiLuongTao;
    }

    public int getTienNhapTao() {
        return tienNhapTao;
    }

    public void setTienNhapTao(int tienNhapTao) {
        this.tienNhapTao = tienNhapTao;
    }

    
}
