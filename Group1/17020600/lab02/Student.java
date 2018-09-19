/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;
import java.util.Scanner;
public class Student {
    private String name, id, email, group;

    public Student(String name, String id, String email, String group) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = group;
    }
    public Student() {
        this.name = "Student";
        this.id = "000";
        this.email = "uet@vnu.edu.vn";
        this.group = "K59CB";
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getInfo()
    {
        return this.name + "   " + this.id + "   "  + this.group
                + "   "  + this.email;
    }
    public void setInfo()
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ten: ");
		this.name = sc.nextLine();
		System.out.println("mssv: ");
		this.id = sc.nextLine();
		System.out.println("group: ");
		this.group = sc.nextLine();
		System.out.println("email: ");
		this.email = sc.nextLine();
	}
}
