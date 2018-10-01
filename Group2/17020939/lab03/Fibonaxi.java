package bai_tap_tuan_3;

public class Fibonaxi {
	public void printFibonaxi (int n) {
		int[] fibonaxi = new int[n];
		fibonaxi[0] = 0;
		fibonaxi[1] = 1;
		for (int i = 2; i < n; i++)
		{
			fibonaxi[i] =  fibonaxi[i-1] + fibonaxi[i-2];
		}
		for (int i = 0; i < n; i++)
		{
			System.out.print(fibonaxi[i] + " ");
		}
	}
}
