package com.algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class B_2579_양준성 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int[] DP = new int[N + 1]; // DP[i] = 계단의 갯수가 i일 때, 최댓값
		int[] arr = new int[N + 1]; // 계단에 쓰여진 점수의 배열

		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		// N=1인 경우,
		DP[1] = arr[1];

		// N=2인 경우,
		// N>=3인 경우에도 DP[2]의 값을 이용해야하기 때문에 N>=2
		if (N >= 2) {
			DP[2] = arr[1] + arr[2];
		}

		// N>=3인 경우,
		if (N >= 3) {
			for (int i = 3; i <= N; i++) {
				DP[i] = Math.max(DP[i - 2], DP[i - 3] + arr[i - 1]) + arr[i];
			}
		}
		System.out.println(DP[N]);
	}
}
