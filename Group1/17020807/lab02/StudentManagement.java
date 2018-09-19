import java.util.ArrayList;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Studentmanagement;

/**
 *
 * @author CCNE
 */
class Student { //Khai báo class Student
    private String name;
    private String id;
    private String group;
    private String email;
    public Student(String _name, String _id, String _group, String _email) {
        name = _name;
        id = _id;
        group = _group;
        email = _email;
    }
    public void setName(String _name) {
        this.name = _name;
    }
    public void setId(String _id) {
        this.id = _id;
    }
    public void setGroup(String _group) {
        this.group = _group;
    }
    public void setEmail(String _email) {
        this.email = _email;
    }
    public String getName() {
        return this.name;
    }
    public String getId() {
        return this.id;
    }
    public String getGroup() {
        return this.group;
    }
    public String getEmail() {
        return this.email;
    }
    public String getInfo() {
        return (name + " " + id + " " + group + " " + email);
    }
    
    public Student()  //Khoi tao class Student
    {                 //Phuong thuc 1
        this.name = "Student";
        this.id = "000";
        this.group = "K59CB";
        this.email = "uet@vnu.edu.vn";
    }
    public Student(Student s)//Phuong thuc 2
    {
        this.name = s.getName();
        this.id = s.getId();
        this.group = s.getGroup();
        this.email = s.getEmail();
    }
    public Student(String n, String sid, String em)  //Phuong thuc 3
    {                                              
        this.name = n;
        this.id = sid;
        this.email = em;
        this.group = "K59CB";
    }
    
}
public class StudentManagement {
    
    public boolean sameGroup(Student st1, Student st2) {
        boolean kt = false;
        if (st1.getGroup().equals(st2.getGroup())) {
            kt = true;
        } 
        return kt;
    }
    static ArrayList<Student> students = new ArrayList<Student>();
    static void studentsByGroup() {
        for (int i=0; i<students.size(); i++) {
            System.out.println(students.get(i).getInfo());
        }
    }
    static void removeStudent(String id) {
        for (int i = 0; i < students.size(); i++)
        {
            if (students.get(i).getId().equals(id))
            {
                students.remove(i);
                i--;
            }
        }

    }
   
    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();
        Student st1 = new Student("Anh", "001", "K59CLC", "vnu@gmail.com");
        System.out.println("Student1's info:");
        System.out.println(st1.getInfo());
        System.out.print("Student1's name: ");
        System.out.println(st1.getName());
        Student st2 = new Student("Lan", "002", "K59CLC"); //Kiem tra phuong thuc khoi tao 3
        Student st3 = new Student(); //Kiem tra phuong thuc khoi tao 1
        Student s = new Student(st1);//Kiem tra phuong thuc khoi tao 2
        if (sm.sameGroup(st1, st2)) {
            System.out.println("In same group");
        }
        else {
            System.out.println("In different group");
        }
        System.out.print("Student S's Info: ");
        System.out.println(s.getInfo()); // Kiem tra phuong thuc khoi tao 3
        students.add(st1);
        students.add(st2);
        students.add(st3);
        System.out.println("List student of Group:");
        studentsByGroup();
        
    }
    
}
