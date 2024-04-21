package com.home;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2810_현상 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		int count = 0;
		
		for(int i=0; i < n; i ++) {
			if(s.charAt(i) == 'S') count ++;	// 일반석일 경우
			else {	//커플석일 경우
				count ++;
				i ++;
			}
		}
		
		count ++;	//마지막 우측 컵홀더
		
		//	컵홀더를 사용할 수 있는 사람의 수 이므로
		count = Math.min(n, count);
		System.out.println(count);
	}

}
