package bai1;

import java.util.Scanner;

public class CamCaoPhong extends QuaCam {

    //Ham khoi tao lop CamCaoPhong

    public CamCaoPhong(int gia, int soLuong, String xuatXu, String vi) {
        super(gia, soLuong, xuatXu, vi);
    }



    public void inGiaBanTrenKg(){
        double gB = (this.getGia()/this.getSoLuong()) * 1.5;
        System.out.println("Gia ban tren kg (VND) : " + gB);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Gia (VND) : ");
        int g = sc.nextInt();
        System.out.print("Nhap So luong (Kg) : ");
        int sL = sc.nextInt();
        System.out.print("Nhap Xuat xu : ");
        sc.nextLine();
        String xX = sc.nextLine();
        System.out.print("Nhap Vi : ");
        String v = sc.nextLine();
        CamCaoPhong CP = new CamCaoPhong(g,sL,xX,v);
        CP.getDeTail();
        CP.inGiaBanTrenKg();
        CP.inDinhDuong();

    }
}
