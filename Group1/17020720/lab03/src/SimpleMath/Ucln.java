package SimpleMath;

public class Ucln {
    public static void main(String[] args) {
        Ucln ucln = new Ucln();

        //example
        int a = 10;
        int b = 30;
        int c = ucln.UCLN(a, b);
        System.out.println(c);
    }

    public int UCLN(int a, int b){
        if(b == 0) return a;
        else return UCLN(b, a%b);
    }
}
