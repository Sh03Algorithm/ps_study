package com.shinhan.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2564_양준성 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int w = Integer.parseInt(st.nextToken()); // 가로 길이
		int h = Integer.parseInt(st.nextToken()); // 세로 길이
		int N = Integer.parseInt(br.readLine()); // 상점의 수
		
		int[] arr = new int[N+1]; // 상점의 위치 + 동근이의 위치
		for(int i=0; i<=N; i++) {
			st = new StringTokenizer(br.readLine());
			int direction = Integer.parseInt(st.nextToken()); // 위치한 방향
			int dist = Integer.parseInt(st.nextToken()); // 거리
			// 직사각형 모양의 루트를 하나의 직선으로 펴는 과정
			switch(direction) {
			case 1: arr[i] = w-dist;
				break;
			case 2: arr[i] = w+h+dist;
				break;
			case 3: arr[i] = w+dist;
				break;
			case 4: arr[i] = 2*(w+h)-dist;
				break;
			}
		}
		
		int total = 0;
		for(int i=0; i<N; i++) {
			int tmp = Math.abs(arr[N]-arr[i]);
			if (tmp <= w+h) {
				total += tmp;
			}else { // 총 거리의 절반보다 길다면 반대 방향으로 가는 것이 유리
				total += 2*(w+h) - tmp;
			}
		}
		System.out.println(total);
	}

}
