public class Student {

    private String name;
    private String id;
    private String group;
    private String email;

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

    public void Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "K59CB";
        this.email = "uet@vnu.edu.vn";
    }

    public void Student(String n, String sid, String em) {
        this.name = n;
        this.id = sid;
        this.group = "K59CB";
        this.email = em;
    }

    public void Student(String n, String sid, String group, String em) {
        this.name = n;
        this.id = sid;
        this.group = group;
        this.email = em;
    }

    public Student Student(Student s) {
        return s;
    }

    public void getInfo() {
        System.out.println(this.name);
        System.out.println(this.id);
        System.out.println(this.group);
        System.out.println(this.email);
    }
}
