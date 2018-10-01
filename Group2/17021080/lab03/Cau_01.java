package Bai_tap_tuan_03;

import java.util.Random;

public class Cau_01 {

    /*
    a. Vi t hàm tìm c s chung l n nh t c a 2 s nguyên a và b. In k t qu ra màn hình. ết các hàm sau và kiểm tra kết quả trong phương thức main ước s ố ớc s ất của 2 số nguyên a và b. In kết quả ra màn hình. ủa 2 số nguyên a và b. In kết quả ra màn hình. ố ết các hàm sau và kiểm tra kết quả trong phương thức main ả trong phương thức main
    b. Vi t hàm tính Fibonaxi c a m t s nguyên n, công th c nh sau:
     */
    public int ucln(int value1, int value2) // ham tinh UCLN
    {
        for(int i = value1; i >= 1; i--) {
            if( value1 % i == 0 && value2 % i == 0 ) return i;
        }
        return 1;
    }

    public int fibonaxi(int n) {
        if ( n == 0) return 0;
        else if ( n == 1) return 1;
        else return ( fibonaxi(n-1) + fibonaxi(n-2) );


    }

    public static void main(String[] args) {
        // test ham fibonaxi
        Cau_01 test = new Cau_01();
        for(int i = 0; i < 20 ; i++ ) {
            System.out.println( test.fibonaxi( i ) );
        }

        // test ham ucln
        Random random = new Random();
        int value1 = random.nextInt(100) +1;
        int value2 = random.nextInt(100) +1;
        System.out.println( "uoc chung lon nhat cua "+value1 + " va " + value2 + " la " + test.ucln(value1, value2));
    }
}
