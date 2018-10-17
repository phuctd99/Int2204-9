package Bai_tap_tuan_05;

import java.util.Date;

public class QuaCam extends HoaQua {
    private String doChua;

    public QuaCam() {
    }

    public QuaCam(String doChua) {
        this.doChua = doChua;
    }

    public QuaCam(int giaBan, String nguonGoc, int soLuongKg, String ngayNhap, String doChua) {
        super(giaBan, nguonGoc, soLuongKg, ngayNhap);
        this.doChua = doChua;
    }

    public String getDoChua() {
        return doChua;
    }

    public void setDoChua(String doChua) {
        this.doChua = doChua;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("do chua : " + doChua + "\n");
    }

    @Override
    public int sumMoney() {
        if (super.sumMoney() > 10000000) System.out.println("da nhap voi so tien lon");
        else System.out.println("so tien khong lon lawm");
        return super.sumMoney();
    }


}
