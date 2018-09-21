package bai_tap_tuan_2;

public class Student {
    private String name, id, group, email;

    Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "K59CB";
        this.email = "uet@vnu.edu.vn";
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


    void getInfo() {
        System.out.println("Ten sv : " + name);
        System.out.println("Ma so sv : " + id);
        System.out.println("Lop hoc : " + group);
        System.out.println("Dia chi email : " + email);
    }

}
