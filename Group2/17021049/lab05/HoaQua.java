package bai1;

import java.util.Scanner;

public class HoaQua{
    protected int gia, soLuong;
    protected String xuatXu;

    // Ham khoi tao lop HoaQua

    public HoaQua(int gia,int soLuong,String xuatXu){
        this.gia = gia;
        this.soLuong = soLuong;
        this.xuatXu = xuatXu;
    }

    public HoaQua() {

    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getGia() {
        return this.gia;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getSoLuong() {
        return this.soLuong;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public String getXuatXu() {
        return this.xuatXu;
    }

    //Ham in ra chi tiet

    public void getDeTail(){
        System.out.println("In ra chi tiet : ");
        System.out.println("Gia (VND) : " + this.getGia());
        System.out.println("So luong (Kg) : " + this.getSoLuong());
        System.out.println("Xuat xu : " + this.getXuatXu());
    }

    public void inDinhDuong(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Dinh duong : ");
        String str = sc.nextLine();
        System.out.println("Dinh duong : " + str);
    }

}

