package ClassStudent;

public class Student{
	private String name; // khai bao thuoc tinh ten sinh vien
	private String ID; // khai bao thuoc tinh ma so sinh vien
	private String email; // khai bao thuoc tinh dia chi email
	private String group; // khai bao thuoc tinh lop hoc
	// phuong thuc khoi tao khong tham so
	public Student(String _name, String _ID , String _email, String _group) {
		name = _name;
		ID = _ID;
		email = _email;
		group = _group;
	}
	// cac phuong thuc getter , setter cua lop student
	public void setName(String _name) {
		this.name = _name;
	}
	public void setID(String _ID) {
		this.ID = _ID;
	}
	public void setEmail(String _email) {
		this.email = _email;
	}
	public void setGroup(String _group) {
		this.group = _group;
	}
	public String getName() {
		return this.name;
	}
	public String getID() {
		return this.ID;
	}
	public String getEmail() {
		return this.email;
	}
	public String getGroup() {
		return this.group;
	}
	// phuong thuc getInfo() in ra man hinh ten , id, lop hoc, va dia chi email
	public String getInfo() {
		return name + " " + ID + " " + " " + group + " " + email;
	}
	// phuong thuc khoi tao khong tham so
	public Student() {
		name = "Student";
		ID = "000";
		email = "uet.vnu.edu.vn";
		group = "K59CLC";
	}
	// phuong thuc khoi tao co tham so mac dinh lop "K59CLC"
	public Student(String n, String sid, String em) {
		name = n;
		ID = sid;
		email = em;
		group = "K59CLC";
	}
	// phuong thuc khoi tao sao chep cac thuoc tinh cua Student s
	public Student(Student s) {
		this.name = s.getName();
		this.ID = s.getID();
		this.email = s.getEmail();
		this.group = s.getGroup();
	}
	
}
