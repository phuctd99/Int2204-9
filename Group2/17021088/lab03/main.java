public class main {
    public static void main(String[] args) {
        lab3 thu = new lab3();
        System.out.println(thu.UCLN(5,15));
        System.out.println(thu.F(3));
        phanSo a = new phanSo(2,3);
        phanSo b = new phanSo(1,3);
        phanSo c = new phanSo();
        c=a.cong(b);
        c.inPS();
        c=a.tru(b);
        c.inPS();
        c=a.nhan(b);
        c.inPS();
        c=a.chia(b);
        c.inPS();
    }
}
