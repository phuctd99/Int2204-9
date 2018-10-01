package bàitapt4;

public class cauc {
       public static String BMI (double weigh, double high) {
    	  double bim = weigh/(high * high);
    	  if (bim < 18.5) return "Thieu can";
    	  if (bim < 23 && bim >=18.5) return "Binh thuong";
    	  if (bim < 25 && bim >=23 ) return "Thua can";
    	  if (bim >= 25) return "Beo phi";
    	  return "";
    	  
       }
}