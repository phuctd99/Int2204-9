public class QuaCam extends HoaQua {
    String nguonGoc;
    String vi;
    public QuaCam(){
        new HoaQua();
        nguonGoc = "";
        vi = "";
    }

    public void setNguongoc(String nguongoc) {
        this.nguonGoc = nguongoc;
    }
    public void setVi(String vi) {
        this.vi = vi;
    }public String getNguongoc() {
        return nguonGoc;
    }
    public String getVi() {
        return vi;
    }
}
