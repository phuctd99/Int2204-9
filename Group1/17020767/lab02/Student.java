/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student.Student;

/**
 *
 * @author admin
 */
public class Student {
    private	String name;
	private	String id;
	private	String group;
	private	String email;
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id=id;
	}
	public String getGroup(){
		return group;
	}
	public void setGroup(String group){
		this.group = group;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public void getInfo(){
		System.out.println(this.name);
		System.out.println(this.id);
		System.out.println(this.group);
		System.out.println(this.email);
	}
	public Student(){
		name = "Student";
		id = "000";
		group = "INT2204 9" ;
		email = "uet@vnu.edu.vn";
	}
	public Student(String n,String sid,String em){
		name = n
		;id = sid
		;email = em
		;group = "INT2204 9 ";
	}
	public Student(Student s){
		name = s.name;
		id = s.id;
		group = s.group
		;email = s.email;
	}
    
}
