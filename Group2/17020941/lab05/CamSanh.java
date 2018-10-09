package bai1;

public class CamSanh extends QuaCam{
	private String xuatXu;
	
	public String getXuatXu() {
		return xuatXu;
	}

	public void setXuatXu(String xuatXu) {
		this.xuatXu = xuatXu;
	}

	public CamSanh(double gia){
		super.setCost(gia);
		this.setXuatXu("abc");
		this.setMuiVi("ngot thanh");
	}
	
	CamSanh(String mv) {
		super("ngot thanh");
		// TODO Auto-generated constructor stub
	}
	
	public double tinhTien(double canNang) {
		double tien = (double) (canNang * this.getCost());
		return tien;
	}
 	public void PrintCamSanh() {
		System.out.println("thong tin cam sanh: ");
		System.out.println("gia ban: " + this.getCost());
		System.out.println("xuat xu: " + this.getXuatXu());
		System.out.println("gia ban: " + this.getCost());
		System.out.println("mui vi: " + this.getMuiVi()) ;
		System.out.print("nhap so can cam sanh mua: ");
		System.out.println("so tien can tra la: " + tinhTien(this.input.nextInt()));
	}
	
}
