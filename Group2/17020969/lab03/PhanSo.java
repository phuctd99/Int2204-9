import java.util.*;
public class PhanSo {
    private int tu, mau;
    // gan gia tri cho tu, mau
    public void setTu(int tu) { this.tu=tu; }
    public void setMau(int mau) { this.mau=mau; }
    //phuong thuc tra ve gia tri tu , mau
    public int getTu() { return this.tu; }
    public int getMau() { return this.mau; }
    // ham tinh ucln cua 2 so nguyen a, b
    public int UCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if(a == 0 || b == 0)
        {
            return (a+b);
        }
        while(a != b) {
            if(a > b) {
                a = a - b;
            }
            else {
                b = b - a ;
            }
        }
        return a;
    }

    public void rutGon() {
        int uoc = UCLN(this.tu, this.mau);
        this.tu = this.tu / uoc;
        this.mau = this.mau / uoc;
    }
    public PhanSo congPs(PhanSo ps) {
        PhanSo PS = new PhanSo();
        PS.tu = this.tu * ps.mau + ps.tu * this.mau;
        PS.mau = this.mau*ps.mau;
        PS.rutGon();
        return PS;
    }
    public PhanSo truPs(PhanSo ps) {
        PhanSo PS = new PhanSo();
        PS.tu = this.tu * ps.mau - ps.tu * this.mau;
        PS.mau = this.mau*ps.mau;
        PS.rutGon();
        return PS;
    }
    public PhanSo nhanPs(PhanSo ps) {
        PhanSo PS = new PhanSo();
        PS.tu = ps.tu * this.tu;
        PS.mau = ps.mau * this.mau;
        if(PS.tu < 0 && PS.mau < 0) {
            PS.tu = Math.abs(PS.tu);
            PS.mau= Math.abs(PS.mau);
        }
        PS.rutGon();
        return PS;
    }
    public PhanSo chiaPs(PhanSo ps) {
        PhanSo PS = new PhanSo();
        PS.tu = this.tu * ps.mau;
        PS.mau = this.mau * ps.tu;
        if(PS.tu < 0 && PS.mau < 0) {
            PS.tu = Math.abs(PS.tu);
            PS.mau= Math.abs(PS.mau);
        }
        PS.rutGon();
        return PS;
    }
    public void Output(PhanSo PS) {
        if(PS.tu % PS.mau == 0) {
            System.out.println(PS.tu / PS.mau);
        }
        else {
            System.out.println(PS.tu + "/" + PS.mau);
        }
    }
    public boolean equals(Object obj) {
        // neu obj co the chuyen thanh phan so
        if (obj instanceof PhanSo) {
            PhanSo ps = (PhanSo)obj; // chuyen obj thanh 1 ps
            return ps.tu * this.mau == ps.mau * this.tu;
        }
        return false;
    }

    public static void main(String[] args) {

        PhanSo ps1 = new PhanSo();
        ps1.setTu(2);
        ps1.setMau(2);
        PhanSo ps2 = new PhanSo();
        ps2.setTu(1);
        ps2.setMau(1);
        PhanSo ps = new PhanSo();
        if(ps1.mau != 0 && ps2.mau != 0) {
            ps = ps1.congPs(ps2);
            System.out.print("Tong 2 phan so: ");
            ps.Output(ps);

            ps = ps1.truPs(ps2);
            System.out.print("Hieu 2 phan so: ");
            ps.Output(ps);

            ps = ps1.nhanPs(ps2);
            System.out.print("Tich 2 phan so: ");
            ps.Output(ps);

            ps = ps1.chiaPs(ps2);
            System.out.print("Thuong 2 phan so: ");
            ps.Output(ps);

            // kiem tra 2 phan so
            System.out.println(ps1.equals(ps2));
        }
        else if(ps1.mau == 0 && ps2.mau != 0) {
            System.out.println("Nhap sai phan so 1");
        }
        else if(ps1.mau != 0 && ps2.mau == 0) {
            System.out.println("Nhap sai phan so 2");
        }
        else{
            System.out.println("Nhap sai phan so");
        }
    }
}
