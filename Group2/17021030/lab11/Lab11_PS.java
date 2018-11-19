package lab11_ps;

import java.util.ArrayList;

public class Lab11_PS {
    
    public static <T extends Comparable<T>> T findMax(ArrayList<T> al) {
        int size = al.size();
        T maxElement = al.get(0);
        for (int i = 1; i < size; i++) {
            if (al.get(i).compareTo(maxElement) > 0) {
                maxElement = al.get(i);
            }
        }
        return maxElement;
    }
    
    public static <T extends Comparable<T>> void selectionSort(ArrayList<T> al) {
        int size = al.size();
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            T minValue = al.get(i);
            for (int j = i + 1; j < size; j++) {
                if (al.get(j).compareTo(al.get(minIndex)) < 0) {
                    minIndex = j;
                    minValue = al.get(j);
                }
            }
            // trao doi
            T tmp = al.get(i);
            al.set(i, al.get(minIndex));
            al.set(minIndex, tmp);
        }
    }
    
    public static <T> void print(ArrayList<T> al) {
        for (T ele: al) {
            System.out.print(ele.toString() + "     ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Phan so
        ArrayList<PhanSo> PS_al = new ArrayList<PhanSo>();
        PS_al.add(new PhanSo(1, 3));
        PS_al.add(new PhanSo(1, 2));
        PS_al.add(new PhanSo(11, 12));
        PS_al.add(new PhanSo(1, 6));
        PS_al.add(new PhanSo(2, 3));
        PS_al.add(new PhanSo(5, 6));
        PS_al.add(new PhanSo(1, 4));
        System.out.println("In ra cac phan so:");
        print(PS_al);
        System.out.println("Phan so lon nhat: " + findMax(PS_al));
        System.out.println("Sap xep cac phan so theo thu tu tang dan va in ra:");
        selectionSort(PS_al);
        print(PS_al);
    }
    
}

class PhanSo implements Comparable<PhanSo> {
    private int tu;
    private int mau;

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public PhanSo() {
        tu = 0;
        mau = 1;
    }
    
    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    @Override
    public int compareTo(PhanSo o) {
        return (this.tu*o.mau - this.mau*o.tu);
    }
    
    @Override
    public String toString() {
        return this.tu + "/" + this.mau;
    }
    
}
