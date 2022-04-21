import java.io.*;
import java.lang.*;
import java.util.*;


public class Main {
	public static final Scanner scanner = new Scanner(System.in);
	public static final int MAX_VALUE = 1000000;
	public static final Sieve sieve = new Sieve(MAX_VALUE);

	public static final BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void testCase(int caseIndex) {
		int x = scanner.nextInt();

		int a = -1;
		int b = -1;
		
		
		for (int i = 3; i < x / 2; i++) {
			if (sieve.isPrime(i) && sieve.isPrime(x - i)) {
				a = i;
				b = x - i;
				break;
			}
		}

		// 정답을 출력한다
		System.out.printf("Case #%d:\n", caseIndex);
		if(a > 0 && b > 0)
		{
			System.out.printf("%d = %d + %d\n", x, a, b);
		}else{
			System.out.println(-1);
		}
	}

	public static void main(String[] args) throws Exception {
		int caseSize = scanner.nextInt();
		sieve.filterPrime();

		for (int caseIndex = 1; caseIndex <= caseSize; caseIndex += 1) {
			testCase(caseIndex);
		}
	}
}

class Sieve {
	public int maxNumber;
	public boolean[] isPrime;
	
	Sieve(int maxNumber) {
		this.maxNumber = maxNumber;
		this.isPrime = new boolean[maxNumber + 1];
		Arrays.fill(this.isPrime, true);
	}
	
	public boolean isPrime(int index) {
		return this.isPrime[index];
	}
	
	public void filterPrime() {
		for (int i = 2; i <= maxNumber; i++) {
			if (isPrime[i] == false) continue;
			
			for (long j = (long) i * i; j <= maxNumber; j += i) {
				isPrime[(int) j] = false;
			}
		}
	}
}