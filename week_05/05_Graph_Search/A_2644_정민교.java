import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

	static int[] arr;
	static boolean[] checked;
	static int result = -1;

	static HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 전체 사람 수 N
		int N = Integer.parseInt(br.readLine());
		
		// 사람 수만큼 checked 배열 생성
		checked = new boolean[N + 1];
		// 사람 수만큼 그래프에 빈 배열 생성
		for (int i = 0; i < N; i++) {
			graph.put(i + 1, new ArrayList<Integer>());
		}

		// 촌수 계산해야 하는 두사람 x, y
		String[] input = br.readLine().split(" ");
		int x = Integer.parseInt(input[0]);
		int y = Integer.parseInt(input[1]);

		// 부모 자식 관계의 수 M
		int M = Integer.parseInt(br.readLine());

		// 관계를 이용해서 그래프 만들기
		for (int i = 0; i < M; i++) {
			input = br.readLine().split(" ");
			makeGraph(input);
		}

		// dfs로 그래프 탐색
		dfs(x,y, 0);
		
		System.out.println(result);
	}

	private static void makeGraph(String[] input) {
		int x = Integer.parseInt(input[0]);
		int y = Integer.parseInt(input[1]);
		graph.get(x).add(y);
		graph.get(y).add(x);
	}

	static void dfs(int start, int end, int cnt) {
		if (start == end) {
			result = cnt;
			return;
		}

		checked[start] = true;
		// 그래프에 배열 탐색
		for (int i = 0; i < graph.get(start).size(); i++) {
			int next = graph.get(start).get(i);
			if (!checked[next]) {
				dfs(next, end, cnt + 1);
			}
		}
	}

}