import java.util.Scanner;

public class Studentmanagement {
    public Student[] st = new Student[100];
	
	//Phuong thuc sameGroup
    public boolean sameGroup( Student st1, Student st2) {
        if( st1.getGroup() == st2.getGroup() )
            return true;
        return false;
    }

    //Phuong thuc StudentByGroup
    public  void StudentByGroup( Student st[]) {
        int sizeSt = st.length;
        int numGroup = 0;
        String[] groupName = new String[100];
        groupName[numGroup] = st[0].getGroup();
        for( int i = 1; i < sizeSt; i++) {
            for( int j = 0; j < i; j++) {
                if( st[i].getGroup() == st[j].getGroup())
                    break;
                else {
                    numGroup += 1;
                    groupName[numGroup] = st[i].getGroup();
                }
            }
        }
        for( int i = 0; i <= numGroup; i++) {
            System.out.println( "Danh sach sinh vien lop " + groupName[i]);
            for( int j = 0; j < sizeSt; j++) {
                if( st[j].getGroup() == groupName[i]) {
                    st[j].getInfo();
                }
            }
        }
    }

    //Phuong thuc removeStudent()
    public void removeStudent( String id, Student st[] ) {
        int sizeArr = st.length;
        for( int i = 0; i < sizeArr; i++) {
            if( id == st[i].getId() ) {
                for( int j = i; j < sizeArr - 1; j++) {
                    st[j] = st[j+1];
                }
                break;
            }
        }
    }

    public static void main( String[] args) {
        Studentmanagement StuMan = new Studentmanagement();
        //Tao ra mot student
        Student st1 = new Student();

        //Thiet lap cac thong tin cua Student
        st1.setName("Dang Van Nguyen");
        st1.setId("17020939");
        st1.setGroup("QH2017-CQ-CL");
        st1.setEmail("vnd99xxx@gmail.com");

        //in ra man hinh thong tin cua student
        System.out.println( st1.getName() );
        st1.getInfo();

        //Kiem tra thuoc tinh student
        System.out.println("\nKiem tra thuoc tinh Student()");
        Student st2 = new Student();
        st2.getInfo();

        //Kiem tra thuoc tinh Student( String, String , String)
        System.out.println("\nKiem tra thuoc tinh Student( String, String, String)");
        Student st3 = new Student( "Tran Thi Thao Nguyen", "17020938", "tttn03081999");
        st3.getInfo();

        //Kiem tra thuoc tinh Student( Student)
        System.out.println("\nKiem tra thuoc tinh Student( Student)");
        Student st4 = new Student( st1);
        st4.getInfo();

        //Kiem tra phuong thuc sameGroup()
        System.out.println("\nKiem tra thuoc tinh sameGroup()");
        System.out.println( StuMan.sameGroup( st2, st3));
        System.out.println( StuMan.sameGroup( st4, st3));

    }
}
