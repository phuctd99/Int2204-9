/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap5;

/**
 *
 * @author Hoang Vu Huong
 */
public class HoaQua {
        private String LoaiQua;
    private String Mui;
    private String Vi;
    private String XuatXu;
    private String NgayNhap;
    private float CanNang;

    public HoaQua(String LoaiQua, String Mui, String Vi, String XuatXu, String NgayNhap, float CanNang) {
        this.LoaiQua = LoaiQua;
        this.Mui = Mui;
        this.Vi = Vi;
        this.XuatXu = XuatXu;
        this.NgayNhap = NgayNhap;
        this.CanNang = CanNang;
    }

    public HoaQua() {
       this.LoaiQua = "";
        this.Mui = "";
        this.Vi = "";
        this.XuatXu = "";
        this.NgayNhap = "";
        this.CanNang = 0.0f;
    }

//    HoaQua() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public String getLoaiQua() {
        return LoaiQua;
    }

    public void setLoaiQua(String LoaiQua) {
        this.LoaiQua = LoaiQua;
    }

    public String getMui() {
        return Mui;
    }

    public void setMui(String Mui) {
        this.Mui = Mui;
    }

    public String getVi() {
        return Vi;
    }

    public void setVi(String Vi) {
        this.Vi = Vi;
    }

    public String getXuatXu() {
        return XuatXu;
    }

    public void setXuatXu(String XuatXu) {
        this.XuatXu = XuatXu;
    }

    public String getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(String NgayNhap) {
        this.NgayNhap = NgayNhap;
    }

    public float getCanNang() {
        return CanNang;
    }

    public void setCanNang(float CanNang) {
        this.CanNang = CanNang;
    }
    void Print(){
        System.out.println(LoaiQua);
        System.out.println(Mui);
        System.out.println(Vi);
        System.out.println(XuatXu);
        System.out.println(NgayNhap);
        System.out.println(CanNang);
    }
}
