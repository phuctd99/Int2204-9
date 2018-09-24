package abc.java;


public class StudentManagement {

    public Student[] students = new Student[100];
    private  int size = 0;

    static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    public boolean arryStudent(Student s) {
        if (size == 100) {
            return false;
        }
        students[size] = s;
        size++;
        return true;
    }
    public void studentsByGroup() {
        int count = 0;
        String [] a = new String[size];
        for (int i = 0 ; i < size ; i++) {
            int j =0;
            for (;j < count ; j++) {
                if (students[i].getGroup().equals(a[j])) {
                    break;
                }
            }
            if (j==count){
                a[count] = students[i].getGroup();
                count++;
            }
        }
        for ( int i = 0 ; i < count ; i++) {
            System.out.println(a[i]);
            for ( int j = 0 ; j < size ; j++){
                if (students[j].getGroup().equals(a[i])) {
                     System.out.println(students[j].getInfo());
                }
            }
        }
    }

    public boolean removeStudent( String id) {
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (students[i].getId().equals(id)) {
                break;
            }
            index++;
        }
        if (index == size) {
            return false;
        }
        for (int j = index; j < size - 1; j++) {
            students[j] = students[j + 1];
        }
        size--;
        return true;
    }

    public static void main(String[] args) {
        Student sv1 = new Student();
        sv1.setGroup("INT22041");
        
        Student sv2 = new Student("sinhvien", "007", "uet@gmail.com");
        sv2.setGroup("INT22042");
        
        Student sv3 = new Student(sv1);
        sv3.setId("001");
    
        StudentManagement st = new StudentManagement();
        
        st.arryStudent(sv1);
        st.arryStudent(sv2);
        st.arryStudent(sv3);
    
        System.out.println(st.removeStudent( "001"));
        st.studentsByGroup();
     

    }
}
