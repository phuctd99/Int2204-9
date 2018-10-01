public class student {
	private String name, MSSV, group, address, email;//ten,id,lop,dia chi,email
	private long phone;//so dien thoai
	private byte age;//tuoi
	private boolean sex;//gioi tinh
	private float dtb;
	public student(String name, String MSSV, String group, String address,
				   String email, long phone, byte tuoi, boolean sex,float dtb) {
		this.name = name;
		this.MSSV = MSSV;
		this.group = group;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.age = age;
		this.sex = sex;
		this.dtb=dtb;
	}
	//get set diemtrung binh
	public float getDtb() {
		return dtb;
	}
	public void setDtb(float dtb) {
		this.dtb = dtb;
	}

	//get set ten sinh vien
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//get set ma so sinh vien
	public String getMSSV() {
		return MSSV;
	}

	public void setMSSV(String MSSV) {
		this.MSSV = MSSV;
	}

	//get set lop sinh viien
	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	// get set dia chi sinh vien
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	//get set email cua sinh vien
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	//get set so dien thoai sinh vien
	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	//get set tuoi sinh vien
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	//get set gioi tinh cua sinh vien
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	//in ra gioi tinh sinh vien
	public void gioiTinh(){
		if (this.isSex()==true) System.out.println("gioi tinh sinh vien: nu");
		else System.out.println("gioi tinh sinh vien la: nam");
	}
	//in ra hoc luc sinh vien
	public void hocLuc(){
		if(this.getDtb()>=8) System.out.println("gioi");
		if(this.getDtb()>=6.5&&this.getDtb()<8) System.out.println("kha");
		if(this.getDtb()>=5&&this.getDtb()<6.5) System.out.println("trung binh");
		else System.out.println("yeu");
	}
}
