package ExampleClass;

import javax.print.DocFlavor;

public class Subject {
    private String nameMon, maMon, soTinChi;

    Subject(String name, String ma, String tinCHi){
        this.nameMon = name;
        this.maMon = ma;
        this.soTinChi = tinCHi;
    }

    public void setNameMon(String nameMon){
        this.nameMon = nameMon;
    }

    public String getNameMon(){
        return this.nameMon;
    }

    public void setMaMon(String maMon){
        this.maMon = maMon;
    }

    public String getMaMon(){
        return this.maMon;
    }

    public void setSoTinChi(String soTinChi){
        this.soTinChi = soTinChi;
    }

    public String getSoTinChi(){
        return this.soTinChi;
    }

    public void getInfo(){
        System.out.println("Ten mon hoc: " + nameMon);
        System.out.println("Ma mon: "+ maMon);
        System.out.println("So tin chi: " + soTinChi);
    }

    public static void main(String[] args){
        Subject s = new Subject("Lap trinh huong doi tuong", "INT2204", "4");
        s.getInfo();
    }
}
