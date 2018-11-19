public class phanSo  implements Comparable<phanSo>{
    private int tuso, mauso;
    public phanSo(int tuso, int mauso){
        this.tuso=tuso;
        this.mauso=mauso;
    }

    public void inPS(){
        System.out.println(this.tuso + "/" + this.mauso);
    }
    @Override
    public int compareTo(phanSo o){
        if (this.tuso*o.mauso < o.tuso*this.mauso) return -1;
        if (this.tuso*o.mauso > o.tuso*this.mauso) return 1;
        return 0;
    }
}