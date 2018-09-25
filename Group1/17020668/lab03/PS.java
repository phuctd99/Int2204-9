package phanso;

public class PS {
    private int ts, ms;

    public PS(int a, int b){//khai báo tương tự
        this.ts = a;
        this.ms = b;
    }

    public PS(){    //khai báo không khởi tạo
        this.ts = 0;
        this.ms = 1;
    }

    public void setTs(int ts) {
        this.ts = ts;
    }

    public void setMs(int ms) {
        this.ms = ms;
    }

    public int getTs() {
        return ts;
    }

    public int getMs() {

        return ms;
    }

    public PS toigian(){
        int absA = Math.abs(this.getTs());// từ line 9 - 16 tìm UCLN của ts và ms
        int absB = Math.abs(this.getMs());
        while (absA != absB) {
            if (absA > absB)
                absA = absA - absB;
            else
                absB = absB - absA;
        }

        this.setMs(this.getMs() / absA);
        this.setTs(this.getTs() / absA);

        return (this);
    }

    public PS congps(PS ps2){ // tính tổng hai ps
        this.setTs(this.getTs() * ps2.getMs() + ps2.getTs() * this.getMs());
        this.setMs(this.getMs() * ps2.getMs());

        this.toigian();

        return (this);
    }

    public PS trups(PS ps2){ // tính tổng hai ps
        this.setTs(this.getTs() * ps2.getMs() - ps2.getTs() * this.getMs());
        this.setMs(this.getMs() * ps2.getMs());

        this.toigian();

        return (this);
    }


    public PS nhanps(PS ps2){
        this.setTs(this.getTs() * ps2.getTs());
        this.setMs(this.getMs() * ps2.getMs());

        this.toigian();

        return this;
    } // tính tích hai phân số

    public PS chiaps(PS ps2){
        this.setTs(this.getTs() * ps2.getMs());
        this.setMs(this.getMs() * ps2.getTs());

        this.toigian();

        return this;
    } // tính thương hai phân số

    public boolean equals(PS ps2){      //so sánh hai phân số
        this.setTs(this.getTs() * ps2.getMs());
        ps2.setTs(ps2.getTs() * this.getMs());

        if (this.getTs() == ps2.getMs()) return true;
        else return false;
    }

    public void inps(){ //in phân số dưới dạng ts/ms
        System.out.println(this.getTs() + "/" + this.getMs());
    }

    public static void main(String args[]){
        PS ps1 = new PS(3, 4);
        PS ps2 = new PS(1, 8);
        ps1.congps(ps2).inps();

    }
}
