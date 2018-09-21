public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    public Student(){
        name = "Student";
        id = "000";
        group = "INT22041";
        email = "uet@vnu.edu.vn";
    }

    
    public Student(String n, String sid, String em){
        name = n;
        id = sid;
        group = "INT22041";
        email = em;
    }

    
    public Student(Student s){
        name = s.name;
        id = s.id;
        group = s.group;
        email = s.email;
    }

    
    public void setName(String ten){
        name = ten;
    }

    
    public String getName(){
        return name;
    }

    
    public void setId(String maSV){
        id = maSV;
    }

    public String getId(){
        return id;
    }

    public void setGroup(String nhom){
        group = nhom;
    }

    public String getGroup(){
        return group;
    }

    public void setEmail(String mail){
        email = mail;
    }

    public String getEmail(){
        return email;
    }

    public String getInfo(){
        return getName() + '\n' + getId() + '\n' + getGroup() + '\n' + getEmail() + '\n';
    }
}
