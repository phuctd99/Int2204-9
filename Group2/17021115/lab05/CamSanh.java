package BaiTapTuan5;

import java.util.Scanner;

public class CamSanh extends QuaCam {
	private String loaiCam;

	public String getLoaiCam() {
		return loaiCam;
	}

	public void setLoaiCam(String loaiCam) {
		this.loaiCam = loaiCam;
	}
	public void nhapThongTin() {		
		System.out.print("Nhập tên loại cam: ");
		this.loaiCam = new Scanner(System.in).nextLine();
		super.nhapThongTin();
	}

	public void inThongTin() {
		System.out.println();
		System.out.println(this.loaiCam);
		super.inThongTin();
		
	}
}
