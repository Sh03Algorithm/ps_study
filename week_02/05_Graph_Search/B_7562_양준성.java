package com.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class B_7562_양준성 {

	static int[] dx = { -2, -1, -2, -1, 1, 2, 2, 1 };
	static int[] dy = { -1, -2, 1, 2, 2, 1, -1, -2 };
	static Point end;
	static int n, l;
	static boolean[][] visited;
	static List<Integer> result = new ArrayList<>();

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수

		for (int i = 0; i < n; i++) {
			l = Integer.parseInt(br.readLine()); // 체스판 한 변의 길이(나이트가 움직일 수 있는 범위)
			visited = new boolean[l][l];

			Point start = new Point(0, 0, 0);
			String input = br.readLine();
			start.r = Integer.parseInt(input.split(" ")[0]);
			start.c = Integer.parseInt(input.split(" ")[1]);

			end = new Point(0, 0, 0);
			input = br.readLine();
			end.r = Integer.parseInt(input.split(" ")[0]);
			end.c = Integer.parseInt(input.split(" ")[1]);

			bfs(start);
		}

		result.stream().forEach(System.out::println);

	}

	private static void bfs(Point point) {
		Queue<Point> queue = new LinkedList<>();
		queue.add(point);
		visited[point.r][point.c] = true;

		while (!queue.isEmpty()) {
			Point temp = queue.poll();
			int r = temp.r;
			int c = temp.c;
			int cnt = temp.cnt;

			if (r == end.r && c == end.c) {
				result.add(cnt);
				return;
			}

			for (int i = 0; i < 8; i++) {
				int nr = r + dx[i];
				int nc = c + dy[i];

				if (nr > -1 && nc > -1 && nc < l && nr < l && !visited[nr][nc]) {
					queue.add(new Point(nr, nc, cnt + 1));
					visited[nr][nc] = true;
				}
			}
		}
	}

	public static class Point {
		int r; // x좌표 값
		int c; // y좌표 값
		int cnt; // 해당 좌표까지 가는 최소 횟수

		public Point(int r, int c, int cnt) {
			this.r = r;
			this.c = c;
			this.cnt = cnt;
		}
	}

}
