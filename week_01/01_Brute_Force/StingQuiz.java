package test;

import java.io.IOException;
import java.util.Scanner;

public class StingQuiz {
	public static void main(String[] args) throws IOException {
		Scanner br = new Scanner(System.in);
		String[] input = br.nextLine().split(" ");
		System.out.println(solve(input[0], input[1]));
		br.close();
	}

	private static int solve(String str1, String str2) {
		int min = Integer.MAX_VALUE;
		for (int startIndex = 0; startIndex <= str2.length() - str1.length(); startIndex++) {
			int cnt = 0;
			for (int j = 0; j < str1.length(); j++) {
				if (str1.charAt(j) != str2.charAt(startIndex + j)) cnt++;
			}
			if (cnt < min) min = cnt;
		}
		return min;
	}
}
