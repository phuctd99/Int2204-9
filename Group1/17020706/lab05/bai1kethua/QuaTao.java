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
public class QuaTao extends HoaQua {

    String mau;
    String type;

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public QuaTao(String mau, String type, String nguonGoc, int gia, int soluong, int ngaynhap) {
        super(gia, nguonGoc, soluong, ngaynhap);
        this.mau = mau;
        this.type = type;
    }
    // Tra ve thong tin
    public void getInfo() {
        System.out.println("Thông tin quả táo: ");
        System.out.print("Màu sắc: " + mau + "\n"
                + "Loại táo: " + type + "\n"
                + "Nguồn gốc: " + nguonGoc + "\n"
                + "Giá bán(USD): " + gia + "\n"
                + "Số lượng: " + soluong + "\n"
                + "Ngày nhập: " + ngayNhap + "\n\n");
    }

}
