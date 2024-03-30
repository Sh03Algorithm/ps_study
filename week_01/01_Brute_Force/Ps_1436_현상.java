import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		int input = Integer.parseInt(br.readLine());
 
		int num = 666;    //666의 최솟값
		int count = 1;
        
		while(count != input) {    // count가 입력값과 같을 경우 탈출
			num++;
			if(String.valueOf(num).contains("666")) {
				count++;
			}
		}
		System.out.println(num);
	}
}
