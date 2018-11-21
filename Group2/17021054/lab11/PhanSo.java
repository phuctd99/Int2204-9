public class PhanSo implements Comparable<PhanSo> {
    private int ts, ms;
    public PhanSo(int ts, int ms){
        this.ts = ts;
        this.ms = ms;
    }

    public void setMs(int ms) {
        this.ms = ms;
    }

    public void setTs(int ts) {
        this.ts = ts;
    }

    public int getMs() {
        return ms;
    }

    public int getTs() {
        return ts;
    }
    @Override
    public String toString() {
        return ts + "/" + ms;
    }

    @Override
    public int compareTo(PhanSo o) {
        int ts = this.ts * o.ms - this.ms * o.ts;
       // int ms = this.ms*o.ms;
        if(ts<0) return -1;
        else if(ts>0) return 1;
        else return 0;
    }


}
