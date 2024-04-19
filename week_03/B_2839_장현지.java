package week03;

import java.util.Scanner;

public class B_2839_장현지 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[n+1];

		for(int i = n; i >= 3; i--) {
			if(dp[i] == 0 && i != n) continue;
			dp[i - 3] = dp[i - 3] == 0? dp[i] + 1 : Math.min(dp[i - 3], dp[i] + 1);
			if(i >= 5) dp[i - 5] = dp[i - 5] == 0? dp[i] + 1 : Math.min(dp[i - 5], dp[i] + 1);
		}
		
		System.out.println(dp[0] == 0? -1:dp[0]);
	}
}
