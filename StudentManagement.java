package week2;

import java.util.Scanner;
import java.util.ArrayList;

public class StudentManagement {

    static int n;
    static Scanner sc = new Scanner(System.in);
    static ArrayList <Student> list = new ArrayList<>();
    public static void studentsByGroup (String group)

    {
        group = sc.next();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getGroup().equals(group)) {
                System.out.println(list.get(i).getName());
            }
        }
    }
    public static void removeStudent(String id)
    {
        id = sc.next();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) list.remove(i);
        }
    }
    public static void main(String[] args) {

        System.out.println("nhap n: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            Student st = new Student();
            System.out.println("nhap ten: ");
            st.setName(sc.next());
            System.out.println("nhap ID: ");
            st.setId(sc.next());
            System.out.println("nhap lop: ");
            st.setGroup(sc.next());
            System.out.println("nhap email: ");
            st.setEmail(sc.next());
            list.add(st);
        }
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i).getInfo());
        }
        String id;
        System.out.println("Nhập mã sinh viên muốn xóa ");
        id = sc.nextLine();
        removeStudent(id);
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i).getInfo());
        }

    }
}
