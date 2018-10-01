package bai3;

public class NhanVien {
	 private String ten;
	    private String phongBan;
	    private float heSoLuong;
	    private int soNgayCong;
	    private int luongcoban;
	    NhanVien() {
	    	this.setLuongcoban(2000000);
	    }
	    public String getTen() {
	        return ten;
	    }
	    public void setTen(String ten) {
	        this.ten = ten;
	    }

	    public String getPhongBan() {
	        return phongBan;
	    }
	    public void setPhongBan(String phongBan) {
	        this.phongBan = phongBan;
	    }

	    public float getHeSoLuong() {
	        return heSoLuong;
	    }
	    public void setHeSoLuong(float heSoLuong) {
	        this.heSoLuong = heSoLuong;
	    }

	    public int getSoNgayCong() {
	        return soNgayCong;
	    }
	    public void setSoNgayCong(int soNgayCong) {
	        this.soNgayCong = soNgayCong;
	    }
	    public int getLuongcoban() {
			return luongcoban;
		}
		public void setLuongcoban(int luongcoban) {
			this.luongcoban = luongcoban;
		}
	    public float tinhLuong(){
	    	//tinh luong nhan vien dua tren he so luong va luong co ban
	        return this.getHeSoLuong() * this.getLuongcoban() + this.luongcoban; 
	    }
	    public float tienThuong(){
	    	// tien thuong moi thang
	        float bonus = 0;
	        if(this.getSoNgayCong() > 25 && this.getPhongBan().equalsIgnoreCase("vip"))
	            bonus += this.tinhLuong()*0.2;
	        else if(this.getSoNgayCong() > 25)
	            bonus += this.tinhLuong()*0.1;
	        return bonus;
	    }
	    
	    public float tongLuong(){
	        return this.tienThuong() + this.tinhLuong();
	    }
		
}
