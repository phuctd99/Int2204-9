package exercise3;

public class Number {
	  private int number;
		    public int getNum() {
		        return number;
		    }
		    public void setNum(int number) {
		        this.number = number;
		    }
		    Number(){};
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
	}