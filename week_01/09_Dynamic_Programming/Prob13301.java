import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob13301 {
    //1,1,2,3,5,8,13.... => 피보나치수열로 증가하는 타일
    //타일개수 1 2  3  4  5  6  7
    //둘레    4 6  10 16 26 42 68
    //둘레도 피보나치수열과 같음 f(n) = f(n-1) + f(n-2) 의 규칙을 가짐
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        long[] arr = new long[81];

        arr[1] = 4;
        arr[2] = 6;

        for(int i=3; i<=num; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.println(arr[num]);
    }
}
