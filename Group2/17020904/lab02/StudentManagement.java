public class StudentManagement {
    public Student[] st = new Student[100];
    public int size = 0;
    // Kiem tra cung Gr
    public boolean sameGroup(Student a, Student b){
        if (a.getGroup() == b.getGroup()) return true;
            else return false;
    }
    public  boolean addSv(Student s)
    {
        if(size ==100){
            return false;
        }
        st[size] =s;
        size++;
        return  true;
    }

    public void studentByGroup() {
        int [] a = new int[size];
        for (int i = 0; i < size ; i++){
            a[i] = 0;
        }
        for (int i = 0; i< size ; i++)
        {
            if (a[i] == 0){
                System.out.println();
                System.out.println(st[i].getGroup());
                System.out.println(st[i].getInfo());

                a[i] = 1;
            }
            for (int j = i + 1; j < size; j++)
            {
                if (a[j] == 0 && st[i].getGroup() == st[j].getGroup()){
                    System.out.println(st[j].getInfo());
                    a[j] = 1;
                }
            }
        }

    }
    public  void printStudent (){
        System.out.println();
        System.out.println("In danh sach chua xoa");

        for (int i = 0; i < size; i++)
        {
            System.out.println(st[i].getInfo());
        }
    }
    public void removeStudent(String id){
        int a = 0;
        for (int i = 0; i < size; i++){
            if (st[i].getId() == id) a = i;
        }
        for (int i = a; i < size; i++)
        {
            st[i] = st[i+ 1];
        }
        System.out.println();
        System.out.println("In danh sach da xoa");

        for (int i = 0; i < size - 1; i++)
        {
            System.out.println(st[i].getInfo());
        }
    }


    public static void main(String[] args) {
        StudentManagement st = new StudentManagement();

        Student sv = new Student();
        // Tao thong tin sinh vien & in
        sv.setName("Nam");
        sv.setId("17020904");
        sv.setGroup("asdasdqsadasd");
        sv.setEmail("asdqszcsdzc@gmail.com");

        System.out.println(sv.getName());
        System.out.println(sv.getInfo());
        // Tao sinh vien khong tham so, co gr, sao chep sv

        Student sv1 = new Student();
        sv1.Student();
        System.out.println(sv1.getInfo());

        Student sv2 = new Student();
        sv2.Student("IOLJL","21346531","123213@gmail.com");
        System.out.println(sv2.getInfo());

        Student sv3 = new Student();
        sv3.Student(sv);
        System.out.println(sv3.getInfo());

        // Tao 3 sv

        Student sv001 = new Student();
        sv001.setName("sadasd");
        sv001.setId("17020123904");
        sv001.setGroup("K59CLC");
        sv001.setEmail("232623@gmail.com");

        Student sv002 = new Student();
        sv002.setName("8233215");
        sv002.setId("121315");
        sv002.setGroup("K59CLC");
        sv002.setEmail("sadadhqixzc@gmail.com");

        Student sv003 = new Student();
        sv003.setName("asdqwqesad");
        sv003.setId("1231213213213");
        sv003.setGroup("K59CB");
        sv003.setEmail("asdasdasdq1wasdas@gmail.com");

        // Ktra cung Gr
        System.out.println();
        System.out.println("Kiem tra cung gr");
        System.out.println(st.sameGroup( sv001, sv001));
        System.out.println(st.sameGroup( sv002, sv003));
        System.out.println();

        // Them sv vao mang
        st.addSv(sv001);
        st.addSv(sv002);
        st.addSv(sv003);
        st.addSv(sv);
        st.addSv(sv1);

        // kiem tra in cung lop
        System.out.println("Kiem tra in cung lop");
        st.studentByGroup();
        // kiem tra danh sach da xoa
        st.printStudent();
        st.removeStudent("17020904");
    }
}
