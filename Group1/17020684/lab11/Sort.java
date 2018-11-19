
package bai1;

import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author Pc
 */
    
    public class Sort<T extends Comparable<T>> {
        
        private ArrayList<T> i = new ArrayList<T>();
        public void add(T item){
            
            i.add(item);
            
        }
        public void Sapxep() {
            for( int j=0; j<i.size(); j++)
            {
                
                for(int k = j+1 ; k<i.size();k++){
                    
                    if( i.get(j).compareTo(i.get(k) ) >0) {
                    
                    T temp;
                    temp = i.get(j);
                    i.set(j, i.get(k));
                    i.set(k, temp);
                    }
                }
            }
            
        }
        public void print(){
        
        for(int j=0; j< i.size() ; j++ ){
            System.out.println(i.get(j));
        }
    } 
    
        
    public static void main(String[] args) {
        Sort<Integer> s = new Sort();
        for(int j=0;j<10;j++){
            
            s.add(new Random().nextInt());
        }
        s.Sapxep();
        s.print();
        
    }
}
      
    
    

