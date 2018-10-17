public class CamSanh extends QuaCam{
    private String mauQua;

    public CamSanh(){
        this.setKichThuoc("To");
        this.setLoaiQua("Cam Sành");
        mauQua = "màu xanh";
    }
    public String getMauQua() {
        return mauQua;
    }

    public void setMauQua(String mauQua) {
        this.mauQua = mauQua;
    }
    public void getInfo (){
        this.setVi("Ngọt");
        System.out.println("Loại quả "+ this.getLoaiQua());
        System.out.println("màu quả "+ this.getMauQua());
        System.out.println("Vị " + this.getVi());
    }
}
