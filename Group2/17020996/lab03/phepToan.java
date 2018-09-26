public class phepToan {
     public int UCLN(int  a, int b){
         if (a<0) a=-1*a;
         if (b<0) b=-1*b;
         if (a==b) return a;
          else if (a>b) return UCLN(a-b,b);
           else return UCLN(b-a,a);
     }
     public int F(int n){
         if (n==0) return n;
          else if (n==1) return n;
            else return F(n-1)+F(n-2);
     }
}
