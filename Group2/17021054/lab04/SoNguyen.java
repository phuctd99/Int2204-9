public class SoNguyen {
    public static int max(int a, int b){
        if(a>b) return a;
        else return b;
    }
    public static int minArray(int arr[]){
        int n= arr.length;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

}
