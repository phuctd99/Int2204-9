package lab11;

import java.util.ArrayList;


public class Lab11 {

    // phuong thuc tim so lon nhat trong ArrayList cac kieu nguyen thuy
    public static <T extends Comparable<T>> T findMax(ArrayList<T> al) {
        int size = al.size();
        T maxElement = al.get(0);
        for (int i = 1; i < size; i++) {
            if (al.get(i).compareTo(maxElement) > 0) {
                // neu nhu de la al.get(i).compareTo(maxElement) == 1
                // thi se bi sai khi findMax voi kieu char
                maxElement = al.get(i);
            }
        }
        return maxElement;
    }
    
    // phuong thuc sap xep tong quat cho cac kieu nguyen thuy
    // su dung Selection Sort
    public static <T extends Comparable<T>> void selectionSort(ArrayList<T> al) {
        int size = al.size();
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            T minValue = al.get(i);
            for (int j = i + 1; j < size; j++) {
                if (al.get(j).compareTo(al.get(minIndex)) < 0) {
                    // neu nhu de la al.get(j).compareTo(al.get(minIndex)) == -1
                    // thi se bi sai khi sap xep voi kieu char
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
    
    // phuong thuc in ra
    public static <T> void print(ArrayList<T> al) {
        for (T ele: al) {
            System.out.print(ele + "     ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        // Integer
        System.out.println("ArrayList of Integer");
        ArrayList<Integer> Int_Al = new ArrayList<Integer>();
        Int_Al.add(-37259);
        Int_Al.add(-575927);
        Int_Al.add(62876);
        Int_Al.add(4878002);
        Int_Al.add(1017);
        Int_Al.add(798);
        System.out.print("In ra day: ");
        print(Int_Al);
        System.out.println("So lon nhat trong List la: " + findMax(Int_Al));
        selectionSort(Int_Al);
        System.out.print("Sau khi sap xep: ");
        print(Int_Al);
        
        // Long
        System.out.println("\nArrayList of Long");
        ArrayList<Long> Long_Al = new ArrayList<Long>();
        Long_Al.add(5000000000L);
        Long_Al.add(1295729L);
        Long_Al.add(927947982917L);
        Long_Al.add(-177141749L);
        Long_Al.add(-78987862L);
        Long_Al.add(-2874972L);
        System.out.print("In ra day: ");
        print(Long_Al);
        System.out.println("So lon nhat trong List la: " + findMax(Long_Al));
        selectionSort(Long_Al);
        System.out.print("Sau khi sap xep: ");
        print(Long_Al);
        
        // Char
        System.out.println("\nArrayList of Character");
        ArrayList<Character> Char_Al = new ArrayList<Character>();
        Char_Al.add('t');
        Char_Al.add('y');
        Char_Al.add('r');
        Char_Al.add('i');
        Char_Al.add('b');
        Char_Al.add('z');
        Char_Al.add('o');
        System.out.print("In ra day: \t");
        print(Char_Al);
        System.out.println("So lon nhat trong List la: " + findMax(Char_Al));
        selectionSort(Char_Al);
        System.out.print("Sau khi sap xep: ");
        print(Char_Al);
        
        // Byte
        System.out.println("\nArrayList of Byte");
        ArrayList<Byte> Byte_Al = new ArrayList<Byte>();
        byte[] byte_arr = {-127, -58, 30, 127, -84, 7, 120, 69, 10, 24};
        for (int i = 0; i < byte_arr.length; i++) {
            Byte_Al.add(byte_arr[i]);
        }
        System.out.print("In ra day: ");
        print(Byte_Al);
        System.out.println("So lon nhat trong List la: " + findMax(Byte_Al));
        selectionSort(Byte_Al);
        System.out.print("Sau khi sap xep: ");
        print(Byte_Al);
        
        // Short
        System.out.println("\nArrayList of Short");
        ArrayList<Short> Short_Al = new ArrayList<Short>();
        short[] short_arr = {-32485, -1830, 9237, -4972, 178, 24, 433, -5, 5175};
        for (int i = 0; i < short_arr.length; i++) {
            Short_Al.add(short_arr[i]);
        }
        System.out.print("In ra day: ");
        print(Short_Al);
        System.out.println("So lon nhat trong List la: " + findMax(Short_Al));
        selectionSort(Short_Al);
        System.out.print("Sau khi sap xep: ");
        print(Short_Al);
        
        // Double
        System.out.println("\nArrayList of Double");
        ArrayList<Double> Double_Al = new ArrayList<Double>();
        Double_Al.add(3.141592653d);
        Double_Al.add(-145.2536d);
        Double_Al.add(100.1453136d);
        Double_Al.add(90.24251d);
        Double_Al.add(0.1415621d);
        Double_Al.add(-42.5079d);
        System.out.print("In ra day: ");
        print(Double_Al);
        System.out.println("So lon nhat trong List la: " + findMax(Double_Al));
        selectionSort(Double_Al);
        System.out.print("Sau khi sap xep: ");
        print(Double_Al);
        
        // Float
        System.out.println("\nArrayList of Float");
        ArrayList<Float> Float_Al = new ArrayList<Float>();
        Float_Al.add(2.161813418f);
        Float_Al.add(-34.29356f);
        Float_Al.add(1024.892985f);
        Float_Al.add(97.7876189f);
        Float_Al.add(-0.0052621f);
        Float_Al.add(-184.5079f);
        System.out.print("In ra day: ");
        print(Float_Al);
        System.out.println("So lon nhat trong List la: " + findMax(Float_Al));
        selectionSort(Float_Al);
        System.out.print("Sau khi sap xep: ");
        print(Float_Al);
           

    }
    
}
