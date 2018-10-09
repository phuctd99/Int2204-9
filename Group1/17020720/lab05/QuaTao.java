package KeThua_Final;

public class QuaTao extends HoaQua {// ke thua lop HoaQua
    private String mauSac, muiVi;

    public QuaTao(String nguonGoc, String giaCa, String ngayNhap, String soLuong, String mauSac, String muiVi) {
        super(nguonGoc, giaCa, ngayNhap, soLuong);
        this.mauSac = mauSac;
        this.muiVi = muiVi;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getMuiVi() {
        return muiVi;
    }

    public void setMuiVi(String muiVi) {
        this.muiVi = muiVi;
    }

    public void getPrintQuaTao(){
        System.out.println("Dac trung: " + mauSac + ", " + muiVi);
    }
}
