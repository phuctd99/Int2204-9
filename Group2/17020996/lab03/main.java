public class main {
    public static void main(String[] args) {
        phepToan test = new phepToan();
        System.out.println(test.UCLN(-24,30));
        System.out.println(test.F(5));
        phanSo a = new phanSo(1,2);
        phanSo b = new phanSo(2,3);
        phanSo c = new phanSo();
        c=a.cong(b);
        c.inPS();
        c=a.tru(b);
        c.inPS();
        c=a.nhan(b);
        c.inPS();
        c=a.chia(b);
        c.inPS();
        /* sau mỗi phép toán giá trị của a thay đổi do các phương thức cong, tru, nhan, chia tác động trực tiếp vào các thuộc tính của a */
        /* để tường minh hơn mỗi lần run chỉ test 1 phép toán của lớp phanSo */
        System.out.println(a.equals(b));
    }
}
