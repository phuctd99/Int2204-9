package test;

import java.util.*;

public class StudentManagement
{
    public Student[] st = new Student[100];

    public boolean sameGroup(Student s1, Student s2)
    {
        return s1.getGroup().equals(s2.getGroup());
    }

    public void removeStudent(String id)
    {
        for (int i = 0; i < 100; i++)
        {
            if (st[i] == null)
                continue;
            if (st[i].getId().equals(id))
                st[i] = null;
        }
    }

    public void studentsByGroup()
    {
        List<String> group = new ArrayList();
        for (int i = 0; i < 100; i++)
        {
            if (st[i] == null)
                continue;
            if (!group.contains(st[i].getGroup()))
            {
                group.add(st[i].getGroup());
            }
        }
        for (int i = 0; i < group.size(); i++)
        {
            System.out.println("Group: " + group.get(i));
            for (int s = 0; s < 100; s++)
            {
                if (st[s] == null)
                    continue;
                if (st[s].getGroup().equals(group.get(i)))
                   System.out.println(st[s].getInfo());
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
    	Scanner cin = new Scanner(System.in);
    	StudentManagement SM = new StudentManagement();
    	for (int i = 0 ; i < 3 ; i++) {
    		SM.st[i] = new Student();
    	}
    	for (int i = 0 ; i < 3 ; i++) {
    		System.out.print("Student Name " + (i+1) + ": ");
    		SM.st[i].setName(cin.nextLine());
    		System.out.print("Student Id " + (i+1) + ": ");
    		SM.st[i].setId(cin.nextLine());
    		System.out.print("Student Group " + (i+1) + ": ");
    		SM.st[i].setGroup(cin.nextLine());
    		System.out.print("Student Email " + (i+1) + ": ");
    		SM.st[i].setEmail(cin.nextLine());
    	}
    	SM.studentsByGroup();
//        Student s1 = new Student();
//        Student s2 = new Student("Name", "Id", "Email");
//        Student s3 = new Student(s2);
//
//        s1.getInfo();
//        s2.getInfo();
//        s3.getInfo();
    }
}