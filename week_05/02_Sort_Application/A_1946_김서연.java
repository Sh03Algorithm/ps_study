
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//1. 서류 등수 기준으로 오름차순 정렬 ( 그럼 서류1등은 다른 지원자들과 비교하지 않아도 됌 )
//2. 서류2등부터 면접등수로만 다른 지원자들과 비교
//3. 처음은 1등의 면접 등수를 최소로 놓고 비교한 후 2등의 면접등수가 1등의 면접등수보다 작다면 최소로 갱신하면서 비교 계속

class Grade implements Comparable<Grade> {
	int a;
	int b;

	Grade(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public int compareTo(Grade o) {
		if(this.a > o.a) {
			return 1;
		} else {
			return -1;
		}
	}
}

public class  A_1946_김서연  {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int t = 0; t < T; t++) {
			int N = sc.nextInt();
			ArrayList<Grade> list = new ArrayList<>();

			for(int i = 0; i < N; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();

				list.add(new Grade(a, b));
			}

			Collections.sort(list); // 서류 점수 기준 오름차순 정렬 

			int ans = 1; // 서류 1등은 무조건 통과 
			int min = list.get(0).b; // 면접 점수 최소값 
			for(int i = 1; i < N; i++) { // 서류 2등부터 시작 
				if(list.get(i).b < min) { // 이전의 최소 면접 점수보다 낮으면 통과 
					ans++;
					min = list.get(i).b; // 최소 점수 갱신 
				}
			}
			System.out.println(ans);
		}	
	}
}