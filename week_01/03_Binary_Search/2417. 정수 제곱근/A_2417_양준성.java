package com.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob2417 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
		long start = 0;
		long end = n;
		long result = 0;

		while (start <= end) {
			long mid = (start + end) / 2;
			if (n <= (long) Math.pow(mid, 2)) {
				result = mid;
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		System.out.println(result);
	}
}