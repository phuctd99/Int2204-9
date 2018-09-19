import java.util.Scanner;

public class Studentmanagement {
    public Student[] st = new Student[4];
    public boolean sameGroup( Student st1, Student st2)
    {
        if( st1.getGroup() == st2.getGroup() )
            return true;
        return false;
    }

    //Phuong thuc StudentByGroup
    public  void StudentByGroup( Student st[])
    {
        int sizeOfSt = st.length;
        int countNumGroup = 0;
        String[] groupName = new String[100];
        groupName[countNumGroup] = st[0].getGroup();
        for( int i=1; i<st.length; i++)
        {
            for( int j=0; j<i; j++)
            {
                if( st[i].getGroup() == st[j].getGroup())
                    break;
                else
                {
                    countNumGroup += 1;
                    groupName[countNumGroup] = st[i].getGroup();
                }
            }
        }
        for( int i=0; i<=countNumGroup; i++)
        {
            System.out.println( "Danh sach sinh vien lop " + groupName[i]);
            for( int j=0; j<sizeOfSt; j++)
            {
                if( st[j].getGroup() == groupName[i])
                {
                    st[j].getInfo();
                }
            }
        }
    }

    //Phuong thuc removeStudent()
    public void removeStudent( String id, Student st[] )
    {
        int sizeOfArr = st.length;
        for( int i=0; i<sizeOfArr; i++)
        {
            if( id == st[i].getId() )
            {
                for( int j=i; j<sizeOfArr-1; j++)
                {
                    st[j] = st[j+1];
                }
                break;
            }
        }
    }

    public static void main( String[] args)
    {
        Studentmanagement StuMan = new Studentmanagement();
        //Tao ra mot student
        Student st1 = new Student();

        //Thiet lap cac thong tin cua Student
        st1.setName("Nguyen Duy Tam");
        st1.setId("17021009");
        st1.setGroup("K62-C-Q CL");
        st1.setEmail("nguyenduytam01231999@gmail.com");

        //in ra man hinh thong tin cua student
        System.out.println( st1.getName() );
        st1.getInfo();

        //Test thuoc tinh student
        System.out.println("\nTest thuoc tinh Student()");
        Student st2 = new Student();
        st2.getInfo();

        //Test thuoc tinh Student( String, String , String)
        System.out.println("\nTest thuoc tinh Student( String, String, String)");
        Student st3 = new Student( "Nguyen Thi Thuong", "17021009", "ndt23011999");
        st3.getInfo();

        //Test thuoc tinh Student( Student)
        System.out.println("\nTest thuoc tinh Student( Student)");
        Student st4 = new Student( st1);
        st4.getInfo();

        //Kiem tra phuong thuc sameGroup()
        System.out.println("\nKiem tra thuoc tinh sameGroup()");
        System.out.println( StuMan.sameGroup( st2, st3));
        System.out.println( StuMan.sameGroup( st4, st3));

        //Tao ra mot Array thuoc lop Student
        System.out.println("Nhap vao so sinh vien ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for( int i=0; i<n; i++)
        {
            System.out.println("Nhap ten: ");
            StuMan.st[i].setName( scn.nextLine());
            System.out.println("Nhap id: ");
            StuMan.st[i].setId( scn.nextLine());
            System.out.println("Nhap group: ");
            StuMan.st[i].setGroup( scn.nextLine());
            System.out.println("Nhap email: ");
            StuMan.st[i].setEmail( scn.nextLine());
        }
        StuMan.StudentByGroup( StuMan.st);
        StuMan.removeStudent( "2323", StuMan.st);

    }
}
