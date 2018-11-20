package com.company;

public class PS implements Comparable<PS> {
    private int ts,ms;
    public PS(int t, int m){
        this.ms=m;
        this.ts=t;
    }

    @Override
    public int compareTo(PS o) {
        int tu=this.ts*o.ms - this.ms*o.ts;
        int mau=this.ms * o.ms;
        return tu*mau;
    }

    @Override
    public String toString() {
        return ts  + "/" + ms;
    }
}
