package Bai_tap_tuan_05;

public class Test_tuan_5 {
    public static void main(String[] args) {
        QuaCam cam = new QuaCam(10000,"thai binh",100,
                "26/09/2-18","ko");

        int money = cam.sumMoney();
        System.out.println(money);
    }
}
