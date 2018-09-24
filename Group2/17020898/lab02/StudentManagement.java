import  java.util.*;
public class StudentManagement {
    public List<Student>  students = new ArrayList<>();

    public boolean sameGroup(Student sv1, Student sv2){
        return sv1.getGroup()==sv2.getGroup();
    }
public  void removeStudent(String id){
    for(int i=0;i<students.size();i++){
        if(students.get(i).getId().equals(id)){
            students.remove(i);
        }

    }
}
public  void studentsByGroup()
{
    List<String> group = new ArrayList<>();
    for ( int i =0; i< students.size(); i++)
    {
        if(!group.contains(students.get(i).getGroup()))
            group.add(students.get(i).getGroup());
    }
    for(int i = 0;i<group.size();i++)
    {
        System.out.println("Lop:" +group.get(i));
        for(int j = 0; j<students.size(); j++)
        {
            if(students.get(j).getGroup()== group.get(i))
                students.get(j).getInfo();

        }
        System.out.println();
    }


}

    public static void main(String[] args) {

        StudentManagement SV1 = new StudentManagement();
        Student sv = new Student();
        sv.setName("Nguyen Thi Minh ");
        sv.setId("17020898");
        sv.setGroup("K62I-CQ/CL");
        sv.setEmail("minhnguyenypbn@gmail.com");
        String ten = sv.getName();
        System.out.println(ten);
        sv.getInfo();
        Student sv1 = new Student();
        sv1.getInfo();
        Student sv2 = new Student("Nguyen Thi Ngoc", "17020932", "17021456@vnu.edu.vn");
        sv2.getInfo();
        Student sv3 = new Student(sv);
        sv3.getInfo();
        SV1.students.add(sv1);
        SV1.students.add(sv2);
        SV1.students.add(sv3);
        System.out.println(SV1.sameGroup(sv1,sv2));
        SV1.studentsByGroup();
      SV1.removeStudent("17020898");


    }
}
