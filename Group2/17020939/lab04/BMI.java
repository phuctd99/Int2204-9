package Tuan4;

public class BMI {

    public static String BMI( double weight, double height) {
        double bmi = weight / ( height*height );
        if( bmi < 18.5 ) {
            return "Thiếu cân";
        }
        else if( bmi >= 18.5 && bmi <25) {
            return "Bình thường";
        }
        else if( bmi >=25 && bmi <30) {
            return "Thừa cân";
        }
        return "Béo phì";
    }
}
