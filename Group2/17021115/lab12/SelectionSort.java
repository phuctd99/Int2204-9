package Week12;

public class SelectionSort implements Sorting{

	public void sort(int[] arr) {
		System.out.println("Sắp xếp theo thuật toán Selection Sort");
		int n = arr.length;
		for(int i = 0; i < n - 1; i++) {
			for(int j = i+1; j < n; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[j]; 
                    arr[j] = arr[i]; 
                    arr[i] = temp;
				}
			}
		}
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
	
}
