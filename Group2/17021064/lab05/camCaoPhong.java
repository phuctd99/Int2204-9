public class camCaoPhong extends quaCam {
    private String muiVi;
    //set/getter
    public String getMuiVi() {
        return muiVi;
    }

    public void setMoTa(String muiVi) {
        this.muiVi = muiVi;
    }
    //hàm khởi tạo
    public void inThongTin(){
        super.inThongTin();
        System.out.println("Mùi vị của quả cam : " + this.muiVi);
    }
}
