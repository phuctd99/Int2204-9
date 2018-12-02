package Week12;

public class User {
	private Sorting sorting;
	
	public User(Sorting sorting) {
		this.sorting = sorting;
	}

	public void sort(int[] arr) {
		sorting.sort(arr);
	}
	public static void main(String[] args) {
		int[] arr = {1, 5, 2, 3, 4};
		User test1 = new User(new SelectionSort());
		test1.sort(arr);
		System.out.println();
		User test2 = new User(new BubbleSort());
		test2.sort(arr);
		System.out.println();
		User test3 = new User(new QuickSort());
		test3.sort(arr);
	}
}
