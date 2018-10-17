public class student {
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
    public String getInfo()
    {
        return ("name : "+ name +"  ma sv : "+ id +"  lop : " + group +"  email : "+email);
    }
    public student(String n,String sid,String em)
    {
        this.name = n;
        this.id = sid;
        this.group="INT22041";
        this.email=em;
    }
    public student ()
    {
        this.name="Student";
        this.id="000";
        this.group="INT22041";
        this.email="uet@vnu.edu.vn";
    }
    public student (student s)
    {
        this.name=s.name;
        this.id=s.id;
        this.group=s.group;
        this.email=s.email;
    }
    public student (String name, String id,String group,String email)
    {
        this.name=name;
        this.id=id;
        this.group=group;
        this.email=email;
    }
    public student (String group)
    {
        this.group=group;
        //this("name","000",group,"uet@vnu.edu.vn");
    }
}
