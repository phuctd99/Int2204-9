package bai1;

import java.util.Scanner;

public class QuaTao extends HoaQua {
    protected String loai;

    //Ham khoi tao lop QuaTao

    public QuaTao(int gia, int soLuong, String xuatXu, String loai) {
        super(gia, soLuong, xuatXu);
        this.loai = loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getLoai() {
        return this.loai;
    }

    public void getDeTail() {
        super.getDeTail();
        System.out.println("Loai : " + this.getLoai());
    }

    public void inGiaBanTrenKg(){
        double gB = (this.getGia()/this.getSoLuong()) * 1.15;
        System.out.println("Gia ban tren kg (VND) : " + gB);
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Gia (VND) : ");
        int g = sc.nextInt();
        System.out.print("Nhap So luong (Kg): ");
        int sL = sc.nextInt();
        System.out.print("Nhap Xuat xu : ");
        sc.nextLine();
        String xX = sc.nextLine();
        System.out.print("Nhap Vi : ");
        String L = sc.nextLine();
        QuaTao qt = new QuaTao(g,sL,xX,L);
        qt.getDeTail();
        qt.inGiaBanTrenKg();
        qt.inDinhDuong();

    }


}
