/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CACLV
 */
public class Student {
    private String name; // tên 
    private double scoreMath;
    private double ScorePhy;
    private double ScoreChe; // điểm toán lí hóa

    public Student(){
        this.scoreMath = 10.0;
        this.ScorePhy = 10.0;
        this.ScoreChe = 10.0;
    }
    // contructor
    public Student(String name, double scoreMath, double ScorePhy, double ScoreChe) {
        this.name = name;
        this.scoreMath = scoreMath;
        this.ScorePhy = ScorePhy;
        this.ScoreChe = ScoreChe;
    }

    
    // gets/sets
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScoreMath() {
        return scoreMath;
    }

    public void setScoreMath(double scoreMath) {
        this.scoreMath = scoreMath;
    }

    public double getScorePhy() {
        return ScorePhy;
    }

    public void setScorePhy(double ScorePhy) {
        this.ScorePhy = ScorePhy;
    }

    public double getScoreChe() {
        return ScoreChe;
    }

    public void setScoreChe(double ScoreChe) {
        this.ScoreChe = ScoreChe;
    }
    
    
    // hàm tính điểm trung bình
    public double GPA(){
        return (scoreMath + ScoreChe + ScorePhy) / 3;
    }
    
    // hàm in ra thông tin 
    public void showInfo(){
        System.out.println("Student Info:");
        System.out.println("Name\t\t: " + this.getName());
        System.out.println("GPA      \t: " + this.GPA());
        System.out.println("");
    }
    
    // trả về học sinh có thành tích thấp nhất
    public Student numberOne(List <Student> studentList){
        Student student = new Student();
        for(Student ele : studentList){
            if(ele.GPA() < student.GPA()) student = ele;
        }
        return student;
    }
    // hàm main test thử
    public static void main(String[] args) {
        
        // in ra thông tin của học sinh đc khởi tạo 
        new Student("duy kỳ", 9.5, 9.5, 9.8).showInfo();
        
        List <Student> studentList = new ArrayList<>();
        studentList.add(new Student("duy kỳ", 9.5, 9.5, 9.8));
        studentList.add(new Student("hoàn phí", 9, 9, 9.8));
        studentList.add(new Student("trường giang", 9, 9, 8));
        studentList.add(new Student("duy long", 9, 8, 8.8));
        studentList.add(new Student("quý đôn", 9, 9, 9.1));
        
        // in ra thông tin học sinh có điểm đứng cuối danh sách
        new Student().numberOne(studentList).showInfo();
        
    }
}
