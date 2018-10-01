public class lab04 {
    public int max(int x, int y){
        if (x >= y) return x;
         else return y;
    }

    public int minOfArr(int []arr, int n){
        int min = arr[0];
        for(int i=1; i<n; i++){
            if (arr[i]<min) min = arr[i];
        }
        return min;
    }

    public String bmi(double height, double weight){
        double BMI = weight/(height*height);
        if (BMI < 18.5) return  "Thiếu cân";
         else if (18.5 <= BMI && BMI < 25) return "Bình thường";
          else if (25 <= BMI && BMI < 30) return "Thừa cân";
           else return "Béo phì";
    }
}
