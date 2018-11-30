/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab11;

/**
 *
 * @author Admin
 */
public class MaxGeneric {

    public static < E extends Comparable<E>> void printMax(E[] inputArray) {
        for (int i = 1; i < inputArray.length; i++) {
            for (int j = 0; j < i; j++) {
                if (inputArray[i].compareTo(inputArray[j]) > 0) {
                    E element = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = element;
                }
            }
        }
        System.out.printf("%s ", inputArray[0]);
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {2, 1, 6, 4, 5, 10, 7, 9, 8};
        Double[] doubleArray = {34.3, 41.5, 22.4, 31.25, 12.0, 44.8};
        Character[] charArray = {'a', '1', 'c', '-', 'g', 'e'};
        String[] stringArray = {"Cao", "Huyen", "Ngoc", "Thi"};
        System.out.println("Mảng intArray có phần tử lớn nhất là : ");
        printMax(intArray);
        System.out.println("Mảng doubleArray có phần tử lớn nhất là : ");
        printMax(doubleArray);
        System.out.println("Mảng charArray có phần tử lớn nhất là : ");
        printMax(charArray);
        System.out.println("Mảng stringArray có phần tử lớn nhất là : ");
        printMax(stringArray);
    }
}
