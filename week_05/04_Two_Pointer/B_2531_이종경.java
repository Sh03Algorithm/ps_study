import java.io.*;
import java.util.*;

public class Main {
    static int N, d, k, c;
    static int[] sushi;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken())-1;
        sushi = new int[N]; //해당 번호의 초밥이 몇 개인지 나타내는 배열
        int[] eat = new int[d];	// 해당 종류의 초밥을 몇개 먹었는지 저장하는 배열
        for(int i =0 ; i < N ; i++){
            sushi[i] = Integer.parseInt(br.readLine())-1; //위에 있는 c와 이 문장에서 -1을 나타낸 이유는 반복문할 때 int i = 0부터 i < N까지 나타낼 수 있게 하기 위해 썼습니다.
        }
        //eat[sushi[i]] <- 해당 번호의 초밥을 먹었냐 안 먹었냐로 체크함, eat[sushi[i]] = 0일 경우 한 번도 먹지 않은 초밥임을 의미하고, 그러므로 먹은 초밥종류 갯수(cnt)를 증가시킬 수 있다.
        int res = 0;
        int cnt = 0;
        for(int i =0 ; i < k ; i++){
            if(eat[sushi[i]]++ == 0) cnt++; 
        }
        for(int i =0 ; i < N ; i++){
            if(res <= cnt){     // MAX 값 새로 갱신
                if(eat[c] == 0) res = cnt+1;
                else res = cnt;
            }
            int j = (i+k)%N;  // end 값 (순환 → 인덱스 초과할 때의 처리)
            if(eat[sushi[j]] ++ == 0) cnt++; 
            if(-- eat[sushi[i]] == 0) cnt--; 
        }
        System.out.println(res);
    }
}
