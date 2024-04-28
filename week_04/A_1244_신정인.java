import java.io.*;
import java.util.*;

public class A_1244_신정인{

    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        //스위치 개수
        int s=Integer.parseInt(br.readLine());

        //스위치 상태
        int[] switches=new int[s+1];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=1;i<s+1;i++){
            switches[i]=Integer.parseInt(st.nextToken());
        }

        //학생 수
        int n=Integer.parseInt(br.readLine());

        //학생 성별, 받은 수
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            if(a==1){
                f1(switches, b, s);
            }
            else{
                f2(switches, b, s);
            }
        }

        //스위치 상태 출력
        for(int j=1;j<=s;j++){
            System.out.print(switches[j]);
            if(j%20==0){ //한줄에 20개씩 출력
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }
    }

    //남학생일 경우: 받은 수의 배수만 변경
    static void f1(int[] data, int b, int s){
        for(int i=b;i<=s;i+=b){
            //data[j] = 1 - data[j]; <- 스위치 상태를 바꾸는 간단한 방법
            if(data[i]==0){
                data[i]=1;
            }
            else{
                data[i]=0;
            }
        }
    }

    //여학생일 경우: 대칭 찾기
    static void f2(int[] data, int b, int s){
        int start=b;
        int end=b;
        while(start>=1 && end<=s && data[start]==data[end]){
            start--;
            end++;
        }
        start++;
        end--;
        for(int j=start;j<=end;j++){
            //data[j] = 1 - data[j]; <- 스위치 상태를 바꾸는 간단한 방법
            if(data[j]==0){
                data[j]=1;
            }
            else{
                data[j]=0;
            }
        }
    }
}
