package com.company;

public class PhanSo {
    private int tu;
    private int mau;
    public int UCLN(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 && b != 0){
            return b;
        }
        else if (a != 0 && b == 0){
            return a;
        }
        if(a==b){
            return a;
        }
        while(a!=b){
            if(a>b)
                a-=b;
            if(a<b)
                b-=a;
        }
        return a;
    }
    public void ToiGianPS(){
        if( this.mau == 0){
            System.out.println("Mau Phai Khac 0");
            return;
        }
            int uc = UCLN(this.tu, this.mau);
            this.tu = this.tu/uc;
            this.mau = this.mau/uc;

    }
    public PhanSo(int tu, int mau){
        this.tu = tu;
        this.mau = mau;
        //ToiGianPS();
    }
    public void CongPs(PhanSo ps){
        this.tu = this.tu*ps.mau + this.mau*ps.tu;
        this.mau = this.mau*ps.mau;
        //ToiGianPS();
    }
    public void TruPs(PhanSo ps){
        this.tu = this.tu*ps.mau - this.mau*ps.tu;
        this.mau = this.mau*ps.mau;
        //ToiGianPS();
    }
    public void NhanPs(PhanSo ps){
        this.tu = this.tu * ps.tu;
        this.mau = this.mau * ps.mau;
        //ToiGianPS();
    }
    public void ChiaPs(PhanSo ps){
        this.tu = this.tu*ps.mau;
        this.mau = this.mau*ps.tu;
        //ToiGianPS();
    }
    public boolean equals(PhanSo ps){
        int tu1 = this.tu * ps.mau;
        int tu2 = this.mau * ps.tu;
        if(tu1 == tu2)
        return true;
        else
            return false;
    }
    public void Print(){
        ToiGianPS();
        if(this.mau == 1)
        System.out.println(this.tu);
        else{
            System.out.println(this.tu + "/" + this.mau);
        }
    }
    public static void main(String[] args) {
        PhanSo ps = new PhanSo(1,2);
        PhanSo ps1 =new PhanSo(6,12);
//        ps.CongPs(ps1);
//        ps.NhanPs(ps1);
//        ps.TruPs(ps1);
//        ps.Print();
        if(ps.equals(ps1))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
