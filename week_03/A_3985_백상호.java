package baekjun.study;

import java.util.Scanner;

public class rollCake {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();// 롤케이크 길이
		int n = sc.nextInt();// 방청객의 수
		int num = 1;// 방청객 번호

		int[][] roll = new int[n][2]; // 각 방청객이 원하는 조각의 시작 번호와 끝 번호를 저장하는 배열

		for (int i = 0; i < n; i++) { 
		    roll[i][0] = sc.nextInt();
		    roll[i][1] = sc.nextInt();
		}

		int[] roll2 = new int[l + 1];
		int max = 0;
		for (int i = 0; i < n; i++) {
			if (max < roll[i][1] - roll[i][0]) {
				max = roll[i][1] - roll[i][0];
				num= i + 1;
			}
		}
		System.out.println(num);

		for (int i = 1; i <= n; i++) {
			for (int k = roll[i - 1][0]; k <= roll[i - 1][1]; k++) {
				if (roll2[k] == 0) {
					roll2[k] = i;
				}

			}
		}

		max = 0;
		for (int i = 1; i <= n; i++) {

			int count = 0;

			for (int j = 1; j < roll2.length; j++) {
				if (roll2[j] == i) {
					count++;
				}
			}
			if (count > max) {
				max = count;
				num = i;
			}
		}
	System.out.println(num);
	sc.close();
	}
}
