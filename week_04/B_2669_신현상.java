import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2669_신현상 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int result = 0;
		int[][] arr = new int[100][100];
		
		for(int i = 0; i < 4; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			// 1x1 단위로 좌표값 저장
			for(int j = x1; j < x2; j++) {
				for(int z = y1; z < y2; z++) {
					arr[j][z] = 1;
				}
			}
		}
		
		// 100 x 100 사각형 모든 값 더하기 (1이 직사각형이 그려진 좌표)
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j < 100; j++) {
				result += arr[i][j];
			}
		}
		
		System.out.println(result);
	}
}
