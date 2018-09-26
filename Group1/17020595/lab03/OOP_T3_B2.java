package oop_t3_b2;

public class OOP_T3_B2 {
    public static void main(String[] args) {       
        PS ps = new PS();
        ps.setTuSo(2);
        ps.setMauSo(4);
        ps.Chia(1,4);
    }    
}
class PS{
    int tuSo,mauSo;
    public int getTuSo() {
        return tuSo;
    }
    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }
    public int getMauSo() {
        return mauSo;
    }
    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }
    public void Cong(int TS, int MS){
        if (MS == mauSo){
            tuSo +=TS;
        }
        else {
            tuSo = tuSo * MS + TS * mauSo;
            mauSo = mauSo * MS;
        }
        rutGon();
    }
    public void Tru(int TS,int MS){
        if (MS == mauSo){
            tuSo -=TS;
        }
        else {
            tuSo = tuSo * MS - TS * mauSo;
            mauSo = mauSo * MS;
        }
        rutGon();
    }
    public void Nhan(int TS,int MS){
        tuSo = tuSo * TS;
        mauSo = mauSo * MS;
        rutGon();
    }
    public void Chia(int TS, int MS){
        tuSo = tuSo * MS;
        mauSo = mauSo * TS;
        rutGon();
    }
    public void rutGon(){
        int x = UCLN(tuSo,mauSo);
        if (mauSo / x == 1 ){
            System.out.println(tuSo / x);
        }
        else System.out.println(tuSo/x + "/" + mauSo/x);      
    }
    public static int UCLN(int a, int b){
        if (b == 0) return a;
        else return  UCLN(b ,a % b);
    }
}
