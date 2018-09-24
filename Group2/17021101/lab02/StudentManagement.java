package com.company;
import java.util.*;
public class StudentManagement {
    int n = 100;
    public Student[] students = new Student[n];

    public static boolean sameGroup(Student s1, Student s2)
    {
        if (s1.getGroup().equals(s2.getGroup())) return true;
        else return false;
    }

    public void studentsByGroup()
    {
        List<String> g = new ArrayList();
        for (int i = 0; i < n; i++)
        {
            if (students[i] == null);
            else if (g.contains(students[i].getGroup())==false)
            {
                g.add(students[i].getGroup());
            }
        }
        for (int i = 0; i < g.size(); i++)
        {
            System.out.println("Group: "+ g.get(i));
            for (int s = 0; s <n; s++)
            {
                if (students[s]!=null && students[s].getGroup().equals(g.get(i))) System.out.println(students[s].getInfo());
            }
            System.out.println();
        }
    }

    public  void removeStudent(String id)
    {
        for (int i = 0; i < n; i++)
        {
            if (students[i] == null);
            else if (students[i].getId().equals(id)) students[i] = null;
        }
        for (int i = 0; i < n; i++)
        {
            if (students[i] == null)
            {
                for(int j=i;j<n-1;j++)
                {

                    students[j]=students[j+1];
                    students[j+1]=null;
                }
            }
        }
    }

    public static void main(String[] args)
    {

        Student a = new Student();
        Student b = new Student("tuan","17021101","17021101@uet.vnu");
        System.out.println(b.getName());
        System.out.println(b.getInfo());
        Student c=new Student(b);
        System.out.println(a.getInfo());
        System.out.println(b.getInfo());
        System.out.println(c.getInfo());
        a.setGroup("K59CLC");
        b.setGroup("K59CLC");
        c.setGroup("K59CB");
        System.out.println(sameGroup(a,b));
        System.out.println(sameGroup(a,c));
        StudentManagement lop = new StudentManagement();
        lop.students[0]=a;
        lop.students[1]=b;
        lop.students[2]=c;
        lop.studentsByGroup();
        System.out.println("danh sach sau khi xoa : ");
        lop.removeStudent("17021101");
        for(int i = 0; i < lop.students.length; i++){
            System.out.println(lop.students[i].getInfo());
        }
    }
}
