/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CCNE
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CCNE
 */
public class PS implements Comparable<PS>{
    int tuSo;
    int mauSo;

    public PS() {
        this.tuSo = 1;
        this.mauSo = 1;
    }

    public PS(int tu, int mau) {
        this.tuSo = tu;
        this.mauSo = mau;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    @Override
    public int compareTo(PS o) {
        if(this.tuSo*o.mauSo -this.mauSo*o.tuSo >0) return 1 ;
        else{
            if(this.tuSo*o.mauSo -this.mauSo*o.tuSo <0) return -1 ;
            else return 0 ;
        }
    } 
}
    