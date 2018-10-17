package com.company;

public class Main {
    public static void main(String[] args) {
        HoaQua qua1 = new HoaQua("Mít", 10, "Ha Noi", "03/12/1999");
        System.out.println(qua1);
        QuaCam cam1 = new QuaCam(15, "Lang Son", "15/11/1999");
        System.out.println(cam1);
        CamCaoPhong camCaoPhong1 = new CamCaoPhong(5, "Ha Tay", "26/03/1999");
        System.out.println(camCaoPhong1);
        CamSanh camSanh1 = new CamSanh(100, "Hai Phong", "11/11/1999");
        System.out.println(camSanh1);
    }
}
