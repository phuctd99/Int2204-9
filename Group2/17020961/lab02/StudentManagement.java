package lap02;
import java.util.*;
//tao lop Student


public class StudentManagement{
	//thuoc tinh
	   public List<Student> students= new ArrayList<>();
	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args) {
	    	
	    	/*Tao the hien test cua class StudentManagement
	    	 * han che su dung phuong thuc static vi no khong
	    	 * the tao duoc nhieu danh sach quan li sinh vien
	    	 * (do static thuoc ve class)
	    	 */
	        StudentManagement test =new StudentManagement();
	        // TODO code application logic here
	        Student sinhvien=new Student(); //tao mot sinh vien
			
			//thiet lap cac thong tin ve sinh vien
			sinhvien.setName("Tran Duy Phuc");
			sinhvien.setId("17020961");
			sinhvien.setGroup("INT22042");
			sinhvien.setEmail("tranphuc072@gmail.com");
			
			//in ra ten sinh vien
			System.out.println(sinhvien.getName());
			
			//in ra toan bo thong tin sinh vien
			sinhvien.getInfo();
			
			//kiem tra cac phuong thuc khoi tao
			Student sv1=new Student();									//INT22041
			Student sv2=new Student("ABC","17020000","XYZ@gmail.com");	//INT22041
			Student sv3=new Student(sinhvien);							//INT22042
			System.out.println("sv1: ");
			sv1.getInfo();
			System.out.println("sv2: ");
			sv2.getInfo();
			System.out.println("sv3: ");
			sv3.getInfo();
			
			//kiem tra sv1 va sv3 co cung lop khong?
			System.out.println("sv1 va sv3 co cung lop khong?: "+test.sameGroup(sv1,sv3));
	        
			
			test.students.add(sv1);
	        test.students.add(sv2);
	        test.students.add(sv3);
	        //test ham byGroup
	        System.out.println("test ham studentsByGroup");
	        test.studentsByGroup();
	        
	        
	        
	        
	        //test ham remove
	        System.out.println("Test ham remove");
	        test.removeStudent("17020961");
	        for(int i=0;i<test.students.size();i++){
	                    test.students.get(i).getInfo();
	                }
	                
	    }
	    
	    public  boolean sameGroup(Student s1,Student s2){
			if(s1.getGroup().equals(s2.getGroup())){
				return true;
			}
			return false;
		}
	   
	    void studentsByGroup() {
	        ArrayList<String> group = new ArrayList<String>();
	        for (int i = 0; i < students.size(); i++) {
	            if (!group.contains(students.get(i).getGroup())) {//contains de kiem tra group do da co trong list chua
	                group.add(students.get(i).getGroup());        //neu chua co thi add group vao
	            }
	        }
	        for (int i = 0; i< group.size(); i++) {
	            System.out.println("Lop " + group.get(i));
	            for (int j = 0; j < students.size(); j++) {
	                if (students.get(j).getGroup().equals(group.get(i))) {
	                    students.get(j).getInfo();
	                }
	            }
	        }
	        System.out.println();
	    }
		//phuong thuc xoa sinh vien id ra khoi danh sach
	    
		public  void removeStudent(String id){
			int length=students.size();
			for(int i=0;i<length;i++){
				if(students.get(i).getId()==id){		
						students.remove(i);	
				}
			}
		}
	}
	
