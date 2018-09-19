public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    public Student()
    {
        name = "Student";
        id = "000";
        group = "INT22041";
        email = "uet@vnu.edu.vn";
    }

    public Student(String n, String sid, String em)
    {
        name = n;
        id = sid;
        email = em;
        group = "INT22041";
    }

    public Student(Student s)
    {
        name = s.getName();
        id = s.getId();
        group = s.getGroup();
        email = s.getEmail();
    }

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }

    public void setId(String n){
        id = n;
    }
    public String getId(){
        return id;
    }

    public void setGroup(String n){
        group = n;
    }
    public String getGroup(){
        return group;
    }

    public void setEmail(String n){
        email = n;
    }
    public String getEmail(){
        return email;
    }
    public void getInfo(){ // do la phuong thưc in nên là void chứ k phải String
        //System.out.println(name + " " + id + " " + group + " " + email);
        System.out.printf( "%-15s%-10s%-10s%-15s\n", name, id, group, email);
    }
}
