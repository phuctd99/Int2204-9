package test;

import java.util.Scanner;
import java.util.ArrayList;

public class StudentManagement {

    static int n;
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Student> list=new ArrayList<>();
    public static void studentsByGroup (String group)//in danh sách theo lớp

    {
        group = scan.next();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getGroup().equals(group)) {
                System.out.println(list.get(i).getName());
            }
        }
    }

    String id;
    public static void removeStudent(String id) // xóa sinh viên có id cần xóa
    {
        id = scan.next();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) list.remove(i);
        }
    }
    
    public static void main(String[] args) {

        System.out.println("nhap n: ");
        n = scan.nextInt();

        for (int i = 0; i < n; i++)// nhập thông tin của list vừa tạo
        {
            Student student=new Student();
            System.out.println("Nhập tên: ");
           student.setName(scan.next());
            System.out.println("Nhập ID: ");
            student.setId(scan.next());
            System.out.println("Nhập lớp: ");
            student.setGroup(scan.next());
            System.out.println("Nhập email: ");
            student.setEmail(scan.next());
            list.add(student);
        }

        for (int i = 0; i < list.size(); i++)// in thông tin của list vừa tạo
        {
            System.out.println(list.get(i).getInfo());
        }

       
        System.out.println("Nhập ID sinh viên muốn xóa ");
        id =scan.nextLine();
        removeStudent(id);

        for (int i = 0; i < list.size(); i++)// in thông tin của list vừa xóa
        {
            System.out.println(list.get(i).getInfo());
        }

    }
}
