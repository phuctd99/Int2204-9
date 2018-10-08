public class CamCaoPhong extends QuaCam {
    public CamCaoPhong(){
        this.setLoaiQua("Cam Cao Phong");
        this.setNguongoc("Cao Phong");
    }
    public void getInfo (){
        this.setVi("Ngọt");
        System.out.println("Loại quả "+ this.getLoaiQua());
        System.out.println("Nguồn gốc"+ this.getNguongoc());
        System.out.println("Vị " + this.getVi());
        System.out.println("Giá tiền " +this.getGia()+"/kg");
    }
}
