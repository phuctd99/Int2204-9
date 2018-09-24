//package com.company;

public class Student {
    private String name;
    private String id;
    private String group;
    private String email;
    public Student() {                  // contructor
        this.name = "Student";
        this.id=  "000";
        this.group = "K59CB";
        this.email = "uet@vnu.edu.vn";
    }
    public Student(String n, String sid, String em, String group) {  // contructor
        this.name = n;
        this.id = sid;
        this.email = em;
        this.group = group;
    }
    public void setName(String _name) {    // contructor
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
        return name + " " + id + " " + group + " " + email;
    }
    public Student(Student s) {
        this.name = s.getName();
        this.id = s.getId();
        this.group = s.getGroup();
        this.email = s.getEmail();
    }
}
