public class rent {
	private int tienPhong,tienDien,tienNuoc;
	private byte area;//dien tich phong
	private boolean condition;//dieu kien phong tro

	public int getTienPhong() {
		return tienPhong;
	}
	public void setTienPhong(int tienPhong) {
		this.tienPhong = tienPhong;
	}

	public boolean isCondition() {
		return condition;
	}
	public void setCondition(boolean condition) {
		this.condition = condition;
	}

	public byte getArea() {
		return area;
	}
	public void setArea(byte area) {
		this.area = area;
	}

	public int getTienNuoc() {
		return tienNuoc;
	}
	public void setTienNuoc(int tienNuoc) {
		this.tienNuoc = tienNuoc;
	}

	public int getTienDien() {
		return tienDien;
	}
	public void setTienDien(int tienDien) {
		this.tienDien = tienDien;
	}
	//kiem ta co so cua phong tro
	public void test(){
		if(this.isCondition()==true) System.out.println("tot");
		else System.out.println("can nang cap");
	}
	//kiem tra phong o duoc may nguoi
	public int soNguoi(){
		if(this.getArea()<=15) return 2;
		else return 3;
	}
	//tinh tienn dien khi biet so dien va so nuoc da dung
	public int Rent(int a,int b){
		return this.getTienPhong()+this.getTienDien()*4000+this.getTienNuoc()*30000;
	}
}
