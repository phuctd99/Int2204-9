/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Admin
 */
public class Student {

    // Cau 1 va Cau 3
    private String name;
    private String id;
    private String group;
    private String email;
    
    // Cau 4
    public String getName(){
        return name;
    }
    
    public String getId(){
        return id;
    }
    
    public String getGroup(){
        return group;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setName(String n){
        name=n;
    }
    
    public void setId(String n){
        id=n;
    }
    
    public void setGroup(String n){
        group=n;
    }
    
    public void setEmail(String n){
        email=n;
    }
    
    // Cau 5
    public void getInfo(){
        System.out.println("Ten SV la " + name);
        System.out.println("MSSV la " + id);
        System.out.println("Lop SV la " + group);
        System.out.println("Email SV la " + email);
    }
    
    // Cau 7
    public Student(){
        name="Student";
        id="000";
        group="INT22041";
        email="uet@vnu.edu.vn";
    }
    
    public Student(String n,String sid,String em){
        name=n;
        id=sid;
        email=em;
        group="INT22041";
    }
    
    public Student(Student s){
        name=s.name;
        id=s.id;
        group=s.group;
        email=s.email;
    }
}
