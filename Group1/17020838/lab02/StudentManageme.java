package studentmanageme;
import java.util.*;
import java.lang.*;
class Student{
    private String name, id, group, email;
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public String getId()
    {
        return id;
    }
    public void setId(String n){
        id = n;
    }
    public String getGroup(){
        return group;
    }
    public void setGroup(String n){
        group = n;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String n)
    {
        email = n;
    }
    public Student(){
        name = "Student";
        id = "000";
        group = "INT22041";
        email = "uet@vnu.edu.vn";
    }
    public Student(String n, String sid, String em)
    {
        name  = n;
        id = sid;
        email = em;
        group = "INT22041";
    }
    public Student(Student s)
    {
        name = s.name;
        id = s.id;
        group = s.group;
        email = s.email;
    }
    public void getInfo(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(group);
        System.out.println(email);
    }
}
public class StudentManageme {

    /**
     * @param args the command line arguments
     */
    Student[] students = new Student[100];
    public boolean sameGroup(Student s1, Student s2)
    {
        if (s1.getGroup() == s2.getGroup()) return true;
        else return false;
    }
    public void studentsByGroup(){
        int n = students.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (students[i].getGroup() == students[j].getGroup()){
                    students[i].getInfo();
                    students[j].getInfo();
                    students[i] = students[i+1];
                    n--;
                } 
                    
    }
    public int vitri(String id){
        int n = students.length;
        for (int i = 0; i < n; i++)
            if (students[i].getId() == id) return i;
        return -1;
    }
    public void removeStudent(String id){
        int n = students.length;
        int vt = vitri(id);
            if (vt >= 0) 
                for (int j = vt; j < n - 1; j++)
                {
                    students[j] = students[j+1];
                    n--;
                }
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Student khoa = new Student();
        khoa.setName("Do Luong Khoa");
        khoa.setId("17020838");
        khoa.setGroup("INT2204 9");
        khoa.setEmail("17020838@vnu.edu.vn");
       // System.out.println(khoa.name);
        khoa.getInfo();
        Student s4 = new Student();
        Student s5 = new Student("Giang", "1702334", "truonggiang@gmail.com");
        Student s6 = new Student(s5);
        Student s1 = new Student();
        s4.getInfo();
        s5.getInfo();
        s6.getInfo();
        s1.setGroup("INT22041");
        Student s2 = new Student();
        s2.setGroup("INT22041");
        Student s3 = new Student();
        s3.setGroup("INT22042");
        StudentManageme test = new StudentManageme();
        System.out.println("s1, s2 co cung lop khong:" + test.sameGroup(s1, s2));
        System.out.println("s1, s3 co cung lop khong:" + test.sameGroup(s1, s3));
     }
}
