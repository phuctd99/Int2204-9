/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

/**
 *
 * @author Tommmm^^
 */
public class Student {
    private String name , id , email , group;
    public Student (String name , String id , String email ,String group){
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = group;
    }
    public Student(){
        name ="Student";
        id = "001";
        group = "INT22401";
        email = "uet@vnu.edu.vn";
    }
    public Student (String name , String id , String email ){
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = "INT22401";
    }
    public Student (Student s){
        name = s.name;
        id =s.id;
        email = s.email;
        group = s.group;
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
    public void getInfo(){
        System.out.println("ID :" + id);
        System.out.println("Name : "+ name);
        System.out.println("Email : " + email);
        System.out.println("Group : " +group);
        
    }
    
    
}
