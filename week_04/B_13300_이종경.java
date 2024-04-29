import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int arr[][] = new int[2][7]; //성별은 0,1, 학년은 1~6
		int sex;
		int grade;

		for (int i = 0; i < N; i++) {
			sex = sc.nextInt();
			grade = sc.nextInt();
			arr[sex][grade]++;
		}
		
		int count = 0;

		for (int i = 0; i < 2; i++) {
			for (int j = 1; j <= 6; j++) {
				if(arr[i][j] == 0) continue;
				else if(arr[i][j] < K) count++;
				else if(arr[i][j] % K == 0) count += arr[i][j] / K;
				else count += arr[i][j] / K + 1;
			}
		}
		
		System.out.print(count);
	}
}
