package bai1;

import java.util.Scanner;

public class CamSanh extends QuaCam {
    public CamSanh(int gia, int soLuong, String xuatXu, String vi) {
        super(gia, soLuong, xuatXu, vi);
    }

    public void inGiaBanTrenKg(){
        double gB = ((this.getGia()/this.getSoLuong()) * 2);
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
        CamSanh CS = new CamSanh(g,sL,xX,v);
        CS.getDeTail();
        CS.inGiaBanTrenKg();
        CS.inDinhDuong();

    }
}
