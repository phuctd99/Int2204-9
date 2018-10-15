public class CamSanh extends  QuaCam {
    private String mauQua;
    public CamSanh(){
        mauQua = " mau xanh";
        this.setLoaiQua("Cam Sanh");
        this.setVi(" chua");
    }

    public void setMauQua(String mauQua) {
        this.mauQua = mauQua;
    }
    public String getMauQua() {
        return mauQua;
    }
    public void getInfo (){
        System.out.println("Loại quả :"+ this.getLoaiQua());
        System.out.println("màu quả :"+ this.getMauQua());
        System.out.println("Vị: " + this.getVi());
        System.out.println("Giá: "+ this.getGia());
    }
}
