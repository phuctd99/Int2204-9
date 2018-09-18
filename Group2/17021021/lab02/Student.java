public class Student {

    private String name;
    private String id;
    private String group;
    private String email;


    //constructors
    public Student() {
        name = "Student";
        id = "000";
        group = "INT22041";
        email = "uet@vnu.edu.vn";
    }
    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        group = "INT22041";
    }
    public Student(Student s) {
        this.name = s.getName();
        this.id = s.getId();
        this.email = s.getEmail();
        this.group = s.getGroup();
    }


    //getter
    public String getName() {return name;}
    public String getId() {return id;}
    public String getGroup() {return group;}
    public String getEmail() {return email;}
    public String getInfo() {return name + "  " + id + "  " + group + "  " + email;}


    //setter
    public void setName(String name) {this.name = name;}
    public void setId(String id) {this.id = id;}
    public void setGroup(String group) {this.group = group;}
    public void setEmail(String email) {this.email = email;}
}
