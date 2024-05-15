package com.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_10819_양준성 {

	static int[] arr, nums;
    static boolean[] visited;
    static int n, result = 0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine()); // 순열의 길이
		nums = new int[n]; // 순열
		arr = new int[n]; // 값을 구하기 위해 임시로 만든 순열
		visited = new boolean[n]; // DFS를 위해 방문여부 체크
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		dfs(0);
		System.out.println(result);
	}
	

    public static void dfs(int cnt) {
        if (cnt == n) {
            int total = 0;
            for (int i = 0; i < n - 1; i++) {
                total += Math.abs(arr[i] - arr[i + 1]);
            }
            result = Math.max(result, total);
            return;
        }

        // 순열 탐색
        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;

            visited[i] = true;
            arr[cnt] = nums[i];
            dfs(cnt + 1);
            visited[i] = false;
        }
    }
}
