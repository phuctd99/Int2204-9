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
public class CamSanh extends QuaCam{
    private int giaCamSanh;            // giá bán trên kg
    private String huongVi;                 // hương vị quả cam
    private String mauSac;                  //Màu sắc

    public int getGiaCamSanh() {
        return giaCamSanh;
    }

    public void setGiaCamSanh(int giaCamSanh) {
        this.giaCamSanh = giaCamSanh;
    }

    public String getHuongVi() {
        return huongVi;
    }

    public void setHuongVi(String huongVi) {
        this.huongVi = huongVi;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }
    
}
