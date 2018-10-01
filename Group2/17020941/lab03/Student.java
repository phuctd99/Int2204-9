package bai3;
import java.util.Scanner;
public class Student {
		private String ten;
	    private String mssv;
	    private float diemTB;
	    private String lop;
	    Scanner input;
	    Student(String name, String mssv, float diemTB, String lop) {
	    	this.setTen(name);
	    	this.setMssv(mssv);
	    	this.setDiemTB(diemTB);
	    	this.setLop(lop);
	    }
	    Student(Student s){
	        this.ten = s.ten;
	        this.mssv = s.mssv;
	        this.lop = s.lop;
	        this.diemTB = s.diemTB;
	        input = new Scanner(System.in);
	    }
	    public String getTen() {
	        return ten;
	    }
	    public void setTen(String ten) {
	        this.ten = ten;
	    }

	    public String getMssv() {
	        return mssv;
	    }
	    public void setMssv(String mssv) {
	        this.mssv = mssv;
	    }

	    public float getDiemTB() {
	        return diemTB;
	    }
	    public void setDiemTB(float diemTB) {
	        this.diemTB = diemTB;
	    }

	    public String getLop() {
	        return lop;
	    }
	    public void setLop(String lop) {
	        this.lop = lop;
	    }
	    public void inputInfo(){ // nhap thong tin hoc sinh
	        System.out.println("Nhap thong tin sinh vien:");
	        System.out.print("Ten: ");
	        this.setTen(input.nextLine());
	        System.out.println();
	        System.out.print("Ma so sinh vien: ");
	        this.setMssv(input.nextLine());
	        System.out.println();
	        System.out.print("Lop: ");
	        this.setLop(input.nextLine());
	        System.out.println();
	        System.out.print("Diem trung binh: ");
	        this.setDiemTB(input.nextFloat());
	        System.out.println();
	    }
	    public void showInfo(){ // in thong tin hoc sinh
	        System.out.println("Ten sinh vien: " + this.getTen());
	        System.out.println("Ma so sinh vien: " + this.getMssv());
	        System.out.println("Lop hoc: " + this.getLop());
	        System.out.println("Diem trung binh: " + this.getDiemTB());
	    }
	    public boolean checkHocBong(){ // kiem tra hoc sinh co duoc hoc bong khong
	        return (this.getDiemTB() > 3.2);
	    }
}
