import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
	public static final Scanner scanner = new Scanner(System.in);
	public static final int MAX_TABLE_LENGTH = 10000;

	/**
	 * data[0] ~ data[n-1]에 등장한 번호들에 대한 빈도수 테이블을 채우는 함수
	 * @param data
	 * @param n
	 * @param table  table[x] := data배열에서 x가 등장한 횟수
	 */
	public static void fillFrequencyTable(int[] data, int n, int[] table) {
		for (int i = 0; i < n; i++) {
			table[data[i]]++;
		}
	}


	/**
	 * data[0] ~ data[n-1]사이에서 가장 많이 등장한 번호를 반환하는 함수
	 * @param data
	 * @param n
	 * @return  가장 많이 등장한 번호. 여러개인 경우 사전순으로 가장 빠른 번호.
	 */
	public static int getFrequentNumber(int[] data, int n) {
		int frequent_number = 0;  //0000~9999중  가장 많이 등장한 번호
		
		int[] table = new int[10000];
		
		fillFrequencyTable(data, n, table);
	
		int temp = 0;
		for (int i = 0; i < table.length; i++) {
			if (temp < table[i]) {
				frequent_number = i;
				temp = table[i];
			}
		}
		
		return frequent_number;
	}

	public static void main(String[] args) throws Exception {
		int n = scanner.nextInt();
		int[] data = new int[n];
		for (int i = 0; i < n; i++) {
			data[i] = scanner.nextInt();
		}

		int answer = getFrequentNumber(data, n);
		System.out.printf("%04d", answer);
	}
}
