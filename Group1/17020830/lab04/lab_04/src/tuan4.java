public class tuan4 {

    static int lonnhat(int a, int b){
        if(a>b)
            return a;
        return b;
    }

    static int nhonhatcuamang(int arr[]){
        int n = arr.length;
        int min = 999999999;
        for(int i = 0; i < n; i++)
        {
            if(arr[i]<min)
                min = arr[i];
        }
        return min;
    }
    static String IBM(double cannang, double chieucao){
        String ketluan="Béo phì" ;
        double ketqua =  (cannang / Math.pow(chieucao,2.0));
        if(ketqua < 18.5) ketluan="Thiếu cân";
        else if((ketqua >= 18.5)&&(ketqua < 23 ))
            ketluan = "Bình thường";
        else if((ketqua >=23)&&(ketqua <24.99))
            ketluan = "Thừa cân";

        return ketluan;
    }
}
