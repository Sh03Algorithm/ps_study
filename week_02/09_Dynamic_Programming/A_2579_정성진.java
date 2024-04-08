package com.shinhan.day15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int[] s = new int[N + 1];
		int[] d = new int[N + 1];

		s[0] = 0;
		
		for (int i = 1; i < N + 1; i++) {
			d[i] = Integer.parseInt(br.readLine());
			
		}

		s[1]=d[1];
		if (N > 1) {
			s[2] = d[1] + d[2];
		}

		for(int i=3;i<N+1;i++) {
			s[i]=Math.max((s[i-2]+d[i]), (s[i-3]+d[i-1]+d[i]));
		}
		System.out.println(s[N]);
	}

}
