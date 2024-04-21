package baekjun.study;

import java.util.Scanner;

public class OxQuiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[] ans = new int [cnt];
		
		for(int i=0; i<cnt; i++) {
			String a=sc.next();
			int add=0;
			
			for(int j=0; j<a.length(); j++) {
				if(a.charAt(j)=='O') {
					add += 1;
					}
				if(a.charAt(j)=='X') {
					add = 0;
				}
				ans[i] += add;
			}
		}
		for (int i = 0; i<ans.length; i++) {
			System.out.println(ans[i]);
		}
		sc.close();
	}
}
