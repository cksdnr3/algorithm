
import java.io.*;
import java.lang.*;
import java.util.*;


public class Main {
	public static final Scanner scanner = new Scanner(System.in);

	public static void testCase(int caseIndex) {
		long N = scanner.nextLong();

		// N을 소인수 분해한다
		ArrayList<Long> factors = MathUtil.factorize(N);

		// 정답을 출력한다
		System.out.printf("#%d:\n", caseIndex);
		for(int i = 0 ; i <factors.size();i+=1)
		{
			System.out.print(factors.get(i));
			System.out.print(" ");
		}
		System.out.println();
	}

	public static void main(String[] args) throws Exception {
		int caseSize = scanner.nextInt();

		for (int caseIndex = 1; caseIndex <= caseSize; caseIndex += 1) {
			testCase(caseIndex);
		}
	}

}


class MathUtil{
	/**
	 * 자연수 N을 구성하는 모든 소인수를 반환하는 함수
	 *
	 * @param N
	 * @return
	 */
	public static ArrayList<Long> factorize(long N)
	{
		ArrayList<Long> factors = new ArrayList<>();
		
		 
		// 범위를 sqrt(N)으로 잡는 이유 
		// 만약 N이 소수라면 소인순의 집합은 { N }이 될게 자명하다.
		// 따라서 N이 소수인 경우 탐색을 종료하는 것이 좋다.
		// 소수는 자기 자신을 제외한 자연수 약수를 가지고 있지 않기 때문에 sqrt(N) 이하의 범위만 순회하고 약수를 발견하지 못했다면 탐색을 종료한다.
		// - N이 소수라면 sqrt(N) 까지 탐색하고 종료
		// |
		// - N이 합성수라면 N의 범위가 계속해서 작아지짐 
		
		// 현재 탐색하는 숫자가 N을 역전하면 탐색 종료
		// 그 결과 N은 소수거나 1임이 자명하다.
		
		for (long i = 2; i * i <= N; i++) {
			
			// 소수검증이 필요 없는 이유
			// 2 -> 3 -> 4 -> ... 4는 검증 과정을 거치지 않는다.
			// 4는 소수인 2를 인수로 가진 합성수이고 따라서 이미 소수 2를 분해할 때 4도 이미 분해가 되었기 때문.
			// 따라서 N은 반드시 i 보다 큰 수의 소인수를 가진 합성수임이 보장된다.
			
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
}