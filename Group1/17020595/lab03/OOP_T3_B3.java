package oop_t3_b3;

public class OOP_T3_B3 {

    public static void main(String[] args) {
        // TODO code application logic here
    } 
}
class GiaoVien{
    String name, mon, phongHoc; //khai bao ten, mon day, phong hoc
    
    public String getName() {
        return name;
    }
    //lay gia tri
    public void setName(String name) {
        this.name = name;
    }

    public String getMon() {
        return mon;
    }
    //lay gia tri
    public void setMon(String mon) {
        this.mon = mon;
    }

    public String getPhongHoc() {
        return phongHoc;
    }
    //lay gia tri
    public void setPhongHoc(String phongHoc) {
        this.phongHoc = phongHoc;
    }
    public void printGiaoVien(){
        System.out.println(name + "day mon: " + mon + " tai phong: " + phongHoc );
    }
    
}

class monHoc{
    String tenMon, Ma, TC, gioHoc;

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public String getTC() {
        return TC;
    }

    public void setTC(String TC) {
        this.TC = TC;
    }

    public String getGioHoc() {
        return gioHoc;
    }

    public void setGioHoc(String gioHoc) {
        this.gioHoc = gioHoc;
    }
    public void output(){
        System.out.println(tenMon + " " + Ma + " " + TC + " " + gioHoc);
    }
}
class BanBe{
    String name, age, group;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
    public void output(){
        System.out.println(name + age + group);
    }
}
class soDt{
    String name;
    String number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public void output(){
        System.out.println(name + "sdt: " + number);
    }
    
}
class mayTinh{
    String name, hang, id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void output(){
        System.out.println(name + "" + hang + " vs"+ id);
    }
}
 class ngonNgu{
     String name;
     float soLieu;

    public void setName(String name) {
        this.name = name;
    }

    public void setSoLieu(float soLieu) {
        this.soLieu = soLieu;
    }

    public String getName() {
        return name;
    }

    public float getSoLieu() {
        return soLieu;
    }
     public void output(){
        System.out.println(name + " " + soLieu);
    }
 }
class kieuDuLieu{
    String name;
    long size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }
    public void output(){
        System.out.println(name + " " + size);
    }
}
class app{
    String name, tacGia;
    int tien;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getTien() {
        return tien;
    }

    public void setTien(int tien) {
        this.tien = tien;
    }
    public void output(){
        System.out.println(name + " " +tacGia);
    }
}
class dienThoai{
    String name, noiBan;
    int tien;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNoiBan() {
        return noiBan;
    }

    public void setNoiBan(String noiBan) {
        this.noiBan = noiBan;
    }

    public int getTien() {
        return tien;
    }

    public void setTien(int tien) {
        this.tien = tien;
    }
    public void output(){
        System.out.println(name + " " + noiBan);
    }
}
class thoiTrang{
    String name, loai, mua;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getMua() {
        return mua;
    }

    public void setMua(String mua) {
        this.mua = mua;
    }
    public void output(){
        System.out.println(name);
    }
}
