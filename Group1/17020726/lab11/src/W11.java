public class W11
{
    public static void main(String[] args)
    {

        System.out.println("String: ");
        String arr[] = {"a", "c", "d", "b", "e"};
        W11 cl = new W11();
        cl.sort(arr);

        for (String s: arr)
        {
            System.out.print(s + " ");
        }

        System.out.println("\nMax = " + cl.findMax(arr) );


        //INT
        System.out.println("Int: ");
        Integer intArr[] = {1,4,2,3,5,6,8};
        cl.sort(intArr);
        for (int i : intArr)
        {
            System.out.print(i + " ");
        }
        System.out.println("\nMax = " + cl.findMax(intArr) );

    }

    public <T extends Comparable> void sort(T[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i].compareTo(arr[j]) > 0)
                {
                    T temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public <T extends Comparable> T findMax(T[] arr)
    {
        sort(arr);
        return arr[arr.length - 1];
    }
}
