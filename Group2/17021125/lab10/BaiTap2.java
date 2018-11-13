
/**
 * Created by CCNE on 12/11/2018.
 */
public class BaiTap2 {
    static void bubble (double [] arr){
        for(int i = 0; i < arr.length - 1;  i++){
            for(int j = arr.length - 1; j > i; j--){
                if(arr[j] < arr[j-1]){
                    double temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        double []arr = new double [1000];
        for(int i = 0; i < 1000; i++){
            arr[i] = Math.random()*1000;
        }
        bubble(arr);
        for(int i = 0; i < 1000; i++){
            System.out.println( (double)Math.round(arr[i] * 100) / 100);
        }
    }
}
