
import java.util.Scanner;

public class Phanso{
    private int tuso;
    private int mauso;

    public void setPhanso(int tu, int mau) {
        this.tuso = tu;
        this.mauso = mau;
    }

    public void setTuso(int tuso) {
        this.tuso = tuso;
    }

    public void setMauso(int mauso) {
        this.mauso = mauso;
    }

    public int getTuso() {
        return tuso;
    }

    public int getMauso() {
        return mauso;
    }
    /* Tìm ước chung lớn nhất*/
    public int findUCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (a != b) {
            if (a > b) a = a - b;
            else b = b - a;
        }
        return a;

    }
    /* Tìm bội chung nhỏ nhất*/

    public int findBCNN(int a, int b) {
        int uc = a * b / findUCLN(a, b);
        return uc;
    }
    /* Hàm tối giản phân số */

    public void toigianPhanso() {
        int k = findUCLN(this.getTuso() , this.getMauso() );
        this.setTuso(this.getTuso() / k);
        this.setMauso(this.getMauso() / k);

    }

    /* Hàm công phân số*/

    public void congPhanso(Phanso ps2) {
        Phanso ps_tong = new Phanso();
        ps_tong.setTuso(this.getTuso() * ps2.getMauso() + this.getMauso() * ps2.getTuso());
        ps_tong.setMauso(this.getMauso() * ps2.getMauso());
        ps_tong.toigianPhanso();
        System.out.println(ps_tong.getTuso() + "/" + ps_tong.getMauso());
    }

    /* Hàm trừ phân số*/

    public void truPhanso(Phanso ps2) {
        Phanso ps_tru = new Phanso();
        ps_tru.setTuso((this.getTuso() * ps2.getMauso()) - (this.getMauso()*ps2.getTuso()));
        ps_tru.setMauso(this.getMauso() * ps2.getMauso());
        ps_tru.toigianPhanso();
        System.out.println(ps_tru.getTuso() + "/" + ps_tru.getMauso());
    }

    /* Hàm nhân phân số */

    public void nhanPhanso(Phanso ps2) {
        Phanso ps_tich = new Phanso();
        ps_tich.setPhanso(this.getTuso() * ps2.getTuso(), this.getMauso() * ps2.getMauso());
        ps_tich.toigianPhanso();
        System.out.println(ps_tich.getTuso() + "/" + ps_tich.getMauso());

    }

    /* Hàm chia phân số */

    public void chiaPhanso(Phanso ps2) {
        Phanso ps_thuong = new Phanso();
        ps_thuong.setPhanso(this.getTuso() * ps2.getMauso(), this.getMauso() * ps2.getTuso());
        ps_thuong.toigianPhanso();
        System.out.print(ps_thuong.getTuso() + "/" + ps_thuong.getMauso());

    }

    /* Hàm so sánh */

    public static boolean equals(Phanso ps1 , Phanso ps2){
        boolean kq = false;
        ps1.toigianPhanso();
        ps2.toigianPhanso();
        int k = ps2.getMauso() * ps1.getMauso();
        ps1.setTuso(k / ps1.getMauso() * ps1.getTuso());
        ps2.setTuso((k / ps2.getMauso() * ps2.getTuso()));
        if(ps1.getTuso() < ps2.getTuso())
            kq = true;
        return kq ;

    }
    public static void main(String args[]) {
        Phanso ps1 = new Phanso();
        ps1.setPhanso(1, 6);
        Phanso ps2 = new Phanso();
        ps2.setPhanso(2, 3);
        ps1.truPhanso(ps2);
        ps1.congPhanso(ps2);
        System.out.println(equals(ps1,ps2));



    }
}


