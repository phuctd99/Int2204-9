package Lab03;
import java.util.*;
class PhanSo{
	private int tu; 
	private int mau;
	// khoi tao gia tri cho thuoc tinh
	public void setTu(int tu) {
		this.tu = tu;
	}
	public void setMau(int mau) {
		this.mau = mau;
	}
	// tra ve gia tri cua thuoc tinh
	public int getTu() {
		return this.tu;
	}
	public int getMau() {
		return this.mau;
	}
	// truyen gia tri cho phan so
	public PhanSo(int Tu, int Mau) {
		this.tu = Tu;
		this.mau = Mau;
	}
	// khoi tao gia tri mac dinh
	public PhanSo() {
		tu = 1;
		mau = 1;
	}
	// ham cong 2 phan so
	public void CongPhanSo( PhanSo ps2) {
		//PhanSo psSum = new PhanSo();
		this.tu = this.tu*ps2.mau + ps2.tu*this.mau;
		this.mau = this.mau*ps2.mau;
	}
	// ham tru pso
	public void TruPhanSo( PhanSo ps2) {
		//PhanSo ps_hieu = new PhanSo();
		this.tu = this.tu*ps2.mau - this.mau*ps2.tu;
		this.mau = this.mau*ps2.mau;
		//return ps_hieu;
	}
	public void nhanPhanSo( PhanSo ps2) {
		//PhanSo ps_tich = new PhanSo();
		this.tu = this.tu*ps2.tu;
		this.mau = this.mau*ps2.mau;
		//return ps_tich;
	}
	public void chiaPhanSo( PhanSo ps2) {
		//PhanSo ps_thuong = new PhanSo();
		this.tu = this.tu*ps2.mau;
		this.mau = this.mau*ps2.tu;
		//return ps_thuong;
	}
	
	public void printPhanSo() {
		System.out.println(tu+" / " +mau);
	}
	
}
public class Bai2 {
	public boolean equals(PhanSo ps1, PhanSo ps2) {
		if((double)ps1.getTu()/ps1.getMau() == (double)ps2.getTu()/ps2.getMau()) return true;
		return false;
	}
	
	public static void main(String[] args) {
		Bai2 cmd = new Bai2();
		
		PhanSo ps1 = new PhanSo(5, 3);
		System.out.println("Phan so thu nhat: ");
		ps1.printPhanSo();
		PhanSo ps2 = new PhanSo(4, 19);
		System.out.println("Phan so thu hai: ");
		ps2.printPhanSo();
		
		ps1.CongPhanSo(ps2);
		System.out.println("Tong 2 Phan so: ");
		ps1.printPhanSo();
		
		//PhanSo ps_H = new PhanSo();
		ps1.TruPhanSo(ps2);
		System.out.println("Hieu 2 Phan so: ");
		ps1.printPhanSo();
		
		//PhanSo ps_N = new PhanSo();
		ps1.nhanPhanSo( ps2);
		System.out.println("Tich 2 Phan so: ");
		ps1.printPhanSo();
		
		//PhanSo ps_C = new PhanSo();
		ps1.chiaPhanSo(ps2);
		System.out.println("Thuong 2 Phan so: ");
		ps1.printPhanSo();
		
		PhanSo ps_f = new PhanSo(3 , 4);
		PhanSo ps_s = new PhanSo(2, 4);
		boolean check = cmd.equals(ps_s, ps_f);
		System.out.println(check);
	}
}
