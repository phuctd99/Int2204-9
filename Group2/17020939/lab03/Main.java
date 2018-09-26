package bai_tap_tuan_3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap tu so phan so thu 1:");
        int tuSo1 = scanner.nextInt();
        System.out.print("Nhap mau so phan so thu 1:");
        int mauSo1 = scanner.nextInt();
        PhanSo ps1 = new PhanSo(tuSo1, mauSo1);
		
        System.out.print("Nhap tu so phan so thu 2:");
        int tuSo2 = scanner.nextInt();
        System.out.print("Nhap mau so phan so thu 2:");
        int mauSo2 = scanner.nextInt();
        PhanSo ps2 = new PhanSo(tuSo2, mauSo2);
        
        scanner.close();
        
        PhanSo ps = new PhanSo();
        
		ps.congPS (ps1,ps2);
		
		ps.truPS (ps1,ps2);
		
		ps.nhanPS (ps1,ps2);
		
		ps.chiaPS (ps1,ps2);
		
		if (ps.equals(ps1,ps2) == true) {
			System.out.print("Hai phan so bang nhau.");
		} else {
			System.out.print("Hai phan so khong bang nhau.");
		}
		
	}

}
