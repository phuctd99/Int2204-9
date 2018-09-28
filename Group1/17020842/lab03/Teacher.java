/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author CACLV
 */
public class Teacher {
    public String name; // tên người
    public String code; // số cmt
    public int birthYear; // năm sinh
    public double salary; // lương tháng

    public Teacher() {
    }
    // contructor có tham số truyền vào là các thông tin liên quan
    public Teacher(String name, String code, int birthYear, double salary) {
        this.name = name;
        this.code = code;
        this.birthYear = birthYear;
        this.salary = salary;
    }
    
    // các phương thức set/get
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    

    public void setSalary(double Salary) {
        this.salary = Salary;
    }
    
    public double getSalary(){
        return this.salary;
    }
    
    // tính tuổi của đối tượng
    public int getAge(){
        Calendar now = Calendar.getInstance();
        return now.get(Calendar.YEAR)-this.getBirthYear();
    }
    
    // in ra toàn bộ thông tin của giáo viên
    public void showInfo(){
        System.out.println("Teacher Info:");
        System.out.println("Name\t\t: " + this.getName());
        System.out.println("Code\t\t: " + this.getCode());
        System.out.println("Birthday\t: " + this.getBirthYear());
        System.out.println("Age \t\t: " + this.getAge());
        System.out.println("salary     \t: " + this.salary);
        System.out.println("");
    }
    
    // trả về giáo viên có số tuổi cao nhất
    public Teacher retiringEarly(List <Teacher> teacherList){
        Teacher teacher = teacherList.get(0);
        Student student = new Student();
        for(Teacher ele : teacherList){
            if(ele.getAge() > teacher.getAge()) teacher = ele;
        }
        return teacher;
    }
    public static void main(String[] args) {
        List <Teacher> teacherList = new ArrayList<>();
        // khởi tạo và in ra thông tin của 1 giáo viên
        Teacher teacher = new Teacher("Lê Minh Khôi", "1234568", 1985, 13.5);
        teacher.showInfo();
        
        // tạo danh sách các giáo viên trong mảng teacherList
        teacherList.add(new Teacher("Lê Minh Khôi", "1234568", 1985, 13.5));
        teacherList.add(new Teacher("Lê Minh Hoàng", "1234895", 1980, 23.5));
        teacherList.add(new Teacher("Lê Minh Khôi", "1234963", 1975, 30.5));
        teacherList.add(new Teacher("Lê Minh Khôi", "1234786", 1995, 10.5));
        
        // in ra thông tin giáo viên sắp nghĩ hưu trong dah sách
        System.out.println("The teacher is about to retire: ");
        new Teacher().retiringEarly(teacherList).showInfo();
        
        
        
    }
}
