package week04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2491_장현지 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		int n = Integer.parseInt(br.readLine());
		
		int[] nums = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] asc = new int[n];
		int[] desc = new int[n];
		for(int i = 1; i < n; i++) {
			if(nums[i] >= nums[i-1]) {
				asc[i] = asc[i-1] + 1;
			}
			if(nums[i] <= nums[i-1]) {
				desc[i] = desc[i-1] + 1;
			}
		}
		
		int answer = 0;
		for(int i = 0; i < n; i++) {
			answer = Math.max(answer, Math.max(asc[i], desc[i]));
		}
		
		
		System.out.println(answer+1);
	}
	// dp
	
}
