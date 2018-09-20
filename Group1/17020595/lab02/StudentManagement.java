

package studentmanagement;
import java.util.*;

public class StudentManagement {
    public static Scanner sc = new Scanner(System.in);
    public static int size = 3;
    public static Student [] arr = new Student[size];
    public static void main(String[] args) {
         Student student = new Student();
         
         student.setName("Vu Trung Anh");
         student.setId("12124123");
         student.setEmail("vutrunganh@gmail.com");
         student.setGroup("INT22041");
         Student s2 = new Student();
         Student s3 = new Student("Ha","123","ok@mail.com");
        //Student s4 = new Student( Student s2);
         student.getInfo();
         s2.getInfo();
         s3.getInfo();
//         s4.getInfo();
        System.out.println("Ket qua hs 1 va 3 cung lop nhau khong: " + sameGroup( student , s3 ));
        System.out.println("Ket qua hs 1 va 2 cung lop nhau khong: " + sameGroup( student , s2 ));
        input(arr);
        StudentByGroup(); 
        String num = sc.nextLine();
        removeStudent(num);
    }    

    public static void StudentByGroup(){
        for (int i = 0; i < size; i++){
            for (int j = i; j < size; j++){
                if (sameGroup(arr[i],arr[j])){
                    arr[i].getInfo();
                }
            }
        }
    }
    public static void removeStudent(String id){
        int k = 0;
        for (int i = 0; i < size; i++){
            if (arr[i].id == id) {
                k = i;
            }
        }
        for (int i = k ; i < size - 1; i++){
                arr[i] = arr[i+1];
        }    
        size--;
        for (int i = 0; i < size ; i++){
            arr[i].getInfo();
        }
    }
    public static void input(Student[] arr){
        for (int i = 0; i < size ; i++){    
            System.out.print("Nhap vao ten sv thu " + i + ": ");
            String name = sc.nextLine();
            
            System.out.print("Nhap vao ID sv thu " + i + ": ");
            String id = sc.nextLine();
            
            System.out.print("Nhap vao mail sv thu " + i + ": ");
            String email = sc.nextLine();
            
            System.out.print("Nhap vao Group sv thu " + i + ": ");
            String group = sc.nextLine();
            arr[i] = new Student( name, id, email, group);
        }
    }
    public static boolean sameGroup(Student s1, Student s2){
        if (s1.group == s2.group){
            return true;
        }
        else return false;
    }
}
class Student{
    String name, id, email, group;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
    void getInfo(){
        System.out.print("Name    : " + name + " ");
        System.out.print("ID      : " + id + " ");
        System.out.print("Email   : " + email + " ");
        System.out.println("Group   : " + group);
    }
    Student (){
        name = "Student";
        id = "000";
        group = "INT22041";
        email = "uet@mail.com";
    }
    Student(String n,String sid, String em){
        name = n;
        id = sid;
        email = em;
        group = "INT22042";
    }
    Student (Student s){
        name = s.name;
        id  = s.id;
        email = s.email;
        group = s.group;
    }
    Student(String name, String id, String email, String group){
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = group;
    }
}
