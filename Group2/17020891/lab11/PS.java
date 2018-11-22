package com.company;

public class PS implements Comparable<PS>{
    int ts;
    int ms;

    @Override
    public int compareTo(PS o) {
        int tsSub = this.ts * o.ms - o.ts * this.ms;
        int msSub = this.ms * o.ms;
        return tsSub * msSub;
    }

    public PS(int ts, int ms) {
        this.ts = ts;
        this.ms = ms;
    }

    @Override
    public String toString() {
        return ts + "/" + ms;
    }
}