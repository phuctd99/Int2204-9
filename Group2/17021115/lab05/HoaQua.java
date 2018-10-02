package BaiTapTuan5;

import java.util.Scanner;

public class HoaQua {
	
	private int soLuongQua;
	private String nguonGoc;
	private int giaBan;
	
	
	public HoaQua() {
		super();
	}
	public HoaQua(int soLuongQua, String nguonGoc, int giaBan) {
		super();
		this.soLuongQua = soLuongQua;
		this.nguonGoc = nguonGoc;
		this.giaBan = giaBan;
	}
	
	public int getSoLuongQua() {
		return soLuongQua;
	}
	public void setSoLuongQua(int soLuongQua) {
		this.soLuongQua = soLuongQua;
	}
	public String getNguonGoc() {
		return nguonGoc;
	}
	public void setNguonGoc(String nguonGoc) {
		this.nguonGoc = nguonGoc;
	}
	public int getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(int giaBan) {
		this.giaBan = giaBan;
	}
	
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số lượng quả: ");
		this.soLuongQua = sc.nextInt();
		System.out.print("Nhập nguồn gốc xuất xứ: ");
		this.nguonGoc = new Scanner(System.in).nextLine();
		System.out.print("Nhập giá bán/kg: ");
		this.giaBan = sc.nextInt();
	}
	public void inThongTin() {
		System.out.println("Số lượng: " + this.soLuongQua + "\nNguồn gốc: " + this.nguonGoc + "\nGiá bán: " + this.giaBan + " đồng/kg");
	}
	 
}
