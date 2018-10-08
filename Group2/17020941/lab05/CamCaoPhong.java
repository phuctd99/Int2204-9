package bai1;

public class CamCaoPhong extends QuaCam {
	private double canNang;
	private String xuatXu;
	public double getCanNang() {
		return canNang;
	}

	public void setCanNang(double canNang) {
		this.canNang = canNang;
	}
	
	public String getXuatXu() {
		return xuatXu;
	}

	public void setXuatXu(String xuatXu) {
		this.xuatXu = xuatXu;
	}

	public CamCaoPhong( String mv) {
		super("ngot thanh");
		// TODO Auto-generated constructor stub
	}
	public CamCaoPhong(double gia) {
		super.setCost(gia);
		this.setXuatXu("Cao Phong");
		this.setMuiVi("ngot thanh");
	}	

	public String getMuiVi() {
		return super.getMuiVi();
	}

	public void setMuiVi(String muiVi) {
		super.setMuiVi(muiVi);
	}
	public double tinhTien() {
		System.out.print("nhap so can cam cao phong: ");
		this.setCanNang(this.input.nextInt());
		double tien = getCanNang() * this.getCost();
		return tien;
	}
 	public void PrintCamCaoPhong() {
		System.out.println("thong tin cam cao phong: ");
		System.out.println("gia ban: " + this.getCost());
		System.out.println("xuat xu: " + this.getXuatXu());
		System.out.println("mui vi: " + this.getMuiVi());
		System.out.println("so tien can tra la: " + this.tinhTien());
	}
}
