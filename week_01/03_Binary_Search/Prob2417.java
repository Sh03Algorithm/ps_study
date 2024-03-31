package com.algorithm;

public class Prob2417 {

	public static void main(String[] args) {
		long n = 122333444455555L;
		long start = 0;
        long end = n;
        long result = 0;
        
        while(start<=end) {
        	long mid = (start + end) / 2;
        	if (n<=(long) Math.pow(mid, 2)) {
        		result = mid;
        		end = mid - 1;
        	}else {
        		start= mid + 1;
        	}
        }
        System.out.println(result);
	}
}