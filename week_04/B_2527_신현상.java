import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2527_신현상 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String result = "";
		for(int i = 0; i < 4; i++) {
			st = new StringTokenizer(br.readLine());
			int[] coor = new int[8];
			
			for(int j = 0; j < 8; j++) {
				coor[j] = Integer.parseInt(st.nextToken());
			}
			
			if(checkD(coor)) result += "d\n";
			else if(checkC(coor)) result += "c\n";
			else if(checkB(coor)) result += "b\n";
			else result += "a\n";
			
		}
		System.out.println(result);
	}
	
	//전혀 겹치지 않을때
	private static boolean checkD(int[] coor) {
        if (coor[0] > coor[6]) return true;     //x1 > x4
        if (coor[2] < coor[4]) return true;     //x2 < x3
        if (coor[1] > coor[7]) return true;     //y1 > y4
        if (coor[3] < coor[5]) return true;     //y2 < y3
 
        return false;
    }
 
	// 점이 겹칠 때
    private static boolean checkC(int[] coor) {
        if (coor[0] == coor[6] && coor[1] == coor[7]) return true;   //x1 == x4 그리고 y1 == y4
        if (coor[0] == coor[6] && coor[3] == coor[5]) return true;   //x1 == x4 그리고 y2 == y3
        if (coor[2] == coor[4] && coor[3] == coor[5]) return true;   //x2 == x3 그리고 y2 == y3
        if (coor[2] == coor[4] && coor[1] == coor[7]) return true;   //x2 == x3 그리고 y1 == y4
 
        return false;
    }
 
    // 변이 겹칠 때
    private static boolean checkB(int[] coor) {
        if (coor[0] == coor[6]) return true;    //첫번째의 아랫변 == 두번째의 윗변
        if (coor[2] == coor[4]) return true;    //첫번째의 윗변 == 두번째의 아랫변
        if (coor[1] == coor[7]) return true;    //첫번째의 오른쪽변 == 두번째의 왼쪽변
        if (coor[3] == coor[5]) return true;    //첫번째의 왼쪽변 == 두번쨰의 오른쪽변
 
        return false;
    }

}
