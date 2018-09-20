package Student;

import java.util.Scanner;

public class Student {
	private String name;
	private String id;
	private String lopHoc;
	private String email;
	
	public Student() {
		this.name = "Student";
		this.id = "000";
		this.lopHoc = "INT22041";
		this.email = "uet@vnu.edu.vn";
	}
	public Student(String n, String sid, String em) {
		this.name = n;
		this.id = sid;
		this.lopHoc = "INT22041";
		this.email = em;
	}
	public Student(Student s) {
		this.name = s.name;
		this.id = s.id;
		this.lopHoc = s.lopHoc;
		this.email = s.email;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLopHoc() {
		return lopHoc;
	}
	public void setLopHoc(String lopHoc) {
		this.lopHoc = lopHoc;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setInfo() {
		System.out.print("Nhập tên sinh viên: ");
		this.name = new Scanner(System.in).nextLine();
		System.out.print("Nhập mã sinh viên: ");
		this.id = new Scanner(System.in).nextLine();
		System.out.print("Nhập lớp sinh viên: ");
		this.lopHoc = new Scanner(System.in).nextLine();
		System.out.print("Nhập email sinh viên: ");
		this.email = new Scanner(System.in).nextLine();
	}
	public String getInfo() {
		//System.out.println("Thông tin của sinh viên là: ");
		return this.name + "\n" + this.id + "\n" + this.lopHoc + "\n" + this.email;
	}


}



