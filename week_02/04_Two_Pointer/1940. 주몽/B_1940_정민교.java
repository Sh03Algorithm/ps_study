import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void Solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int[] data = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		int count = 0;
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				int sum = data[i] + data[j];
				if (sum == M) {
					count++;
				}
			}
		}
		System.out.println(count);

	}

	public static void main(String[] args) throws Exception {
		new Main().Solution();
	}
}
