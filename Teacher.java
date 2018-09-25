package Lab03;

//import java.util.ArrayList;
public class Teacher{
	private String name;
	private String lopHocPhan;
	private int luong;
	private int soTinChi;
	public void setName(String name) {this.name = name;}
	public void setLopHocPhan(String lopHocPhan) {this.lopHocPhan = lopHocPhan;}
	public void setLuong(int luong) {this.luong = luong;}
	public void setsoTinChi(int soTinChi) {this.soTinChi = soTinChi; }
	public String getName() { return this.name;}
	public String getLopHocPhan() { return this.lopHocPhan;}
	public int getLuong() { return this.luong;}
	public int getsoTinChi() { return this.soTinChi;}
	public String getInfo() {
		return name + " " + lopHocPhan;
	}
	public Teacher() {
		this.name = "Nguyen Hoai Thu";
		this.lopHocPhan = "ELT2035_";
		this.luong = 0;
		this.soTinChi = 3;
	}
//	public ArrayList<GiaoVien> giaovien = new ArrayList<GiaoVien>();
//	public void giaoVien_Cung_Ma_Lop() {
//		for(int i = 0; i < giaovien.size(); i++) {
//			System.out.println(giaovien.get(i).getInfo());
//		}
//	}
}
