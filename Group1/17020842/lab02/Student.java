/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduceOOP;

/**
 *
 * @author CACLV
 */
public class Student {
    private String name, id, group, emal;
    // khởi tạo không tham số
    public Student() {
        this.name = "Student";
        this.id = "0000";
        this.group = "INT22041";
        this.emal = "uet@vnu.edu.vn";
    }
//    boolean isp= false;
    // khởi tạo có tham số truyền vào
    public Student(String name, String id, String group, String emal) {
        this.name = name;
        this.id = id;
        this.group = group;
        this.emal = emal;
    }
    // khởi tạo sao chép
    public Student(Student s){
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.emal = s.emal;
    }
    
    // các phương thức get/set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getEmal() {
        return emal;
    }

    public void setEmal(String emal) {
        this.emal = emal;
    }
    // phương thức trả về các thông tin sinh viên
    public String getInfor(){
        return getName() + "\n" + getId() + "\n" + getGroup() + "\n" + getEmal();
    }
    
    public boolean same(Student s1, Student s2){
        return s1.getGroup().equals(s2.getGroup());
    }
}
