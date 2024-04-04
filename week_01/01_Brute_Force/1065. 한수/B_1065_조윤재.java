package mine;

import java.util.Scanner;

public class Hansu {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		//한수 개수
		int count = 0;
		
		for( int i=0; i<=num; i++) {
			//99 이하의 수는 모두 한수
			if( i <= 99 ) {
				count += 1;
			} else if ( i <= 999 ) {
				String[] num_str = Integer.toString(i).split("");
				// 각 자릿수의 차이가 같으면
				if (( Integer.parseInt(num_str[1]) - Integer.parseInt(num_str[0]) ) 
						== (Integer.parseInt(num_str[2])- Integer.parseInt(num_str[1])))	
					count += 1;
			}
		}
		System.out.println(count);
		
	}

}




