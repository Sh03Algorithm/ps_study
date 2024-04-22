package com.shinhan.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2999 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] tmp = str.split("");
		int l = str.length();
		int r = 1;
		for(int i = 2; i <= Math.sqrt(l); i++) {
			if (l%i == 0) {
				r = i;
			}
		}
		int c = l/r;

		String[][] arr = new String[r][c];
		
		int cnt = 0;
		for(int j = 0; j<c; j++) {
			for(int i = 0; i<r; i++) {
				arr[i][j] = tmp[cnt];
				cnt++;
			}
		}
		
		StringBuilder result = new StringBuilder();
		for(int i = 0; i<r; i++) {
			for(int j = 0; j<c; j++) {
				result.append(arr[i][j]);
			}
		}
		
		System.out.println(result);
	}

}
