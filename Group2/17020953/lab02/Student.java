/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice2;

/**
 *
 * @author Admin
 */
public class Student {

    String name;
    private String id , group , email;
    public String getName()
    {
       return name ;
    }
    public void setName(String n)
    {
        this.name = n;
    }
     public String getId()
    {
       return id ;
    }
    public void setId(String i)
    {
        this.id = i;
    }
     public String getGroup()
    {
       return group ;
    }
    public void setGroup(String g)
    {
        this.group = g;
    }
     public String getEmail()
    {
       return email ;
    }
    public void setEmail(String e)
    {
        this.email = e;
    }
    public void getInfo(){
        
        System.out.println(this.name );
        System.out.println(this.id);
        System.out.println(this.group);
        System.out.println(this.email);
    }
    public Student()
    {
        this.name="Student" ;
        this.id = "000";
        this.group = "INT22041";
        this.email = "uet@vnu.com";
    }
    public Student(String n , String sid , String em)
    {
        this.name = n;
        this.id = sid ;
        this.email = em ;
        this.group = "INT22041" ;
    }
    public Student(Student s)
    {
        this.name = s.name ;
        this.id = s.id ;
        this.group = s.group ;
        this.email = s.email ;
    }
}

   