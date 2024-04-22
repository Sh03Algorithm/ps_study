

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;
//1) 문자열의 길이(N)의 제곱근 (sqrt) 을 구함
//2) 1~ sqrt 까지 포문 돌리면서 N%i 가 0일 경우 R 과 C 를 갱신
//3) 2의 결과 R, C 로 배열을 만듬
//4) 배열을 읽음
public class A_2999_김서연 {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String message = br.readLine();
		int N = message.length();
		int R =  0, C = 0;
	
		for (int r = N; r > 0; r--) {
			if (N % r == 0 && r <= N/r) {
				R = r;	C = N/r;
				break;
			}
		}
		
		char[][] arr = new char[R][C];
		
		int m = 0;
		loop : for (int j = 0; j < C; j++) {
			for (int i = 0; i < R; i++) {
				arr[i][j] = message.charAt(m++);
			
				if (m == message.length())	break loop;
			}
		}
		
		String answer = "";
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				answer += arr[i][j];
		}
		
		System.out.println(answer);
	}
}

