import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2559_김서연 {
	//온도가 정수 수열로 주어지고 연속적인 며칠 동안의 온도 합이 가장 큰 값을 출력
	
	public static void main(String[] args) throws Exception {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        int n = Integer.parseInt(st.nextToken()); //온도 측정한 전체 날짜 수
	        int k = Integer.parseInt(st.nextToken()); //연속적인 날짜의 수 
	        int[] arr = new int[n+1]; //배열선언
	        
	        st = new StringTokenizer(br.readLine());
	        for (int i = 1; i <= n; i++) {
	        	arr[i] = arr[i-1]+Integer.parseInt(st.nextToken());//누적합배열로
	        	//System.out.println(arr[i]);
	        }
	        
	        int max = Integer.MIN_VALUE; //최댓값 변수 초기화
	        
	        //연속 범위 수에 따라 최댓값 구하기
	        for (int i = k; i <= n; i++) {
	            int rangeSum = arr[i]-arr[i-k];
	            if (max < rangeSum) max = rangeSum;
	        }
	        
	        System.out.println(max);
	}
}
