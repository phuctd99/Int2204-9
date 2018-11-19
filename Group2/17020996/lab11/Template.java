import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class phepToan {
    public int UCLN(int  a, int b){
        if (a<0) a=-1*a;
        if (b<0) b=-1*b;
        if (a==b) return a;
        else if (a>b) return UCLN(a-b,b);
        else return UCLN(b-a,a);
    }
    public int F(int n){
        if (n==0) return n;
        else if (n==1) return n;
        else return F(n-1)+F(n-2);
    }
}

class phanSo implements Comparable<phanSo>{
    private int tu, mau;
    public phanSo(int tu, int mau){
        this.tu=tu;
        this.mau=mau;
    }
    public phanSo(){
        this(0,1);
    }

    public phanSo simplify(){
        phepToan a = new phepToan();
        phanSo toiGian = this;
        if (this.tu == 0) {return this;}
        else {
            int UC = a.UCLN(toiGian.tu, toiGian.mau);
            toiGian.tu = toiGian.tu / UC;
            toiGian.mau = toiGian.mau / UC;
        }
        return this;
    }

    public void inPS(){
        System.out.println(this.tu + "/" + this.mau);
    }

    public phanSo cong(phanSo a) {
        this.tu = this.tu*a.mau + a.tu*this.mau;
        this.mau = this.mau*a.mau;
        return this.simplify();
    }

    public phanSo tru(phanSo a){
        this.tu = (this.tu*a.mau) - (a.tu*this.mau);
        this.mau = this.mau*a.mau;
        return this.simplify();
    }

    public phanSo nhan(phanSo a){
        this.tu = this.tu*a.tu;
        this.mau = this.mau*a.mau;
        return this.simplify();
    }
    public phanSo chia(phanSo a){
        this.tu = this.tu*a.mau;
        this.mau = this.mau*a.tu;
        return this.simplify();
    }

    public boolean equals(phanSo a){
        return this.tu*a.mau == a.tu*this.mau;
    }

    @Override
    public int compareTo(phanSo o){
        if (this.tu*o.mau < o.tu*this.mau) return -1;
         if (this.tu*o.mau > o.tu*this.mau) return 1;
        return 0;
    }
}

public class Template {
    public static <T extends Comparable<T>> void sort(ArrayList<T> a){
        int n = a.size();
        Collections.sort(a);
    }

    public static <T extends Comparable<T>> T max(ArrayList<T> a){
        T x = a.get(0);
        for (int i=0; i<a.size(); i++)
            if (a.get(i).compareTo(x) > 0) x = a.get(i);
        return x;
    }

    public static void main(String[] args) {
        ArrayList<phanSo> a = new ArrayList<>();
        a.add(new phanSo(1,3));
        a.add(new phanSo(3,2));
        a.add(new phanSo(2,5));
        a.add(new phanSo(1,2));
        max(a).inPS();
        System.out.println("--------------------");
        sort(a);
        for (phanSo x : a){
            x.inPS();
        }
    }
}
