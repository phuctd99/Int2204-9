package baitaptuan5;

import java.lang.Character.Subset;

public class baitaptuan1 {

	public static class Hoaqua{
		
		public double giaban;
		public double can;
		String nguongoc;
		String ngaynhap;
		int soluong;
		public double getGiaban() {
			return giaban;
		}
		public void setGiaban(double giaban) {
			this.giaban = giaban;
		}
		public double getCan() {
			return can;
		}
		public void setCan(double can) {
			this.can = can;
		}
		public String getNguongoc() {
			return nguongoc;
		}
		public void setNguongoc(String nguongoc) {
			this.nguongoc = nguongoc;
		}
		public String getNgaynhap() {
			return ngaynhap;
		}
		public void setNgaynhap(String ngaynhap) {
			this.ngaynhap = ngaynhap;
		}
		public int getSoluong() {
			return soluong;
		}
		public void setSoluong(int soluong) {
			this.soluong = soluong;
		}
		public Hoaqua() {
			super();
			giaban = 15000;
			can = 1;
			nguongoc = "Trung Quoc";
			ngaynhap = "1/1/2018";
			soluong = 100;
		}
		
		
		
		}
	public class Quacam extends Hoaqua{
		
		
		
		
		
		
	}
	public class Quatao extends Hoaqua{
		
		
		
		
		
	}
	public class CamCaoPhong extends Quacam{
		
		
		
		
		
	}
	public class Camsanh extends Quacam {
		String dongon;
		public Camsanh() {
			giaban = 25000;
			can = 1000;
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		baitaptuan1 bt = new baitaptuan1();
		
		Camsanh cs = bt.new Camsanh();
		System.out.println(cs.nguongoc);
		Quacam qc = bt.new Quacam();
		System.out.println(qc.giaban);
		qc.setCan(15);
		
		System.out.println(qc.can);
		
		
		
		
		
	}
	
	
	
	
	
	
}