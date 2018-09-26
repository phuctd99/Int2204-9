import  java.util.*;

public class StudentManagement {
    public List<student> students = new ArrayList<>();


    public boolean sameGroup(student s1, student s2) {
        return s1.getGroup() == s2.getGroup();
    }

    public  void removeStudent(String id){
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getId().equals(id)){
                students.remove(i);
            }
        }
    }

    public  void studentsByGroup()
    {
        List<String> group = new ArrayList<>();
        for ( int i = 0; i< students.size(); i++)
        {
            if(!group.contains(students.get(i).getGroup()))
                group.add(students.get(i).getGroup());
        }
        for(int i = 0;i<group.size();i++)
        {
            System.out.println("Group:" +group.get(i));
            for(int j = 0; j < students.size(); j++)
            {
                if(students.get(j).getGroup()== group.get(i))
                    students.get(j).getInfor();

            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        student st =  new student();
        st.setName("La Quoc Viet");
        st.setId("17021125");
        st.setGroup("INT22041");
        st.setEmail("17021125uet@vnu.edu.vn");
        String ten = st.getName();
        System.out.println(ten);
        st.getInfor();

        student st1 = new student();
        student st2 = new student("AAAAA","17020000","INT22041","17020000uet@vnu.edu.vn");
        student st3 = new student(st);
        st1.getInfor();
        st2.getInfor();
        st3.getInfor();

        StudentManagement s = new StudentManagement();
        if (s.sameGroup(st1, st2)){
            System.out.println("Co");
        }
        else {
            System.out.println("Khong");
        }
    }
}
