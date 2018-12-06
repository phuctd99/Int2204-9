/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyễn Giang
 */
public class ThanhVien {

    public String dateOfBirth, name;
    public int age;
    public String sex;
    public int childrenNum;
    public boolean married;
    public List<ThanhVien> members;
    public ThanhVien wifeThanhVien;
    public int gener;
    public static int youngestGen = 0;

    public ThanhVien(String name, String dateOfBirth, int age, String sex, int childrenNum, boolean married) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.sex = sex;
        this.childrenNum = childrenNum;
        this.married = married;
        members = new ArrayList<>();
    }

    public void bornChildren(ThanhVien child) {
        if (this.married == true) {
            child.gener = this.gener + 1;
            if (youngestGen < child.gener) {
                youngestGen = child.gener;
            }
            this.members.add(child);
            this.wifeThanhVien.members.add(child);
        }
    }

    @Override
    public String toString() {
        return ("Thành viên: " + name + " " + dateOfBirth + " " + age + " " + sex + " "
                + "Số con: " + childrenNum + " Kết hôn: " + married + " Thế hệ: " + gener );
    }

    public List<ThanhVien> getChildren() {
        return members;
    }

    public void marriedWith(ThanhVien wife) {
        this.wifeThanhVien = wife;
        wife.wifeThanhVien = this;
        this.married = true;
        wife.married = true;
    }
}
