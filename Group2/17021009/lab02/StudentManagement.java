import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class StudentManagement {
    private List<Student> st = new ArrayList<Student>();
    public boolean sameGroup( Student st1, Student st2)
    {
        if( st1.getGroup() == st2.getGroup() )
            return true;
        return false;
    }

    //Phuong thuc StudentByGroup
    public  void StudentByGroup( )
    {
        int sizeOfSt = st.size();
        int countNumGroup = 0;
        String[] groupName = new String[sizeOfSt];
        groupName[countNumGroup] = st.get(0).getGroup();
        for( int i=1; i<sizeOfSt; i++)
        {
            for( int j=0; j<i; j++)
            {
                if( st.get(i).getGroup() == st.get(j).getGroup())
                    break;
                else if( j==i-1)
                {
                    countNumGroup += 1;
                    groupName[countNumGroup] = st.get(i).getGroup();
                }
            }
        }
        for( int i=0; i<=countNumGroup; i++)
        {
            System.out.println( "Danh sach sinh vien lop " + groupName[i]);
            for( int j=0; j<sizeOfSt; j++)
            {
                if( st.get(j).getGroup() == groupName[i])
                {
                    st.get(j).getInfo();
                }
            }
        }
    }

    //Phuong thuc removeStudent()
    public void removeStudent( String id )
    {
        int sizeOfSt = st.size();
        for( int i=0; i<sizeOfSt; i++)
        {
            if( id == st.get(i).getId() )
            {
                st.remove(i);
                break;
            }
        }
    }

    public static void main( String[] args)
    {
        StudentManagement StuMan = new StudentManagement();
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
        System.out.println();


        StuMan.st.add( st1);
        StuMan.st.add( st2);
        StuMan.st.add( st3);
        StuMan.st.add( st4);
        for( int i=0; i<4; i++)
        {
            System.out.println("Sinh vien " + (i+1) );
            StuMan.st.get(i).getInfo();
            System.out.println();
        }



        StuMan.StudentByGroup( );
        System.out.println();
        StuMan.removeStudent( "17021009");

    }
}
