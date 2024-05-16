package train;

import java.util.Scanner;

public class A_10974_권대현 {
	static int N;
	static int[] permutation;
	static boolean[] check;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		//1~N 까지 사용하기 위해 N+1
		permutation = new int[N+1];
		
		//숫자가 사용되었는지 check
		check = new boolean[N+1];
		
		//순열 생성 1로 재귀
		getPermutation(1);
	}

	private static void getPermutation(int depth) {
		//순열의 깊이가 N+1이면 모든 숫자가 순열에 포함된 상태
		if(depth == N+1) {
			getPrintAnswer();
			return;
		}
		for(int i=1; i<=N ; i++) {
			if(!check[i]) {
				check[i] = true; //숫자 i 순열에 포함 시키기
				permutation[depth] = i; 
				getPermutation(depth + 1);
				check[i] = false; //재귀호출 하기위해 다시 초기화
			}
		}
	}

	private static void getPrintAnswer() {
		for(int i=1; i<=N ; i++) {
			System.out.print(permutation[i]+ " ");
		}
		System.out.println();
	}

}
