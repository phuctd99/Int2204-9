public class CamCaoPhong extends QuaCam {
    private String NguonGoc;

    public CamCaoPhong(){
        this.setLoaiQua("Cam Cao Phong");
        NguonGoc = "Cao Phong";
    }

    public String getNguonGoc() {
        return NguonGoc;
    }

    public void setNguonGoc(String nguonGoc) {
        NguonGoc = nguonGoc;
    }
    public void getInfo (){
        this.setVi("Ngọt");
        System.out.println("Loại quả "+ this.getLoaiQua());
        System.out.println("Nguồn gốc"+ this.getNguonGoc());
        System.out.println("Vị " + this.getVi());
    }
}
