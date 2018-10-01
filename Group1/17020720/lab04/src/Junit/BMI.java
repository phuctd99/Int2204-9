package Junit;

public class BMI {
    private float canNang, chieuCao;

    public static String BIMresult(double cannang, double chieucao) {
        double bmi = cannang / (chieucao * chieucao);
        if (bmi < 18.5) {
            return "Thieu can";
        } else if (bmi > 18.5 && bmi < 23) {
            return "Binh thuong";
        } else if (bmi > 22.99 && bmi < 24.99) {
            return "Thua can";
        } else{
            return "Beo phi";
        }
    }
}
