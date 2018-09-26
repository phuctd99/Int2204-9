

public class Student {

    private String name ;
    private String id ;
    private String group ;
    private String email ;
    // cac phuong thuc get , set
    public void setName( String name ) { this.name = name; }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }


    //
    // phuong thuc khoi tao


    public Student() // khoi toa khong tham so
    {
        this.name = "Student";
        this.group = "INT_2204_1";
        this.id = "000";
        this.email = "uet@vnu.edu.vn";
    }

    public Student(String name, String id,  String email) // khoi tao 3 tham so
    {
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = "INT_2004_1";
    }

    public Student(String name, String id,  String email, String group) // khoi tao 3 tham so
    {
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = group ;
    }

    public Student(Student s) {
        this.name = s.getName();
        this.id = s.getId();
        this.group = s.getGroup();
        this.email = s.getEmail();
    }

    // viet ham in ra thong tin;
    public String getInfo() {
        String s = "Name  : " + this.name +
                "\nMSSV  : " + this.id +
                "\nGroup : " + this.group +
                "\nemail : " + this.email;
        return s;
    }
    // viet ham kiem tra cung lop

    public boolean sameGroup(Student s1) {
        if( s1.getGroup() == this.group ) return true;
        else return false;
    }
    // ham sap xep sinh vien cung lop
    public static void studentsByGroup(Student[] arr) {
        int studentsSize = arr.length;
        for ( int i=0; i < studentsSize - 1; i++) {
            for(int j = i+1; j < studentsSize; j++) {
                if( ( arr[i].getGroup().compareToIgnoreCase(arr[j].getGroup() ) ) > 0  && arr[j] != null ) {
                    Student s = arr[i];
                    arr[i] = arr[j];
                    arr[j] = s;
                }
            }
        }
    }
    // ham xoa sinh vien
    public static void removeStudent(Student[] arr, String id) {
        for(int i=0; i<arr.length; i++) {
            if( arr[i].getId() == id  ) {
                arr[i] = new Student() ;

            }
        }

    }







}
