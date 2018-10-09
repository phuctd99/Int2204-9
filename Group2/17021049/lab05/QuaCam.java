package bai1;

public class QuaCam extends HoaQua {
    protected String vi;

    //Ham khoi tao lop QuaCam

    public QuaCam(int gia, int soLuong, String xuatXu, String vi) {
        super(gia, soLuong, xuatXu);
        this.vi = vi;
    }

    public void setVi(String vi) {
        this.vi = vi;
    }

    public String getVi() {
        return this.vi;
    }

    public void getDeTail() {
        super.getDeTail();
        System.out.println("Vi : " + this.getVi());
    }

}
