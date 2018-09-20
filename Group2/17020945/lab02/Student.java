public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    String getInfo()
    {
        return (name+" "+id+" "+group+" "+email);
    };
    Student()
    {
        this.name = "Student";
        this.id = "000";
        this.group = "INT22041";
        this.email = "uet@vnu.edu.vn";
    }
    Student( String n, String sid, String em)
    {
        this.name = n;
        this.id = sid;
        this.group = "INT22041";
        this.email = em;

    }
    Student(Student s)
    {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }
}
