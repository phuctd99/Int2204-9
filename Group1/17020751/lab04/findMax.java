public class findMax {

    public static int find(int first, int second)
    {
        if ( first >= second) return first;
        else return second;
    }
    // ham tim min trong mang
    public static int findMin( int[] a){

        int size = a.length;
        int min = a[0];
        for (int i=1; i<size ; i++)
        {
            if (a[i] < min) min = a[i];
        }
        return min;
    }
    //chi so BMI
    public static String BMI ( double weight, double hight)
    {
        double bmi = weight / (hight * hight);
        if ( bmi < 18.5 ) {
            return "Thieu can";
        }
        else if (  bmi <22.99 ) {
            return "Binh thuong";
    }
        else if (  bmi <24.99) {
            return "Thua can";
    }
        else {
            return "Beo phi";
    }
    }

}
