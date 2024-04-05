
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_1463_장현지 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N+1];

        dp[N] = 0;
        for(int i = N; i >= 2; i--) {
            dp[i - 1] = dp[i - 1] == 0? dp[i] + 1 : Math.min(dp[i - 1], dp[i]+1);
            if(i % 3 == 0) {
                dp[i / 3] = dp[i / 3] == 0? dp[i] + 1 : Math.min(dp[i / 3], dp[i]+1);
            }
            if(i % 2 == 0) {
                dp[i / 2] = dp[i / 2] == 0? dp[i] + 1 : Math.min(dp[i / 2], dp[i]+1);
            }

        }


        bw.write(String.valueOf(dp[1]));

        br.close();
        bw.close();

    }
}
