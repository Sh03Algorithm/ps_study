
package com.home;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1051_현상 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[][] arr = new int[N][M];
		for (int i = 0; i < N; i++) {
			String row = br.readLine();
			for (int j = 0; j < M; j++) {
				arr[i][j] = row.charAt(j) - '0';
			}
		}

		// 정사각형은 N, M 두 수중 더 작은 것을 사용
		int len = Math.min(N, M);
        
        while(len > 1) {
            for(int i=0; i<= N-len; i++) {
                for(int j=0; j<=M-len; j++) {
                	// 기준이 되는 꼭지점 선언
                    int num = arr[i][j];
                    // 나머지 꼭지점 비교
                    if(num==arr[i][j+len-1] && num == arr[i+len-1][j] && num == arr[i+len-1][j+len-1]) {
                        System.out.println(len*len);
                        return;
                    }
                }
            }
            len--;
        }
		System.out.println(len);
	}
}
