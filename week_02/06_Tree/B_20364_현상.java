
package com.home;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_20364_현상 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken()); // 땅의 개수
		int Q = Integer.parseInt(st.nextToken()); // 오리의 마리 수

		int[] ducks = new int[Q];

		for (int i = 0; i < Q; i++) {
			st = new StringTokenizer(br.readLine());
			ducks[i] = Integer.parseInt(st.nextToken());
		}

		boolean[] visit = new boolean[N + 1];

		StringBuilder sb = new StringBuilder();
		
		for (int duck : ducks) {
			int answer = 0; // 세금을 내야하는 땅
			int road = duck;
			
			while (road != 0) {
				// 방문하는 곳이 자리가 있으면 값을 answer 대입
				if (visit[road] == true) {
					answer = road;
				}
				road /= 2;
			}
			sb.append(answer + "\n");
			
			// 세금을 내야하는 땅이 없었다
			if (answer == 0) {
				visit[duck] = true;
			}
		}
		System.out.println(sb);
	}
}
