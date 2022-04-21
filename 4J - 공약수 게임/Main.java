import java.io.*;
import java.lang.*;
import java.util.*;


public class Main {
	public static final Scanner scanner = new Scanner(System.in);
	public static final int MAX_VALUE = 1000000;


	/**
	 * 게임의 규칙을 만족하면서 만들 수 있는 가장 큰 최대공약수를 반환하는 함수
	 *
	 * @param n         주어진 카드의 수
	 * @param cards     각 카드에 적힌 숫자 배열
	 * @return
	 */
	public static int getMaximumGCD(int n, int[] cards)
	{
		ArrayList<ArrayList<Long>> factors = new ArrayList();
		
		for (int i = 0; i < n; i++) {
			factors.add(MathUtil.factorize(cards[i]));
		}
		
		HashMap<Long, Integer> powTable = new HashMap();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < factors.get(i).size(); j++) {
				if (powTable.containsKey(factors.get(i).get(j))) {
					int value = powTable.get(factors.get(i).get(j)) + 1;
					powTable.put(factors.get(i).get(j), value);
				} else {
					powTable.put(factors.get(i).get(j), 1);
				}
			}
		}
		
		int answer = 1;
		
		for (long key : powTable.keySet() ) {
			int div = powTable.get(key) / n;
 			answer *= MathUtil.powInt((int) key, div);
		}
		
		return answer;
	}

	public static void main(String[] args) throws Exception {
		int n = scanner.nextInt();
		int[] cards = new int[n];
		for(int i = 0 ; i < n ; i++)
		{
			cards[i] = scanner.nextInt();
		}

		int answer = getMaximumGCD(n, cards);

		System.out.println(answer);
	}

}

class MathUtil{
	/**
	 *
	 * @param N
	 * @return
	 */
	public static ArrayList<Long> factorize(long N) // 최몇
	{
		ArrayList<Long> factors = new ArrayList();
		for (long i = 2; i * i <= N; i++) {
			while (N % i == 0) {
				factors.add(i);
				N /= i;
			}
		}
		
		if (N > 1) {
			factors.add(N);
		}
		
		return factors;
	}


	/**
	 * 두 정수 a, n에 대해 a ^ n을 계산해주는 함수
	 *
	 * @param a
	 * @param n
	 * @return
	 */
	public static int powInt(int a, int n)
	{
		int value = 1;
		
		if (n == 0) return 1;
		
		for (int i = 0; i < n; i++) {
			value *= a;
		}
		return value;
	}
}

