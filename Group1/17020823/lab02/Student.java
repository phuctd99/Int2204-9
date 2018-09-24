/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Hoang Vu Huong
 */
public class Student {

    /**
     * @param args the command line arguments
     */
    private String name, id, group, email;

    Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "K59CB";
        this.email = "@vnu.edu.vn";
    }

    Student(String n, String id, String em) {
        this.name = n;
        this.id = id;
        this.email = em;
        this.group = "K59CB";
    }

    Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

    String getName() {
        return name;
    }

     String getEmail() {
        return email;
    }

     String getGroup() {
        return group;
    }

     String getId() {
        return id;
    }

     void setName(String name) {
        this.name = name;
    }

     void setEmail(String email) {
        this.email = email;
    }

     void setGroup(String group) {
        this.group = group;
    }

     void setId(String id) {
        this.id = id;
    }


     public String getInfo()
    {
        return (name + "\n" + id + "\n" + group + "\n" + email + "\n");
        
    }
    
}
