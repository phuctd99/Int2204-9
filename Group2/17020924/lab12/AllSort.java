package Ex2;

public class AllSort implements Sort{

	@Override
	public int BubbleSort(int[] num) {
		int n = num.length;
        int temp = 0;  
        for(int i=0; i < n; i++){  
        	for(int j=1; j < (n-i); j++){  
        		if(num[j-1] > num[j]){  
        			temp = num[j-1];  
                    num[j-1] = num[j];  
                    num[j] = temp;  
                 }           
             }  
        }
        for (int i = 0 ; i < num.length; i++) {
        	System.out.print(num[i] + " ");
        }
		return 0;
	}

	@Override
	public int SelectionSort(int[] num) {
		for (int i = 0; i < num.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < num.length; j++){  
                if (num[j] < num[index]){  
                    index = j; 
                }  
            }  
            int smallerNumber = num[index];   
            num[index] = num[i];  
            num[i] = smallerNumber;  
        }
		for (int i = 0 ; i < num.length; i++) {
        	System.out.print(num[i] + " ");
        }
		return 0;
	}

}
