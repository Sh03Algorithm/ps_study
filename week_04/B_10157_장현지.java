package week04;

import java.util.Scanner;

public class B_10157_장현지 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int c = sc.nextInt();
		int r = sc.nextInt();
		int k = sc.nextInt();
		if (k > r * c) {
			System.out.println(0);
			return;
		}

		int[] dx = { 0, 1, 0, -1 };
		int[] dy = { -1, 0, 1, 0 };

		int[][] arr = new int[r][c];
		arr[r - 1][0] = 1;

		int x = 0;
		int y = r - 1;

		int answerX = 0;
		int answerY = 0;
		int dir = 0;

		while (true) {
			if (arr[y][x] == k) {
				answerX = x;
				answerY = y;
				break;
			}

			for (int i = 0; i < 4; i++) {
				if (dir != i)
					continue;
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (nx < 0 || nx >= c || ny < 0 || ny >= r || arr[ny][nx] != 0)
					dir = (dir + 1) % 4;
				else {
					arr[ny][nx] = arr[y][x] + 1;
					x = nx; y = ny;
				}
			}
		}
		
		System.out.println(answerX+1+" "+Math.abs(r-answerY));
	}

}
