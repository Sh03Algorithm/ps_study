


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
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer tokens;

	public static void main(String[] args) throws NumberFormatException, IOException {
		input = new BufferedReader(new StringReader(src));
		String str = input.readLine();
		int N = str.length();
		int sqrt = (int) Math.sqrt(N);
		int R = 0, C = 0;
		for(int i=1; i<=sqrt; i++) {
			if(N%i==0) {
				R = i;
				C = N/i;
			}
		}
		int cnt = 0;
		char map[][] = new char[R][C];
		for(int c=0; c<C; c++) {
			for(int r=0; r<R; r++) {
				map[r][c] = str.charAt(cnt++);
			}	
		}
		for(int r=0; r<R; r++) {
			for(int c=0; c<C; c++) {
				System.out.print(map[r][c]);
			}	
		}
	}
	static String src =
			"boudonuimilcbsai";
}
