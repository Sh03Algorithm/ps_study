package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon11004 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String [] arr =  s.split(" ");
		int x = Integer.parseInt(arr[0]);
		int y = Integer.parseInt(arr[1]);
		int[] number = new int[x];
		String [] num_str = sc.nextLine().split(" ");
		for(int i=0; i<num_str.length; i++) {
			number[i]=Integer.parseInt(num_str[i]);
		}
		Arrays.sort(number);
		System.out.println(number[y]);
		
	}
}
