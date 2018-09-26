package Student;

public class StudentManagement {
	Student []sv = new Student[3];
	
	public boolean sameGroup(Student s1, Student s2) {
		if(s1.getLopHoc().equals(s2.getLopHoc())) {
			return true;
		}
		return false;
	}
	
	public void studentByGroup() {
		// số sinh viên ví dụ là 3 sinh viên
        int soLopKhacNhau = 1;
        String[] tenLop = new String[3];
        tenLop[0] = sv[0].getLopHoc();
        for(int i=1; i<3; i++) {
        	for(int j=0; j<soLopKhacNhau; j++) {
        		if(tenLop[j].equals(sv[i].getLopHoc())) {
        			break;
        		}
        		if(j+1 == soLopKhacNhau) {
        			 tenLop[soLopKhacNhau] = sv[i].getLopHoc();
                     soLopKhacNhau++;
        		}
        	}
        }
        for(int i=0; i<soLopKhacNhau; i++) {
        	System.out.println("Danh sách sinh viên lớp " + tenLop[i] + ":");
        	for(int j=0; j<3; j++) {
        		if(tenLop[i].equals(sv[j].getLopHoc())) {
        			System.out.println(sv[j].getInfo());
        		}
        	}
        	if(i!=soLopKhacNhau-1) {
        		System.out.println("--------------------");
        	}
        }
        
	}
	
	// hàm xóa sinh viên theo id
	public void removeStudent(String id) {
		int count=0;
		for(int i=0, k=0; i<sv.length; i++) {
			if(sv[i].getId().equals(id)==false) {
				sv[k]=sv[i];
				k++;
				count++;
			}
		}
		// danh sách sau khi xóa
		System.out.println("Danh sách sau khi xóa: ");
        for(int i = 0; i<count; i++){
            System.out.println(sv[i].getInfo());
            if(i!=count-1) {
            	System.out.println("--------------------");
            }
        }
	}

	public static void main(String[] args) {
		
		 StudentManagement test = new StudentManagement();
	        int soLuongSinhVien = 3;
	        for(int i = 0; i<soLuongSinhVien; i++){
	            test.sv[i] = new Student();
	            test.sv[i].setInfo();
	        }
	        
	        // test hàm xem 2 sinh viên có cùng lớp hay không
	        if(test.sameGroup(test.sv[0], test.sv[1])==true) {
	        	System.out.println("Sinh viên " + test.sv[0].getName() + " và " + test.sv[1].getName() + " cùng lớp");
	        }
	        else
	        	System.out.println("Sinh viên " + test.sv[0].getName() + " và " + test.sv[1].getName() + " khác lớp");
	        
	        // test hàm in danh sách sinh viên theo lớp
	        test.studentByGroup();
	        
	        // test hàm in xóa sinh viên có mã Id = 123, rồi in ra
	        test.removeStudent("123");	        
	        
	}        

}
