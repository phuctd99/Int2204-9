
import java.util.Scanner;

public class PhanSo {
    int tuso;
    int mauso;
    PhanSo(){}

    PhanSo(int tuso, int mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
    }
    int ucln(int a, int b)
    {
        if(b==0)
            return a;
        else return ucln(b,a%b);
    }
    PhanSo Add(PhanSo ps1, PhanSo ps2)
    {
        PhanSo ps3 = new PhanSo();
        ps3.tuso = ps1.tuso*ps2.mauso + ps2.tuso*ps1.mauso;
        ps3.mauso = ps1.mauso * ps2.mauso;
        int uc = ucln(ps3.tuso, ps3.mauso);
        ps3.tuso /= uc;
        ps3.mauso /= uc;
        return ps3;

    }
    PhanSo Subtrac(PhanSo ps1, PhanSo ps2)
    {
        PhanSo ps3 = new PhanSo();
        ps3.tuso = ps1.tuso*ps2.mauso - ps2.tuso*ps1.mauso;
        ps3.mauso = ps1.mauso * ps2.mauso;
        int uc = ucln(ps3.tuso, ps3.mauso);
        ps3.tuso /= uc;
        ps3.mauso /= uc;
        return ps3;
    }


    PhanSo Multipli(PhanSo ps1, PhanSo ps2)
    {
        PhanSo ps3 = new PhanSo();
        ps3.tuso = ps1.tuso*ps2.tuso;
        ps3.mauso = ps1.mauso * ps2.mauso;
        int uc = ucln(ps3.tuso, ps3.mauso);
        ps3.tuso /= uc;
        ps3.mauso /= uc;
       return ps3;
    }

    PhanSo Divi(PhanSo ps1, PhanSo ps2)
    {
        PhanSo ps3 = new PhanSo();
        ps3.tuso = ps1.tuso*ps2.mauso;
        ps3.mauso = ps1.mauso * ps2.tuso;
        int uc = ucln(ps3.tuso, ps3.mauso);
        ps3.tuso /= uc;
        ps3.mauso /= uc;
        return ps3;
    }
     public boolean equals(PhanSo ps)
    {
        int a = this.tuso * ps.mauso - this.mauso*ps.tuso;
        if(a < 0)
            return false;
        else
            return false;
    }
    public static void main(String[] args)
   {

            Scanner scanner = new Scanner(System.in);
       System.out.print("Nhap tu so phan so thu 1:");
            int tuso1 = scanner.nextInt();
       System.out.print("Nhap mau so phan so thu 1:");
            int mauso1 = scanner.nextInt();
            PhanSo PS1 = new PhanSo(tuso1, mauso1);
       System.out.print("Nhap tu so phan so thu 2:");
           int tuso2 = scanner.nextInt();
       System.out.print("Nhap mau so phan so thu 2:");
           int mauso2 = scanner.nextInt();
           PhanSo PS2 = new PhanSo(tuso2, mauso2);

            PhanSo PS3 = new PhanSo();

            PS3 = PS3.Add(PS1, PS2);
            System.out.print("Tong hai phan so: ");
       if(PS3.tuso == PS3.mauso)
           System.out.println(PS3.tuso );
       else
       System.out.println(PS3.tuso + "/" + PS3.mauso);

           PS3 = PS3.Subtrac(PS1, PS2);
       System.out.print("Hieu hai phan so: ");
       if(PS3.tuso == PS3.mauso)
           System.out.println(PS3.tuso );
       else
       System.out.println(PS3.tuso + "/" + PS3.mauso);

       PS3 = PS3.Multipli(PS1, PS2);
       System.out.print("Tich hai phan so: ");
       if(PS3.tuso == PS3.mauso)
           System.out.println(PS3.tuso );
       else
       System.out.println(PS3.tuso + "/" + PS3.mauso);

       PS3 = PS3.Divi(PS1, PS2);
       System.out.print("Thuong hai phan so: ");
       if(PS3.tuso == PS3.mauso)
       System.out.println(PS3.tuso );
       else System.out.println(PS3.tuso + "/" + PS3.mauso);

           
       if(PS2.equals(PS1))
       System.out.print("Bang nhau");
       else System.out.print("Khong Bang nhau");
   }

}