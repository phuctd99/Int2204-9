public class Teacher {
	private String name;    // Trường name - Thông tin tên người.
	private int age;        // Trường age - Thông tin tuổi người. 
	private String subject; // Trường subject - Thông tin môn dạy học của giáo viên.
	private String gioiTinh;        // Trường gioiTinh - Thông tin giới tính người. 

    // Mục đích nhằm để gán các giá trị cho các trường của Teacher.
    // Chỉ định rõ tên, tuổi, môn dạy học, giới tính của một giáo viên.
	public Teacher(String name, int age, String subject, String gioiTinh) {
		this.name = name;
		this.age = age;
		this.subject = subject;
		this.gioiTinh = gioiTinh;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	//phuong thuc tra ve gia tri
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getSubject() {
		return subject;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public String getInfo() {
		return("Ten giao vien: " + this.name + ", Tuoi: " + this.age 
				+ ", Mon day hoc: " + this.subject + ", Gioi tinh: " + this.gioiTinh);
	}
}
