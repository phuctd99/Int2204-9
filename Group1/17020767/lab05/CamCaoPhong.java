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
public class CamCaoPhong extends QuaCam{
    private int giaCamCaoPhong;             // giá bán trên kg
    private String huongVi;                 // hương vị quả cam
    private String mauSac;                  //Màu sắc 

    public int getGiaCamCaoPhong() {
        return giaCamCaoPhong;
    }

    public void setGiaCamCaoPhong(int giaCamCaoPhong) {
        this.giaCamCaoPhong = giaCamCaoPhong;
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
