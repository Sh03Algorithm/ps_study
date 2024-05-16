import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		StringTokenizer st = new StringTokenizer(br.readLine());

    //N : 라이언, 어피치가 놓여진 인형 줄의 인형 총 갯수
    //K : 이 중에서 라이언 인형이 몇 개 포함되어있는지
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
 
		int[] arr = new int[N + 1]; //계산을 편하게 하기 위해
 
		st = new StringTokenizer(br.readLine());
 
		for (int i = 1; i < N + 1; i++) {
			arr[i] = Integer.parseInt(st.nextToken()); //인형의 배열을 arr 배열로 설정
		}
 
		int R = 0; 
		int ans = -1;		//부분인형줄의 인형 갯수 ,  만약에 해당되는 라이언 K 갯수가 없을 경우 -1로 반환하는 문제이므로 미리 -1로 초기화함
		int sum = 0; // 라이언 인형의 합
		for(int L = 1; L<N+1; L++){
					
			while(R < N && sum < K){ //오른쪽 포인터가 인형줄의 끝까지 갔거나, 라이언의 인형갯수가 K개를 만족하는 부분 인형줄을 만들 때 까지 반복문을 수행
				R++;
				if(arr[R] == 1){ //라이언 인형 = 1로 표기되어있으므로 arr의 해당 인덱스에 '1'이 있으면 라이언 인형의 합 갯수 변수 sum을 +1해준다.
					sum++;
				}
			}
 
			if(sum == K){ //조건을 만족할 경우
				if(ans == -1){//처음 조건을 만족한 부분인형줄의 인형 갯수를 ans로 설정
					ans = R - L + 1; 
				}
				ans = Math.min(ans, R - L + 1); //그 다음에 만족하는 부분인형줄과 그 전까지 설정된 부분인형줄의 인형갯수를 비교하여 더 적은 인형의 갯수를 보유한 부분인형줄에 ans를 갱신
			}
 
			if(arr[L] == 1){ //L++를 하기 전 맨 왼쪽의 인형이 라이언이었을 경우 sum--
				sum--;
			}
 
		}
 
		System.out.println(ans);
		
 
	}
}
