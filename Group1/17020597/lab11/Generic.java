/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab11;

import java.util.Comparator;

/**
 *
 * @author Admin
 */
public class Generic {

    public static < E extends Comparable<E>> void printArray(E[] inputArray) {

        for (int i = 1; i < inputArray.length; i++) {
            for (int j = 0; j < i; j++) {
                if (inputArray[i].compareTo(inputArray[j]) > 0) {
                    E element = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = element;
                }
            }
        }

        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {2, 1, 6, 4, 5, 10, 7, 9, 8};
        Double[] doubleArray = {34.3, 41.5, 22.4, 31.25, 12.0, 44.8};
        Character[] charArray = {'a', '1', 'c', '-', 'g', 'e'};
        String[] stringArray = {"Cao", "Huyen", "Ngoc", "Thi"};
        System.out.println("Mảng intArray được sắp xếp : ");
        printArray(intArray);
        System.out.println("Mảng doubleArray được sắp xếp : ");
        printArray(doubleArray);
        System.out.println("Mảng charArray được sắp xếp : ");
        printArray(charArray);
        System.out.println("Mảng stringArray được sắp xếp : ");
        printArray(stringArray);
    }

}
