import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {
	// 주사위 반대 값을 찾기위한 HashMap
	static HashMap<Integer, Integer> dicePattern = new HashMap<Integer, Integer>() {{
        put(0, 5);
        put(1, 3);
        put(2, 4);
        put(3, 1);
        put(4, 2);
        put(5, 0);
    }};

	public static void Solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());

		int[][] dices = new int[N][6];
		dices = new int[N][6];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 6; j++) {
				dices[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		// 가장 아래 주사위의 6면을 돌면서 면들의 합이 가장 큰 값을 구함
		int max = 0;
		for (int i = 0; i < 6; i++) {
			int sum = maxSideSum(dices, i);
			max = Math.max(max, sum);
		}
		System.out.println(max);

	}

	private static int maxSideSum(int[][] dices, int idx) {
		int sum = 0;
		// 가장 아래 주사위의 bottom 값
		int bottom = dices[0][idx];

		for (int[] dice : dices) {
			List<Integer> newDice = Arrays.stream(dice).boxed().collect(Collectors.toList());
			
			// bottom 값의 index를 구하고 pattern을 사용해서 top의 index를 구하여 top 값을 찾음
			int top = dice[dicePattern.get(newDice.indexOf(bottom))];
			
			//  dice, top, bottom을 사용해서 주사위 4면의 max값을 탐색
			int tmpMax = getMax(dice, top, bottom);
			
			sum += tmpMax;
			bottom = top;
		}
		return sum;
	}

	private static int getMax(int[] dice, int top, int bottom) {
		int max = 0;
		for (int i = 0; i < 6; i++) {
			if (dice[i] == top || dice[i] == bottom)
				continue;
			max = Math.max(max, dice[i]);
		}
		return max;
	}

	public static void main(String[] args) throws Exception {
		new Main().Solution();
	}
}