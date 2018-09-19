public class Student {
    //Các thuộc tính của lớp Student
    private String name;
    private String id;
    private String group;
    private String email;

    //Các phương thức get/set của lớp Student
    //name
    public String getName() {
        return name;
    }
    public void setName( String n) {
        name = n;
    }
    //id
    public String getId() {
        return id;
    }
    public void setId( String n) {
        id = n;
    }
    //group
    public String getGroup() {
        return group;
    }
    public void setGroup( String n) {
        group = n;
    }
    //email
    public String getEmail() {
        return email;
    }
    public void setEmail( String n) {
        email = n;
    }

    //Phương thức getInfo để in ra màn hình thông tin của student
    public void getInfo() {
        System.out.println("Ten\t\t: " + name);
        System.out.println("Id \t\t: " + id);
        System.out.println("Group\t: " + group);
        System.out.println("Email\t: " + email);
    }
	
	// Phuong thuc khoi tao Student
    public Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "K59CB";
        this.email = "uet@vnu.edu.vn";
    }
    public Student( String n, String sid, String em) {
        this.name = n;
        this.id = sid;
        this.email = em;
        this.group = "K59CB";
    }
    public  Student( Student s) {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }
}
