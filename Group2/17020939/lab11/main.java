import java.util.ArrayList;

class PhanSo implements Comparable<PhanSo>{
    //Cac thuoc tinh cua lop PhanSo
    private int tuSo;
    private int mauSo;

    //Cac phuong thuc get/get cua lop PhanSo
    public int getTuSo()
    {
        return tuSo;
    }
    public void setTuSo( int TS)
    {
        tuSo = TS;
    }
    public int getMauSo()
    {
        return mauSo;
    }
    public void setMauSo( int MS )
    {
        mauSo = MS;
    }


    //Ham khoi tao tham so cho lop phan so
    public PhanSo( int tuSo, int mauSo)
    {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }


    @Override
    public int compareTo(PhanSo o) {
        if( this.tuSo*o.mauSo - this.mauSo*o.tuSo > 0) {
            return 1;
        } else if( this.tuSo*o.mauSo - this.mauSo*o.tuSo < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}



public class main {
    //
    public static <T extends Comparable<T>> T max(ArrayList<T> arr) {
        T maxElement = arr.get(0);
        for( int i=1; i<arr.size(); i++) {
            if( arr.get(i).compareTo(maxElement) > 0) {
                maxElement = arr.get(i);
            }
        }
        return maxElement;
    }

    //
    public static <T extends Comparable<T>> void sort(ArrayList<T> arr) {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i).compareTo(arr.get(j)) > 0) {
                    T temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
    }

    //
    public static <T> void print(ArrayList<T> arr) {
        for( int i=0; i<arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //ki?u Integer
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(4);
        arr1.add(7);
        arr1.add(2);
        arr1.add(9);
        arr1.add(10);
        arr1.add(-3);
        System.out.print("M?ng chua du?c s?p x?p: ");
        print(arr1);
        System.out.println("GTLN c?a m?ng Integer: " + max(arr1));
        sort(arr1);
        System.out.print("M?ng sau khi du?c s?p x?p: ");
        print(arr1);
        System.out.println();

        //ki?u Double
        ArrayList<Double> arr2 = new ArrayList<>();
        arr2.add(2.3);
        arr2.add(1.0);
        arr2.add(3.5);
        arr2.add(7.0);
        arr2.add(9.4);
        arr2.add(10.5);
        arr2.add(0.3);
        arr2.add(-9.2);
        System.out.print("M?ng chua du?c s?p x?p: ");
        print(arr2);
        System.out.println("GTLN c?a m?ng Double: " + max(arr2));
        sort(arr2);
        System.out.print("M?ng sau khi du?c s?p x?p: ");
        print(arr2);
        System.out.println();

        //ki?u char
        ArrayList<Character> arr3 = new ArrayList<>();
        arr3.add('d');
        arr3.add('s');
        arr3.add('t');
        arr3.add('g');
        arr3.add('h');
        arr3.add('u');
        arr3.add('i');
        arr3.add('p');
        arr3.add('q');
        System.out.print("M?ng chua du?c s?p x?p: ");
        print(arr3);
        System.out.println("GTLN c?a m?ng Character: " + max(arr3));
        sort(arr3);
        System.out.print("M?ng sau khi du?c s?p x?p: ");
        print(arr3);
        System.out.println();

        //phân s?
        ArrayList<PhanSo> arr4 = new ArrayList<>();
        arr4.add(new PhanSo(3, 4));
        arr4.add(new PhanSo(1, 2));
        arr4.add(new PhanSo(0, 4));
        arr4.add(new PhanSo(6, 9));
        System.out.print("Chua s?p x?p: ");
        for( int i=0; i<arr4.size(); i++) {
            System.out.print(arr4.get(i).getTuSo() + "/" + arr4.get(i).getMauSo() + " ");
        }
        System.out.println();
        System.out.println("GTLN: " + max(arr4).getTuSo() + "/" + max(arr4).getMauSo());
        sort(arr4);
        System.out.print("Sau khi s?p x?p: ");
        for( int i=0; i<arr4.size(); i++) {
            System.out.print(arr4.get(i).getTuSo() + "/" + arr4.get(i).getMauSo() + " ");
        }
    }
}