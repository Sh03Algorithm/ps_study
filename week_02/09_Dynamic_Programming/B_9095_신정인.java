import java.io.*;
import java.util.*;

public class B_9095_신정인{
    public static void main(String[] args) throws Exception{

        //테스트 케이스 T 입력받기
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());

        //1-> 1(1개) / 2-> 1+1, 2(2개) / 3-> 1+1+1, 1+2, 2+1, 3(4개)
        //4-> 1+3, 1+1+2, 2+2, 1+1+1+1, 1+2+2, 2+1+1, 3+1 (7개)
        int[] ans=new int[11];
        ans[1]=1;
        ans[2]=2;
        ans[3]=4;

        //방법의 수 계산
        for(int i=4;i<11;i++){
            ans[i]=ans[i-3]+ans[i-2]+ans[i-1];
        }

        //각 케이스별 방법의 수 출력
        for(int i=0;i<t;i++){
            int c=Integer.parseInt(br.readLine());
            System.out.println(ans[c]);
        }
    }
}