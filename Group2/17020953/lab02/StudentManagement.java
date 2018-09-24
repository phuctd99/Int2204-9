/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice2;



/**
 *
 * @author Admin
 */
public class StudentManagement {
    //
    public Student[] students = new Student[100];
    		    private int size = 0;
    public boolean sameGroup(Student s1, Student s2)
    {
        return s1.getGroup().equals(s2.getGroup());
    }
     public void arryStudent(Student s) {
    		        if (size == 100) {
                            return ;
    		        }
    		        students[size] = s;
    		        size++;
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
    		            
    	 for ( int j = 0 ; j < size ; j++){
    		  if (students[j].getGroup().equals(a[i])) {
    		           students[j].getInfo();
    		                }
    		            }
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
    	 if (index == size) {
    		 return ;
    		        }
    	 for (int i = index; i < size - 1; i++) {
    		 students[i] = students[i + 1];
    		        }
    		        size--;
     
    		    }

    public static void main (String[] agrs){
        Student st1 =new Student();
        Student st2 =new Student();
        st2.setName("Phong");
        st2.setId("17020953");
        st2.setGroup("INT22049");
        st2.setEmail("nguyendacphong09@gmail.com");
        System.out.println(st2.name);
        st2.getInfo();
        //kiểm tra phương thức khởi tạo
         Student s0 =new Student ();
         s0.getInfo();
         Student s = new Student("A" , "17030000" , "Auet@gmail.com");
         s.getInfo();
         Student s1= new Student(s);
         s1.getInfo();
         s1.setId("17020000");
        StudentManagement st= new StudentManagement();
    		        st.arryStudent(s0);
    		        st.arryStudent(s);
    		        st.arryStudent(s1);
    		        
    		        st.removeStudent( "17020000");
    		        st.studentsByGroup();
    		       

        
    }
}

   