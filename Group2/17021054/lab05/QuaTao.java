public class QuaTao extends HoaQua {
    private int loaiHAng;

    public QuaTao(){
        new HoaQua();
        loaiHAng = 0;
    }
    public void setLoai(int loai) {
        this.loaiHAng = loai;
    }

    public int getLoai() {
        return loaiHAng;
    }
    public void tinhGiatien() {
        double giaban;
        if(loaiHAng == 1) {
            giaban = (getGia()+2000)*getSoCan();
        }
        else {
            giaban = getGia()*getSoCan();
        }
        System.out.println("Số tiền táo loại "+loaiHAng+ " là "+giaban);
    }

}
