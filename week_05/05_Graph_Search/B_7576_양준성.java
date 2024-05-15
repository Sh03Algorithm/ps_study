package com.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B_7576_양준성 {

	static int w, h;
	static int[][] box;
	static Queue<Tomato> que = new LinkedList<Tomato>();
	static int[] dx = { 0, 0, 1, -1 };
	static int[] dy = { 1, -1, 0, 0 };
	static int result;
	static int unripe; // 처음 box를 받았을 때 안익은 토마토 수
	static int ripened; // 안익었다가 익은 걸로 변한 토마토 수

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		w = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());

		box = new int[h][w];

		for (int i = 0; i < h; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < w; j++) {
				box[i][j] = Integer.parseInt(st.nextToken());
				if (box[i][j] == 1) {
					// box를 돌면서 익은 토마토를 찾은 경우 queue에 넣음			
					que.add(new Tomato(i, j, 0));
				} else if (box[i][j] == 0)
					// 안익은 토마토의 개수를 count함 (최종적으로 모든 토마토가 익었는지 확인하기 위해)
					unripe += 1;
			}
		}
		bfs();

		if (unripe == 0)
			// 원래부터 토마토가 다 익어있었을 경우 0 출력
			System.out.print(0);
		else if (unripe == ripened) {
			// 원래 안익어있던 토마토 == 익힌 토마토일 경우, result 출력
			System.out.print(result);
		} else {
			System.out.print(-1);
			// 원래 안익어있던 토마토 != 익힌 토마토일 경우, -1 리턴
		}
	}

	public static void bfs() {
		while (!que.isEmpty()) {
			Tomato tom = que.poll();

			for (int i = 0; i < 4; i++) {
				// 익은 토마토 상하좌우로 박스 내부에 있는 토마토
				if (tom.x + dx[i] >= 0 && tom.x + dx[i] < h && tom.y + dy[i] >= 0 && tom.y + dy[i] < w) {
					// 해당 토마토가 안익은 경우
					if (box[tom.x + dx[i]][tom.y + dy[i]] == 0) {
						box[tom.x + dx[i]][tom.y + dy[i]] = 1; // 익은 토마토로 변경
						que.add(new Tomato(tom.x + dx[i], tom.y + dy[i], tom.days + 1)); // 익은 토마토가 되어 큐에 추가
						result = tom.days + 1; // 최종 결과값도 증가
						ripened += 1; // 익은 토마토 수 증가
					}
				}
			}
		}
	}

	public static class Tomato {
		int x;
		int y;
		int days; // 해당 토마토가 익는데 걸린 기간

		public Tomato(int x, int y, int days) {
			this.x = x;
			this.y = y;
			this.days = days;
		}
	}
}
