package test;

import java.util.*;

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

//    public String toString() { hàm này có tác dụng giống hàm getInfo
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", id='" + id + '\'' +
//                ", email='" + email + '\'' +
//                ", group='" + group + '\'' +
//                '}';
//    }

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
        return getName() + "   " + getId() + "   "  + getGroup()
                + "   "  + getEmail();
    }

    public boolean sameGroup(Student s1, Student s2){//so sánh 2 sv có cùng lớp ko
        return ( s1.getGroup() == s2.getGroup());
    }


}
