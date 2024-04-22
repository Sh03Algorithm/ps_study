import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //게임 참여인원수
		int m = sc.nextInt(); //공을 받은 횟수
		int l = sc.nextInt(); //좌우측 이동 횟수
		
		int[] arr = new int[n];
		int count = 0; //공을 던진 총 횟수
		int location = 0; //1번자리의 사람이 공을 받는다. (배열의 첫째자리가 0번이기 때문에 0으로 초기화)
		while(true) {
				
			if(arr[location] % 2 == 1) { //현재 자리에 있는 사람의 공 받은횟수가 홀수이면 L만큼 시계방향으로 location이 이동한다.
				location = (location + l) % n; //현재 자리의 위치에서 L만큼 움직였을때 이동거리가 n보다 크면 한바퀴 그대로 돌아서 나머지만큼 추가 이동한다.
				arr[location]++; //해당하는 위치에 있는 사람의 공 받은횟수 증가
				count++; //공던진 총 횟수 증가
				
			} else if(arr[location] % 2 == 0) { //현재 자리에 있는 사람의 공 받은횟수가 짝수이면 L만큼 시계방향으로 location이 이동한다.
				location = ((location - l) + n) % n; //현재 자리의 위치에서 L만큼 움직였을때 이동거리가 n보다 크면 한바퀴 그대로 돌아서 나머지만큼 추가 이동한다.
				arr[location]++; //해당하는 위치에 있는 사람의 공 받은횟수 증가
				count++; //공던진 총 횟수 증가
			}
			if(arr[location] == m) break; //만약 m값이 location의 index내 값과 일치하면 끝난다.
		}
		System.out.print(count-1);
	}
}
