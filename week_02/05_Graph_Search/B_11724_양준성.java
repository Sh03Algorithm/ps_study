package com.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class B_11724_양준성 {
	static int N, M;
	static ArrayList<Integer> list[];
	static boolean visited[];

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(reader);
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		list = new ArrayList[N + 1];
		for (int i = 1; i <= N; i++) {
			list[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			list[s].add(e);
			list[e].add(s);
		}

		int count = 0;
		visited = new boolean[N + 1];
		for (int i = 1; i <= N; i++) {
			if (visited[i])
				continue;
			BFS(i);
			count++;
		}
		System.out.println(count);
	}


	static void BFS(int s) {
		Queue<Integer> Q = new LinkedList<>();
		Q.offer(s);
		visited[s] = true;

		while (!Q.isEmpty()) {
			int now = Q.poll();
			for (int next : list[now]) {
				if (visited[next])
					continue;
				Q.offer(next);
				visited[next] = true;
			}
		}
	}
}
