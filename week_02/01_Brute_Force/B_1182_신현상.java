
package com.home;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//* 부분 수열
//
// 원소 {A, B, C} 라면,  
// depth=0일 때는 아무것도 선택하지 않았을 때, 부분수열 = {Ø}
// depth=1일때는 이전 부분수열에 A를 가졌냐 안 가졌나로 나누어짐. 부분수열 = {A}, {Ø}
// depth=2일 때는 이전 부분수열에 B를 가졌냐 안 가졌나로 나누어짐. 부분수열 = {AB}, {A}, {B}, {Ø}
// depth=3일 때는 이전 부분수열에 C를 가졌냐 안 가졌나로 나누어짐. 부분수열 = {ABC}, {AB}, {AC}, {BC}, {A}, {B}, {C}, {Ø}

public class B_1182_현상 {

	static int N;
	static int S;
	static int result = 0;
	static int[] num;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken()); // 정수 개수
		S = Integer.parseInt(st.nextToken()); // 부분 수열의 원소를 다 더한 값
		num = new int[N]; // 정수를 담는 배열

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		dfs(0,0);

		if (S == 0) {
			result -= 1;
		}

		System.out.println(result);

	}

	public static void dfs(int depth, int sum) {
		if (depth == N) {
			if (sum == S) {
				result++;
			}
			return;
		}
		dfs(depth + 1, sum + num[depth]); // 지금 위치의 원소를 선택 했거나
		dfs(depth + 1, sum); // 안했거나
	}
}
