import java.util.Scanner;

public class BMIcout {

    public static String inKetqua(double w, double h){
        double ketqua = w/(h*h);
        String s;
        if(ketqua >25){
           s= "Beo phi";
        }
        else if(ketqua > 23 ){
            s="Thua can";
        }
        else if(ketqua >18.5 ){
            s="Binh thuong";
        }
        else {
           s="Thieu can";
        }
        return s;
    }
}
