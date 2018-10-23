package Bai_tap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Layer layer = new Layer();
        System.out.println("Quy uoc : 1 la hinh tron \n" +
                           "          2 la hinh vuong \n "+
                           "          3 la hinh chu nhat \n" +
                           "          4 la hinh tam giac "  );
        System.out.println();
        System.out.print ("Nhap vao so luong hinh ban muon tao : ");
        int size = scanner.nextInt();

        for (int i=0; i<size; i++) {
            System.out.println("ban muong tao hinh gi : ");
            String chose = scanner.next() ;
            if (chose.equalsIgnoreCase("1")) {
                Hinh_tron hinh_tron = new Hinh_tron ();
                hinh_tron.khoiTao();
                layer.add( hinh_tron);
            } else if ( chose.equalsIgnoreCase("2")) {
                Hinh_vuong hinh_vuong = new Hinh_vuong();
                hinh_vuong.khoiTao();
                layer.add( hinh_vuong);
            } else if ( chose.equalsIgnoreCase("3")) {
                Hinh_chu_nhat hinh_chu_nhat = new Hinh_chu_nhat();
                hinh_chu_nhat.khoiTao();
                layer.add( hinh_chu_nhat);
            } else if ( chose.equalsIgnoreCase("4")) {
                Hinh_tam_giac hinh_tam_giac = new Hinh_tam_giac();
                hinh_tam_giac.khoiTao();
                layer.add(hinh_tam_giac);
            }

        }

        layer.reset();      // xoa cac hinh trung nhau


        // int ra thong tin cua layer
        for (int i=0 ; i<layer.getCount(); i++) {
            layer.get(i ).inThongTin();
        }


    }


}
