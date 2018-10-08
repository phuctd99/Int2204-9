package Bai_tap_tuan_05;

public class hamMain {
    public static void main(String[] args) {
        HoaQua quaGi = new HoaQua(12000, "thai binh",100 ,"20/11" );

        QuaCam cam = new QuaCam(10000,"viet nam",100, "20/10","ngot lam");


        Rectangle hcn = new Rectangle("red", true, 10, 15);
        System.out.println(hcn.toString());
    }
}
