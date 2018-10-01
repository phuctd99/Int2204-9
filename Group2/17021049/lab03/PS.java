import java.util.Scanner;

public class PS {
    private int tu, mau;

    //Ham khoi tao tham so cho lop PS

    public PS(int tu, int mau){
        this.tu = tu;
        this.mau = mau;
    }

    public void setTu(int tu){
        this.tu = tu;
    }
    public int getTu() {
        return this.tu;
    }
    public void setMau(int mau){
        this.mau = mau;
    }
    public int getMau(){
        return this.mau;
    }

    //Ham tinh uoc chung lon nhat cua 2 so

    public int UCLN(int a, int b){
        while (Math.abs(a) != Math.abs(b)){
            if(Math.abs(a) > Math.abs(b)) a = Math.abs(a) - Math.abs(b);
            else b = Math.abs(b) - Math.abs(a);
        }
        return a;
    }

    //Ham rut gon phan so

    public void rutGon(){
        int u = UCLN(getTu(),getMau());
        this.setTu(this.getTu()/u);
        this.setMau(this.getMau()/u);
    }

    //Ham cong 2 phan so

    public void congPS(PS ps){
        int t = this.getTu() * ps.getMau() + this.getMau() * ps.getTu();
        int m = this.getMau() * ps.getMau();
        PS k = new PS(t, m);
        k.rutGon();
        if(t==m) System.out.println("Ket qua Chia 2 phan so : " + t/m);
        else if(t*m > 0) System.out.println("Ket qua Cong 2 phan so : " + Math.abs(k.tu) + "/" + Math.abs(k.mau));
        else System.out.println("Ket qua Cong 2 phan so : " + -Math.abs(k.tu) + "/" + Math.abs(k.mau));
    }

    //Ham tru 2 phan so

    public void truPS(PS ps){
        int t = this.getTu() * ps.getMau() - this.getMau() * ps.getTu();
        int m = this.getMau() * ps.getMau();
        if(t==0) System.out.println("Ket qua Tru 2 phan so : " + t);
        else {
            PS k = new PS(t, m);
            k.rutGon();
            if(t==m) System.out.println("Ket qua Chia 2 phan so : " + t/m);
            else if (t * m > 0) System.out.println("Ket qua Tru 2 phan so : " + Math.abs(k.tu) + "/" + Math.abs(k.mau));
            else System.out.println("Ket qua Tru 2 phan so : " + -Math.abs(k.tu) + "/" + Math.abs(k.mau));
        }
    }

    //Ham nhan 2 phan so

    public void nhanPS(PS ps){
        int t = this.getTu() * ps.getTu();
        int m = this.getMau() * ps.getMau();
        PS k = new PS(t, m);
        k.rutGon();
        if(t==m) System.out.println("Ket qua Chia 2 phan so : " + t/m);
        else if(t*m > 0) System.out.println("Ket qua Nhan 2 phan so : " + Math.abs(k.tu) + "/" + Math.abs(k.mau));
        else System.out.println("Ket qua Nhan 2 phan so : " + -Math.abs(k.tu) + "/" + Math.abs(k.mau));
    }

    //Ham chia 2 phan so

    public void chiaPS(PS ps){
        int t = this.getTu() * ps.getMau();
        int m = this.getMau() * ps.getTu();
        PS k = new PS(t, m);
        k.rutGon();
        if(t==m) System.out.println("Ket qua Chia 2 phan so : " + t/m);
        else if(t*m > 0) System.out.println("Ket qua Chia 2 phan so : " + Math.abs(k.tu) + "/" + Math.abs(k.mau));
        else System.out.println("Ket qua Chia 2 phan so : " + -Math.abs(k.tu) + "/" + Math.abs(k.mau));
    }

    //Ham so sanh 2 phan so

    public boolean equals(PS obj){
      return (this.getTu()*obj.getMau()-this.getMau()*obj.getTu()== 0);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap phan so thu nhat : ");
        int t1 = sc.nextInt();
        int m1 = sc.nextInt();
        PS ps1 = new PS(t1,m1);
        System.out.print("Nhap phan so thu hai : ");
        int t2 = sc.nextInt();
        int m2 = sc.nextInt();
        PS ps2 = new PS(t2,m2);

        ps1.congPS(ps2);
        ps1.truPS(ps2);
        ps1.nhanPS(ps2);
        ps1.chiaPS(ps2);

        if(ps1.equals(ps2) == true) System.out.println("True");
        else System.out.println("Flase");
    }
}
