package com.company;

public class PS {
    int ucln(int a, int b) { // hàm tìm ước chung lớn nhất
        a = a > 0 ? a : - a;
        b = b > 0 ? b : - b;
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                if (a < b) {
                    b = b - a;
                }
            }
        }
        return a;
    }
    private int ts;
    private int ms;
    public PS() { // hàm khởi tạo không tham số
        this.ts = 0;
        this.ms = 1;
        compact();
    }
    public PS(int ts, int ms) { // hàm khởi tạo có tham số
        this.ts = ts;
        this.ms = ms;
        compact();
    }
    public int getTs() {
        return this.ts;
    }
    public int getMs() {
        return this.ms;
    }
    public void setTs(int t) {
        this.ts = t;
    }
    public void setMs(int m) {
        this.ms = m;
    }
    public String toString() {
        return this.ts + "/" + this.ms;
    }


    public void compact() { // hàm tối giản phân sóo
        int gcd = ucln(this.ts, this.ms);
        this.ts /= gcd;
        this.ms /= gcd;
        if (this.ms < 0) {
            this.ms *= -1;
            this.ts *= -1;
        }
    }

    public PS plus(PS p) { //hàm cộng phân số
        int ts = this.ts, ms = this.ms;
        this.ts = ts * p.ms + ms * p.ts;
        this.ms = ms * p.ms;
        compact();
        return this;
    }
    public PS subtract(PS p) { //hàm trừ phân số
        int ts = this.ts, ms = this.ms;
        this.ts = ts * p.ms - ms * p.ts;
        this.ms = ms * p.ms;
        compact();
        return this;
    }
    public PS multi(PS p) { //hàm nhân phân số
        this.ts *= p.ts;
        this.ms *= p.ms;
        compact();
        return this;
    }
    public PS div(PS p) {  // hàm chia phân số
        this.ts *= p.ms;
        this.ms *= p.ts;
        compact();
        return this;
    }
    public boolean equals(Object obj) {//hàm so sánh hai phân số
        if ((obj instanceof PS)) {
            PS o = (PS)obj;
            return (double)(this.ts)/(double)(this.ms) == (double)o.ts/(double)o.ms;
        }
        if (obj instanceof Integer) {
            Integer o = (Integer)obj;
            return o.equals((int)this.ts/this.ms);
        }
        if (obj instanceof Double) {
            Double o = (Double)obj;
            return obj.equals((double)(this.ts)/(double)(this.ms));
        }
        return false;
    }
}

