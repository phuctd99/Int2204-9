import java.util.*;


public class lab11 {


    public <N> void printArray(N[] inputArray) {

        Arrays.sort(inputArray);

        // Display array elements
        for ( N element : inputArray){
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public <N> N[] arraySorted(N[] inputArray){
        Arrays.sort(inputArray);
        return inputArray;
    }
    public <N> void sortArray(N[] inputArray){
        Arrays.sort(inputArray);
    }

    public <N> N maxArray(N[] inputArray) {
        Arrays.sort(inputArray);
        return inputArray[inputArray.length - 1];
    }

    public <T> void sortArray(List<T> inputList ){

    }



    public static void main(String[] args) {

        Integer[] intArray = { 1, 5, 3, 2, 7 };
        Double[] doubleArray = { 4.1, 2.2, 1.3, 3.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };



        // Create object
        lab11 gmt = new lab11();


        System.out.println( "Array integerArray contains:" );
        gmt.printArray( intArray ); // pass an Integer array

        System.out.println( "\nArray doubleArray contains:" );
        gmt.printArray( doubleArray ); // pass a Double array

        System.out.println( "\nArray characterArray contains:" );
        gmt.printArray( charArray ); // pass a Character array

        System.out.println( "\nNumber max:" );
        System.out.println(gmt.maxArray(intArray));
        System.out.println(gmt.maxArray(doubleArray));
        System.out.println(gmt.maxArray(charArray));

    }
}




