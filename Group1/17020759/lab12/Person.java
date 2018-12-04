package week12;

import java.util.ArrayList;

public class Person {

    protected String HoTen;
    protected int NgaySinh;
    protected int ThangSinh;
    protected int NamSinh;
    protected String GioiTinh;
    protected int thehe;
    protected Person Vo;
    ArrayList<Person> Con;

    public Person(String hoten, int ngay, int thang, int nam, String gt) {
        this.HoTen = hoten;
        this.NgaySinh = ngay;
        this.ThangSinh = thang;
        this.NamSinh = nam;
        this.GioiTinh = gt;
        Con = new ArrayList<>();
        thehe = 0;
    }
    public void ketHon(Person p) {
        this.Vo = p;
    }

    public void add(Person p) {
        Con.add(p);
        p.thehe++;
    }

    public void remove(Person p) {
        Con.remove(p);
    }

    public ArrayList<Person> getCon() {
        return Con;
    }

    @Override
    public String toString() {
        return ("Persion :[ Họ Tên: " + HoTen + " - Sinh Ngày: " + NgaySinh + "/" + ThangSinh + "/" + NamSinh + " - GT: " + GioiTinh + " ]");
    }

    public static void main(String[] args) {
        Person gen1 = new Person("X", 22, 1, 1999, "Nam");
        gen1.ketHon(new Person("Y",1 , 1, 2, "Nữ"));
        gen1.add(new Person("A", 2, 1, 2017, "Nam"));
        gen1.add(new Person("B", 25, 8, 2018, "Nữ"));
        gen1.Con.get(0).ketHon(new Person("M", 2, 2, 2034, "Nam"));
        
//        for (int i = 0; i < phahe.size(); i++) {
//            if (!phahe.get(i).KetHon) {
//                System.out.println("- Không kết hôn - ");
//                System.out.println(phahe.get(i).toString());
//            }
//            if (phahe.get(i).Con.size() == 2) {
//                System.out.println("- Có 2 con - ");
//                System.out.println(phahe.get(i).toString());
//            }
//        }
    }

}
