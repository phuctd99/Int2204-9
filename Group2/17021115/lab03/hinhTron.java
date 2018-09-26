
public class hinhTron {
    private double banKinh;

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }
    
    public double tinhDienTich(){
        double dienTich = Math.PI * this.banKinh * this.banKinh;
        return dienTich;
    }
    public double tinhChuVi(){
        double chuVi = Math.PI * 2 * this.banKinh;
        return chuVi;
    }
}
