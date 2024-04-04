package com.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob13301Junsung {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        
        long[] arr = new long[k];
        
        arr[0] = 4;
        arr[1] = 6;
        
        for (int index = 2; index < k; index++) {
        	arr[index] = arr[index-1] + arr[index-2];
        }
        
        System.out.println(arr[k-1]);
	}

}
