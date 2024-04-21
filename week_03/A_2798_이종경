import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];
		int max = 0;
		int add;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length - 2; i++)
			for (int j = i + 1; j < arr.length - 1; j++)
				for (int k = j + 1; k < arr.length; k++) {
					add = arr[i] + arr[j] + arr[k];
					if (add > max && add <= M)
						max = add;
				}
		System.out.print(max);
	}
}
