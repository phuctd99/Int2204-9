abstract class Shape extends Layer {
    private String vitri;
    private double kichthuoc;
    private boolean dichuyen;
    private boolean tomau;

    public Shape(String vitri, double kichthuoc, boolean dichuyen, boolean tomau){
        this.vitri = vitri;
        this.kichthuoc = kichthuoc;
        this.dichuyen = dichuyen;
        this.tomau = tomau;
    }

    public String getVitri() {
        return vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }

    public double getKichthuoc() {
        return kichthuoc;
    }

    public void setKichthuoc(double kichthuoc) {
        this.kichthuoc = kichthuoc;
    }

    public boolean isDichuyen() {
        return dichuyen;
    }

    public void setDichuyen(boolean dichuyen) {
        this.dichuyen = dichuyen;
    }

    public boolean isTomau() {
        return tomau;
    }

    public void setTomau(boolean tomau) {
        this.tomau = tomau;
    }
}
