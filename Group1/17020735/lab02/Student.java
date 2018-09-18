public class Student {

    private String name;
    private String id;
    private String group;
    private String email;

    public Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "INT22041";
        this.email = "uet@vnu.edu.vn";
    }
    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.group = "INT22041";
        this.email = email;
    }
    public Student(Student sv) {
        this.name = sv.getName();
        this.id = sv.getID();
        this.group = sv.getGroup();
        this.email = sv.getEmail();
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setID(String ID) {
        this.id = ID;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return this.name;
    }
    public String getID() {
        return this.id;
    }
    public String getGroup() {
        return this.group;
    }
    public String getEmail() {
        return this.email;
    }

    public String getInfo() {
        return (this.name + " " + this.id + " " +this.group + " " +this.email);
    }

//    public void getInfo_1() {
//        System.out.printf("%-30s %-10s %-10s %s\n", "Name", "ID", "Group", "Email");
//        System.out.printf("%-30s %-10s %-10s %s\n", this.name, this.ID, this.group, this.email);
//    }

}
