public class Student {
    private
    String name, id, group, email;

    public Student() {
        name = "Student";
        id = "000";
        group = "K59CB";
        email = "uet@vnu.edu.vn";
    }

    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        group = "K59CB";
        this.email = email;
    }


    public Student(Student sv) {
        this.name = sv.getName();
        this.id = sv.getId();
        this.group = sv.getGroup();
        this.email = sv.getEmail();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setGroup(String group) { this.group = group; }

    public String getGroup() {
        return group;
    }

    public void setEmail(String email) { this.email = email; }

    public String getEmail() {
        return email;
    }

    public void setInfo(String name, String id, String group, String email) {
        this.name = name;
        this.id = id;
        this.group = group;
        this.email = email;
    }

    public void getInfo() {
        System.out.println( name );
        System.out.println( id );
        System.out.println( group );
        System.out.println( email );
    }


}