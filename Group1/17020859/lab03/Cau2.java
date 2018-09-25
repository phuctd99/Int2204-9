import java.util.Scanner;

public class Cau2 {

    private int tu, mau;

    public Cau2(int tu, int mau) {
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

    public void quychuan () {
        if (this.tu != 0 && this.mau != 0) {
            Cau1 Ucln = new Cau1();
            int ucln = Ucln.UCLN(this.tu, this.mau);
            this.tu = this.tu / ucln;
            this.mau = this.mau / ucln;
        }
    }

    public Cau2 cong (Cau2 y) {
        int tu = this.getTu()*y.getMau() + y.getTu()*this.getMau();
        int mau = this.getMau()*y.getMau();
        Cau2 a = new Cau2(tu, mau);
        a.quychuan();
        return a;
    }

    public Cau2 tru (Cau2 y) {
        int tu = this.getTu()*y.getMau() - y.getTu()*this.getMau();
        int mau = this.getMau()*y.getMau();
        Cau2 a = new Cau2(tu, mau);
        a.quychuan();
        return a;
    }

    public Cau2 nhan (Cau2 y) {
        int tu = this.getTu() * y.getTu();
        int mau = this.getMau() * y.getMau();
        Cau2 a = new Cau2(tu, mau);
        a.quychuan();
        return a;
    }

    public Cau2 chia (Cau2 y) {
        int tu = this.getTu()*y.getMau();
        int mau = this.getMau()*y.getTu();
        Cau2 a = new Cau2(tu, mau);
        a.quychuan();
        return a;
    }

    public boolean equals (Cau2 y) {
        return this.getTu()*y.getMau() == this.getMau()*y.getTu();
    }

    public void output (Cau2 x) {
        System.out.println(x.getTu() + " / " +x.getMau());
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        Cau2 a = new Cau2(x1, y1);

        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        Cau2 b = new Cau2(x2, y2);

        a.output(a.cong(b));
        a.output(a.tru(b));
        a.output(a.nhan(b));
        a.output(a.chia(b));

        if (a.equals(b)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

        sc.close();
    }
}

