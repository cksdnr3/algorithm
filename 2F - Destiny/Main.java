import java.io.*;
import java.lang.*;
import java.util.*;


public class Main {
	public static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args)
	{
		int n = scanner.nextInt();
		Point2D[] points = new Point2D[n];

		for(int i = 0 ; i < n ; i++)
		{
			int x=  scanner.nextInt();
			int y=  scanner.nextInt();
			points[i] = new Point2D(x, y);
		}
		
		int lower = Integer.MAX_VALUE;
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (lower > points[i].getSquaredDistanceTo(points[j])) {
					lower = points[i].getSquaredDistanceTo(points[j]);
					count = 1;
				} else if (lower == points[i].getSquaredDistanceTo(points[j])) {
					count += 1;
				}
			}
		}
		
		System.out.printf("%.1f\n", Math.sqrt(lower));
		System.out.printf("%d", count);
	}
}

class Point2D{
	int x;
	int y;
	public Point2D(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	/**
	 * 2차원 평면 상에서 점 this부터 점 target까지 거리의 제곱을 계산하는 함수
	 * @param target
	 * @return
	 */
	public int getSquaredDistanceTo(Point2D target)
	{
		int deltaX = target.x - this.x;
		int deltaY = target.y - this.y;
		

		return deltaX * deltaX + deltaY * deltaY;
	}

	public double getDistanceTo(Point2D target)
	{
		return Math.sqrt(getSquaredDistanceTo(target));
	}
}