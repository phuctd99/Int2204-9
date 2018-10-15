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
public class QuaCam extends HoaQua {

    String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public QuaCam(String color, String nguonGoc, int gia, int soluong, int ngaynhap) {
        super(gia, nguonGoc, soluong, ngaynhap);
        this.color = color;
    }
    // tra ve thong tin
    public void getInfo() {
        System.out.println("Thông tin quả cam: ");
        System.out.print("Màu sắc: " + color + "\n"
                + "Nguồn gốc: " + nguonGoc + "\n"
                + "Giá bán(USD): " + gia + "\n"
                + "Số lượng: " + soluong + "\n"
                + "Ngày nhập: " + ngayNhap + "\n\n");
    }
}
