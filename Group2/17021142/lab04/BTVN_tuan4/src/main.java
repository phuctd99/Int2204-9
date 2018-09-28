public class main {
    public int gtln(int a, int b)
    {
        if(a>b){
            return a;
        }
        else
            return b;
    }
    public int gtnn(int[] n)
    {
        int min = n[0];
        for(int i=1; i<n.length; i++){
            if(min>n[i]){
                min = n[i];
            }
        }
        return min;
    }
    public double BMI(double weight, double hight)
    {
        double a = weight/(hight*hight);
        return (double) Math.ceil(a*1000)/1000;
    }
    public String evaluate(double pBMI){
        if(pBMI > 25){
            return "Béo phì";
        }
        else
        {
            if(pBMI >= 23){
                return "Thừa cân";
            }
            else
            {
                if(pBMI >= 18.5){
                    return "Bình thường";
                }
                else
                    return "Thiếu cân";
            }
        }
    }
    public static void main(String[] args) {
        main test = new main();
            double w, h;
            w = 70;
            h = 1.75;
            int[] n = {10,20,30};
        System.out.println("gtln " + test.gtln(17, 15));
        System.out.println("gtnn " + test.gtnn(n));
            String t = test.evaluate(test.BMI(w,h));
        System.out.println(test.BMI(w,h) + " " + t);
    }
}
