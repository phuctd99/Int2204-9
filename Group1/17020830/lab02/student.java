public class student {
    private String name;
    private String id;
    private String group;
    private String email;

    public String getName()
    {
        return name;
    }
    public String getGroup(){
        return group;
    }
    public  String getId(){
        return id ;

    }
    public String getEmail(){
        return email;
    }
    public void setName(String name)
    {
        this.name = name ;
    }
    public void setId(String id) {
        this.id = id ;
    }
    public void setGroup(String group){
        this.group = group ;
    }
    public void setEmail(String email) {
        this.email = email ;
    }

    public void getInfo(){
        System.out.println(this.name);
        System.out.println(this.id);
        System.out.println(this.group);
        System.out.println(this.email);

    }
    public student(){
        this.name = "student";
        this.id = "000";
        this.group = "INT22041";
        this.email ="uet@vnu.edu.vn";
    }
    public  student(String n , String sid , String em){
        name = n ;
        id = sid ;
        email = em ;
        group = "INT22041";
    }
    public student(student s){
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;

    }




}
