
import java.util.ArrayList;

import java.util.Scanner;

public class StudentManagement
{
    //thuộc tính chứa các đối tượng thuộc lớp Student

         Student[] b = new Student[100];
       ArrayList<Student> students = new ArrayList<Student>();

    //phương thức kiểm tra 2 sinh viên có cùng lớp hay không
    public boolean sameGroup(Student s1,Student s2)
    {
        if(s1.getGroup().equals(s2.getGroup()))
        return true;
        else return false;
    }

    /*phương thức  để xóa sinh viên với mã số là id ra khỏi danh sách*/
    public boolean removeStudent(String id)
    {
        int value = students.size();
        for(int i=0; i<value; i++)
        {
            if(students.get(i).getId().equals(id))
            {
                students.remove(students.get(i));
                break;
            }
        }
        return true;
    }

    public void studentsByGroup() {
        String str = students.get(0).getGroup();
        ArrayList<Student> danhsach = new ArrayList<Student>();

        danhsach.add(students.get(0));
        for(int i=0; i<students.size(); i++)
        {
            if(!students.get(i).getGroup().equals(str))
            {
                danhsach.add(students.get(i));
            }
        }

        for(int i=0; i<danhsach.size(); i++)
        {
            System.out.println("Sinh vien thuoc Group " + danhsach.get(i).getGroup());

            for(int j=0; j<students.size(); j++)
            {
                if(students.get(j).getGroup().equals(danhsach.get(i).getGroup()))
                    System.out.println(students.get(j).getInfo());
            }
        }
    }


    public static void main(String[] args)
    {
        StudentManagement stm = new StudentManagement();
        Scanner scanner = new Scanner(System.in);
        // tạo đối tượng của lớp student
        Student st = new Student();

        //Nhập và in ra thông tin của sinh viên
        System.out.println("Nhap vao thong tin mot sinh vien: ");
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        st.setName(name);


        System.out.print("Enter ID: ");
        String id = scanner.nextLine();
        st.setId(id);

        System.out.print("Enter group: ");
        String group = scanner.nextLine();
        st.setGroup(group);

        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        st.setEmail(email);

        System.out.println();

        System.out.println("In ra thong tin mot sinh vien: ");
        System.out.println(st.getInfo());

        System.out.println();


        //3 phương thức khởi tạo Student
        System.out.println("In ra 3 phuong thuc khoi tao:");
        Student s = new Student();
        System.out.println(s.getInfo());

        Student st1 = new Student("quang", "17020978", "quang@99.com");
        System.out.println(st1.getInfo());

        Student st2= new Student(s);
        System.out.println(st2.getInfo());

        System.out.println();


      //kiểm tra 2 sinh viên có cùng lớp không
        System.out.println("Kiem tra 2 sinh vien co cung lop khong:");
        System.out.println(stm.sameGroup(st1, st2));

        //tạo 3 sinh viên và kiểm tra phương thức sameGroup()
        System.out.println();

        System.out.println("Kiem tra 2 sinh vien trong 3 sinh vien co cung lop khong: ");
        Student sv1 = new Student();
        sv1.setGroup("K59CLC");

        Student sv2 = new Student();
        sv2.setGroup("K59CLC");

        Student sv3 = new Student();
        sv3.setGroup("K59CB");

        System.out.println(stm.sameGroup(sv1, sv2));
        System.out.println(stm.sameGroup(sv1, sv3));
        System.out.println();


        //nhập vào danh sach sinh viên
        System.out.println("Nhap vao danh sach thong tin 3 sinh vien: ");
        for(int i=0; i<3; i++)
        {
            int x = i+1;
            stm.b[i] = new Student();
            System.out.println("Nhap sinh vien thu " + x);

            System.out.print("Enter Name: ");
            String na = scanner.nextLine();
            stm.b[i].setName(na);

            System.out.print("Enter ID: ");
            String idi = scanner.nextLine();
            stm.b[i].setId(idi);

            System.out.print("Enter group: ");
            String gro = scanner.nextLine();
            stm.b[i].setGroup(gro);

            System.out.print("Enter email: ");
            String ema = scanner.nextLine();
            stm.b[i].setEmail(ema);

            stm.students.add(stm.b[i]);
          }
        //in ra sinh viên
        System.out.println("In ra danh sach 3 sinh vien luc dau");
        for(int i=0; i<3; i++)
        {
            System.out.println(stm.b[i].getInfo());
        }


        System.out.println("In ra sinh vien theo tung group ");
        stm.studentsByGroup();


            // xóa sinh viên
       System.out.print("Nhap id sinh vien muon xoa: ");
        String str = scanner.nextLine();
            stm.removeStudent(str);

        System.out.println("In ra sinh vien sau khi xoa voi ma so id ");
        for(Student std : stm.students)
        {
            System.out.println(std.getInfo());
        }

    }
}

class Student
{
    //thuộc tính của lớp Student
    private String name;
    private String id;
    private String group;
    private String email;


    public Student(){name = "student"; id="000"; group ="k59CB"; email ="uet@vnu.edu.vn";}

    public Student(String n, String sid, String em)
    {
        this.name = n;
        this.id = sid;
        this.email = em;
        this.group = "k59CB";
    }
    public Student(Student s)
    {
        this.id = s.id;
        this.name = s.name;
        this.group = s.group;
        this.email = s.email;
    }


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getId()
    {
        return id;
    }
    public void setId(String id)
    {
        this.id = id;
    }

    public String getGroup()
    {
        return group;
    }
    public void setGroup(String group)
    {
        this.group = group;
    }

    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }

    //phương thức “String getInfo()” in ra màn hình tên, mã số SV, lớp, và email của sinh viên.
    public String getInfo()
    {

        return this.name +" "+ this.id+" " + this.group+" " + this.email;
    }
}