package com.home;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Pr_11728 {

	public static void main(String[] args) throws IOException {
		arrSort();
		twoPointer();
	}

	private static void twoPointer() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		int aSize, bSize;

		StringTokenizer st = new StringTokenizer(br.readLine());
		aSize = Integer.parseInt(st.nextToken());
		bSize = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < aSize; i++) {
			a.add(Integer.parseInt(st.nextToken()));
		}

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < bSize; i++) {
			b.add(Integer.parseInt(st.nextToken()));
		}

		int aPointer = 0;
		int bPointer = 0;

		while (aPointer < a.size() && bPointer < b.size()) {
			if (a.get(aPointer) > b.get(bPointer)) {
				result.add(b.get(bPointer));
				bPointer++;
			} else if(a.get(aPointer) < b.get(bPointer)) {
				result.add(a.get(aPointer));
				aPointer++;
			} else {
				result.add(a.get(aPointer));
				result.add(b.get(bPointer));
				aPointer++;
				bPointer++;
			}
		}

		while(aPointer < a.size()) {
            result.add(a.get(aPointer++));
        }
        
        while(bPointer <b.size()) {
            result.add(b.get(bPointer++));
        }

		StringBuilder sb = new StringBuilder();

		for (int data : result) {
			sb.append(data + " ");
		}

		System.out.println(sb);
	}

	static void arrSort() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n + m];

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < m; i++) {
			arr[n + i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);

		StringBuilder sb = new StringBuilder();

		for (int r : arr) {
			sb.append(r + " ");
		}

		System.out.println(sb);

	}

}
