
import java.util.ArrayList;
import java.util.Random;

public class ex2<T extends Comparable<T>> {

    /**
     * @param args the command line arguments
     */
    private ArrayList<T> items = new ArrayList<T>();
    public void add(T item) {
      items.add(item);
   }
    public T max (){
        T temp = items.get(0);
       for (int i=1; i< items.size(); i++){
          
             if ( items.get(i).compareTo(temp) > 0){
                 temp = items.get(i);
             }
          
       }
       return temp;
    }
    
    public void printItems() {
        System.out.println(items.toString());
        
    }

    public static void main(String[] args) {
        // TODO code application logic here
          ex2<Integer> max = new ex2();
          for (int i = 0; i < 5; i++) {
              max.add(new Random().nextInt());
          }
          max.printItems();
          System.out.println(max.max());
    }
    
}