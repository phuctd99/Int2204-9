    import java.util.*;


    public class StudentManagement
    {
        public List<Student> students = new ArrayList();


        public boolean sameGroup(Student s1, Student s2) {
            return s1.getGroup().equals(s2.getGroup());
        }


        public void removeStudent(String id) {
            for (int i = 0; i < students.size(); i++)
            {
                if (students.get(i).getId().equals(id))
                {
                    students.remove(i);
                    i--;
                }
            }
        }


        public void studentsByGroup() {
            List<String> group = new ArrayList();
            for (int i = 0; i < students.size(); i++)
            {
                if (!group.contains(students.get(i).getGroup()))
                    group.add(students.get(i).getGroup());
            }
            for (int i = 0; i < group.size(); i++)
            {
                System.out.println("Group: " + group.get(i));
                for (int s = 0; s < students.size(); s++)
                {
                    if (students.get(s).getGroup().equals(group.get(i)))
                        System.out.println(students.get(s).getInfo());
                }
            }
        }


        public static void main(String[] args)
        {
            StudentManagement sm = new StudentManagement();
            Student s1 = new Student();
            s1.setName("Vu Ha Thanh");
            s1.setId("17021021");
            s1.setGroup("INT22049");
            s1.setEmail("17021021@vnu.edu.vn");
            System.out.println(s1.getInfo());

            Student s2 = new Student("Hoang Kim Minh", "17020891", "17020891@vnu.edu.vn");
            Student s3 = new Student(s2);
            System.out.printf("\n3 students info:\n%s\n%s\n%s\n\n", s1.getInfo(), s2.getInfo(), s3.getInfo());

            sm.students.add(new Student("Hoang", "17021120", "17021120@vnu.edu.vn"));
            sm.students.add(new Student("Tuan", "17021001", "17021001@vnu.edu.vn")); // same id
            sm.students.add(new Student("Thuy", "17021001", "17021001@vnu.edu.vn")); // same id
            sm.students.add(new Student("Nha", "17021041", "17021041@vnu.edu.vn"));
            sm.students.add(new Student("Thai", "17020971", "17020971@vnu.edu.vn"));
            sm.students.get(0).setGroup("INT22042");

            System.out.println(sm.sameGroup(sm.students.get(0), sm.students.get(1)) ? "Same group" : "Different group");
            System.out.println(sm.sameGroup(sm.students.get(1), sm.students.get(2)) ? "Same group" : "Different group");

            sm.removeStudent("17021001");
            sm.studentsByGroup();
        }
    }
