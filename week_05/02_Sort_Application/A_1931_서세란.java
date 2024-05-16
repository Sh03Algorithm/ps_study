import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int cnt = 1, max = 1;
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int[][] arr = new int[x][2];

		for (int i = 0; i < x; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}

		Arrays.sort(arr, (o1, o2) -> o1[1] == o2[1] ? o1[0] - o2[0] : o1[1] - o2[1]);
		int temp = arr[0][1];
		int j = 1;

		while (j < x) {

			while (j < x - 1) {
				if (arr[j][0] >= temp) {
					break;
				}
				j++;

			}
			if (arr[j][0] >= temp) {
				cnt++;
			}
			temp = arr[j][1];
			j++;

		}

		System.out.println(cnt);

	}

}
