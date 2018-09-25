// phan so
import java.util.*;
public class Phanso {
    private int ts;
    private int ms;
    public Phanso (int ts, int ms){
        this.ts=ts;
        this.ms=ms;
    }
    public int getTs(){
        return this.ts;
    }
    public  int getMs(){
        return this.ms;
    }
    public void setTs(int ts){
        this.ts=ts;
    }
    public  void setMs(int ms){
        this.ms=ms;
    }
    public int UCLN(int a, int b){
        while ((a != b)) {
            if(a<0) a=-a;
            if(b<0) b=-b;
            if(a>b){
                a-=b;
            }else {
                b-=a;
            }
        }
        return a;
    }

    public void toigianPhanso(){
        int n = UCLN(this.getTs(), this.getMs());
        this.setTs( this.getTs()/n);
        this.setMs( this.getMs()/n);
    }

    public void congPhanso( Phanso ps){
        int ts = this.getTs()*ps.getMs()+this.getMs()*ps.getTs();
        int  ms = this.getMs()*ps.getMs();
        Phanso pstong = new Phanso(ts, ms);
        pstong.toigianPhanso();
        System.out.println(pstong.getTs()+"/"+pstong.getMs());
    }
    public void truPhanso( Phanso ps){
        int ts = this.getTs()*ps.getMs()-this.getMs()*ps.getTs();
        int  ms = this.getMs()*ps.getMs();
        Phanso pshieu = new Phanso(ts, ms);
        pshieu.toigianPhanso();
        System.out.println(pshieu.getTs()+"/"+pshieu.getMs());

    }
    public void nhanPhanso(Phanso ps){
        int ts = this.getTs()*ps.getTs();
        int ms = this.getMs()*ps.getMs();
        Phanso pstich = new Phanso(ts,ms);
        pstich.toigianPhanso();
        System.out.println(pstich.getTs()+"/"+pstich.getMs());

    }
    public void chiaPhanso(Phanso ps){
        int ts = this.getTs()*ps.getMs();
        int ms = this.getMs()*ps.getTs();
        Phanso pschia = new Phanso(ts,ms);
        pschia.toigianPhanso();
        System.out.println(pschia.getTs()+"/"+pschia.getMs());

    }
    public boolean equals( Phanso ps2){
        int ts1 = this.getTs()*ps2.getMs();
        int ts2 = ps2.getTs()*this.getMs();
        if(ts1 == ts2){return  true;}
        else return false;
    }
    public static void main(String[] args) {

        Phanso ps = new Phanso(16, 4);

        Phanso ps2 = new Phanso(4, 8);

        System.out.println("Phan so: " + ps.ts + "/" + ps.ms);

        System.out.println("USCLN: " + ps.UCLN(ps.ts, ps.ms));

        ps.congPhanso(ps2);
        System.out.println(ps.equals(ps2));
    }

}
