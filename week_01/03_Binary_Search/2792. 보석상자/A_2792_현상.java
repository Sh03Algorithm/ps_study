
package com.shinhan.week.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class pro_2792 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] jewelryAmount = new int[M];
		
		int left = 1;
		int right = Integer.MIN_VALUE;
		
		for(int i = 0; i < jewelryAmount.length; i++) {
			st = new StringTokenizer(br.readLine());
			jewelryAmount[i] = Integer.parseInt(st.nextToken());
			right = Math.max(right, jewelryAmount[i]);
		}
		
		int ans = 0;
		while(left <= right) {
			int mid = (left + right) / 2;
			int sum = 0;
			
			for(int i=0; i<M; i++) {
				if(jewelryAmount[i] % mid == 0) {
					sum += jewelryAmount[i] / mid;
				} else {
					sum += jewelryAmount[i] / mid + 1;
				}
			}
			if(sum > N) {
				left = mid + 1;
			} else {
				right = mid - 1;
				ans = mid;
			}
		}
		System.out.println(ans);
	}

}
