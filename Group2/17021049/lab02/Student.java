 package Lab2;

 public class Student{
    private String name;
    private String id;
    private String group;
    private String email;

    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(String ID){
        this.id = ID;
    }
    public String getId(){
        return id;
    }
    public void setGroup(String g){
        this.group = g;
    }
    public String getGroup(){
        return group;
    }
     public void setEmail(String em){
        this.email = em;
    }
    public String getEmail(){
        return email;
    }


    public void getInfo(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id );
        System.out.println("Group: " + group);
        System.out.println("Email: " +email);



    }
    public Student() {
        name = "student";
        id = "000";
        group = "INT22041";
        email = "uet@vnu.edu.vn";
    }

    public Student(String n, String ID, String em){
            this.name = n;
            this.id = ID;
            this.group = "INT22041";
            this.email = em;
    }

    public Student(Student s){
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

}

