package exercise3;

public class PrimeNumber {
	  private int num;
		    public int getNum() {
		        return num;
		    }
		    public void setNum(int num) {
		        this.num = num;
		    }
		    PrimeNumber(){};
		    public boolean isPrimeNumber(int x){
		        if(x < 2)
		            return false;
		        else {
		            for(int i = 2; i <= Math.sqrt(x); i++){
		                if(x % i == 0)
		                    return false;
		            }
		            return true;
		        }
		    }
		    // neu x la so nguyen to nhap vao num
		    PrimeNumber(int x){
		        if(isPrimeNumber(x))
		            this.setNum(x);
		        else
		               System.out.println(x + " khong la so nguyen to.");
		    }
		    //tim so nguyen to sau x
		    public void findPrimeNumber(int x){
		        if(isPrimeNumber(x)){
		            int temp = x;
		        while(!isPrimeNumber(temp))
		                temp ++;
		            System.out.println("So nguyen to lien sau " + x + " la: " + temp);
		        } else {
		            System.out.println("x khong la so nguyen to");
		        }
		    }
	}
