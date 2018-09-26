public class congTy {
    private String ten;
    private int namThanhLap;
    private String tongGiamDoc;
    private String nganhNgheKinhDoanh;

    public congTy()
    {
        ten = "";
        namThanhLap = 0;
        tongGiamDoc = "";
        nganhNgheKinhDoanh = "";
    }

    //Cac phuong thuc get/set

    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamThanhLap() {
        return namThanhLap;
    }
    public void setNamThanhLap(int namThanhLap) {
        this.namThanhLap = namThanhLap;
    }

    public String getTongGiamDoc() {
        return tongGiamDoc;
    }
    public void setTongGiamDoc(String tongGiamDoc) {
        this.tongGiamDoc = tongGiamDoc;
    }

    public String getNganhNgheKinhDoanh() {
        return nganhNgheKinhDoanh;
    }
    public void setNganhNgheKinhDoanh(String nganhNgheKinhDoanh) {
        this.nganhNgheKinhDoanh = nganhNgheKinhDoanh;
    }
}
