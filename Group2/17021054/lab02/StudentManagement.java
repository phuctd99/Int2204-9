
import java.util.*;

public class StudentManagement {
    public Student[] students = new Student[100];
    int size =0;

    public boolean sameGroup(Student s1, Student s2)
    {
        if (s1.getGroup().equals(s2.getGroup()))
            return true;
        return false;
    }
    public  boolean arrStudent(Student s)
    {
        if(size ==100){
            return false;
        }
        students[size] =s;
        size++;
        return  true;
    }
    public void removeStudent(String id)
    {
        int index =0;
        for(int i=0;i<size;i++)
        {
            if(students[i].getId().equals(id)){
                break;
            }
            index++;
        }
        if(index == size){
            return;
        }
        for(int j=index;j<size-1;j++)
        {
            students[j]=students[j+1];
        }
        size--;
        for(int i=0;i<size;i++)
        {
            System.out.println(students[i].getInfo());
        }
    }
    public void studentsByGroup() {
        int count = 0;
        String [] a = new String[size];
        for (int i = 0 ; i < size ; i++) {
            int j =0;
            for (;j < count ; j++) {
                if (students[i].getGroup().equals(a[j])) {
                    break;
                }
            }
            if (j==count){
                a[count] = students[i].getGroup();
                count++;
            }
        }
        for ( int i = 0 ; i < count ; i++) {
            System.out.println(a[i]);
            for ( int j = 0 ; j < size ; j++){
                if (students[j].getGroup().equals(a[i])) {
                    System.out.println(students[j].getInfo());
                }
            }
        }
    }

    public  static void main(String[] args)
    {
        Student sv = new Student();
        sv.setName("NGUYEN THI THUY");
        sv.setGroup("INT22041");
        sv.setId("17021054");
        sv.setEmail("17021054@vnu.edu.vn");
        System.out.println(sv.getInfo());
        Student sv1 = new Student("DO AN DUONG", "17020399","17020399@vnu.edu.vn");
        sv1.setGroup("INT22041");
        StudentManagement sm = new StudentManagement();
        System.out.println(sm.sameGroup(sv,sv1));
        Student sv2 = new Student("BUI DANH TUAN","17021101","17021101@vnu.edu.vn");
        sv2.setGroup("INT22041 9");
        sm.arrStudent(sv);
        sm.arrStudent(sv1);
        sm.arrStudent(sv2);
        sm.studentsByGroup();
        sm.removeStudent("17020399");


    }
}
