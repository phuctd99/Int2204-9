public class Student {
    //3
    private String name;
    private String id;
    private String group;
    private String email;

    //4
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

    //5
    public String getInfo() {
        return this.name + "\n" + this.id + "\n" + this.group + "\n" + this.email;
    }

    //7
    public Student() {
        name = "Student";
        id = "000";
        group = "INT22041";
        email = "uet@vnu.edu.vn";
    }

    public Student(String n, String sid, String em) {
        this.name = n;
        this.id = sid;
        this.email = em;
        this.group = "INT22041";
    }

    public Student(Student s) {
        this.name = s.getName();
        this.id = s.getId();
        this.group = s.getGroup();
        this.email = s.getEmail();
    }
}
