public class PhanSo implements Comparable<PhanSo>{
    private int tu;
    private int mau;
    public  PhanSo(int t, int m){
        this.tu = t;
        this.mau = m;
    }
    @Override
    public int compareTo(PhanSo o) {
        int c = this.tu * o.mau - this.mau * o.tu;
        return c;
    }
    @Override
    public String toString(){
        return this.tu +"/" +this.mau;
    }
    
}
