public class dienthoai {
    private int Hang;
    private int ram;

    public int getHang() {
        return Hang;
    }

    public void setHang(int hang) {
        Hang = hang;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
    public void getInfodt(){
        System.out.println(this.Hang);
        System.out.println(this.ram);
    }
}
