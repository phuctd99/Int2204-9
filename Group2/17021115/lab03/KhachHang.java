/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CCNE
 */
public class KhachHang {

    private String name;
    private int soTaiKhoan;
    private int soTien;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(int soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }
    
    public void xuatThongTin(){
        System.out.println("Ten khach hang: " + this.name);
        System.out.println("So tai khoan: " + this.soTaiKhoan);
        System.out.println("SO tien : " + this.soTien);
    }
    
}
