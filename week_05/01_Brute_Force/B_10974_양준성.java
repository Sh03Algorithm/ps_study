package com.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_10974_양준성 {

	static int[] arr, nums;
    static boolean[] visited;
    static int n, result = 0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		nums = new int[n];
		arr = new int[n];
		visited = new boolean[n];
		
		for(int i=0;i<n;i++) {
			nums[i] = i+1;
		}
		
		dfs(0);
	}
	

    public static void dfs(int cnt) {
        if (cnt == n) {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println("");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;

            visited[i] = true;
            arr[cnt] = nums[i];
            dfs(cnt + 1);
            visited[i] = false;
        }
    }
}
