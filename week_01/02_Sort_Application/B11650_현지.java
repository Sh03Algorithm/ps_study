import java.util.Arrays;
import java.util.Scanner;

public class B11650_현지 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] xy = new int[N][];

        for(int i=0; i < N; i++) {
            xy[i] = new int[] {sc.nextInt(), sc.nextInt()};
        }
        Arrays.sort(xy, (a, b) -> {
            int result = a[0] - b[0];
            if (result == 0) return a[1] - b[1];
            return result;
        });

        for(int[] data:xy) {
            System.out.println(data[0] + " " + data[1]);
        }
    }
}
