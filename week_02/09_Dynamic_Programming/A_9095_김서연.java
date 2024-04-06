import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


//문제 분석 및 설명 :
//정수를 1,2,3의 합으로 나타내는 방법의 수를 구해야함
//정수(n)이 1인 경우 1 한가지 뿐 --> dp[1] = 1
//n이 2인 경우 (1+1) , (2) 두가지 --> dp[2] = 2
//n이 3인 경우 (1+1+1), (2+1), (1+2), (3) --> dp[3] = 4
//n이 4인 경우 (1+1+1+1), (2+1+1), (1+2+1), (3+1), (1+1+2), (2+2), (1+3) --> 7가지
//4인경우에서  1+1+1 / 2+1 / 1+2 / 3부분의 연산은 dp[3]에 포함된 경우의 수와 같고 ,
//1+1 / 2 부분의 연산은 dp[2]에 포함된 경우의 수와 동일 마지막 1+3에서 1부분의 연산역시 dp[1]에 포함된 경우의 수이다.
//여기서 dp[4]는 결국 dp[3]+dp[2]+dp[1] 과 같다는 것을 알 수 있다.
//즉 점화식이 dp[n] = dp[n-1] + dp[n-2] + dp[n-3]

public class A_9095_김서연 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            int[] dp = new int[11];

            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;
            //1,2,3은 미리 정의

            for (int i = 4; i <= n; i++) { //4부터 돌림
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }

            bw.write(dp[n] + "\n");
        }
        bw.flush();
    }
}
