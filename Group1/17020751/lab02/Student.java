/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CCNE
 */
public class Student {
    private String name,id,group,emai;

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

    public String getEmai() {
        return emai;
    }

    public void setEmai(String emai) {
        this.emai = emai;
    }
    public void getInfo()// ham in thong tin sinh vien
    {
        System.out.println("ten sinh vien " + this.name);
        System.out.println("ma so sinh vien " + this.id);
        System.out.println("lop hoc " + this.group);
        System.out.println("email sinh vien " + this.emai);
    }
    
    public  Student() // khoi tao khong tham so
    {
        this.name = "Student";
        this.id = "000";
        this.group = "K59Cb";
        this.emai ="uet@vnu.edu.vn";
    }
    public Student(String n, String sid, String em)// khoi tao co tham so
    {
        this.name = n;
        this.id = sid;
        this.emai = em;
        this.group = "K59CB";
    }
     public  Student(Student s)
     {
         this.name = s.name;
         this.emai = s.emai;
         this.group = s.group;
         this.id = s.id;
     }
}
