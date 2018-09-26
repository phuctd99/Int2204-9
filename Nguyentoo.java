package Lab03;

public class Nguyentoo {
	private String tinhChat_HH;
	private String tinhCHat_VL;
	public void set_HH(String tc) { this.tinhChat_HH = tc; }
	public void set_VL(String tc) { this.tinhCHat_VL = tc; }
	public String get_HH() { return this.tinhChat_HH;}
	public String get_VL() { return this.tinhCHat_VL;}
	public Nguyentoo() {
		this.tinhChat_HH = "kim loai";
		this.tinhCHat_VL = "ran";
	}
	public String getDacDiem() {
		return tinhChat_HH + " "+ tinhCHat_VL;
	}
}
