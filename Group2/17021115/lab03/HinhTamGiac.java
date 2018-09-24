public class HinhTamGiac {
    public double canh1;
    public double canh2;
    public double canh3;

    public double getCanh1() {
        return canh1;
    }

    public void setCanh1(double canh1) {
        this.canh1 = canh1;
    }

    public double getCanh2() {
        return canh2;
    }

    public void setCanh2(double canh2) {
        this.canh2 = canh2;
    }

    public double getCanh3() {
        return canh3;
    }

    public void setCanh3(double canh3) {
        this.canh3 = canh3;
    }
    
    public double tinhChuVi(){
        return this.canh1 + this.canh2 + this.canh3;
    }
}
