package oop_2;

public class Student {
	private String name;
	private String id;
	private String group;
	private String email;
	public Student() {
		this.name = "student";
		this.id = "000";
		this.group = "INT22041";
		this.email = "uet@vnu.edu.vn";
	}
	public Student(String n, String sid, String em) {
		name = n;
		id = sid;
		group = "INT2241";
		email = em;
	}
	public Student(Student s) {
		
		name = s.name;
		id = s.id;
		group = s.group;
		email = s.email;
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
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getInfo() {
		return name + " " + id + " " + group + " " + email;
	}
	
	
}
