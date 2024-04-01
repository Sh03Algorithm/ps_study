import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// Brute Force - 일곱 난쟁이(2309)
// 1.입력값을 배열에 저장
// 2.난쟁이 키 총합 구하기
// 3.오름차순 정렬
// 4.총합에서 2개의 데이터값 빼서, 100이면, 가짜난쟁이

public class Seven {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//아홉 난쟁이를 넣을 배열 생성 
		int[] arr = new int[9];
		
		//난쟁이 키 총합
		int sum = 0;
		
		for(int i=0; i<9; i++) {
			int n = Integer.parseInt(br.readLine()); //값을 입력받기
			arr[i] = n;		//배열에 i번째 난쟁이 키 저장
			sum += arr[i];	//난쟁이 키 총합
		}
		
		//난쟁이 키 오름차순 정렬
		Arrays.sort(arr);
		
		//가짜 난쟁이
		int a=0, b=0;
		
		//총합이 100인 경우 찾기
		for(int i=0; i<arr.length-1; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(sum - arr[i] - arr[j] == 100) {
					a = i;
					b = j;
					break;
				}
			}
		} //총합찾는 for-end
		
		//일곱난쟁이 키 출력
		for(int i=0; i<arr.length; i++) {
			//가짜난쟁이는 출력하지 않음
			if( i!= a && i != b) {
				System.out.println(arr[i]);
			}
		}

	}

}

















