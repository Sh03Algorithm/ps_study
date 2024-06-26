//구하고자 하는 것 : 각 회의가 겹치지 않게 하면서 회의실을 사용할 수 있는 회의의 최대 개수
//서로 겹치지 않는 활동에 대해 종료시간이 빠르면 더 많은 활동을 선택할 수 있는 시간이 많아진다는 것
//먼저 종료시간을 기준으로 정렬 한 후 시간이 겹치지 않으면서 빨리 끝나는 것을 선택

//입력 예제를 토대로 봤을 때 첫 번째로 a1을 선택한 뒤 다음으로 빨리 끝나는 것은 a2다. 
//그러나 a1과 시간이 겹치므로 a2는 제외시킨다. (a3도 a2와 마찬가지) 그리고 a4는 a1과 겹치지 않으면서 다음으로 빨리끝난다. 
//이런식으로 선택해나아가다 보면 a1 (1, 4), a4 (5, 7), a8 (8, 11), a11 (12, 14) 가 선택되므로 최대 회의 가능한 수는 4

// 종료시점을 기준으로 오름차순으로 정렬해주되 종료시점이 같을경우 시작시점을 오름차순으로 정렬 
// 예를 들어 8,8 | 4,8 | 1,3 이 들어온다고 가정하면 정렬시에 8,8이 앞에 정렬되버리면 4,8이 count가 안될 수 있다.

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
 
public class A_1931_김서연 {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		
		/*
		  time[][0] 은 시작시점을 의미 
		  time[][1] 은 종료시점을 의미 
		*/
		int[][] time = new int[N][2];
		
		
		for(int i = 0; i < N; i++) {
			time[i][0] = in.nextInt();	// 시작시간 
			time[i][1] = in.nextInt();	// 종료시간 
		}
		
		
		// 끝나는 시간을 기준으로 정렬하기 위해 compare 재정의 
		Arrays.sort(time, new Comparator<int[]>() {
			
			@Override
			public int compare(int[] o1, int[] o2) {
				
				// 종료시간이 같을 경우 시작시간이 빠른순으로 정렬해야한다.  
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				
				return o1[1] - o2[1];
			}
 
		});
		
		int count = 0;
		int prev_end_time = 0;
		
		for(int i = 0; i < N; i++) {
			
			// 직전 종료시간이 다음 회의 시작 시간보다 작거나 같다면 갱신 
			if(prev_end_time <= time[i][0]) {
				prev_end_time = time[i][1];
				count++;
			}
		}
		
		System.out.println(count);
	}
 
}