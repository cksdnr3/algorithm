import java.io.*;
import java.lang.*;
import java.util.*;


public class Main {
	public static final Scanner scanner = new Scanner(System.in);

	/**
	 * 색종이들이 덮고 있는 영역의 총 넓이를 계산하는 함수
	 *
	 * @param papers
	 * @param n
	 * @return
	 */
	public static int getCoveredArea(Paper[] papers, int n)
	{
		int answer = 0; //색종이들이 덮은 영역의 총 넓이
		int[][] sq = new int[100][100];
			
		for (Paper p : papers) {
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					sq[p.leftColumn + i][p.bottomRow + j]++;
				}
			}
		}
		
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if (sq[i][j] >= 1) {
					answer += 1;
				}
			}
		}
		
		return answer;
	}

	public static void main(String[] args) throws Exception {
		int caseSize = scanner.nextInt();

		for (int caseIndex = 1; caseIndex <= caseSize; caseIndex += 1)
		{ //각 테스트케이스에 대하여
			int n = scanner.nextInt();

			//색종이들의 정보를 입력 받는다.
			Paper[] papers = new Paper[n];
			for(int i = 0 ; i < n ; i ++)
			{
				int leftX = scanner.nextInt();
				int bottomY = scanner.nextInt();
				papers[i] = new Paper(leftX, bottomY);
			}

			//색종이들이 덮은 영역의 넓이를 계산한다.
			int answer = getCoveredArea(papers, n);

			System.out.println(answer);
		}
	}

}


class Paper
{
	int leftColumn;   //가장 왼쪽 격자의 열 번호
	int rightColumn;  //가장 오른쪽 격자의 열 번호
	int topRow;       //가장 위쪽 격자의 행 번호
	int bottomRow;    //가장 아래쪽 격자의 행 번호
	Paper(int xPos, int yPos)
	{
		this.leftColumn = xPos;
		this.rightColumn = this.leftColumn + 9;
		this.bottomRow = yPos;
		this.topRow = this.bottomRow + 9;
	}
}
