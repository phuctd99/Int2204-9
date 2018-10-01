public class Lab04 {
    public static  int maxHaiso(int a, int b){
        if (a > b) return a;
            else return b;
    }
    public static int minSN(int a[]){
        int min = a[0];
        for (int i = 0; i < a.length; i++){
            if (a[i] < min) min = a[i];
        }
        return min;
    }
    public static String ktBMI (double weight, double height){
        double BMI = weight /(height*height);
        if (BMI < 18.5) return "Thiếu cân";
        else if (BMI < 23) return "Bình Thường";
        else if (BMI <= 25) return "Thừa cân" ;
        else return "Béo Phì";
    }
}
