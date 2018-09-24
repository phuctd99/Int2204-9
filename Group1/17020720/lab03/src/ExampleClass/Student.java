package ExampleClass;

public class Student {
    private String name, id, group, email;

    public Student(String n, String id, String em, String lop) {
        this.name = n;
        this.id = id;
        this.email = em;
        this.group = lop;
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


    public void getInfo() {
        System.out.println("Ten sv : " + name);
        System.out.println("Ma so sv : " + id);
        System.out.println("Lop hoc : " + group);
        System.out.println("Dia chi email : " + email);
    }

    public static void main(String[] args) {
        Student s = new Student("Nguyen Thi Hong Hanh", "17020720", "hanhanhhueduy@gmail.com", "INT2204 9");
        s.getInfo();
    }
}
