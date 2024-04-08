
import java.util.Scanner;
​
public class Decomposition {
​
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			int num = i;
			int sum = 0;
			
			while(num != 0) {
				sum += num % 10;
				num /= 10;
			}
			
			if(sum + i == N) {
				System.out.println(i);
				break;
			}
		}
		
	}
​
}
