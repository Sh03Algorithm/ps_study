package Algorithm;

import java.util.Scanner;

public class Baekjoon1120 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strarr = str.split(" ");
		
		char[] Xarr = strarr[0].toCharArray();
		char[] Yarr = strarr[1].toCharArray();
		int max_cnt = 0;
		
		for (int i=0; i<=Yarr.length-Xarr.length; i++) {
			int cnt = 0;
			for (int j=0; j<Xarr.length; j++) {
				if (Xarr[j]==Yarr[j+i]) {
					cnt ++;
				}
			} 
			if(cnt>max_cnt) max_cnt=cnt;
		}
		
		System.out.println(Yarr.length-max_cnt-(Yarr.length-Xarr.length));
		
	}

}
