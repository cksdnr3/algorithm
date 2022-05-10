import java.io.*;
import java.lang.*;
import java.util.*;


public class Main {
	public static final Scanner scanner = new Scanner(System.in);

	public static int getMaximumRangeDifference(int n, int k, City[] cities){
		int answer = 0;

		// 소득이 가장 작은 도시부터 pop되는 우선순위 큐
		PriorityQueue<City> rangeMinimum = new PriorityQueue<>();

		// 소득이 가장 높은 도시부터 pop되는 우선순위 큐
		PriorityQueue<City> rangeMaximum = new PriorityQueue<>(Collections.reverseOrder());
		
		for (int i = 0; i < k; i++) {
			City city = cities[i];
			rangeMaximum.add(city);
			rangeMinimum.add(city);
		}
		
		for (int i = k; i < n; i++) {
			City prevCity = cities[i - k];
			City city = cities[i];
					
			answer = Math.max(answer, rangeMaximum.peek().income - rangeMinimum.peek().income);
			
			while (prevCity.index >= rangeMaximum.peek().index) {
				rangeMaximum.remove();
			}
			
			while (prevCity.index >= rangeMinimum.peek().index) {
				rangeMinimum.remove();
			}
						
			rangeMaximum.add(city);
			rangeMinimum.add(city);
		}
		
		answer = Math.max(answer, rangeMaximum.peek().income - rangeMinimum.peek().income);
		
		
		
		return answer;
	}

	public static void testCase(int caseIndex) {
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		City[] cities = new City[n];

		for(int i = 0 ; i < n ; i += 1){
			int income = scanner.nextInt();
			cities[i] = new City(i, income);
		}

		int answer = getMaximumRangeDifference(n, k, cities);

		System.out.println(answer);
	}

	public static void main(String[] args) throws Exception {
		int caseSize = scanner.nextInt();

		for (int caseIndex = 1; caseIndex <= caseSize; caseIndex += 1) {
			testCase(caseIndex);
		}
	}

}


class City implements  Comparable<City>{
	public final int index;     // 도시의 인덱스
	public final int income;    // 해당 도시의 소득

	public City(int index, int income){
		this.index = index;
		this.income = income;
	}

	@Override
	public int compareTo(City o) {
		// 소득에 대해 우선순위를 가지도록 대소관계를 정의해준다
		return this.income - o.income;
	}
}