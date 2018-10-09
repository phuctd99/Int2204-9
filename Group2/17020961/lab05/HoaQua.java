/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan51;

import java.util.Scanner;

/**
 *
 * @author CCNE
 */
public class HoaQua {
		protected int giaban;
		protected int soluong;
		protected String ngaynhap;
		protected String nguongoc;
		
		public int getSoluong() {
			return soluong;
		}
		public void setSoluong(int soluong) {
			this.soluong = soluong;
		}
		public int getGiaban() {
			return giaban;
		}
		public void setGiaban(int giaban) {
			this.giaban = giaban;
		}
		public String getNgaynhap() {
			return ngaynhap;
		}
		public void setNgaynhap(String ngaynhap) {
			this.ngaynhap = ngaynhap;
		}
		public String getNguongoc() {
			return nguongoc;
		}
		public void setNguongoc(String nguongoc) {
			this.nguongoc = nguongoc;
		}
		public void nhapThongTin(){
			System.out.println("---------------------");
			Scanner sc = new Scanner(System.in);
			System.out.print("Nhập số lượng quả: ");
			this.soluong = sc.nextInt();
			sc.nextLine();
			System.out.print("Nhập nguồn gốc xuất xứ: ");
			this.nguongoc = sc.nextLine();
			System.out.print("Nhập ngày nhập: ");
			this.ngaynhap = sc.nextLine();
			System.out.print("Nhập giá bán/kg: ");
			this.giaban = sc.nextInt();
		}
		public void inThongTin() {
			System.out.println("Số lượng: " + this.soluong 
					+ "\nNguồn gốc: " + this.nguongoc 
					+"\nNgay nhap: " +this.ngaynhap
					+ "\nGiá bán: " + this.giaban + " đồng/kg");
		}
}
