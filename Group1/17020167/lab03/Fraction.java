package fraction;
import java.util.*;
public class Fraction {

   private int tu, mau;
    //getter va setter

    public int getTu() {
        return tu;
    }

    public int getMau() {
        return mau;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }
   
    
    
    //Ham khoi tao with this
    public Fraction(int a,int b) {
        this.tu = a;
        this.mau = b;
    }
    
    //Ham UCLN
    public int GCD(int a, int b) {
        if(b==0) return a;
        return GCD(b,a%b);
    }
    
    //Ham rut gon phan so
    public Fraction compact() {
        int UCLN = GCD(this.tu,this.mau);
        this.tu = this.getTu()/UCLN;
        this.mau = this.getMau()/UCLN;
        
        if((this.tu>0&&this.mau<0)||(this.tu<0&&this.mau<0)) {
            this.tu = -1*this.tu;
            this.mau = -1*this.mau;
        }
        return this;
    }
    
    //Ham in phan so
    public void pf(){
        if(this.getMau()!=1) System.out.println(this.getTu() +"/" +this.getMau());
        else System.out.println(this.getTu());
    }
    
    //Ham cong phan so
    public Fraction plus(Fraction f) {
        int a = ( this.getTu()*f.getMau() + this.getTu()*f.getMau() );
        int b = this.getMau() *f.getMau() ;
        Fraction plus = new Fraction(a, b);
        plus.compact();
        return plus;
    }
    
    //Ham tru phan so
    public Fraction minus(Fraction f) {
        int a = ( this.getTu()*f.getMau() - this.getTu()*f.getMau() );
        int b = this.getMau() *f.getMau() ;
        Fraction minus = new Fraction(a, b);
        minus.compact();
        return minus;
    }
    
    //Ham nhan phan so
    public Fraction multiple(Fraction f) {
       
        int a = ( this.getTu()*f.getTu());
        int b = this.getMau() *this.getMau() ;
        Fraction multiple = new Fraction(a, b);
        multiple.compact();
        return multiple;
    }
    
    //Ham chia phan so
    public  Fraction divide(Fraction f) {
        
       int a= ( this.getTu()*f.getMau());
       int b  = this.getMau() *f.getTu() ;
        Fraction s = new Fraction(a,b);
        s.compact();
        return s;
    }
    
    //ham so sanh phan so
    public boolean equals(Fraction f ) {
      
        return(this.tu==f.tu&&this.mau==f.mau);
    }
    
    public static void main(String[] args) {
        System.out.println("Nhap phan so thu 1 ");
        Scanner input = new Scanner(System.in);
        String ps1;
        ps1=input.nextLine();
        String[] ps11;
        ps11 = ps1.split("/");
        int t1,m1;
        t1=Integer.parseInt(ps11[0]);
        m1=Integer.parseInt(ps11[1]);
        while(m1==0) {
            System.out.println("Phan so khong hop le moi nhap lai phan so thu 1 ");
            ps1=input.nextLine();
            String[] ps12;
            ps12 = ps1.split("/");
            t1=Integer.parseInt(ps12[0]);
            m1=Integer.parseInt(ps12[1]);
        } 
        System.out.println("Nhap phan so thu 2 ");
        String ps2;
        ps2=input.nextLine();
        String[] ps21;
        ps21 = ps2.split("/");
        int t2,m2;
        t2=Integer.parseInt(ps21[0]);
        m2=Integer.parseInt(ps21[1]);
        while(m2==0) {
            System.out.println("Phan so khong hop le moi nhap lai phan so thu 2 ");
            ps2=input.nextLine();
            String[] ps22;
            ps22 = ps2.split("/");
            t2=Integer.parseInt(ps22[0]);
            m2=Integer.parseInt(ps22[1]);
        } 
    
        Fraction f1 = new Fraction(t1, m1);
        Fraction f2 = new Fraction(t2, m2);
        
        System.out.println("Tong 2 phan so la ");
        (f1.plus(f2)).pf();
        System.out.println("Hieu 2 phan so la ");
        (f1.minus(f2)).pf();
        System.out.println("Tich 2 phan so la "); 
        (f1.multiple(f2)).pf();
        System.out.println("Thuong 2 phan so la ");
        (f1.divide(f2)).pf();
        System.out.print("Ket qua so sanh 2 phan so la ");
        if(!f1.equals(f1)) System.out.println("khac nhau");
        else System.out.println("giong nhau");
        System.out.println();
    }
    
}
