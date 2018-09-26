// class mô tả Ô tô
public class Oto {
	// Trường mô tả thuộc tính: Nhãn hiệu xe, Màu xe, Giá xe.
	private String nhanHieuXe;
	private String mauXe;
	private float giaXe;
	// phuong thuc gan gia tri vao thuoc tinh
	public void setnNHX(String nhanHieuXe){
		this.nhanHieuXe = nhanHieuXe;
	}
	public void setMauXe(String mauXe){
		this.mauXe = mauXe; 
	}
	public void setGia(float giaXe){
		this.giaXe = giaXe;
	}
	// phuong thuc tra ve gia tri
	public String getNHX() {
		return nhanHieuXe;
	}
	public String getMau() {
		return mauXe;
	}
	public float getGia() {
		return giaXe;
	}
	// phuong thuc sao chep
	public Oto(String nhanHieuXe, String mauXe, float giaXe){
		this.nhanHieuXe = nhanHieuXe;
		this.mauXe = mauXe;
		this.giaXe = giaXe;
	}
	public String getInfo() {
		return("Nhan hieu cua xe: " + this.nhanHieuXe + ", Mau xe : " + this.mauXe 
				+ ", Gia ban: " + this.giaXe);
	}
}