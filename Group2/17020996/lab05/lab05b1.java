
class hoaQua{
    protected int gia, soLg;
    protected String ngayNhap, xuatXu;

    public int getSoLg() {
            return soLg;
    }

    public int getGia() {
            return gia;
    }

    public String getXuatXu() {
            return xuatXu;
    }

    public String getNgayNhap() {
            return ngayNhap;
    }

    public void setSoLg(int soLg) {
            this.soLg = soLg;
    }

    public void setGia(int gia) {
            this.gia = gia;
    }

    public void setXuatXu(String xuatXu) {
            this.xuatXu = xuatXu;
    }

    public void setNgayNhap(String ngayNhap) {
            this.ngayNhap = ngayNhap;
    }
}
class quaTao extends hoaQua{

    protected String loaiTao;

    public String getLoaiTao() {
        return loaiTao;
    }

    public void setLoaiTao(String loaiTao) {
        this.loaiTao = loaiTao;
    }
}

class quaCam extends hoaQua{

    protected boolean ngotHayChua; //ngọt = true, chua =  false

    public boolean isNgotHayChua() {
        return ngotHayChua;
    }

    public void setNgotHayChua(boolean ngotHayChua) {
        this.ngotHayChua = ngotHayChua;
    }
}

class camSanh extends quaCam{

    protected String vo; //cam sành vỏ màu xanh lá

    public String getMauVo() {
        return vo;
    }

    public void setMauVo(String mauVo) {
        this.vo = mauVo;
    }
}

class camCaoPhong extends quaCam{

    protected String vo; //cam Cao Phong vỏ màu vàng

    public String getMauVo() {
        return vo;
    }

    public void setMauVo(String mauVo) {
        this.vo = mauVo;
    }
}

public class lab05b1 {
        public static void main(String[] args){
            hoaQua hq = new hoaQua();
            quaTao qt = new quaTao();
            quaCam qc = new quaCam();
            camSanh cs = new camSanh();
            camCaoPhong ccp = new camCaoPhong();
        }
}
