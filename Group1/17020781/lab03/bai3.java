class conCho{					// đối tượng con chó 
	private String name;		// tên chó 
	private String mauLong;		// Màu lông	
	private float canNang;		//Cân nặng
	private int age;			//Tuổi 

	public String getName(){	//getter
		return this.name;
	}
	public String getMauLong(){
		return this.mauLong;
	}
	public float getCanNang(){
		return this.canNang;
	}
	public int getAge(){
		return this.age;
	}
	public void setName(String a){		// Setter
		this.name = a.name;
	}
	public void setMauLong(String a){
		this.mauLong = a.mauLong;
	}
	public void setAge(int a){
		this.age = a.age;
	}

	public void setCanNang(float a){
		this.canNang = a.canNang;
	}
}

class sinhVien{					//Đối tượng sinh vien
	private String name;		// Tên sinh viên
	private int age;			//Tuổi sinh viên
	private String maSV;        // Mã sinh viên
	private String maLop;     // Mã lớp
	
	public String getName(){		//getter
		return this.name;
	}
	public String getAge(){
		return this.age;
	}
	public float getMaSV(){
		return this.maSV;
	}
	public int getMaLop(){
		return this.maLop;
	}
	public void setName(String a){		//Setter
		this.name = a.name;
	}
	public void setAge(int a){
		this.age = a.age;
	}
	public void setMaSV(String a){
		this.maSV = a.maSV;
	}
}
	

class xeMay{					//Doi tượng Xe máy 
	private String loaiXe;
	private String mauSac;
	private String ngayMua;
	
	public String getName(){			//Getter
		return this.loaiXe;
	}
	public String getColor(){
		return this.mauSac;
	}
	public String getDate(){
		return this.ngayMua;
	}
	
	public void setName(String a){		//Setter
		this.name = a.name;
	}
	public void setColor(String a){
		this.mauSac = a.mauSac;
	}
	public void setDate(String a){
		this.ngayMua = a.ngayMua;
	}
}
class doiBong{						//Đối tượng là đội bóng
	private String tenDoiBong;			
	private int soLuongTV;
	private String tenHLV;
	private String tenChutich;
	public String getTenDoiBong(){				//Getter
		return this.tenDoiBong;
	}
	public int getSoLuongTV(){
		return this.soLuongTV;
	}
	public String getTenHLV(){
		return this.tenHLV;
	}
	public String getTenChuTich(){
		return this.tenChutich;
	}
	public void setName(String a){				//Setter
		this.tenDoiBong = a.tenDoiBong;
	}
	public void setSL(int a){
		this.soLuongTV = a.soLuongTV;
	}
	public void setHLV(String a){
		this.tenHLV = a.tenHLV;
	}
}

class quocGia{						//ĐỐi tượng là một quốc gia
	private String tenQuocGia;
	private double dienTich;
	private double danSo;
	private String viTri;

	public String gettenQuocGia(){ 			//Getter
		return this.tenQuocGia;
	}
	public double getDientich(){
		return this.dienTich;
	}
	public double getDanSo(){
		return this.danSo;
	}
	public void setName(String a){				//Setter
		this.tenHanhTinh = a.tenHanhTinh;
	}
	public void setS(double a){
		this.dienTich = a.dienTich;
	}
	public void setDanSo(double a){
		this.danSo = a.danSo;
	}
}

class hanhTinh{							//ĐỐi tượng là 1 hành tinh
	private String tenHanhTinh;
	private double khoiLuong;
	private double chuKy;
	private int viTri;
	public String getTenHanhTinh(){				//Getter
		return this.tenHanhTinh;
	}
	public double getKhoiLuong(){
		return this.khoiLuong;
	}
	public double getChuKy(){
		return this.chuKy;
	}
	public void setName(String a){					//Setter
		this.tenHanhTinh = a.tenHanhTinh;
	}
	public void setKhoiLuong(double a){
		this.khoiLuong = a.khoiLuong;
	}
	public void setChuKy(double a){
		this.chuKy = a.chuKy;
	}
}

class phim{						//đối tượng là 1 bộ phim
	private String tenPhim;
	private int namSX;
	private String daoDien;
	private double doanhThu;
	public String getTenPhim(){				// Getter
		return this.tenPhim;
	}
	public int getNamSX(){
		return this.namSX;
	}
	public String getDaoDien(){
		return this.daoDien;
	}
	public double getDoanhThu(){
		return this.doanhThu;
	}
	public void setName(String a){				//Setter
		this.tenPhim = a.tenPhim;
	}
	public void setNamSX(int a){
		this.namSX = a.namSX;
	}
	public void setDaoDien(String a){
		this.daoDien = a.daoDien;
	}
}

class traiCay{						//đối tượng là 1 loại trái cây
	private String tenTraiCay;
	private float giaCa;
	private String noiTrong;
	public String getTenTraiCay(){					//Getter
		return this.tenTraiCay;
	}
	public float getGiaCa(){
		return this.giaCa;
	}
	public String getNoiTrong(){
		return this.noiTrong;
	}
	public void setName(){					//Setter
		this.tenTraiCay = a.tenTraiCay;
	}
	public void setGia(float a){
		this.giaCa = a.giaCa;
	}
	public void setNoiTrong(String a){
		this.noiTrong = a.noiTrong;
	}
}

class Sach{							// đối tượng là 1  đầu sách
	private String tenSach;
	private String loaiSach;
	private int soLuong;
	private String maSach;
	public String getTenSach(){				//Getter
		return this.tenSach;
	}
	public String getLoaiSach(){
		return loaiSach;
	}
	public int getSoLuong(){
		return this.soLuong;
	}
	public void setName(String a){				//Setter
		this.tenSach = a.tenSach;
	}
	public void setLoai(String a){
		this.loaiSach = a.loaiSach;
	}
	public void setSL(int a){
		this.soLuong = a.soLuong;
	}
}

class dienThoai{							//Đối tượng là 1 chiếc điện thoại
	private String tenDienThoai;
	private String hangSanXuat;
	private String xuatXu;
	private String loaiMay;
	private float gia;

	public String getTen(){						//Getter
		return this.tenDienThoai;
	}
	public String getHang(){
		return this.hangSanXuat;
	}
	public String getXuatXu(){
		return this.xuatXu;
	}
	public float getGia(){
		return this.gia;
	}
	public void setName(String a){					//Setter
		this.tenDienThoai = a.tenDienThoai;
	}
	public void setHangSX(String a){
		this.hangSanXuat = a.hangSanXuat;
	}
	public void setXX(String a){
		this.xuatXu = a.xuatXu;
	}
	public void setGia(float a){
		this.gia = a.gia;
	}

}