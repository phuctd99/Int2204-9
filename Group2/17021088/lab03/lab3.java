public class lab3 {
     public int UCLN(int  a, int b)
            {
                if (a==b) return a;
                    else if (a>b) return UCLN(a-b,b);
                        else return UCLN(b-a,a);
            }

     public int F(int n)
        {
            switch (n)
            {
                case 0:
                    return n;
                case 1:
                    return n;
                default:
                    return F(n-1)+F(n-2);
            }
        }
}
