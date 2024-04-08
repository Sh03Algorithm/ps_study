package com.shinhan.day15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[][] s = new int[N][M];
		for (int i = 0; i < N; i++) {
			String line = br.readLine();
			for (int j = 0; j < M; j++) {
				s[i][j] = line.charAt(j);
			}
		}
		int max = Math.min(N, M);

		// 정사각형 크기
		for (int i = max; i > 1; i--) {
			for (int j = 0; j <= N - i; j++) {
				for (int k = 0; k <= M - i; k++) {
					if (s[j][k] == s[j][k + i-1] && 
							s[j][k] == s[j + i-1][k] && 
							s[j][k] == s[j + i-1][k + i-1]) {
						System.out.println(i * i);
						return;
					}
				}
			}
		}
		System.out.println(1);
	}

}