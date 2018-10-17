import java.util.Scanner;

public class Solution {

    public static void main (String[] args) {

        CamCaoPhong CamCaoPhong = new CamCaoPhong();
        QuaTao QuaTao = new QuaTao();
        Camsanh Camsanh = new Camsanh();

        Scanner sc = new Scanner(System.in);

        CamCaoPhong.setCan(sc.nextInt());
        CamCaoPhong.setSoluong(sc.nextInt());
        CamCaoPhong.setNgaynhap(sc.nextLine());
        CamCaoPhong.setNguongoc(sc.nextLine());
        CamCaoPhong.setGia(sc.nextInt());
        CamCaoPhong.setMuivi(sc.nextLine());
        CamCaoPhong.setMausac(sc.nextLine());

        QuaTao.setCan(sc.nextInt());
        QuaTao.setSoluong(sc.nextInt());
        QuaTao.setNgaynhap(sc.nextLine());
        QuaTao.setGia(sc.nextInt());
        QuaTao.setMuivi(sc.nextLine());
        QuaTao.setMausac(sc.nextLine());

        Camsanh.setCan(sc.nextInt());
        Camsanh.setSoluong(sc.nextInt());
        Camsanh.setNgaynhap(sc.nextLine());
        Camsanh.setNguongoc(sc.nextLine());
        Camsanh.setGia(sc.nextInt());
        Camsanh.setDodayvo(sc.nextLine());

        Shape x = new Shape();
    }
}
