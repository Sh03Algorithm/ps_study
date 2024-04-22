
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());

		System.out.println(checkCupHolder(N, site));
	}

	public static int checkCupHolder(int N, String site) {
		char[] siteArr = site.toCharArray();
		int cnt = 0;
		sb.append('*');
		int step = 1;
		for (int i=0; i<N; i+=step) {
			if(siteArr[i] =='S') {
				sb.append("S*");
				step =1;
			}
			else if(siteArr[i] =='L') {
				sb.append("LL*");
				step=2; 
			}
		}
		String cupHolder = sb.toString();
		cnt = cupHolder.length() - cupHolder.replace("*", "").length();
		cnt = cnt>=N ? N : cnt; 
 		return cnt; 
	}
}
