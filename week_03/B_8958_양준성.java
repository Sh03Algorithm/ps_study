package com.shinhan.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_8958_양준성 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수
		
		String[][] arr = new String[N][];
		
		for (int i = 0; i < N; i++) {
			arr[i] = br.readLine().split(""); // (i+1)번째 케이스의 문자열
		}
		
		for (int j = 0; j < N; j++) {
			int score = 0; // O를 만났을 때 얻는 점수
			int total = 0; // 총 점수
			for (String s: arr[j]) {
				if (s.equals("O")) {
					score++;
					total += score;
				}else {
					score = 0; // X를 만나면 가산점 초기화
				}
			}
			System.out.println(total);
		}
	}
}
