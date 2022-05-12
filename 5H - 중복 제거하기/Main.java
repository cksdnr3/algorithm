import java.io.*;
import java.lang.*;
import java.util.*;


public class Main {
	public static final Scanner scanner = new Scanner(System.in);
	public static final BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception {
		int N = scanner.nextInt();

		HashSet<Integer> integers = new HashSet<>();

		for(int i = 0 ; i < N ; i++){
			// integers := 이전까지 등장한 모든 정수를 저장한 집합
			int X = scanner.nextInt();

			if (integers.contains(X)) {
				writer.write("DUPLICATED" + "\n");
			} else {
				writer.write("OK" + "\n");
				integers.add(X);
			}
		}

		writer.flush();
		writer.close();
	}

}
