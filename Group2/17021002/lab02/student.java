package abc.java;


public class student {

    private String name;
    private String id;
    private String group;
    private String email;
    public String getName(){
        return name;
    }
    
    public String getId(){
        return id;
    }
    
    public String getGroup(){
        return group;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setName(String a){
        name=a;
    }
    
    public void setId(String a){
        id=a;
    }
    
    public void setGroup(String a){
        group=a;
    }
    
    public void setEmail(String a){
        email=a;
    }
    
    public void getInfo(){
        System.out.println("Ten SV la " + name);
        System.out.println("MSSV la " + id);
        System.out.println("Lop SV la " + group);
        System.out.println("Email SV la " + email);
    }
    
    public student(){
        name="Student";
        id="000";
        group="INT22041";
        email="uet@vnu.edu.vn";
    }
    
    public student(String n,String sid,String em){
        name=n;
        id=sid;
        email=em;
        group="INT22041";
    }
    
    public student(student s){
        name=s.name;
        id=s.id;
        group=s.group;
        email=s.email;
    }
}