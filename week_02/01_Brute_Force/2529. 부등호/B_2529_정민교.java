import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void Solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine()) + 1;
		String[] brackets = br.readLine().split(" ");

		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		List<String> list = new ArrayList<>();
		
		permutation(arr, 0, arr.length, N, brackets, list);
		
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));

	}

	public static void permutation(int[] arr, int depth, int n, int r, String[] brackets, List<String> list) {
		if (depth == r) {
			int[] datas = new int[r];
			for (int i = 0; i < r; i++) {
				datas[i] = arr[i];
			}
			check(datas, brackets, list);
			return;
		}

		for (int i = depth; i < n; i++) {
			swap(arr, depth, i);
			permutation(arr, depth + 1, n, r, brackets, list);
			swap(arr, depth, i);
		}
	}

	private static void swap(int[] arr, int depth, int i) {
		int temp = arr[depth];
		arr[depth] = arr[i];
		arr[i] = temp;
	}
	
	public static void check(int[] datas, String[] brackets, List<String> list) {
		for (int i = 0; i < datas.length - 1; i++) {
			if (brackets[i].equals(">")) {
				if (datas[i] < datas[i + 1])
					return;
			} else if (brackets[i].equals("<")) {
				if (datas[i] > datas[i + 1])
					return;
			}
		}
		String num = Arrays.stream(datas).mapToObj(String::valueOf).collect(Collectors.joining());
		list.add(num);
	}

	public static void main(String[] args) throws Exception {
		new Main().Solution();
	}
}