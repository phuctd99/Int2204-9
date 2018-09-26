package bai_tap;

public class Students {
    private String name, id, group, email;

    Students() {
        this.name = "Student";
        this.id = "123";
        this.group = "K62CK";
        this.email = "uet@vnu.edu.vn";
    }

    Students(String name, String id, String email, String group) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = group;
    }

    Students(Students s) {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGroup() {
        return group;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInfor() {
        String studentInfor = String.format("Ho ten: %s \nId: %s \nGroup: %s \nEmail: %s\n", this.name, this.id, this.group, this.email);
        return  studentInfor;
    }
}
