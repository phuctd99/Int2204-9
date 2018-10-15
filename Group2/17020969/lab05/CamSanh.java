package lab05;

public class CamSanh extends QuaCam{
	private String nguonGoc;
	private String mauSac;
	
	public CamSanh() {
		super();
		this.nguonGoc = "tinh Bac Giang";
		this.mauSac = "mau luc nhat";
	}

	public String getNguonGoc() {
		return nguonGoc;
	}

	public void setNguonGoc(String nguonGoc) {
		this.nguonGoc = nguonGoc;
	}

	public String getMauSac() {
		return mauSac;
	}

	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}
	public void GetInfo() {
		this.setNgayNhap("10/10/2018");
		this.setSoLuong(80);
		System.out.println(this.getInfo());
		System.out.println("Nguon goc: " + this.nguonGoc);
		System.out.println("Mau qua cam Sanh: "+ this.mauSac);	
	}
	
}