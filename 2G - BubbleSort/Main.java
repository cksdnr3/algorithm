import java.io.*;
import java.lang.*;
import java.util.*;


public class Main {
	public static final Scanner scanner = new Scanner(System.in);

	public static void bubbleSort(int[] data, int n)
	{
		for(int i = 1 ; i < n - 1 ; i++)
		{
			int swapCount = 0;
			
			for (int j = 0; j < n - i; j++) {
				if (data[j] > data[j + 1]) {
					int temp = 0;
					temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
					swapCount += 1;
				}
			}
			if (swapCount == 0) {
				break;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		int n = scanner.nextInt();
		int[] data = new int[n];
		for(int i = 0 ; i < n ; i++)
		{
			data[i] = scanner.nextInt();
		}

		bubbleSort(data, n);

		for(int i = 0 ; i < n ; i++)
		{
			if( i > 0 )
			{
				System.out.print(" ");
			}
			System.out.print(data[i]);
		}
	}

}