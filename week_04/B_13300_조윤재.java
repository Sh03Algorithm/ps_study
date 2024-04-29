import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        //학생수
		int N = Integer.parseInt(st.nextToken());
        //방별 최대인원수
		int K = Integer.parseInt(st.nextToken());
        //성별(여0남1) , 학년
		int[][] room = new int[2][7]; 
        
        //필요 최소방의수 구하기
		int count = 0 ;
		int s , g;
		for(int i = 0 ; i < N ; i++) {
			st = new StringTokenizer(br.readLine());
			s = Integer.parseInt(st.nextToken());
			g = Integer.parseInt(st.nextToken());
			room[s][g]++;			
		}
		
        // 수용 인원으로 나누어주며 계산 
		for(int i = 0 ; i < 2 ; i ++) {
			for(int j = 1 ; j <7 ; j++) {
				count += room[i][j] / K ;
				if(room[i][j]% K !=0) {
					count++;
				}
			}
		}
		System.out.print(count);

	}
}
