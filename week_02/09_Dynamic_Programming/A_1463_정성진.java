package com.shinhan.day15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int[] a = new int[N + 1];
		a[1] = 0;

		for (int i = 2; i < N + 1; i++) {
			if (i % 2 != 0 && i % 3 != 0) {
				a[i] = a[i - 1] + 1;
			} else if (i % 2 == 0 && i % 3 != 0) {
				a[i]=Math.min(a[i-1], a[i/2])+1;
			} else if(i % 3 == 0 && i % 2 != 0) {
				a[i]=Math.min(a[i-1], a[i/3]) +1;
			} else {
				a[i]=Math.min(a[i-1], Math.min(a[i/3], a[i/2]))+1;
			}
		}
		System.out.println(a[N]);
	}

}