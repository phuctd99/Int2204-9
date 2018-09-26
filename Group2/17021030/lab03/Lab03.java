package lab03;

public class Lab03 {
    
    
    public static void main(String[] args) {
        System.out.println("UCLN cua 91 va 35 la: " + Fibonaci_and_UCLN.UCLN(91, 35));
        System.out.println("So Fibo thu 7 la " + Fibonaci_and_UCLN.Fibonaci(7));
        PhanSo ps1 = new PhanSo(1, 3);
        PhanSo ps2 = new PhanSo(-4, 12);
        System.out.println("ps1 = " + ps1.getTuSo() + "/" + ps1.getMauSo());
        System.out.println("ps2 = " + ps2.getTuSo() + "/" + ps2.getMauSo());
        if (ps1.equals(ps2)) System.out.println("ps1 = ps2");
        else System.out.println("ps1 != ps2");
        System.out.print("ps1 + ps2 = ");
        System.out.println(ps1.congPhanSo(ps2).getTuSo() + "/" + ps1.congPhanSo(ps2).getMauSo());
        System.out.print("ps1 - ps2 = ");
        System.out.println(ps1.truPhanSo(ps2).getTuSo() + "/" + ps1.truPhanSo(ps2).getMauSo());
        System.out.print("ps1 * ps2 = ");
        System.out.println(ps1.nhanPhanSo(ps2).getTuSo() + "/" + ps1.nhanPhanSo(ps2).getMauSo());
        System.out.print("ps1 / ps2 = ");
        System.out.println(ps1.chiaPhanSo(ps2).getTuSo() + "/" + ps1.chiaPhanSo(ps2).getMauSo());
        
        
    }
    
}
