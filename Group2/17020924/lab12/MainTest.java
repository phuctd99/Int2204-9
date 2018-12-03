package Ex2;

public class MainTest {

	public static void main(String[] args) {
		int[] num = {-3,4,1,-2,0,1};
		
		Initialization in = new Initialization(new AllSort());
		
		System.out.print("Bubble Sort: ");
		
		in.ConvertBubble(num);
		
		System.out.println();
		
		System.out.print("Selection Sort: ");
		
		in.ConvertSelection(num);
	}

}
