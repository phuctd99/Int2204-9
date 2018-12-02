package Week12;

public class BubbleSort implements Sorting{

	public void sort(int[] arr) {
		System.out.println("Sắp xếp theo thuật toán Bubble Sort");
		int n = arr.length;
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp;
				}
			}
		}
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
	}



}
