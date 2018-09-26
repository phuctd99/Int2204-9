package baitaptuan2;
import java.util.Scanner;
public class Student {
	private String name;
	private String id;
	private String group;
	private String email;
	boolean sw = true;
	public Student(String name, String id, String email) {
		
		this.name = name;
		this.id = id;
		this.group = "K59CB";
		this.email = email;
	}
	public Student() {
	
		this.name = "Student";
		this.id = "000";
		this.group = "K59CB";
		this.email = "uet@vnu.edu.vn";
	}
	public Student(Student s)
	{
		this.name = s.name;
		this.id = s.id;
		this.email  = s.email;
		this.group = s.group;
		
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
	
	public String getInfo()
	{
		
		return ("ten: " + name + "\n" + "mssv: " + id + "\n" + "group: " + group + "\n" + "email: " + email );
	}
	public void setInfo()
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ten: ");
		String name = sc.nextLine();
		System.out.println("mssv: ");
		String id = sc.nextLine();
		System.out.println("group: ");
		String group = sc.nextLine();
		System.out.println("email: ");
		String email = sc.nextLine();
		setName(name);
		setId(id);
		setGroup(group);
		setEmail(email);
		sc.close();
	}
	
	
}	



