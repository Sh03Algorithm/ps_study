package com.shinhan.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_3985_양준성 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int L = Integer.parseInt(br.readLine()); // 롤케이크의 길이
		int N = Integer.parseInt(br.readLine()); // 방청객의 수

		int[] bread = new int[L + 1]; // 롤케이크 각 조각의 배열. 편의상, 0번째는 안씀

		StringTokenizer st;

		int rese = 0; // 가장 많은 조각을 요청한 방청객의 번호
		int resr = 0; // 실제로 가장 많은 조각을 받은 방청객의 번호
		int maxe = 0; // 가장 많은 조각을 요청한 방청객의 요청 조각 수
		int maxr = 0; // 실제로 가장 많이 받아간 방청객이 받은 조각 수

		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());

			int p = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());

			int cnt = 0; // i번째 방청객이 받는 롤케이크 조각의 개수
			
			for (int j = p; j <= k; j++) {
				if (bread[j] == 0) { // j번째 조각을 아직 누구에게도 주지 않았다면
					bread[j] = i; // j번째 조각을 i번째 방청객에게 줌
					cnt++;
				}
			}
			
			if (k - p > maxe) {
				rese = i;
				maxe = k - p;
			}
			
			if (cnt > maxr) {
				resr = i;
				maxr = cnt;
			}
		}
		System.out.println(rese);
		System.out.println(resr);
	}
}
