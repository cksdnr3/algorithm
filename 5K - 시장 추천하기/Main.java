import java.io.*;
import java.lang.*;
import java.util.*;


public class Main {
	public static final Scanner scanner = new Scanner(System.in);
	public static final BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws Exception {
		int N = scanner.nextInt();
		
		// 각 후보 이름과 득표 수를 저장하는 key-value Map
		Map<String, Integer> frequencyMap = new HashMap<>();
		Set<String> winnersList = new TreeSet<>();
		
		int maxFrequency = 0;   // 가장 많은 득표수
		
		
		// ...
		for (int i = 0; i < N; i++) {
			String candidate = scanner.next();
			
			if (frequencyMap.containsKey(candidate)) {
				frequencyMap.put(candidate, frequencyMap.get(candidate) + 1);
			} else {
				frequencyMap.put(candidate, 1);
			}
			
			if (maxFrequency < frequencyMap.get(candidate)) {
				winnersList.clear();
				winnersList.add(candidate);
			} else if (maxFrequency == frequencyMap.get(candidate)) {
				winnersList.add(candidate);
			}
			
			maxFrequency = Math.max(maxFrequency, frequencyMap.get(candidate));
		}
		
		
		// 최대 득표수를 출력한다
		writer.write(String.format("%d\n", maxFrequency));
		
		// 최대 득표를한 동점 후보들 이름을 사전순으로 출력한다;
		
		// ...
		for (String name : winnersList) {
			writer.write(name);
			writer.write(" ");
			
		}
		
		writer.flush();
		writer.close();
	}

  
	
}


