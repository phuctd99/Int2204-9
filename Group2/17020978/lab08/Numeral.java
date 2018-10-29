package lab08;

public class Numeral extends Expression{
     int value;

     Numeral(int value)
     {
         this.value = value;
     }

     Numeral(){}

    public String toString()
     {
          return "value " + this.value;
     }

     public int evaluate()
     {
          return value;
     }

}
