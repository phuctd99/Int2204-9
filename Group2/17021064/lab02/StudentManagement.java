public class StudentManagement {
        //9
        public boolean sameGroup (Student s1, Student s2){
            return s1.getGroup().equals(s2.getGroup());
        }
        //11
        public Student[] students = new Student[100];
        private int size = 0;
        public void arryStudent(Student s) {
            if (size == 100) {
                return ;
            }
            students[size] = s;
            size++;
        }


        public void studentsByGroup() {
            for (int i = 0; i < size; i++){
                for (int j = i+1 ; j < size; j++){
                    if (students[i].getGroup().equals(students[j].getGroup())){
                        Student temp ;
                        temp = students[i+1];
                        students[i+1] = students[j];
                        students[j] = temp;
                    }
                }
            }
            for (int i = 0; i < size; i++){
                System.out.println(students[i].getInfo());
            }
        }

        public void removeStudent( String id) {
            int index = 0;
            for (int i = 0; i < size; i++) {
                if (students[i].getId().equals(id)) {
                    break;
                }
                index++;
            }
            for (int i = index; i < size - 1; i++) {
                students[i] = students[i + 1];
            }
            size--;
        }
        public static void main (String[] args) {
            //6
            Student studentTest = new Student();
            studentTest.setName("Pham Duy Tiep");
            studentTest.setId("17021064");
            studentTest.setGroup("K62-CQ-CL");
            studentTest.setEmail("Phamdtiep29@gmail.com");
            System.out.println(studentTest.getName());
            System.out.println(studentTest.getInfo());
            //8
            //test phuog thuc 7a
            Student sv1 = new Student();
            System.out.println(sv1.getInfo());
            //test phuong thuc 7b
            Student sv2 = new Student(studentTest.getName(), studentTest.getId(), studentTest.getEmail());
            System.out.println(sv2.getInfo());
            //test phuong thuc 7c
            Student sv3 = new Student(studentTest);
            System.out.println(sv3.getInfo());

            StudentManagement sv = new StudentManagement();
            //10 Test phuong thuc sameGroup
            Student sameGr1 = new Student();
            Student sameGr2 = new Student();
            Student sameGr3 = new Student();
            sameGr3.setGroup("INT22042");
            if (sv.sameGroup(sameGr1, sameGr2)){
                System.out.println("same");
            } else {
                System.out.println("not same");
            }
            //Test 12,13
            Student s1 = new Student("A", "000", "mail0");
            s1.setGroup("INT22041");
            Student s2 = new Student("B", "001", "mail1");
            s2.setGroup("INT22041");
            Student s3 = new Student("C", "002", "mail2");
            s3.setGroup("INT22042");
            Student s4 = new Student("D", "003", "mail3");
            s4.setGroup("INT22041");

            sv.arryStudent(s1);
            sv.arryStudent(s2);
            sv.arryStudent(s3);
            sv.arryStudent(s4);
            sv.removeStudent("003");
            sv.studentsByGroup();
        }
}
