/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhkethua;

/**
 *
 * @author Nguyễn Giang
 */
public class CamCaoPhong extends QuaCam {
    String muivi;

    public String getMuivi() {
        return muivi;
    }

    public void setMuivi(String muivi) {
        this.muivi = muivi;
    }

   
    public CamCaoPhong(String muivi, String color, String nguonGoc, int gia, int soluong, int ngaynhap) {
        super(color, nguonGoc, gia, soluong, ngaynhap);
        this.muivi = muivi;
        
    }
    // Tra ve thong tin
    @Override
    public void getInfo() {
        System.out.println("Thông tin cam cao phong: ");
        System.out.print("Màu sắc: " + color + "\n"
                           + "Mùi vị: " + muivi + "\n"
                           + "Nguồn gốc: " + nguonGoc + "\n"
                           + "Giá bán(USD): " + gia + "\n" 
                           + "Số lượng: " + soluong + "\n"
                           + "Ngày nhập: " + ngayNhap + "\n\n");
    }
}
