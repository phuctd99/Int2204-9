public class hocsinh {
    private String name;
    private int tuoi;
    private String Mssv;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getMssv() {
        return Mssv;
    }

    public void setMssv(String mssv) {
        Mssv = mssv;
    }
    public  void getInforsv(){
        System.out.println(this.name);
        System.out.println(this.tuoi);
        System.out.println((this.Mssv));
    }
}
