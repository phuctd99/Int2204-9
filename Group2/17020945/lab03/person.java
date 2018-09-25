public class person {
	private String name,address,cccd;//ten,dia chi,can cuoc cong dan
	private float height,weigh;//chieu cao,can nang kg,cm
	private boolean sex;//gioi tinh

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public float getWeigh() {
		return weigh;
	}
	public void setWeigh(float weigh) {
		this.weigh = weigh;
	}

	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}

	public String getCccd() {
		return cccd;
	}
	public void setCccd(String cccd) {
		this.cccd = cccd;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	//kiem tra su can doi cau co the
	public boolean test(){
		if(this.getWeigh()==50+0.75*this.getHeight()-150)return true;
		else return false;
	}
	//kiem tra BMI
	public void BMI(){
		float a=this.getWeigh()/(this.getHeight()/100*this.getHeight()/100);
		if(a<18.5) System.out.println("gay");
		if(a>=18.5&&a<23) System.out.println("binh thuong");
		if(a>=23) System.out.println("beo");
	}
	//gioi tinh
	public void gioitinh(){
		if(this.isSex()==true) System.out.println("nu");
		else System.out.println("nam");
	}
}
