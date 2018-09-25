import java.util.Scanner;

public class Cau2{
    private int tu, mau;
    public Cau2(int tu, int mau){
        this.tu = tu;
        this.mau = mau;
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    public int UCLN(int m, int n){
        int i = Math.abs(m);
        int j = Math.abs(n);
        while(i != j){
            if (i > j) i = i - j;
            else j = j - i;
        }
        return i;
    }

    public void toigian(){
        int k = UCLN(this.tu, this.mau);
        if (this.tu != 0 && this.mau != 0) {
            this.tu = this.tu / k;
            this.mau = this.mau / k;
        }
    }

    public Cau2 cong(Cau2 ps){
        int t = this.getTu() * ps.getMau() + ps.getTu() * this.getMau();
        int m = this.getMau() * ps.getMau();
        Cau2 a = new Cau2(t, m);
        a.toigian();
        return a;
    }

    public Cau2 tru(Cau2 ps){
        int t = this.getTu() * ps.getMau() - ps.getTu() * this.getMau();
        int m = this.getMau() * ps.getMau();
        Cau2 a = new Cau2(t, m);
        a.toigian();
        return a;
    }

    public Cau2 nhan(Cau2 ps){
        int t = this.getTu() * ps.getTu();
        int m = this.getMau() * ps.getMau();
        Cau2 a = new Cau2(t, m);
        a.toigian();
        return a;
    }

    public Cau2 chia(Cau2 ps){
        int t = this.getTu() * ps.getMau();
        int m = this.getMau() * ps.getTu();
        Cau2 a = new Cau2(t, m);
        a.toigian();
        return a;
    }
    public boolean equals(Cau2 ps){
        if (this.getTu() * ps.getMau() - ps.getTu() * this.getMau() == 0){
            return true;
        }
        else return false ;
    }
    public void print(Cau2 ps){
        System.out.println(ps.getTu() + "/" + ps.getMau()) ;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        Cau2 ps1 = new Cau2(x1, y1);
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        Cau2 ps2 = new Cau2(x2, y2);
        ps1.print(ps1.cong(ps2));
        ps1.print(ps1.tru(ps2));
        ps1.print(ps1.nhan(ps2));
        ps1.print(ps1.chia(ps2));
    }
}