import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void Solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < num; i++) {
			list.add(arr[i], String.valueOf(i + 1));
		}
		Collections.reverse(list);
		String result =  String.join(" ", list);
		
		System.out.println(result);
	}

	public static void main(String[] args) throws Exception {
		new Main().Solution();
	}
}