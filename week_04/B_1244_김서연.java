import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1244_김서연 {
	//스위치 켜짐:1 스위치꺼짐:0
	//0 < 스위치 개수 <= 100
	//0 < 학생수 <= 100
	//학생(성별 - 남:1/여:2) 학생이 받는 수는 스위치개수 이하인 양의정수
	//여자면 받은 수와 같은 번호의 스위치를 중심으로 좌우 대칭이면서 가장 많은 스위치를 포함하는 구간의 상태를 모두바꿈
	//남자면 스위치 번호가 받은 수의 배수이면 그 스위치의 상태를 바꿈
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int total = Integer.parseInt(br.readLine()); //스위치 수
		int[] switches = new int[total]; //스위치 배열
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<total; i++) { //스위치 상태 
			switches[i] = Integer.parseInt(st.nextToken()); 
		}
		int stuCnt = Integer.parseInt(br.readLine()); //학생의 명수
		
		for(int i=0; i<stuCnt; i++) {
			st = new StringTokenizer(br.readLine());
			int gender = Integer.parseInt(st.nextToken()); //학생의 성별
			int number = Integer.parseInt(st.nextToken()); //학생이 받는 수
			
			//남학생
			if(gender == 1) {
				for(int j=0; j<total; j++) //뽑은 수의 배수 위치에 있는 스위치의 상태를 바꾼다.
					if((j+1) % number == 0)
						switches[j] = switches[j] == 0? 1: 0;
			}
			//여학생
			else {
				//뽑은 수를 중심으로 좌우가 대칭이면 상태를 바꾼다.
				switches[number - 1] = switches[number - 1] == 0 ? 1 : 0;
				for(int j=1; j<total/2; j++) {
					if(number - 1 + j >= total || number - 1 - j < 0)
						break;
					if(switches[number - 1 - j] == switches[number - 1 + j]) {
						switches[number - 1 - j] = switches[number - 1 - j] == 0 ? 1 : 0;
						switches[number - 1 + j] = switches[number - 1 + j] == 0 ? 1 : 0;
					}
					else break; //대칭 아닌것이 나오면 바로 끝낸다.
				}
			}
		}
		
		//한 줄에 20개씩 출력
		for(int i=0; i<total; i++) {
			System.out.print(switches[i] + " ");
			if((i+1) % 20 == 0)
				System.out.println();
		}
		
	
		}
	}

