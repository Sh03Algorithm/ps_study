package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekkjoon1072 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		double x = Double.parseDouble(st.nextToken());
		double y = Double.parseDouble(st.nextToken());
		double win = Math.floor(100*y/x);
		double target =0;
		int count=0; 
		
		if (win>= 99) count =-1 ;
		else {
		
			while (win>=target) {
			x++;
			y++;
			count++;
			target = Math.floor(100*y/x );
			}
		}
		System.out.println(count);
	}
}
