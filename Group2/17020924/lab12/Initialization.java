package Ex2;

public class Initialization {
	private Sort sort;

	public Initialization(Sort sort) {
		this.sort = sort;
	}
	
	public int ConvertBubble(int[] num) {
		return sort.BubbleSort(num);
	}
	
	public int ConvertSelection(int[] num) {
		return sort.BubbleSort(num);
	}
	
}
