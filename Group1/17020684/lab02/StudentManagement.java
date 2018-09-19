import java.util.ArrayList;

import java.util.Scanner;

public class StudentManagement
{
	Student[] b = new Student[100];
	ArrayList<Student> students = new ArrayList<Student>();

    public boolean sameGroup(Student s1,Student s2)
    {
        if(s1.getGroup().equals(s2.getGroup()))
        return true;
        else return false;
    }
    public boolean removeStudent(String id)
    {
        int sz = students.size();
        for(int i=0; i<sz; i++)
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
        ArrayList<Student> array = new ArrayList<Student>();

        array.add(students.get(0));
        for(int i=0; i<students.size(); i++)
        {
            if(!students.get(i).getGroup().equals(str))
            {
                array.add(students.get(i));
            }
        }

        for(int i=0; i<array.size(); i++)
        {
            System.out.println("Sv thuoc Group " + array.get(i).getGroup());

            for(int j=0; j<students.size(); j++)
            {
                if(students.get(j).getGroup().equals(array.get(i).getGroup()))
                    System.out.println(students.get(j).getInfo());
            }
        }
    }


    public static void main(String[] args)
    {
        StudentManagement sM = new StudentManagement();
        Scanner scanner = new Scanner(System.in);
        Student st = new Student();

        System.out.println("Moi nhap thong tin mot sv: ");
        System.out.print(" Name: ");
        String name = scanner.nextLine();
        st.setName(name);


        System.out.print("ID: ");
        String id = scanner.nextLine();
        st.setId(id);

        System.out.print("group: ");
        String group = scanner.nextLine();
        st.setGroup(group);

        System.out.print("email: ");
        String email = scanner.nextLine();
        st.setEmail(email);

        System.out.println();

        System.out.println("In thong tin mot sv: ");
        System.out.println(st.getInfo());

        System.out.println();

        System.out.println("In ra 3 phuong thuc khoi tao:");
        Student s = new Student();
        System.out.println(s.getInfo());

        Student st1 = new Student("hoangdinh", "17020684", "dinh@99.com");
        System.out.println(st1.getInfo());

        Student st2= new Student(s);
        System.out.println(st2.getInfo());

        System.out.println();

        System.out.println("Kiem tra xem 2 sv co cung lop khong? ");
        System.out.println(sM.sameGroup(st1, st2));


        System.out.println("Kiem tra 2 sv trong 3 sv co cung lop khong: ");
        Student sv1 = new Student();
        sv1.setGroup("K59CLC");

        Student sv2 = new Student();
        sv2.setGroup("K59CLC");

        Student sv3 = new Student();
        sv3.setGroup("K59CB");

        System.out.println(sM.sameGroup(sv1, sv2));
        System.out.println(sM.sameGroup(sv1, sv3));

        System.out.println("Nhap vao danh sach thong tin 3 sv: ");
        for(int i=0; i<3; i++)
        {
            int x = i+1;
            sM.b[i] = new Student();
            System.out.println("Nhap sv thu " + x);

            System.out.print("Name: ");
            String na = scanner.nextLine();
            sM.b[i].setName(na);

            System.out.print("ID: ");
            String idi = scanner.nextLine();
            sM.b[i].setId(idi);

            System.out.print("group: ");
            String gro = scanner.nextLine();
            sM.b[i].setGroup(gro);

            System.out.print("email: ");
            String ema = scanner.nextLine();
            sM.b[i].setEmail(ema);

            sM.students.add(sM.b[i]);
          }
        System.out.println("In ra danh sach 3 sv luc dau");
        for(int i=0; i<3; i++)
        {
            System.out.println(sM.b[i].getInfo());
        }

        System.out.println("In ra sv theo tung group ");
        sM.studentsByGroup();

       System.out.print("Nhap id sv ma ban muon xoa: ");
        String str = scanner.nextLine();
            sM.removeStudent(str);
            
        System.out.println("In ra sv sau khi xoa voi ma so id ");
        for(Student std : sM.students)
        {
            System.out.println(std.getInfo());
        }
    }
}

class Student
{
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

    public String getInfo()
    {
        return this.name +" "+ this.id+" " + this.group+" " + this.email;
    }
}