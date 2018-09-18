/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author phamh
 */
public class Student {

    private String name, id, group, email;

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
    
    public void getInfo(){
        System.out.println(this.name);
        System.out.println(this.id);
        System.out.println(this.group);
        System.out.println(this.email);
    }
    
    public Student(){
        this.name = "Student";
        this.id = "000";
        this.group = "INT22041";
        this.email = "uet@vnu.edu.vn";
    }
    
    public Student(String n, String i, String e){
        this.name = n;
        this.id = i;
        this.email = e;
        this.group = "INT22041";
    }
    
    public Student(Student s){
        this.name = s.getName();
        this.id = s.id;
        this.email = s.email;
        this.group = s.group;
    }
    
    
}
