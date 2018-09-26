import java.util.ArrayList;
import java.util.List;

public class StudentManagement {

    private List<Student> sv = new ArrayList<Student>();

    public void addSdt(int i, Student sdnt){
        sv.add(sdnt);
    }

    public void inSv(int i){
        System.out.println(sv.get(i).getInfo());
    }

     public boolean sameGroup(Student s1, Student s2){
        if (s1.getGroup()==s2.getGroup()) return true;
         else return false;
    }

    public void studentsByGroup(){
            int n = sv.size();
            int soNhom = 0;
            int ktra = 1;
            String[] nhom = new String[n];
           for(int i=0; i<n; i++){
               for(int j=0; j<=soNhom; j++){
                  if (sv.get(i).getGroup()==nhom[j]) {ktra=0; break;}}
                   if (ktra==1) {nhom[soNhom]=sv.get(i).getGroup(); soNhom++;}
                         else ktra=1;
           }

           for(int i=0; i<=soNhom-1; i++){
               System.out.println("Danh sach sinh vien nhom " + nhom[i] + ":");
               for(int j=0; j<n; j++){
                   if (sv.get(j).getGroup()==nhom[i]) System.out.println(sv.get(j).getInfo());
               }
           }
    }

    public void removeStudent(String id){
            int n = sv.size();
            int i;
            for(i=0; i<n; i++){
                if (sv.get(i).getId()==id) break;
            }
            sv.remove(i);
    }

    public static void main(String[] args) {
        StudentManagement mgr = new StudentManagement();
        Student sv0 = new Student();
        sv0.setName("Thai Tran Hong Quan");
        sv0.setId("17020989");
        sv0.setGroup("INT22042");
        sv0.setEmail("17020989@vnu.edu.vn");
        Student sv1 = new Student();
        Student sv2 = new Student("Nguyen Anh Dung", "17020666", "17020666@vnu.edu.vn");
        Student sv3 = new Student(sv0);
        mgr.addSdt(0,sv0);
        mgr.addSdt(1,sv1);
        mgr.addSdt(2,sv2);
        mgr.addSdt(3,sv3);
        mgr.removeStudent("17020666");
        mgr.inSv(0);
        mgr.inSv(1);
        mgr.inSv(2);
    }
}
