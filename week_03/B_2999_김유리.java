import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chr = br.readLine().toCharArray();
        int N = chr.length;
        int R = 0, C = 0;

        // 행과 열의 개수 찾기 => 주어진 암호화된 메시지의 길이의 최대 약수찾기
        // 최대 약수를 찾으면 해당 약수를 행의 개수로 설정하고, 
        // 열의 개수는 메시지의 길이를 행의 개수로 나눈 값으로 설정
        for (int i = 1; i <= Math.sqrt(N); i++) {
            // 현재 i로 나누어 떨어지면 행과 열이 될 수 있는 후보 => i가 N의 약수인지 검사
            if (N % i == 0) {
            	// 행의 개수가 열의 개수보다 크거나 같을 경우에만 고려
                if (N / i < i)
                    break; // i가 행의 최대값이므로 더 이상 진행할 필요 없음
                else {
                    R = i; // 가장 큰 행 수 저장
                    C = N / i; // 가장 큰 열 수 저장
                }
            }
        }

        // 초기문자열 세로 -> 가로 순서로 
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                // 열 우선으로 읽어서 해독된 메시지 출력
                System.out.print(chr[j * R + i]);
            }
        }
    }
}
