import java.io.*;
import java.util.*;

public class A_2531_신정인{
    static int n,d,k,c;
    static int[] table;
    static int[] sushi;
    static int answer=0;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        d=Integer.parseInt(st.nextToken());
        k=Integer.parseInt(st.nextToken());
        c=Integer.parseInt(st.nextToken());

        table = new int[n];
        sushi = new int[d+1];

        for(int i=0;i<n;i++){
            table[i]=Integer.parseInt(br.readLine());
        }

        System.out.println(check());
    }

    public static int check(){
        int count=0; //k개 접시 내에서 초밥 종류 개수
        int max=0;

        //첫 연속 k접시
        for(int i=0;i<k;i++){
            if(sushi[table[i]]==0){
                count++;
            }
            sushi[table[i]]++;
        }
        max=count;

        for(int i=0;i<n;i++){
            //max값 갱신
            if(count>=max){
                //쿠폰 번호에 적힌 초밥 종류가 현재까지의 초밥에 없었던 경우
                if(sushi[c]==0){
                    max=count+1;
                }
                //쿠폰 번호에 적힌 초밥 종류가 현재까지의 초밥에 있었던 경우
                else{
                    max=count;
                }
            }
            //0~k에서 1~k+1로 변경
            //첫번째 초밥 빼기
            sushi[table[i]]--;
            if(sushi[table[i]]==0){
                count--;
            }
            //마지막 초밥 추가하기
            if(sushi[table[(i+k)%n]]==0){
                count++;
            }
            sushi[table[(i+k)%n]]++;
        }
        return max;
    }
}