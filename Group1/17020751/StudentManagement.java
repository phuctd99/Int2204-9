/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author CCNE
 */
public class StudentManagement {
    /*public Student[] students = new Student[100];
    private int size = 0;
    public void  add(Student s)
    {
        if(size == 100 )
            return ;
        students[size] = s;
        size++;
    }*/
    public  List<Student> dssv = new ArrayList<>(); // tao danh sach sinh vien
    ArrayList<String> dsl= new ArrayList<String>(); // tao danh sach lp hoc


    public void studentByGroup()
    {
        for (int i = 0; i < dssv.size(); i++) {
            if (dsl.indexOf(dssv.get(i).getGroup()) == -1)
                dsl.add(dssv.get(i).getGroup());
        }
        System.out.printf("\t\t\t Danh sách theo lớp \n");
        for (int i = 0; i < dsl.size(); i++) {
            System.out.printf("\t\t\n",dsl.get(i));
            for (int j = 0; j< dssv.size(); j++) {
                if (dssv.get(j).getGroup().equals(dsl.get(i)) == true)
                    dssv.get(j).getInfo();
            }
        }
    }

    public void removeStudent(String id) {
        if (dssv.isEmpty())
            return;
        for (int i = 0; i < dssv.size(); i++) {
            if (dssv.get(i).getId().equals(id) == true) {
                dssv.remove(i);
                return;
            }
        }
    }


    public static boolean sameGroup (Student s1, Student s2)// kiem tra cung lop
    {
        if(s1.getGroup() == s2.getGroup())  return true;
        else return false;
    }
    
    public static void main( String[] arg)
    {
        StudentManagement stm = new StudentManagement();

        Student sv = new Student();// khoi tao thong tin 1 sinh vien 
        sv.setName("tranhieu");
        sv.setId("17020751");
        sv.setGroup("CL");
        sv.setEmai("@");
        
        System.out.println(sv.getName());// in ten sinh vien
        
        sv.getInfo();// in toan bo thong tin sinh vien
        
        Student svA = new Student();
        svA.getInfo();
        
        Student svB = new Student("hieu","1d23","vnu@");
        svB.getInfo();
        
        Student svC = new Student(sv);// sao chep doi tuong svC == sv
        svC.getInfo();
        
        Student sv1 = new Student();
        sv.setGroup("K59CLC");
        Student sv2 = new Student();
        sv.setGroup("K59CLC");
        Student sv3 = new Student ();
        sv.setGroup("K59CB");

        System.out.println(sameGroup(sv1,sv2));


        stm.dssv.add(sv1);
        stm.dssv.add(sv2);
        stm.dssv.add(sv3);
        stm.dssv.add(svA);
        stm.dssv.add(svB);

        stm.studentByGroup();
        stm.removeStudent("17020751");
    }
}
