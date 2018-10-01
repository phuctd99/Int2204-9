import org.omg.CORBA.PUBLIC_MEMBER;

public class Sinhvien {
    private String name;
    private String id;
    private String group;
    private int age;
    public void setName(String name){
        this.name = name;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setGroup(String group){
        this.group = group;
    }
    public void setAge(int age){
        this.age =age;
    }
    public String getName(){ return name;}
    public String getId(){ return id;}
    public String getGroup() { return group;}
    public int getAge(){return  age;}
}
