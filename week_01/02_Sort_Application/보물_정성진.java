import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] a = new int[n]; // A배열
		int[] b = new int[n]; // B배열
		int[] c = new int[n]; // 계산용 C배열

		int s = 0;

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt(); // 입력받은 값을 A배열의 i번째에 추가
		}
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt(); // 입력받은 값을 B배열의 i번째에 추가
			c[i] = b[i]; // b배열=c배열
		}

		Arrays.sort(a);
		Arrays.sort(c);

		for (int i = 0; i < n; i++) {
			s += a[i] * c[n - 1 - i];
		}
		System.out.println(s);
		sc.close();
	}

}