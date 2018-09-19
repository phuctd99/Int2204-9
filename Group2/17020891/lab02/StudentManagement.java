//package com.company;

import java.util.ArrayList;



public class StudentManagement {
    public ArrayList<Student> students = new ArrayList<Student>();
    public boolean sameGroup(Student st1, Student st2) {
        return st1.getGroup().equals(st2.getGroup());
    }

    void studentsByGroup() {
        ArrayList<String> group = new ArrayList<String>();
        for (int i = 0; i < students.size(); i++) {
            if (!group.contains(students.get(i).getGroup())) {
                group.add(students.get(i).getGroup());
            }
        }
        for (int i = 0; i< group.size(); i++) {
            System.out.println("Lop " + group.get(i));
            for (int j = 0; j < students.size(); j++) {
                if (students.get(j).getGroup().equals(group.get(i))) {
                    System.out.println(students.get(j).getInfo());
                }
            }
        }
        System.out.println();
    }
     public void removeStudent(String id) {
        for (int i=0; i<students.size(); i++ ) {
            if (students.get(i).getId().equals(id)) {
                students.remove(i);
            }
        }

    }
    public static void main(String[] args) {
	// write your code here
        StudentManagement test = new StudentManagement();
        Student st1 = new Student("Minh", "001", "Red", "K59CC");
        System.out.println(st1.getInfo());
        System.out.println(st1.getName());
        Student st2 = new Student("Nam", "002", "Blue", "K59CB");
        Student st3 = new Student(st1);
        Student st4 = new Student();
        test.students.add(st1);
        test.students.add(st2);
        test.students.add(st3);
        test.students.add(st4);
        if (test.sameGroup(st1, st2)) {
            System.out.println("In same group");
        }
        else {
            System.out.println("In different group");
        }
        System.out.println(st3.getInfo());

        test.studentsByGroup();


    }
}
