package Tuan4;

public class bmi {

    public static String BMI( double weight, double height) {
        double bmi = weight / ( height*height );
        if( bmi <= 18.5 ) {
            return "Thiếu cân";
        }
        else if( bmi > 18.5 && bmi <=23) {
            return "Bình thường";
        }
        else if( bmi >23 && bmi <25) {
            return "Thừa cân";
        }
        return "Béo phì";
    }

    public static void main( String[] args) {
        System.out.println( BMI( 55, 1.7));
        System.out.println( BMI( 49, 1.7));
        System.out.println( BMI( 65, 1.7));
        System.out.println( BMI( 45, 1.6));
        System.out.println( BMI( 65, 1.5));

    }
}
