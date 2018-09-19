package BT_TH2;

public class Student{
    String name;
    String id;
    String group;
    String email;
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public String getId(){
        return id;
    }
    public void setID(String n){
        id = n;
    }
    public String getGroup(){
        return group;
    }
    public void setGroup(String n){
        group = n;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String n){
        email = n;
    }
    public void getInfo(){
        System.out.println("name: " + name);
        System.out.println("id: " + id);
        System.out.println("group: " + group);
        System.out.println("email: " + email);
    }
    Student(){
        name = "Student";
        id = "000";
        group = "k59CB";
        email = "uet@vnu.edu.vn";
    }
    Student(String n, String sid, String em){
        name = n;
        id = sid;
        email = em;
        group = "INT22041";
    }
    Student(Student s){
        name = s.name;
        id = s.id;
        group = s.group;
        email = s.email;
    }
    public void gan(Student s){
        name = s.name;
        id = s.id;
        group = s.group;
        email = s.email;
    }
}

