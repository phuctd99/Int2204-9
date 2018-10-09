class hoaQua{
	protected String xuatXu;				// Class cha
	protected double giaBan;				//4 Thuoc tinh : Xuat xu, gia ban, ngay nhap ,so luong
	protected String ngayNhap;
	protected int soLuong;
	public hoaQua(){						
		this.xuatXu = "NA";
		this.giaBan = 0;
		this.ngayNhap = "00/00/00";
		this.soLuong = 0;										//Cac constructor
	}
	public hoaQua(String xuatXu, double giaBan, String ngayNhap, int soLuong){
		this.xuatXu = xuatXu;
		this.giaBan = giaBan;
		this.ngayNhap = ngayNhap;
		this.soLuong = soLuong;
	}
	public String getXuatXu(){						//Getter
		return this.xuatXu;
	}
	public double getGiaBan(){
		return this.giaBan;
	}
	public String getNgayNhap(){
		return this.ngayNhap;
	}	
	public int getSoLuong(){
		return this.soLuong;
	}
	public void setXuatXu(String xuatXu){					//Setter
		this.xuatXu = xuatXu;
	}
	public void setGiaBan(double giaBan){
		this.giaBan = giaBan;
	}
	public void setNgayNhap(String ngayNhap){
		this.ngayNhap = ngayNhap;
	}
	public void setSoLuong(int soLuong){
		this.soLuong = soLuong;
	}
	public void infor(){									//In ra thong tin cua class
		System.out.println("Hoa qua vo cung phong phu");
	}

}

class quaTao extends hoaQua{				//Class con cua Hoaqua
	protected String loaiTao;				//them 2 thuoc tinh la loaiTao va ngamRuou;
	protected boolean ngamRuou;

	public quaTao(){									//cac constructor
		this.loaiTao = "";
		this.ngamRuou = false;
	}
	public quaTao(String loaiTao, boolean ngamRuou){
		this.loaiTao = loaiTao;
		this.ngamRuou = ngamRuou;
	}
	public quaTao(String loaiTao, boolean ngamRuou, String xuatXu, double giaBan, String ngayNhap, int soLuong){
		super(xuatXu, giaBan, ngayNhap, soLuong);
		this.loaiTao = loaiTao;
		this.ngamRuou = ngamRuou;
	}
	public String getLoaiTao(){									//Getter,Setter
		return this.loaiTao;
	}
	public boolean getNgamRuou(){
		return this.ngamRuou;
	}
	public void setLoaiTao(String loaiTao){
		this.loaiTao = loaiTao;
	}
	public void setNgamRuou(boolean ngamRuou){
		this.ngamRuou = ngamRuou;
	}
	public void infor() {
		System.out.println("Tao la mot trai cay rat noi tieng");		//Ghi de
	}
}

class quaCam extends hoaQua{		//Class con cua class hoa qua	
	protected String loaiCam;			//Them 2 thuoc tinh loaiCam,Do chua.
	protected double doChua;
	
	public quaCam(){							//cac constructor		
		this.loaiCam = "";
		this.doChua = 0;
	}
	public quaCam(String loaiCam, double doChua){
		this.loaiCam = loaiCam;
		this.doChua = doChua;
	}
	public quaCam(String loaiCam, double doChua, String xuatXu, double giaBan, String ngayNhap, int soLuong){
		super(xuatXu, giaBan, ngayNhap, soLuong);
		this.loaiCam = loaiCam;
		this.doChua = doChua;
	}
	public String getLoaiCam(){					//Getter, Setter
		return this.loaiCam;
	}
	public double getDoChua(){
		return this.doChua;
	}
	public void setLoaiCam(String loaiCam){
		this.loaiCam = loaiCam;
	}
	public void setDoChua(double doChua){
		this.doChua = doChua;
	}
	public void infor(){								//In ra thong tin cua qua cam
		System.out.println("Cam rat tot cho suc khoe");			//Ghi de
	}
}

class camCaoPhong extends quaCam {			//Class con cua class quaCam

	public camCaoPhong(String loaiCam, double doChua, String xuatXu, double giaBan, String ngayNhap, int soLuong){
		super(loaiCam, doChua, xuatXu, giaBan, ngayNhap, soLuong);
	}
	public void infor(){
		System.out.println("Cam Cao Phong la mot dac san rat noi tieng");	//Ghi de
	}
}

public class camSanh extends quaCam {             //Class con cua class quaCam
	public camSanh(String loaiCam, double doChua, String xuatXu, double giaBan, String ngayNhap, int soLuong){
		super(loaiCam, doChua, xuatXu, giaBan, ngayNhap, soLuong);
	}
	public void infor(){
		System.out.println("Cam Sanh la mot trai cay quen thuoc");		//Ghi de
	}

	public static void main(String[] args) {
		camSanh camsanh = new camSanh("loaiA",50,"Bac Giang",30000,"12/10/2018",120);
		camsanh.infor();
		System.out.println(camsanh.getLoaiCam() + " " + camsanh.getDoChua() +  " " + camsanh.getXuatXu() + " " + camsanh.getGiaBan()+ " " + camsanh.getNgayNhap() + " " + camsanh.getSoLuong());
	}
}