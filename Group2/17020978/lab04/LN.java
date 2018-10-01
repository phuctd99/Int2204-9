import java.util.Scanner;

public class LN{
    private static Scanner scanner = new Scanner(System.in);

    static int GTLN(int a, int b)
    {
        return a>b ? a : b;
    }

     static int GTNN(int a[])
    {
       int nn = Integer.MAX_VALUE;
       for(int i=0; i<a.length; i++)
       {
           if(a[i] < nn)
               nn = a[i];
       }
        return nn;
    }
    static String BMI(double chieucao, double cannang)
    {
        double BMI = cannang / (chieucao*chieucao);

        if(BMI < 18.5)  return "Thiếu cân";
        if(BMI >= 18.5 && BMI < 23) return "Bình thường";
        if(BMI >= 23 && BMI <= 25) return "Thừa cân";
        else return "Béo phì";
    }

    public static void main(String[] args)
    {
        int arr[] = new int[5];
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = scanner.nextInt();
        }

        System.out.println(GTLN(arr[0],arr[1]));
        System.out.println(GTNN(arr));

        //tinh BMI
        System.out.print("Nhap can nang(kg): ");
        float cannang = scanner.nextInt();
        System.out.print("Nhap chieu cao(m): ");
        float chieucao = scanner.nextFloat();
        System.out.print(BMI(chieucao, cannang));
    }
}
