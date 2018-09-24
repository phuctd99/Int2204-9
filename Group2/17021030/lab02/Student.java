package studentmanagement;

public class Student {
   private String name;
   private String id;
   private String group;
   private String email;
   
   // cac phuong thuc get/set cho cac thuoc tinh
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
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
    // phuong thuc getInfo
    public void getInfo()
    {
        System.out.println("Ho va ten: " + name);
        System.out.println("MSSV: " + id);
        System.out.println("Lop: " + group);
        System.out.println("Email: " + email);
        System.out.println();
    }
    // phuong thuc khoi tao khong co tham so
    public Student() {
        name = "Student";
        id = "000";
        group = "K59CB";
        email = "uet@vnu.edu.vn";
    }
    // phuong thuc khoi tao co 3 tham so name, id, email
    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        group = "K59CB";
    }
    // phuong thuc khoi tao sao chep
    public Student(Student stu) {
        name = stu.name;
        id = stu.id;
        group = stu.group;
        email = stu.email;
    }
    // constructor phu
    public Student(String name, String id, String group, String email) {
        this.name = name;
        this.id = id;
        this.group = group;
        this.email = email;
    }
}
