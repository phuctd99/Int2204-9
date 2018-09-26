//import java.util.Scanner;

public class Phan_So {
    int ts , ms;
    //khoi tao phan so
    Phan_So(int ts, int ms) {
        this.ts = ts;
        this.ms = ms;
    }
    //tim ucln cua a, b
    public int  gcd(int a, int b){
        while (a!=0){
            int temp = a;
            a = b%a;
            b = temp;
        }
        return b;
    }
    // toi gian phan so
    public Phan_So reduction(){
        int temp = gcd(this.ts, this.ms);//tim ucln giua ts va ms
        if(temp == 1)   return this;
        else{
            this.ts /= temp;
            this.ms /= temp;
            return this;
        }
    }
    //ham cong phan so
    public Phan_So add(Phan_So ps1){
        Phan_So result = new Phan_So(0,1);
        result.ts = this.ts*ps1.ms + this.ms*ps1.ts;
        result.ms = this.ms*ps1.ms;

        return result.reduction();
    }
    // ham tru phan so
    public Phan_So subtract(Phan_So ps1){
        Phan_So result = new Phan_So(0,1);
        result.ts = this.ts*ps1.ms - this.ms*ps1.ts;
        result.ms = this.ms*ps1.ms;
        return result.reduction();
    }
    // ham nhan phan so
    public  Phan_So mutiply(Phan_So ps1){
        Phan_So result = new Phan_So(0,1);
        result.ts = this.ts * ps1.ts;
        result.ms = this.ms * ps1.ms;
        return result.reduction();
    }
    //ham chia phan so
    public Phan_So divide(Phan_So ps1){
        Phan_So result = new Phan_So(0,1);
        result.ts = this.ts * ps1.ms;
        result.ms = this.ms * ps1.ts;
        return result.reduction();
    }
    //ham so sanh hai phan so
    public boolean equal(Object obj){

        //if(this.ms == ps1.ms){
        //    return (this.ts == ps1.ts) ? true : false;
        //}
        //return (this.ts*ps1.ms == this.ms*ps1.ts) ? true : false;
        if((obj instanceof Phan_So)){
            Phan_So tmp = (Phan_So)obj;
            return (this.ts*tmp.ms == this.ms*tmp.ts);
        }

        if((obj instanceof Integer)){
            Integer tmp = (Integer) obj;
            return tmp.equals(this.ts/this.ms);
        }

        if((obj instanceof Double)){
            Double tmp = (Double) obj;
            return (tmp == (double)(this.ts)/(double)(this.ms));
        }

        return false;
    }
    //ham dinh dang phan so thanh dang a/b
    public String Print(){
        return Integer.toString(this.ts) + "/" + Integer.toString(this.ms);
    }

    public static void main(String[] args){
        //int a, b;
        //Scanner scan = new Scanner();
        //a = scan(System.in);
        Phan_So ps = new Phan_So(5, 10);
        Phan_So ps1 = new Phan_So(7, 8);
        Phan_So ps2 = new Phan_So(6, 5);
        int a = 5;
        double b = 0.5;

//        ps.add(ps2).Print();
//        ps.subtract(ps2).Print();
//        ps.mutiply(ps2).Print();
//        ps.divide(ps2).Print();
        System.out.println(ps.Print() + " + " + ps2.Print() + " = " + ps.add(ps2).Print());
        System.out.println(ps.Print() + " - " + ps2.Print() + " = " + ps.subtract(ps2).Print());
        System.out.println(ps.Print() + " x " + ps2.Print() + " = " + ps.mutiply(ps2).Print());
        System.out.println(ps.Print() + " : " + ps2.Print() + " = " + ps.divide(ps2).Print());

        if(ps.equal(b))   System.out.println(ps.Print() + " and "+ b + " is equal ");
        else                System.out.println(ps.Print() + " and "+ b + " is not equal");


    }

}



