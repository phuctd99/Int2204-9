public class Week4
{
    static int greater (int a, int b)
    {
        return (a>b)?a:b;
    }

    static int min (int [] a)
    {
        int minium = a[0];
        for (int i : a)
        {
            if (i < minium)
            {
                minium = i;
            }
        }
        return minium;
    }

    static String BMI (double weigh, double heigh)
    {
        double result = weigh / heigh / heigh;
        if (result < 18.5)
        {
            return("Thieu can");
        }
        if (result < 23)
        {
            return("Binh thuong");
        }
        if (result < 25)
        {
            return("Thua can");
        }
        return("Beo phi");
    }
}
