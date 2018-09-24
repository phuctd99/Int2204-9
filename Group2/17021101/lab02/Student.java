package com.company;
public class Student {

    private String name, id,group,email;
    public Student()
    {
        name = "Student";
        id = "000";
        group = "K59CB";
        email = "uet@vnu.edu.vn";
    }

    public Student(String n, String sid, String em)
    {
        name = n;
        id = sid;
        email = em;
        group = "K59CB";
    }

    public Student(Student s)
    {
        name = s.getName();
        id = s.getId();
        email = s.getEmail();
        group = s.getGroup();
    }

    public String getName()
    {
        return name;
    }
    public String getId()
    {
        return id;
    }
    public String getGroup()
    {
        return group;
    }
    public String getEmail()
    {
        return email;
    }
    public void setName(String name_)
    {
        name = name_;
    }
    public void setId(String id_)
    {
        id = id_;
    }
    public void setGroup(String group_)
    {
        group = group_;
    }
    public void setEmail(String email_)
    {
        this.email = email_;
    }

    public String getInfo()
    {
        String a=name+" "+id+" "+email;
        return a;
    }
}