import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A_3079_신정인 {
    static int n;
    static long m, max;
    static int[] datas;
    static long answer = Long.MAX_VALUE;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        m=Long.parseLong(st.nextToken());
        datas=new int[n];

        for(int i=0;i<n;i++){
            datas[i]=Integer.parseInt(br.readLine());
            max=Math.max(max, datas[i]);
        }

        Arrays.sort(datas);

        f1();

        System.out.println(answer);
    }

    public static void f1(){
        long left = 0;
        long right = max*m;

        while(left<=right){
            long mid = (left+right)/2;
            long sum=0;
            for(int i=0;i<n;i++){
                long count = mid/datas[i];
                if(sum>=m){
                    break;
                }
                else{
                    sum+=count;
                }
            }
            if(sum>=m){
                right=mid-1;
                answer=Math.min(answer,mid);
            }
            else{
                left=mid+1;
            }
        }
    }
}