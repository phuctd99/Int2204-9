public class SinhVien {
    private String hoTen;
    private float diem;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }
    
    public void inThanhTich(){
        if(this.diem <= 5){
            System.out.println("Trung binh");
        }
        if(this.diem > 5 && this.diem <8){
            System.out.println("Kha");
        }
        if(this.diem >=8 ){
            System.out.println("Gioi");
        }
    }
    
}
