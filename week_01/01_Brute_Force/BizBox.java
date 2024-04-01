package test;

import java.util.Scanner;

public class BizBox {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int num[] = new int[M];

		int left = 1;
		int right = Integer.MIN_VALUE;

		for (int i = 0; i < M; i++) {
			num[i] = sc.nextInt();
			right = Math.max(right, num[i]);
		}

        
}
