package com.shinhan.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2477_양준성 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[][] field = new int[6][2];
		int x = 0;
		int y = 0;
		
		for(int i=0;i<6;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int d = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());
			
			switch(d) {
			case 1: {
				x += h;
				field[i][0] = x;
				field[i][1] = y;
			} break;
			case 2: {
				x -= h;
				field[i][0] = x;
				field[i][1] = y;
			} break;
			case 3: {
				y -= h;
				field[i][0] = x;
				field[i][1] = y;
			} break;
			case 4: {
				y += h;
				field[i][0] = x;
				field[i][1] = y;
			} break;
			}
		}
		
		int result = Math.abs(
				(field[0][0]*field[1][1] + field[1][0]*field[2][1] + field[2][0]*field[3][1] + field[3][0]*field[4][1] + field[4][0]*field[5][1])
				-(field[0][1]*field[1][0] + field[1][1]*field[2][0] + field[2][1]*field[3][0] + field[3][1]*field[4][0] + field[4][1]*field[5][0]))
				/2*N; // 좌표 사이의 영역을 구하는 공식
		
		System.out.println(result);
	}

}
