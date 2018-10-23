package Bai_tap;

public class Hinh_vuong extends Hinh_chu_nhat {

    public Hinh_vuong() {
    }

    public Hinh_vuong(Toa_do trongTam, String mau, Toa_do[] diem) {
        super(trongTam, mau, diem);
        this.ten = "hinh vuong";
    }

    @Override
    public void khoiTao() {
        super.khoiTao();
        if( chieuDai == chieuRong ) {
            System.out.println("ban da khoi tao mot hinh vuong ");
        } else {
            System.out.println("day khong phai hinh vuong ");
        }
    }


}
