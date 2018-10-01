// class mo ta ve nha chung cu
public class House {
	// phuong thuc khoi tao cac thuoc tinh cua 1 nha chung cu
	private String tenChungCu;
	private int Tang;
	private int soNha;
	private String diaChi;
	private float giaBan;
	//phuong thuc khoi tao sao chep
	public House(String tenChungCu, int Tang, int soNha, String diaChi, float giaBan) {
		this.tenChungCu = tenChungCu;
		this. Tang = Tang;
		this.soNha = soNha;
		this.diaChi = diaChi;
		this.giaBan = giaBan;
	}
	// gan gia tri vao cac thuoc tinh
	public void setTen(String tenChungCu) { 
		this.tenChungCu = tenChungCu;
	}
	public void setNSX(int Tang) {
		this.Tang = Tang;
	}
	public void setHSD(int soNha) {
		this.soNha = soNha;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public void setGia(float giaBan) {
		this.giaBan = giaBan;
	}
	// tra ve gia tri cac thuoc tinh
	public String getTen() {
		return tenChungCu;
	}
	public int getNSX() {
		return Tang;
	}
	public int getHSD() {
		return soNha;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public float getGia() {
		return giaBan;
	}
	
	public String getInfo() {
		return("Ten chung cu: " + this.tenChungCu + ", so tang can mua: " + this.Tang + ", so nha duoc chon: " + this.soNha
				+ ", Dia chi chung cu: " + this.diaChi + ", Gia ban: " + this.giaBan);
	}
}
