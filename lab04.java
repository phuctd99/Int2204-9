public class lab04 {
    public int max(int a, int b){
        if (a >= b) return a;
         else return b;
    }

    public int minOfArr(int []arr, int n){
        int min = arr.[0];
        for(int i=1; i<arr.length; i++){
            if (arr[i]<min) min = arr[i];
        }
        return min;
    }

    public String bmi(double height, double weight){
        double BMI = weight/(height*height);
        if (BMI < 18.5) return  "Thiếu cân";
         else if (18.5 <= BMI && BMI < 23) return "Bình thường";
          else if (23 <= BMI && BMI <= 24.99) return "Thừa cân";
           else return "Béo phì";
    }
}
